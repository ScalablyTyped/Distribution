package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Privacy metric to compute for reidentification risk analysis.
  */
@js.native
trait Schema$GooglePrivacyDlpV2PrivacyMetric extends js.Object {
  var categoricalStatsConfig: js.UndefOr[Schema$GooglePrivacyDlpV2CategoricalStatsConfig] = js.native
  var deltaPresenceEstimationConfig: js.UndefOr[Schema$GooglePrivacyDlpV2DeltaPresenceEstimationConfig] = js.native
  var kAnonymityConfig: js.UndefOr[Schema$GooglePrivacyDlpV2KAnonymityConfig] = js.native
  var kMapEstimationConfig: js.UndefOr[Schema$GooglePrivacyDlpV2KMapEstimationConfig] = js.native
  var lDiversityConfig: js.UndefOr[Schema$GooglePrivacyDlpV2LDiversityConfig] = js.native
  var numericalStatsConfig: js.UndefOr[Schema$GooglePrivacyDlpV2NumericalStatsConfig] = js.native
}

object Schema$GooglePrivacyDlpV2PrivacyMetric {
  @scala.inline
  def apply(
    categoricalStatsConfig: Schema$GooglePrivacyDlpV2CategoricalStatsConfig = null,
    deltaPresenceEstimationConfig: Schema$GooglePrivacyDlpV2DeltaPresenceEstimationConfig = null,
    kAnonymityConfig: Schema$GooglePrivacyDlpV2KAnonymityConfig = null,
    kMapEstimationConfig: Schema$GooglePrivacyDlpV2KMapEstimationConfig = null,
    lDiversityConfig: Schema$GooglePrivacyDlpV2LDiversityConfig = null,
    numericalStatsConfig: Schema$GooglePrivacyDlpV2NumericalStatsConfig = null
  ): Schema$GooglePrivacyDlpV2PrivacyMetric = {
    val __obj = js.Dynamic.literal()
    if (categoricalStatsConfig != null) __obj.updateDynamic("categoricalStatsConfig")(categoricalStatsConfig.asInstanceOf[js.Any])
    if (deltaPresenceEstimationConfig != null) __obj.updateDynamic("deltaPresenceEstimationConfig")(deltaPresenceEstimationConfig.asInstanceOf[js.Any])
    if (kAnonymityConfig != null) __obj.updateDynamic("kAnonymityConfig")(kAnonymityConfig.asInstanceOf[js.Any])
    if (kMapEstimationConfig != null) __obj.updateDynamic("kMapEstimationConfig")(kMapEstimationConfig.asInstanceOf[js.Any])
    if (lDiversityConfig != null) __obj.updateDynamic("lDiversityConfig")(lDiversityConfig.asInstanceOf[js.Any])
    if (numericalStatsConfig != null) __obj.updateDynamic("numericalStatsConfig")(numericalStatsConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2PrivacyMetric]
  }
}

