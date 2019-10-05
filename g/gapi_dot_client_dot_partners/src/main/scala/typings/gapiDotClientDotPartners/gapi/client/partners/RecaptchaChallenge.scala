package typings.gapiDotClientDotPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecaptchaChallenge extends js.Object {
  /** The ID of the reCaptcha challenge. */
  var id: js.UndefOr[String] = js.undefined
  /** The response to the reCaptcha challenge. */
  var response: js.UndefOr[String] = js.undefined
}

object RecaptchaChallenge {
  @scala.inline
  def apply(id: String = null, response: String = null): RecaptchaChallenge = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (response != null) __obj.updateDynamic("response")(response)
    __obj.asInstanceOf[RecaptchaChallenge]
  }
}

