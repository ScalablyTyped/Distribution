package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single inspection rule to be applied to infoTypes, specified in
  * `InspectionRuleSet`.
  */
@js.native
trait Schema$GooglePrivacyDlpV2InspectionRule extends js.Object {
  /**
    * Exclusion rule.
    */
  var exclusionRule: js.UndefOr[Schema$GooglePrivacyDlpV2ExclusionRule] = js.native
  /**
    * Hotword-based detection rule.
    */
  var hotwordRule: js.UndefOr[Schema$GooglePrivacyDlpV2HotwordRule] = js.native
}

object Schema$GooglePrivacyDlpV2InspectionRule {
  @scala.inline
  def apply(
    exclusionRule: Schema$GooglePrivacyDlpV2ExclusionRule = null,
    hotwordRule: Schema$GooglePrivacyDlpV2HotwordRule = null
  ): Schema$GooglePrivacyDlpV2InspectionRule = {
    val __obj = js.Dynamic.literal()
    if (exclusionRule != null) __obj.updateDynamic("exclusionRule")(exclusionRule.asInstanceOf[js.Any])
    if (hotwordRule != null) __obj.updateDynamic("hotwordRule")(hotwordRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2InspectionRule]
  }
}

