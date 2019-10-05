package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1CategoricalStatsConfig extends js.Object {
  /**
    * Field to compute categorical stats on. All column types are
    * supported except for arrays and structs. However, it may be more
    * informative to use NumericalStats when the field type is supported,
    * depending on the data.
    */
  var field: js.UndefOr[GooglePrivacyDlpV2beta1FieldId] = js.undefined
}

object GooglePrivacyDlpV2beta1CategoricalStatsConfig {
  @scala.inline
  def apply(field: GooglePrivacyDlpV2beta1FieldId = null): GooglePrivacyDlpV2beta1CategoricalStatsConfig = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1CategoricalStatsConfig]
  }
}

