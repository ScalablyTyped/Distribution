package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLeadRequest extends js.Object {
  /**
    * The lead resource. The `LeadType` must not be `LEAD_TYPE_UNSPECIFIED`
    * and either `email` or `phone_number` must be provided.
    */
  var lead: js.UndefOr[Lead] = js.native
  /** <a href="https://www.google.com/recaptcha/">reCaptcha</a> challenge info. */
  var recaptchaChallenge: js.UndefOr[RecaptchaChallenge] = js.native
  /** Current request metadata. */
  var requestMetadata: js.UndefOr[RequestMetadata] = js.native
}

object CreateLeadRequest {
  @scala.inline
  def apply(): CreateLeadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLeadRequest]
  }
  @scala.inline
  implicit class CreateLeadRequestOps[Self <: CreateLeadRequest] (val x: Self) extends AnyVal {
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
    def setLead(value: Lead): Self = this.set("lead", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLead: Self = this.set("lead", js.undefined)
    @scala.inline
    def setRecaptchaChallenge(value: RecaptchaChallenge): Self = this.set("recaptchaChallenge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecaptchaChallenge: Self = this.set("recaptchaChallenge", js.undefined)
    @scala.inline
    def setRequestMetadata(value: RequestMetadata): Self = this.set("requestMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestMetadata: Self = this.set("requestMetadata", js.undefined)
  }
  
}

