package typings.googleapis.buildSrcApisIdentitytoolkitV3Mod.identitytoolkit_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for Identitytoolkit-SendVerificationCode
  */
@js.native
trait Schema$IdentitytoolkitRelyingpartySendVerificationCodeResponse extends js.Object {
  /**
    * Encrypted session information
    */
  var sessionInfo: js.UndefOr[String] = js.native
}

object Schema$IdentitytoolkitRelyingpartySendVerificationCodeResponse {
  @scala.inline
  def apply(sessionInfo: String = null): Schema$IdentitytoolkitRelyingpartySendVerificationCodeResponse = {
    val __obj = js.Dynamic.literal()
    if (sessionInfo != null) __obj.updateDynamic("sessionInfo")(sessionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$IdentitytoolkitRelyingpartySendVerificationCodeResponse]
  }
}

