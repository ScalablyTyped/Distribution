package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLeadRequest extends js.Object {
  /**
    * The lead resource. The `LeadType` must not be `LEAD_TYPE_UNSPECIFIED`
    * and either `email` or `phone_number` must be provided.
    */
  var lead: js.UndefOr[Lead] = js.undefined
  /** <a href="https://www.google.com/recaptcha/">reCaptcha</a> challenge info. */
  var recaptchaChallenge: js.UndefOr[RecaptchaChallenge] = js.undefined
  /** Current request metadata. */
  var requestMetadata: js.UndefOr[RequestMetadata] = js.undefined
}

object CreateLeadRequest {
  @scala.inline
  def apply(
    lead: Lead = null,
    recaptchaChallenge: RecaptchaChallenge = null,
    requestMetadata: RequestMetadata = null
  ): CreateLeadRequest = {
    val __obj = js.Dynamic.literal()
    if (lead != null) __obj.updateDynamic("lead")(lead.asInstanceOf[js.Any])
    if (recaptchaChallenge != null) __obj.updateDynamic("recaptchaChallenge")(recaptchaChallenge.asInstanceOf[js.Any])
    if (requestMetadata != null) __obj.updateDynamic("requestMetadata")(requestMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLeadRequest]
  }
}

