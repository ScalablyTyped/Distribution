package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON request template for moving ChromeOs Device to given OU in Directory
  * Devices API.
  */
@js.native
trait Schema$ChromeOsMoveDevicesToOu extends js.Object {
  /**
    * ChromeOs Devices to be moved to OU
    */
  var deviceIds: js.UndefOr[js.Array[String]] = js.native
}

object Schema$ChromeOsMoveDevicesToOu {
  @scala.inline
  def apply(deviceIds: js.Array[String] = null): Schema$ChromeOsMoveDevicesToOu = {
    val __obj = js.Dynamic.literal()
    if (deviceIds != null) __obj.updateDynamic("deviceIds")(deviceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ChromeOsMoveDevicesToOu]
  }
}

