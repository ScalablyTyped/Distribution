package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Compute numerical stats over an individual column, including min, max, and
  * quantiles.
  */
@js.native
trait Schema$GooglePrivacyDlpV2NumericalStatsConfig extends js.Object {
  /**
    * Field to compute numerical stats on. Supported types are integer, float,
    * date, datetime, timestamp, time.
    */
  var field: js.UndefOr[Schema$GooglePrivacyDlpV2FieldId] = js.native
}

object Schema$GooglePrivacyDlpV2NumericalStatsConfig {
  @scala.inline
  def apply(field: Schema$GooglePrivacyDlpV2FieldId = null): Schema$GooglePrivacyDlpV2NumericalStatsConfig = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2NumericalStatsConfig]
  }
}

