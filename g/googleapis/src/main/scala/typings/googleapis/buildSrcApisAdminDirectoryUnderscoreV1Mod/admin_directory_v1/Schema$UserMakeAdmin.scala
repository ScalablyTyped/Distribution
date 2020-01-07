package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON request template for setting/revoking admin status of a user in
  * Directory API.
  */
@js.native
trait Schema$UserMakeAdmin extends js.Object {
  /**
    * Boolean indicating new admin status of the user
    */
  var status: js.UndefOr[Boolean] = js.native
}

object Schema$UserMakeAdmin {
  @scala.inline
  def apply(status: js.UndefOr[Boolean] = js.undefined): Schema$UserMakeAdmin = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UserMakeAdmin]
  }
}

