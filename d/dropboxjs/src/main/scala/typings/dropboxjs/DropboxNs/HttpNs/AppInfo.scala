package typings.dropboxjs.DropboxNs.HttpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.Http.AppInfo")
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

/* static members */
@JSGlobal("Dropbox.Http.AppInfo")
@js.native
object AppInfo extends js.Object {
  var ICON_LARGE: Double = js.native
  var ICON_SMALL: Double = js.native
  def parse(appInfo: js.Object): AppInfo = js.native
  def parse(appInfo: js.Object, appKey: String): AppInfo = js.native
}

