package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON request template for firing actions on ChromeOs Device in Directory
  * Devices API.
  */
@js.native
trait Schema$ChromeOsDeviceAction extends js.Object {
  /**
    * Action to be taken on the ChromeOs Device
    */
  var action: js.UndefOr[String] = js.native
  var deprovisionReason: js.UndefOr[String] = js.native
}

object Schema$ChromeOsDeviceAction {
  @scala.inline
  def apply(action: String = null, deprovisionReason: String = null): Schema$ChromeOsDeviceAction = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (deprovisionReason != null) __obj.updateDynamic("deprovisionReason")(deprovisionReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ChromeOsDeviceAction]
  }
}

