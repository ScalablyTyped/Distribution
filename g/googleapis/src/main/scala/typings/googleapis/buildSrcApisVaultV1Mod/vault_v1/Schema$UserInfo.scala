package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * User&#39;s information.
  */
@js.native
trait Schema$UserInfo extends js.Object {
  /**
    * The displayed name of the user.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The email address of the user.
    */
  var email: js.UndefOr[String] = js.native
}

object Schema$UserInfo {
  @scala.inline
  def apply(displayName: String = null, email: String = null): Schema$UserInfo = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UserInfo]
  }
}

