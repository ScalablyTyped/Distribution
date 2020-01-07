package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Rule for modifying a CustomInfoType to alter behavior under certain
  * circumstances, depending on the specific details of the rule. Not supported
  * for the `surrogate_type` custom info type.
  */
@js.native
trait Schema$GooglePrivacyDlpV2DetectionRule extends js.Object {
  /**
    * Hotword-based detection rule.
    */
  var hotwordRule: js.UndefOr[Schema$GooglePrivacyDlpV2HotwordRule] = js.native
}

object Schema$GooglePrivacyDlpV2DetectionRule {
  @scala.inline
  def apply(hotwordRule: Schema$GooglePrivacyDlpV2HotwordRule = null): Schema$GooglePrivacyDlpV2DetectionRule = {
    val __obj = js.Dynamic.literal()
    if (hotwordRule != null) __obj.updateDynamic("hotwordRule")(hotwordRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2DetectionRule]
  }
}

