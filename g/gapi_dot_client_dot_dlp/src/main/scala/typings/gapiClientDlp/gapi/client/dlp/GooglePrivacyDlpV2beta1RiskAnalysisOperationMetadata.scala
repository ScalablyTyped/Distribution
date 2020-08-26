package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1RiskAnalysisOperationMetadata extends js.Object {
  /** The time which this request was started. */
  var createTime: js.UndefOr[String] = js.native
  /** Privacy metric to compute. */
  var requestedPrivacyMetric: js.UndefOr[GooglePrivacyDlpV2beta1PrivacyMetric] = js.native
  /** Input dataset to compute metrics over. */
  var requestedSourceTable: js.UndefOr[GooglePrivacyDlpV2beta1BigQueryTable] = js.native
}

object GooglePrivacyDlpV2beta1RiskAnalysisOperationMetadata {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1RiskAnalysisOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1RiskAnalysisOperationMetadata]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1RiskAnalysisOperationMetadataOps[Self <: GooglePrivacyDlpV2beta1RiskAnalysisOperationMetadata] (val x: Self) extends AnyVal {
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setRequestedPrivacyMetric(value: GooglePrivacyDlpV2beta1PrivacyMetric): Self = this.set("requestedPrivacyMetric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestedPrivacyMetric: Self = this.set("requestedPrivacyMetric", js.undefined)
    @scala.inline
    def setRequestedSourceTable(value: GooglePrivacyDlpV2beta1BigQueryTable): Self = this.set("requestedSourceTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestedSourceTable: Self = this.set("requestedSourceTable", js.undefined)
  }
  
}

