package typings.gapiDotClientDotPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLeadResponse extends js.Object {
  /**
    * Lead that was created depending on the outcome of
    * <a href="https://www.google.com/recaptcha/">reCaptcha</a> validation.
    */
  var lead: js.UndefOr[Lead] = js.undefined
  /**
    * The outcome of <a href="https://www.google.com/recaptcha/">reCaptcha</a>
    * validation.
    */
  var recaptchaStatus: js.UndefOr[String] = js.undefined
  /** Current response metadata. */
  var responseMetadata: js.UndefOr[ResponseMetadata] = js.undefined
}

object CreateLeadResponse {
  @scala.inline
  def apply(lead: Lead = null, recaptchaStatus: String = null, responseMetadata: ResponseMetadata = null): CreateLeadResponse = {
    val __obj = js.Dynamic.literal()
    if (lead != null) __obj.updateDynamic("lead")(lead.asInstanceOf[js.Any])
    if (recaptchaStatus != null) __obj.updateDynamic("recaptchaStatus")(recaptchaStatus.asInstanceOf[js.Any])
    if (responseMetadata != null) __obj.updateDynamic("responseMetadata")(responseMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLeadResponse]
  }
}

