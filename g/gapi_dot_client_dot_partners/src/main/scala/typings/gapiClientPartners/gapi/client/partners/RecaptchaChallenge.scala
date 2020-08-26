package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecaptchaChallenge extends js.Object {
  /** The ID of the reCaptcha challenge. */
  var id: js.UndefOr[String] = js.native
  /** The response to the reCaptcha challenge. */
  var response: js.UndefOr[String] = js.native
}

object RecaptchaChallenge {
  @scala.inline
  def apply(): RecaptchaChallenge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecaptchaChallenge]
  }
  @scala.inline
  implicit class RecaptchaChallengeOps[Self <: RecaptchaChallenge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setResponse(value: String): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
  }
  
}

