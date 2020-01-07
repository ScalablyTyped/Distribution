package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of conditions.
  */
@js.native
trait Schema$GooglePrivacyDlpV2Conditions extends js.Object {
  var conditions: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2Condition]] = js.native
}

object Schema$GooglePrivacyDlpV2Conditions {
  @scala.inline
  def apply(conditions: js.Array[Schema$GooglePrivacyDlpV2Condition] = null): Schema$GooglePrivacyDlpV2Conditions = {
    val __obj = js.Dynamic.literal()
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2Conditions]
  }
}

