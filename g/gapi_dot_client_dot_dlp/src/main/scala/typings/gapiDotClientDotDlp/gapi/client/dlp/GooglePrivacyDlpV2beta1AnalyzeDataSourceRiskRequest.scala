package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1AnalyzeDataSourceRiskRequest extends js.Object {
  /** Privacy metric to compute. */
  var privacyMetric: js.UndefOr[GooglePrivacyDlpV2beta1PrivacyMetric] = js.undefined
  /** Input dataset to compute metrics over. */
  var sourceTable: js.UndefOr[GooglePrivacyDlpV2beta1BigQueryTable] = js.undefined
}

object GooglePrivacyDlpV2beta1AnalyzeDataSourceRiskRequest {
  @scala.inline
  def apply(
    privacyMetric: GooglePrivacyDlpV2beta1PrivacyMetric = null,
    sourceTable: GooglePrivacyDlpV2beta1BigQueryTable = null
  ): GooglePrivacyDlpV2beta1AnalyzeDataSourceRiskRequest = {
    val __obj = js.Dynamic.literal()
    if (privacyMetric != null) __obj.updateDynamic("privacyMetric")(privacyMetric)
    if (sourceTable != null) __obj.updateDynamic("sourceTable")(sourceTable)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1AnalyzeDataSourceRiskRequest]
  }
}

