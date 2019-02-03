package typings
package dropboxjsLib.DropboxNs.HttpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.Http.AppInfo")
@js.native
class AppInfo () extends js.Object {
  var canUseDatastores: scala.Boolean = js.native
  var canUseFiles: scala.Boolean = js.native
  var canUseFullDropbox: scala.Boolean = js.native
  var hasAppFolder: scala.Boolean = js.native
  var key: java.lang.String = js.native
  var name: java.lang.String = js.native
  def icon(width: scala.Double): scala.Unit = js.native
  def icon(width: scala.Double, height: scala.Double): scala.Unit = js.native
}

/* static members */
@JSGlobal("Dropbox.Http.AppInfo")
@js.native
object AppInfo extends js.Object {
  var ICON_LARGE: scala.Double = js.native
  var ICON_SMALL: scala.Double = js.native
  def parse(appInfo: js.Object): dropboxjsLib.DropboxNs.HttpNs.AppInfo = js.native
  def parse(appInfo: js.Object, appKey: java.lang.String): dropboxjsLib.DropboxNs.HttpNs.AppInfo = js.native
}

