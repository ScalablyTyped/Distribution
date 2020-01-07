package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Replace each input value with a given `Value`.
  */
@js.native
trait Schema$GooglePrivacyDlpV2ReplaceValueConfig extends js.Object {
  /**
    * Value to replace it with.
    */
  var newValue: js.UndefOr[Schema$GooglePrivacyDlpV2Value] = js.native
}

object Schema$GooglePrivacyDlpV2ReplaceValueConfig {
  @scala.inline
  def apply(newValue: Schema$GooglePrivacyDlpV2Value = null): Schema$GooglePrivacyDlpV2ReplaceValueConfig = {
    val __obj = js.Dynamic.literal()
    if (newValue != null) __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2ReplaceValueConfig]
  }
}

