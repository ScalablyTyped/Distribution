package typings.gapiClientDlp.gapi.client.dlp

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDlp.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentResource extends js.Object {
  /**
    * De-identifies potentially sensitive info from a list of strings.
    * This method has limits on input size and output size.
    */
  def deidentify(request: AnonAccesstoken): Request_[GooglePrivacyDlpV2beta1DeidentifyContentResponse]
  /**
    * Finds potentially sensitive info in a list of strings.
    * This method has limits on input size, processing time, and output size.
    */
  def inspect(request: AnonAccesstoken): Request_[GooglePrivacyDlpV2beta1InspectContentResponse]
  /**
    * Redacts potentially sensitive info from a list of strings.
    * This method has limits on input size, processing time, and output size.
    */
  def redact(request: AnonAccesstoken): Request_[GooglePrivacyDlpV2beta1RedactContentResponse]
}

object ContentResource {
  @scala.inline
  def apply(
    deidentify: AnonAccesstoken => Request_[GooglePrivacyDlpV2beta1DeidentifyContentResponse],
    inspect: AnonAccesstoken => Request_[GooglePrivacyDlpV2beta1InspectContentResponse],
    redact: AnonAccesstoken => Request_[GooglePrivacyDlpV2beta1RedactContentResponse]
  ): ContentResource = {
    val __obj = js.Dynamic.literal(deidentify = js.Any.fromFunction1(deidentify), inspect = js.Any.fromFunction1(inspect), redact = js.Any.fromFunction1(redact))
    __obj.asInstanceOf[ContentResource]
  }
}

