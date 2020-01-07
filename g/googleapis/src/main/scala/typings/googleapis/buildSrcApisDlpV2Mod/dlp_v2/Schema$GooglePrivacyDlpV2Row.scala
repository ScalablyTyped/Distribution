package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$GooglePrivacyDlpV2Row extends js.Object {
  var values: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2Value]] = js.native
}

object Schema$GooglePrivacyDlpV2Row {
  @scala.inline
  def apply(values: js.Array[Schema$GooglePrivacyDlpV2Value] = null): Schema$GooglePrivacyDlpV2Row = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2Row]
  }
}

