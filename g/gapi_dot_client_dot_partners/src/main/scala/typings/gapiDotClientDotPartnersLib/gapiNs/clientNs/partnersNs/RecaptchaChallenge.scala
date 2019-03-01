package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecaptchaChallenge extends js.Object {
  /** The ID of the reCaptcha challenge. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The response to the reCaptcha challenge. */
  var response: js.UndefOr[java.lang.String] = js.undefined
}

object RecaptchaChallenge {
  @scala.inline
  def apply(id: java.lang.String = null, response: java.lang.String = null): RecaptchaChallenge = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (response != null) __obj.updateDynamic("response")(response)
    __obj.asInstanceOf[RecaptchaChallenge]
  }
}

