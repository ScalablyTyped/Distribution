package typings.dropboxjs.global.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Dropbox.Http")
@js.native
object Http extends js.Object {
  
  @js.native
  class AppInfo ()
    extends typings.dropboxjs.Dropbox.Http.AppInfo
  /* static members */
  @js.native
  object AppInfo extends js.Object {
    
    var ICON_LARGE: Double = js.native
    
    var ICON_SMALL: Double = js.native
    
    def parse(appInfo: js.Object): typings.dropboxjs.Dropbox.Http.AppInfo = js.native
    def parse(appInfo: js.Object, appKey: String): typings.dropboxjs.Dropbox.Http.AppInfo = js.native
  }
  
  @js.native
  class PollResult ()
    extends typings.dropboxjs.Dropbox.Http.PollResult
  /* static members */
  @js.native
  object PollResult extends js.Object {
    
    def parse(response: js.Object): typings.dropboxjs.Dropbox.Http.PollResult = js.native
  }
  
  @js.native
  class PulledChange ()
    extends typings.dropboxjs.Dropbox.Http.PulledChange
  /* static members */
  @js.native
  object PulledChange extends js.Object {
    
    def parse(entry: js.Object): typings.dropboxjs.Dropbox.Http.PulledChange = js.native
  }
  
  @js.native
  class PulledChanges ()
    extends typings.dropboxjs.Dropbox.Http.PulledChanges
  /* static members */
  @js.native
  object PulledChanges extends js.Object {
    
    def parse(deltaInfo: js.Object): typings.dropboxjs.Dropbox.Http.PulledChanges = js.native
  }
  
  @js.native
  class RangeInfo ()
    extends typings.dropboxjs.Dropbox.Http.RangeInfo
  /* static members */
  @js.native
  object RangeInfo extends js.Object {
    
    def parse(headerValue: String): typings.dropboxjs.Dropbox.Http.RangeInfo = js.native
  }
  
  @js.native
  class UploadCursor protected ()
    extends typings.dropboxjs.Dropbox.Http.UploadCursor {
    def this(cursorData: String) = this()
    def this(cursorData: js.Object) = this()
  }
  /* static members */
  @js.native
  object UploadCursor extends js.Object {
    
    def parse(cursorData: String): typings.dropboxjs.Dropbox.Http.UploadCursor = js.native
    def parse(cursorData: js.Object): typings.dropboxjs.Dropbox.Http.UploadCursor = js.native
  }
}
