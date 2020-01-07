package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON request template for firing commands on Mobile Device in Directory
  * Devices API.
  */
@js.native
trait Schema$MobileDeviceAction extends js.Object {
  /**
    * Action to be taken on the Mobile Device
    */
  var action: js.UndefOr[String] = js.native
}

object Schema$MobileDeviceAction {
  @scala.inline
  def apply(action: String = null): Schema$MobileDeviceAction = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MobileDeviceAction]
  }
}

