package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Compute numerical stats over an individual column, including number of
  * distinct values and value count distribution.
  */
@js.native
trait Schema$GooglePrivacyDlpV2CategoricalStatsConfig extends js.Object {
  /**
    * Field to compute categorical stats on. All column types are supported
    * except for arrays and structs. However, it may be more informative to use
    * NumericalStats when the field type is supported, depending on the data.
    */
  var field: js.UndefOr[Schema$GooglePrivacyDlpV2FieldId] = js.native
}

object Schema$GooglePrivacyDlpV2CategoricalStatsConfig {
  @scala.inline
  def apply(field: Schema$GooglePrivacyDlpV2FieldId = null): Schema$GooglePrivacyDlpV2CategoricalStatsConfig = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2CategoricalStatsConfig]
  }
}

