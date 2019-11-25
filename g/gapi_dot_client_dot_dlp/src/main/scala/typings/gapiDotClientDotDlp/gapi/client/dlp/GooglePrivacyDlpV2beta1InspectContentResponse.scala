package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1InspectContentResponse extends js.Object {
  /**
    * Each content_item from the request has a result in this list, in the
    * same order as the request.
    */
  var results: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1InspectResult]] = js.undefined
}

object GooglePrivacyDlpV2beta1InspectContentResponse {
  @scala.inline
  def apply(results: js.Array[GooglePrivacyDlpV2beta1InspectResult] = null): GooglePrivacyDlpV2beta1InspectContentResponse = {
    val __obj = js.Dynamic.literal()
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1InspectContentResponse]
  }
}

