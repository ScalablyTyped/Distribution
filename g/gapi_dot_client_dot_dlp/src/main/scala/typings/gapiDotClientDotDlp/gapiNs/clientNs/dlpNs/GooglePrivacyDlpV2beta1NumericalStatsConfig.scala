package typings.gapiDotClientDotDlp.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1NumericalStatsConfig extends js.Object {
  /**
    * Field to compute numerical stats on. Supported types are
    * integer, float, date, datetime, timestamp, time.
    */
  var field: js.UndefOr[GooglePrivacyDlpV2beta1FieldId] = js.undefined
}

object GooglePrivacyDlpV2beta1NumericalStatsConfig {
  @scala.inline
  def apply(field: GooglePrivacyDlpV2beta1FieldId = null): GooglePrivacyDlpV2beta1NumericalStatsConfig = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1NumericalStatsConfig]
  }
}

