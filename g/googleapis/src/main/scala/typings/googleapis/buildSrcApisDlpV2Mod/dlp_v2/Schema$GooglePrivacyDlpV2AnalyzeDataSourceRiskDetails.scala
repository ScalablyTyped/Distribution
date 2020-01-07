package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of a risk analysis operation request.
  */
@js.native
trait Schema$GooglePrivacyDlpV2AnalyzeDataSourceRiskDetails extends js.Object {
  var categoricalStatsResult: js.UndefOr[Schema$GooglePrivacyDlpV2CategoricalStatsResult] = js.native
  var deltaPresenceEstimationResult: js.UndefOr[Schema$GooglePrivacyDlpV2DeltaPresenceEstimationResult] = js.native
  var kAnonymityResult: js.UndefOr[Schema$GooglePrivacyDlpV2KAnonymityResult] = js.native
  var kMapEstimationResult: js.UndefOr[Schema$GooglePrivacyDlpV2KMapEstimationResult] = js.native
  var lDiversityResult: js.UndefOr[Schema$GooglePrivacyDlpV2LDiversityResult] = js.native
  var numericalStatsResult: js.UndefOr[Schema$GooglePrivacyDlpV2NumericalStatsResult] = js.native
  /**
    * Privacy metric to compute.
    */
  var requestedPrivacyMetric: js.UndefOr[Schema$GooglePrivacyDlpV2PrivacyMetric] = js.native
  /**
    * Input dataset to compute metrics over.
    */
  var requestedSourceTable: js.UndefOr[Schema$GooglePrivacyDlpV2BigQueryTable] = js.native
}

object Schema$GooglePrivacyDlpV2AnalyzeDataSourceRiskDetails {
  @scala.inline
  def apply(
    categoricalStatsResult: Schema$GooglePrivacyDlpV2CategoricalStatsResult = null,
    deltaPresenceEstimationResult: Schema$GooglePrivacyDlpV2DeltaPresenceEstimationResult = null,
    kAnonymityResult: Schema$GooglePrivacyDlpV2KAnonymityResult = null,
    kMapEstimationResult: Schema$GooglePrivacyDlpV2KMapEstimationResult = null,
    lDiversityResult: Schema$GooglePrivacyDlpV2LDiversityResult = null,
    numericalStatsResult: Schema$GooglePrivacyDlpV2NumericalStatsResult = null,
    requestedPrivacyMetric: Schema$GooglePrivacyDlpV2PrivacyMetric = null,
    requestedSourceTable: Schema$GooglePrivacyDlpV2BigQueryTable = null
  ): Schema$GooglePrivacyDlpV2AnalyzeDataSourceRiskDetails = {
    val __obj = js.Dynamic.literal()
    if (categoricalStatsResult != null) __obj.updateDynamic("categoricalStatsResult")(categoricalStatsResult.asInstanceOf[js.Any])
    if (deltaPresenceEstimationResult != null) __obj.updateDynamic("deltaPresenceEstimationResult")(deltaPresenceEstimationResult.asInstanceOf[js.Any])
    if (kAnonymityResult != null) __obj.updateDynamic("kAnonymityResult")(kAnonymityResult.asInstanceOf[js.Any])
    if (kMapEstimationResult != null) __obj.updateDynamic("kMapEstimationResult")(kMapEstimationResult.asInstanceOf[js.Any])
    if (lDiversityResult != null) __obj.updateDynamic("lDiversityResult")(lDiversityResult.asInstanceOf[js.Any])
    if (numericalStatsResult != null) __obj.updateDynamic("numericalStatsResult")(numericalStatsResult.asInstanceOf[js.Any])
    if (requestedPrivacyMetric != null) __obj.updateDynamic("requestedPrivacyMetric")(requestedPrivacyMetric.asInstanceOf[js.Any])
    if (requestedSourceTable != null) __obj.updateDynamic("requestedSourceTable")(requestedSourceTable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2AnalyzeDataSourceRiskDetails]
  }
}

