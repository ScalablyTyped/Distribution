package typings.googleapis.buildSrcApisWebsecurityscannerV1alphaMod.websecurityscanner_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes authentication configuration that uses a Google account.
  */
@js.native
trait Schema$GoogleAccount extends js.Object {
  /**
    * Input only. Required. The password of the Google account. The credential
    * is stored encrypted and not returned in any response nor included in
    * audit logs.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * Required. The user name of the Google account.
    */
  var username: js.UndefOr[String] = js.native
}

object Schema$GoogleAccount {
  @scala.inline
  def apply(password: String = null, username: String = null): Schema$GoogleAccount = {
    val __obj = js.Dynamic.literal()
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleAccount]
  }
}

