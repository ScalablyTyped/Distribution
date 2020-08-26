package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1RiskAnalysisOperationResult extends js.Object {
  var categoricalStatsResult: js.UndefOr[GooglePrivacyDlpV2beta1CategoricalStatsResult] = js.native
  var kAnonymityResult: js.UndefOr[GooglePrivacyDlpV2beta1KAnonymityResult] = js.native
  var lDiversityResult: js.UndefOr[GooglePrivacyDlpV2beta1LDiversityResult] = js.native
  var numericalStatsResult: js.UndefOr[GooglePrivacyDlpV2beta1NumericalStatsResult] = js.native
}

object GooglePrivacyDlpV2beta1RiskAnalysisOperationResult {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1RiskAnalysisOperationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1RiskAnalysisOperationResult]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1RiskAnalysisOperationResultOps[Self <: GooglePrivacyDlpV2beta1RiskAnalysisOperationResult] (val x: Self) extends AnyVal {
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
    def setCategoricalStatsResult(value: GooglePrivacyDlpV2beta1CategoricalStatsResult): Self = this.set("categoricalStatsResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategoricalStatsResult: Self = this.set("categoricalStatsResult", js.undefined)
    @scala.inline
    def setKAnonymityResult(value: GooglePrivacyDlpV2beta1KAnonymityResult): Self = this.set("kAnonymityResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKAnonymityResult: Self = this.set("kAnonymityResult", js.undefined)
    @scala.inline
    def setLDiversityResult(value: GooglePrivacyDlpV2beta1LDiversityResult): Self = this.set("lDiversityResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLDiversityResult: Self = this.set("lDiversityResult", js.undefined)
    @scala.inline
    def setNumericalStatsResult(value: GooglePrivacyDlpV2beta1NumericalStatsResult): Self = this.set("numericalStatsResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumericalStatsResult: Self = this.set("numericalStatsResult", js.undefined)
  }
  
}

