package typings.googleapis.buildSrcApisIdentitytoolkitV3Mod.identitytoolkit_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response of getting recaptcha param.
  */
@js.native
trait Schema$GetRecaptchaParamResponse extends js.Object {
  /**
    * The fixed string &quot;identitytoolkit#GetRecaptchaParamResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Site key registered at recaptcha.
    */
  var recaptchaSiteKey: js.UndefOr[String] = js.native
  /**
    * The stoken field for the recaptcha widget, used to request captcha
    * challenge.
    */
  var recaptchaStoken: js.UndefOr[String] = js.native
}

object Schema$GetRecaptchaParamResponse {
  @scala.inline
  def apply(kind: String = null, recaptchaSiteKey: String = null, recaptchaStoken: String = null): Schema$GetRecaptchaParamResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (recaptchaSiteKey != null) __obj.updateDynamic("recaptchaSiteKey")(recaptchaSiteKey.asInstanceOf[js.Any])
    if (recaptchaStoken != null) __obj.updateDynamic("recaptchaStoken")(recaptchaStoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GetRecaptchaParamResponse]
  }
}

