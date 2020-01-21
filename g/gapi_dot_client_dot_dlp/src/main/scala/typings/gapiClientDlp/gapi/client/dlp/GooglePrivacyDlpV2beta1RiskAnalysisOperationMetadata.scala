package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1RiskAnalysisOperationMetadata extends js.Object {
  /** The time which this request was started. */
  var createTime: js.UndefOr[String] = js.undefined
  /** Privacy metric to compute. */
  var requestedPrivacyMetric: js.UndefOr[GooglePrivacyDlpV2beta1PrivacyMetric] = js.undefined
  /** Input dataset to compute metrics over. */
  var requestedSourceTable: js.UndefOr[GooglePrivacyDlpV2beta1BigQueryTable] = js.undefined
}

object GooglePrivacyDlpV2beta1RiskAnalysisOperationMetadata {
  @scala.inline
  def apply(
    createTime: String = null,
    requestedPrivacyMetric: GooglePrivacyDlpV2beta1PrivacyMetric = null,
    requestedSourceTable: GooglePrivacyDlpV2beta1BigQueryTable = null
  ): GooglePrivacyDlpV2beta1RiskAnalysisOperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (requestedPrivacyMetric != null) __obj.updateDynamic("requestedPrivacyMetric")(requestedPrivacyMetric.asInstanceOf[js.Any])
    if (requestedSourceTable != null) __obj.updateDynamic("requestedSourceTable")(requestedSourceTable.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1RiskAnalysisOperationMetadata]
  }
}

