package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1DeidentifyContentResponse extends js.Object {
  var items: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1ContentItem]] = js.native
  /** A review of the transformations that took place for each item. */
  var summaries: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1DeidentificationSummary]] = js.native
}

object GooglePrivacyDlpV2beta1DeidentifyContentResponse {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1DeidentifyContentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1DeidentifyContentResponse]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1DeidentifyContentResponseOps[Self <: GooglePrivacyDlpV2beta1DeidentifyContentResponse] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: GooglePrivacyDlpV2beta1ContentItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[GooglePrivacyDlpV2beta1ContentItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setSummariesVarargs(value: GooglePrivacyDlpV2beta1DeidentificationSummary*): Self = this.set("summaries", js.Array(value :_*))
    @scala.inline
    def setSummaries(value: js.Array[GooglePrivacyDlpV2beta1DeidentificationSummary]): Self = this.set("summaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummaries: Self = this.set("summaries", js.undefined)
  }
  
}

