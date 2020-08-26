package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLeadResponse extends js.Object {
  /**
    * Lead that was created depending on the outcome of
    * <a href="https://www.google.com/recaptcha/">reCaptcha</a> validation.
    */
  var lead: js.UndefOr[Lead] = js.native
  /**
    * The outcome of <a href="https://www.google.com/recaptcha/">reCaptcha</a>
    * validation.
    */
  var recaptchaStatus: js.UndefOr[String] = js.native
  /** Current response metadata. */
  var responseMetadata: js.UndefOr[ResponseMetadata] = js.native
}

object CreateLeadResponse {
  @scala.inline
  def apply(): CreateLeadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLeadResponse]
  }
  @scala.inline
  implicit class CreateLeadResponseOps[Self <: CreateLeadResponse] (val x: Self) extends AnyVal {
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
    def setRecaptchaStatus(value: String): Self = this.set("recaptchaStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecaptchaStatus: Self = this.set("recaptchaStatus", js.undefined)
    @scala.inline
    def setResponseMetadata(value: ResponseMetadata): Self = this.set("responseMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseMetadata: Self = this.set("responseMetadata", js.undefined)
  }
  
}

