package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeOsDeviceDeviceFiles extends js.Object {
  var createTime: js.UndefOr[String] = js.undefined
  var downloadUrl: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ChromeOsDeviceDeviceFiles {
  @scala.inline
  def apply(createTime: String = null, downloadUrl: String = null, name: String = null, `type`: String = null): ChromeOsDeviceDeviceFiles = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime)
    if (downloadUrl != null) __obj.updateDynamic("downloadUrl")(downloadUrl)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ChromeOsDeviceDeviceFiles]
  }
}

