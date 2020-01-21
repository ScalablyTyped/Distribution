package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1PrivacyMetric extends js.Object {
  var categoricalStatsConfig: js.UndefOr[GooglePrivacyDlpV2beta1CategoricalStatsConfig] = js.undefined
  var kAnonymityConfig: js.UndefOr[GooglePrivacyDlpV2beta1KAnonymityConfig] = js.undefined
  var lDiversityConfig: js.UndefOr[GooglePrivacyDlpV2beta1LDiversityConfig] = js.undefined
  var numericalStatsConfig: js.UndefOr[GooglePrivacyDlpV2beta1NumericalStatsConfig] = js.undefined
}

object GooglePrivacyDlpV2beta1PrivacyMetric {
  @scala.inline
  def apply(
    categoricalStatsConfig: GooglePrivacyDlpV2beta1CategoricalStatsConfig = null,
    kAnonymityConfig: GooglePrivacyDlpV2beta1KAnonymityConfig = null,
    lDiversityConfig: GooglePrivacyDlpV2beta1LDiversityConfig = null,
    numericalStatsConfig: GooglePrivacyDlpV2beta1NumericalStatsConfig = null
  ): GooglePrivacyDlpV2beta1PrivacyMetric = {
    val __obj = js.Dynamic.literal()
    if (categoricalStatsConfig != null) __obj.updateDynamic("categoricalStatsConfig")(categoricalStatsConfig.asInstanceOf[js.Any])
    if (kAnonymityConfig != null) __obj.updateDynamic("kAnonymityConfig")(kAnonymityConfig.asInstanceOf[js.Any])
    if (lDiversityConfig != null) __obj.updateDynamic("lDiversityConfig")(lDiversityConfig.asInstanceOf[js.Any])
    if (numericalStatsConfig != null) __obj.updateDynamic("numericalStatsConfig")(numericalStatsConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1PrivacyMetric]
  }
}

