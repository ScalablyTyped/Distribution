package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1AnalyzeDataSourceRiskRequest extends js.Object {
  /** Privacy metric to compute. */
  var privacyMetric: js.UndefOr[GooglePrivacyDlpV2beta1PrivacyMetric] = js.native
  /** Input dataset to compute metrics over. */
  var sourceTable: js.UndefOr[GooglePrivacyDlpV2beta1BigQueryTable] = js.native
}

object GooglePrivacyDlpV2beta1AnalyzeDataSourceRiskRequest {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1AnalyzeDataSourceRiskRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1AnalyzeDataSourceRiskRequest]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1AnalyzeDataSourceRiskRequestOps[Self <: GooglePrivacyDlpV2beta1AnalyzeDataSourceRiskRequest] (val x: Self) extends AnyVal {
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
    def setPrivacyMetric(value: GooglePrivacyDlpV2beta1PrivacyMetric): Self = this.set("privacyMetric", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivacyMetric: Self = this.set("privacyMetric", js.undefined)
    @scala.inline
    def setSourceTable(value: GooglePrivacyDlpV2beta1BigQueryTable): Self = this.set("sourceTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceTable: Self = this.set("sourceTable", js.undefined)
  }
  
}

