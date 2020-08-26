package typings.gapiClientDlp.gapi.client.dlp

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDlp.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentResource extends js.Object {
  /**
    * De-identifies potentially sensitive info from a list of strings.
    * This method has limits on input size and output size.
    */
  def deidentify(request: Accesstoken): Request[GooglePrivacyDlpV2beta1DeidentifyContentResponse] = js.native
  /**
    * Finds potentially sensitive info in a list of strings.
    * This method has limits on input size, processing time, and output size.
    */
  def inspect(request: Accesstoken): Request[GooglePrivacyDlpV2beta1InspectContentResponse] = js.native
  /**
    * Redacts potentially sensitive info from a list of strings.
    * This method has limits on input size, processing time, and output size.
    */
  def redact(request: Accesstoken): Request[GooglePrivacyDlpV2beta1RedactContentResponse] = js.native
}

object ContentResource {
  @scala.inline
  def apply(
    deidentify: Accesstoken => Request[GooglePrivacyDlpV2beta1DeidentifyContentResponse],
    inspect: Accesstoken => Request[GooglePrivacyDlpV2beta1InspectContentResponse],
    redact: Accesstoken => Request[GooglePrivacyDlpV2beta1RedactContentResponse]
  ): ContentResource = {
    val __obj = js.Dynamic.literal(deidentify = js.Any.fromFunction1(deidentify), inspect = js.Any.fromFunction1(inspect), redact = js.Any.fromFunction1(redact))
    __obj.asInstanceOf[ContentResource]
  }
  @scala.inline
  implicit class ContentResourceOps[Self <: ContentResource] (val x: Self) extends AnyVal {
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
    def setDeidentify(value: Accesstoken => Request[GooglePrivacyDlpV2beta1DeidentifyContentResponse]): Self = this.set("deidentify", js.Any.fromFunction1(value))
    @scala.inline
    def setInspect(value: Accesstoken => Request[GooglePrivacyDlpV2beta1InspectContentResponse]): Self = this.set("inspect", js.Any.fromFunction1(value))
    @scala.inline
    def setRedact(value: Accesstoken => Request[GooglePrivacyDlpV2beta1RedactContentResponse]): Self = this.set("redact", js.Any.fromFunction1(value))
  }
  
}

