package typings.dropboxjs.global.Dropbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Http {
  
  @JSGlobal("Dropbox.Http.AppInfo")
  @js.native
  class AppInfo ()
    extends typings.dropboxjs.Dropbox.Http.AppInfo
  object AppInfo {
    
    @JSGlobal("Dropbox.Http.AppInfo")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Dropbox.Http.AppInfo.ICON_LARGE")
    @js.native
    def ICON_LARGE: Double = js.native
    @scala.inline
    def ICON_LARGE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ICON_LARGE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dropbox.Http.AppInfo.ICON_SMALL")
    @js.native
    def ICON_SMALL: Double = js.native
    @scala.inline
    def ICON_SMALL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ICON_SMALL")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dropbox.Http.AppInfo.parse")
    @js.native
    def parse(appInfo: js.Object): typings.dropboxjs.Dropbox.Http.AppInfo = js.native
    @JSGlobal("Dropbox.Http.AppInfo.parse")
    @js.native
    def parse(appInfo: js.Object, appKey: String): typings.dropboxjs.Dropbox.Http.AppInfo = js.native
  }
  
  @JSGlobal("Dropbox.Http.PollResult")
  @js.native
  class PollResult ()
    extends typings.dropboxjs.Dropbox.Http.PollResult
  object PollResult {
    
    /* static member */
    @JSGlobal("Dropbox.Http.PollResult.parse")
    @js.native
    def parse(response: js.Object): typings.dropboxjs.Dropbox.Http.PollResult = js.native
  }
  
  @JSGlobal("Dropbox.Http.PulledChange")
  @js.native
  class PulledChange ()
    extends typings.dropboxjs.Dropbox.Http.PulledChange
  object PulledChange {
    
    /* static member */
    @JSGlobal("Dropbox.Http.PulledChange.parse")
    @js.native
    def parse(entry: js.Object): typings.dropboxjs.Dropbox.Http.PulledChange = js.native
  }
  
  @JSGlobal("Dropbox.Http.PulledChanges")
  @js.native
  class PulledChanges ()
    extends typings.dropboxjs.Dropbox.Http.PulledChanges
  object PulledChanges {
    
    /* static member */
    @JSGlobal("Dropbox.Http.PulledChanges.parse")
    @js.native
    def parse(deltaInfo: js.Object): typings.dropboxjs.Dropbox.Http.PulledChanges = js.native
  }
  
  @JSGlobal("Dropbox.Http.RangeInfo")
  @js.native
  class RangeInfo ()
    extends typings.dropboxjs.Dropbox.Http.RangeInfo
  object RangeInfo {
    
    /* static member */
    @JSGlobal("Dropbox.Http.RangeInfo.parse")
    @js.native
    def parse(headerValue: String): typings.dropboxjs.Dropbox.Http.RangeInfo = js.native
  }
  
  @JSGlobal("Dropbox.Http.UploadCursor")
  @js.native
  class UploadCursor protected ()
    extends typings.dropboxjs.Dropbox.Http.UploadCursor {
    def this(cursorData: String) = this()
    def this(cursorData: js.Object) = this()
  }
  object UploadCursor {
    
    /* static member */
    @JSGlobal("Dropbox.Http.UploadCursor.parse")
    @js.native
    def parse(cursorData: String): typings.dropboxjs.Dropbox.Http.UploadCursor = js.native
    /* static member */
    @JSGlobal("Dropbox.Http.UploadCursor.parse")
    @js.native
    def parse(cursorData: js.Object): typings.dropboxjs.Dropbox.Http.UploadCursor = js.native
  }
}
