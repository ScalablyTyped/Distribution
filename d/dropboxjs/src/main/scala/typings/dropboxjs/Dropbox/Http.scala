package typings.dropboxjs.Dropbox

import typings.dropboxjs.Dropbox.File.Stat
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.Http")
@js.native
object Http extends js.Object {
  @js.native
  class AppInfo () extends js.Object {
    var canUseDatastores: Boolean = js.native
    var canUseFiles: Boolean = js.native
    var canUseFullDropbox: Boolean = js.native
    var hasAppFolder: Boolean = js.native
    var key: String = js.native
    var name: String = js.native
    def icon(width: Double): Unit = js.native
    def icon(width: Double, height: Double): Unit = js.native
  }
  
  @js.native
  class PollResult () extends js.Object {
    var hasChanges: Boolean = js.native
    var retryAfter: Double = js.native
  }
  
  @js.native
  class PulledChange () extends js.Object {
    var path: String = js.native
    var stat: Stat = js.native
    var wasRemoved: Boolean = js.native
  }
  
  @js.native
  class PulledChanges () extends js.Object {
    var blankSlate: Boolean = js.native
    var cursorTag: String = js.native
    var shouldBackOff: Boolean = js.native
    var shouldPullAgain: Boolean = js.native
    def cursor(): String = js.native
  }
  
  @js.native
  class RangeInfo () extends js.Object {
    var end: Double = js.native
    var size: Double = js.native
    var start: Double = js.native
  }
  
  @js.native
  class UploadCursor protected () extends js.Object {
    def this(cursorData: String) = this()
    def this(cursorData: js.Object) = this()
    var expiresAt: Date = js.native
    var offset: Double = js.native
    var tag: String = js.native
    def toJSON(): js.Object = js.native
  }
  
  /* static members */
  @js.native
  object AppInfo extends js.Object {
    var ICON_LARGE: Double = js.native
    var ICON_SMALL: Double = js.native
    def parse(appInfo: js.Object): AppInfo = js.native
    def parse(appInfo: js.Object, appKey: String): AppInfo = js.native
  }
  
  /* static members */
  @js.native
  object PollResult extends js.Object {
    def parse(response: js.Object): PollResult = js.native
  }
  
  /* static members */
  @js.native
  object PulledChange extends js.Object {
    def parse(entry: js.Object): PulledChange = js.native
  }
  
  /* static members */
  @js.native
  object PulledChanges extends js.Object {
    def parse(deltaInfo: js.Object): PulledChanges = js.native
  }
  
  /* static members */
  @js.native
  object RangeInfo extends js.Object {
    def parse(headerValue: String): RangeInfo = js.native
  }
  
  /* static members */
  @js.native
  object UploadCursor extends js.Object {
    def parse(cursorData: String): UploadCursor = js.native
    def parse(cursorData: js.Object): UploadCursor = js.native
  }
  
}

