package typings.gapiDotClientDotDlp.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1RiskAnalysisOperationResult extends js.Object {
  var categoricalStatsResult: js.UndefOr[GooglePrivacyDlpV2beta1CategoricalStatsResult] = js.undefined
  var kAnonymityResult: js.UndefOr[GooglePrivacyDlpV2beta1KAnonymityResult] = js.undefined
  var lDiversityResult: js.UndefOr[GooglePrivacyDlpV2beta1LDiversityResult] = js.undefined
  var numericalStatsResult: js.UndefOr[GooglePrivacyDlpV2beta1NumericalStatsResult] = js.undefined
}

object GooglePrivacyDlpV2beta1RiskAnalysisOperationResult {
  @scala.inline
  def apply(
    categoricalStatsResult: GooglePrivacyDlpV2beta1CategoricalStatsResult = null,
    kAnonymityResult: GooglePrivacyDlpV2beta1KAnonymityResult = null,
    lDiversityResult: GooglePrivacyDlpV2beta1LDiversityResult = null,
    numericalStatsResult: GooglePrivacyDlpV2beta1NumericalStatsResult = null
  ): GooglePrivacyDlpV2beta1RiskAnalysisOperationResult = {
    val __obj = js.Dynamic.literal()
    if (categoricalStatsResult != null) __obj.updateDynamic("categoricalStatsResult")(categoricalStatsResult)
    if (kAnonymityResult != null) __obj.updateDynamic("kAnonymityResult")(kAnonymityResult)
    if (lDiversityResult != null) __obj.updateDynamic("lDiversityResult")(lDiversityResult)
    if (numericalStatsResult != null) __obj.updateDynamic("numericalStatsResult")(numericalStatsResult)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1RiskAnalysisOperationResult]
  }
}

