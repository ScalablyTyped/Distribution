package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1RedactContentResponse extends js.Object {
  /** The redacted content. */
  var items: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1ContentItem]] = js.undefined
}

object GooglePrivacyDlpV2beta1RedactContentResponse {
  @scala.inline
  def apply(items: js.Array[GooglePrivacyDlpV2beta1ContentItem] = null): GooglePrivacyDlpV2beta1RedactContentResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1RedactContentResponse]
  }
}

