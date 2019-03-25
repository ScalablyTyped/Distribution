package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeOsDeviceDeviceFiles extends js.Object {
  var createTime: js.UndefOr[java.lang.String] = js.undefined
  var downloadUrl: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ChromeOsDeviceDeviceFiles {
  @scala.inline
  def apply(
    createTime: java.lang.String = null,
    downloadUrl: java.lang.String = null,
    name: java.lang.String = null,
    `type`: java.lang.String = null
  ): ChromeOsDeviceDeviceFiles = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime)
    if (downloadUrl != null) __obj.updateDynamic("downloadUrl")(downloadUrl)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ChromeOsDeviceDeviceFiles]
  }
}

