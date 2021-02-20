package typings.dropboxjs.Dropbox

import typings.dropboxjs.Dropbox.File.Stat
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait PollResult extends StObject {
    
    var hasChanges: Boolean = js.native
    
    var retryAfter: Double = js.native
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
  
  @js.native
  trait PulledChange extends StObject {
    
    var path: String = js.native
    
    var stat: Stat = js.native
    
    var wasRemoved: Boolean = js.native
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
  
  @js.native
  trait PulledChanges extends StObject {
    
    var blankSlate: Boolean = js.native
    
    def cursor(): String = js.native
    
    var cursorTag: String = js.native
    
    var shouldBackOff: Boolean = js.native
    
    var shouldPullAgain: Boolean = js.native
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
  
  @js.native
  trait RangeInfo extends StObject {
    
    var end: Double = js.native
    
    var size: Double = js.native
    
    var start: Double = js.native
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
  
  @js.native
  trait UploadCursor extends StObject {
    
    var expiresAt: Date = js.native
    
    var offset: Double = js.native
    
    var tag: String = js.native
    
    def toJSON(): js.Object = js.native
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
