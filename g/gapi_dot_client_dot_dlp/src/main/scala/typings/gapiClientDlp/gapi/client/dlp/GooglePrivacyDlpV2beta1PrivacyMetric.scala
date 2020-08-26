package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1PrivacyMetric extends js.Object {
  var categoricalStatsConfig: js.UndefOr[GooglePrivacyDlpV2beta1CategoricalStatsConfig] = js.native
  var kAnonymityConfig: js.UndefOr[GooglePrivacyDlpV2beta1KAnonymityConfig] = js.native
  var lDiversityConfig: js.UndefOr[GooglePrivacyDlpV2beta1LDiversityConfig] = js.native
  var numericalStatsConfig: js.UndefOr[GooglePrivacyDlpV2beta1NumericalStatsConfig] = js.native
}

object GooglePrivacyDlpV2beta1PrivacyMetric {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1PrivacyMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1PrivacyMetric]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1PrivacyMetricOps[Self <: GooglePrivacyDlpV2beta1PrivacyMetric] (val x: Self) extends AnyVal {
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
    def setCategoricalStatsConfig(value: GooglePrivacyDlpV2beta1CategoricalStatsConfig): Self = this.set("categoricalStatsConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategoricalStatsConfig: Self = this.set("categoricalStatsConfig", js.undefined)
    @scala.inline
    def setKAnonymityConfig(value: GooglePrivacyDlpV2beta1KAnonymityConfig): Self = this.set("kAnonymityConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKAnonymityConfig: Self = this.set("kAnonymityConfig", js.undefined)
    @scala.inline
    def setLDiversityConfig(value: GooglePrivacyDlpV2beta1LDiversityConfig): Self = this.set("lDiversityConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLDiversityConfig: Self = this.set("lDiversityConfig", js.undefined)
    @scala.inline
    def setNumericalStatsConfig(value: GooglePrivacyDlpV2beta1NumericalStatsConfig): Self = this.set("numericalStatsConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumericalStatsConfig: Self = this.set("numericalStatsConfig", js.undefined)
  }
  
}

