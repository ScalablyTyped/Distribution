package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for a risk analysis job. See
  * https://cloud.google.com/dlp/docs/concepts-risk-analysis to learn more.
  */
@js.native
trait Schema$GooglePrivacyDlpV2RiskAnalysisJobConfig extends js.Object {
  /**
    * Actions to execute at the completion of the job. Are executed in the
    * order provided.
    */
  var actions: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2Action]] = js.native
  /**
    * Privacy metric to compute.
    */
  var privacyMetric: js.UndefOr[Schema$GooglePrivacyDlpV2PrivacyMetric] = js.native
  /**
    * Input dataset to compute metrics over.
    */
  var sourceTable: js.UndefOr[Schema$GooglePrivacyDlpV2BigQueryTable] = js.native
}

object Schema$GooglePrivacyDlpV2RiskAnalysisJobConfig {
  @scala.inline
  def apply(
    actions: js.Array[Schema$GooglePrivacyDlpV2Action] = null,
    privacyMetric: Schema$GooglePrivacyDlpV2PrivacyMetric = null,
    sourceTable: Schema$GooglePrivacyDlpV2BigQueryTable = null
  ): Schema$GooglePrivacyDlpV2RiskAnalysisJobConfig = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (privacyMetric != null) __obj.updateDynamic("privacyMetric")(privacyMetric.asInstanceOf[js.Any])
    if (sourceTable != null) __obj.updateDynamic("sourceTable")(sourceTable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2RiskAnalysisJobConfig]
  }
}

