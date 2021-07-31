package typings.dropboxjs.Dropbox

import typings.dropboxjs.Dropbox.File.Stat
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Http {
  
  @js.native
  trait AppInfo extends StObject {
    
    var canUseDatastores: Boolean = js.native
    
    var canUseFiles: Boolean = js.native
    
    var canUseFullDropbox: Boolean = js.native
    
    var hasAppFolder: Boolean = js.native
    
    def icon(width: Double): Unit = js.native
    def icon(width: Double, height: Double): Unit = js.native
    
    var key: String = js.native
    
    var name: String = js.native
  }
  
  trait PollResult extends StObject {
    
    var hasChanges: Boolean
    
    var retryAfter: Double
  }
  object PollResult {
    
    @scala.inline
    def apply(hasChanges: Boolean, retryAfter: Double): PollResult = {
      val __obj = js.Dynamic.literal(hasChanges = hasChanges.asInstanceOf[js.Any], retryAfter = retryAfter.asInstanceOf[js.Any])
      __obj.asInstanceOf[PollResult]
    }
    
    @scala.inline
    implicit class PollResultMutableBuilder[Self <: PollResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasChanges(value: Boolean): Self = StObject.set(x, "hasChanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryAfter(value: Double): Self = StObject.set(x, "retryAfter", value.asInstanceOf[js.Any])
    }
  }
  
  trait PulledChange extends StObject {
    
    var path: String
    
    var stat: Stat
    
    var wasRemoved: Boolean
  }
  object PulledChange {
    
    @scala.inline
    def apply(path: String, stat: Stat, wasRemoved: Boolean): PulledChange = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any], wasRemoved = wasRemoved.asInstanceOf[js.Any])
      __obj.asInstanceOf[PulledChange]
    }
    
    @scala.inline
    implicit class PulledChangeMutableBuilder[Self <: PulledChange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStat(value: Stat): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWasRemoved(value: Boolean): Self = StObject.set(x, "wasRemoved", value.asInstanceOf[js.Any])
    }
  }
  
  trait PulledChanges extends StObject {
    
    var blankSlate: Boolean
    
    def cursor(): String
    
    var cursorTag: String
    
    var shouldBackOff: Boolean
    
    var shouldPullAgain: Boolean
  }
  object PulledChanges {
    
    @scala.inline
    def apply(
      blankSlate: Boolean,
      cursor: () => String,
      cursorTag: String,
      shouldBackOff: Boolean,
      shouldPullAgain: Boolean
    ): PulledChanges = {
      val __obj = js.Dynamic.literal(blankSlate = blankSlate.asInstanceOf[js.Any], cursor = js.Any.fromFunction0(cursor), cursorTag = cursorTag.asInstanceOf[js.Any], shouldBackOff = shouldBackOff.asInstanceOf[js.Any], shouldPullAgain = shouldPullAgain.asInstanceOf[js.Any])
      __obj.asInstanceOf[PulledChanges]
    }
    
    @scala.inline
    implicit class PulledChangesMutableBuilder[Self <: PulledChanges] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlankSlate(value: Boolean): Self = StObject.set(x, "blankSlate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursor(value: () => String): Self = StObject.set(x, "cursor", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCursorTag(value: String): Self = StObject.set(x, "cursorTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldBackOff(value: Boolean): Self = StObject.set(x, "shouldBackOff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldPullAgain(value: Boolean): Self = StObject.set(x, "shouldPullAgain", value.asInstanceOf[js.Any])
    }
  }
  
  trait RangeInfo extends StObject {
    
    var end: Double
    
    var size: Double
    
    var start: Double
  }
  object RangeInfo {
    
    @scala.inline
    def apply(end: Double, size: Double, start: Double): RangeInfo = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangeInfo]
    }
    
    @scala.inline
    implicit class RangeInfoMutableBuilder[Self <: RangeInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait UploadCursor extends StObject {
    
    var expiresAt: Date
    
    var offset: Double
    
    var tag: String
    
    def toJSON(): js.Object
  }
  object UploadCursor {
    
    @scala.inline
    def apply(expiresAt: Date, offset: Double, tag: String, toJSON: () => js.Object): UploadCursor = {
      val __obj = js.Dynamic.literal(expiresAt = expiresAt.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[UploadCursor]
    }
    
    @scala.inline
    implicit class UploadCursorMutableBuilder[Self <: UploadCursor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpiresAt(value: Date): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Object): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
}
