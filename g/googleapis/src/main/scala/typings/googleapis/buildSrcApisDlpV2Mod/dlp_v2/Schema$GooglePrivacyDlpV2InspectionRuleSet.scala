package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Rule set for modifying a set of infoTypes to alter behavior under certain
  * circumstances, depending on the specific details of the rules within the
  * set.
  */
@js.native
trait Schema$GooglePrivacyDlpV2InspectionRuleSet extends js.Object {
  /**
    * List of infoTypes this rule set is applied to.
    */
  var infoTypes: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2InfoType]] = js.native
  /**
    * Set of rules to be applied to infoTypes. The rules are applied in order.
    */
  var rules: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2InspectionRule]] = js.native
}

object Schema$GooglePrivacyDlpV2InspectionRuleSet {
  @scala.inline
  def apply(
    infoTypes: js.Array[Schema$GooglePrivacyDlpV2InfoType] = null,
    rules: js.Array[Schema$GooglePrivacyDlpV2InspectionRule] = null
  ): Schema$GooglePrivacyDlpV2InspectionRuleSet = {
    val __obj = js.Dynamic.literal()
    if (infoTypes != null) __obj.updateDynamic("infoTypes")(infoTypes.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2InspectionRuleSet]
  }
}

