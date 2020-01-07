package typings.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The GetNotificationChannelVerificationCode request.
  */
@js.native
trait Schema$GetNotificationChannelVerificationCodeResponse extends js.Object {
  /**
    * The verification code, which may be used to verify other channels that
    * have an equivalent identity (i.e. other channels of the same type with
    * the same fingerprint such as other email channels with the same email
    * address or other sms channels with the same number).
    */
  var code: js.UndefOr[String] = js.native
  /**
    * The expiration time associated with the code that was returned. If an
    * expiration was provided in the request, this is the minimum of the
    * requested expiration in the request and the max permitted expiration.
    */
  var expireTime: js.UndefOr[String] = js.native
}

object Schema$GetNotificationChannelVerificationCodeResponse {
  @scala.inline
  def apply(code: String = null, expireTime: String = null): Schema$GetNotificationChannelVerificationCodeResponse = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (expireTime != null) __obj.updateDynamic("expireTime")(expireTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GetNotificationChannelVerificationCodeResponse]
  }
}

