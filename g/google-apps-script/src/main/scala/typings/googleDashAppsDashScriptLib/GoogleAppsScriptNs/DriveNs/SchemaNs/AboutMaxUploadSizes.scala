package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AboutMaxUploadSizes extends js.Object {
  var size: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object AboutMaxUploadSizes {
  @scala.inline
  def apply(size: java.lang.String = null, `type`: java.lang.String = null): AboutMaxUploadSizes = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AboutMaxUploadSizes]
  }
}

