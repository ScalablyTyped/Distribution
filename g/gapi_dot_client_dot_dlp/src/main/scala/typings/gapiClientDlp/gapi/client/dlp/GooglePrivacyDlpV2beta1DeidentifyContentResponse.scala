package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1DeidentifyContentResponse extends js.Object {
  var items: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1ContentItem]] = js.undefined
  /** A review of the transformations that took place for each item. */
  var summaries: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1DeidentificationSummary]] = js.undefined
}

object GooglePrivacyDlpV2beta1DeidentifyContentResponse {
  @scala.inline
  def apply(
    items: js.Array[GooglePrivacyDlpV2beta1ContentItem] = null,
    summaries: js.Array[GooglePrivacyDlpV2beta1DeidentificationSummary] = null
  ): GooglePrivacyDlpV2beta1DeidentifyContentResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (summaries != null) __obj.updateDynamic("summaries")(summaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1DeidentifyContentResponse]
  }
}

