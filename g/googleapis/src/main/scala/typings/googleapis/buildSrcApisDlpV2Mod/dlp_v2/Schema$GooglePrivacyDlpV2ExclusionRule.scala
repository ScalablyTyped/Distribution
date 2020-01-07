package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The rule that specifies conditions when findings of infoTypes specified in
  * `InspectionRuleSet` are removed from results.
  */
@js.native
trait Schema$GooglePrivacyDlpV2ExclusionRule extends js.Object {
  /**
    * Dictionary which defines the rule.
    */
  var dictionary: js.UndefOr[Schema$GooglePrivacyDlpV2Dictionary] = js.native
  /**
    * Set of infoTypes for which findings would affect this rule.
    */
  var excludeInfoTypes: js.UndefOr[Schema$GooglePrivacyDlpV2ExcludeInfoTypes] = js.native
  /**
    * How the rule is applied, see MatchingType documentation for details.
    */
  var matchingType: js.UndefOr[String] = js.native
  /**
    * Regular expression which defines the rule.
    */
  var regex: js.UndefOr[Schema$GooglePrivacyDlpV2Regex] = js.native
}

object Schema$GooglePrivacyDlpV2ExclusionRule {
  @scala.inline
  def apply(
    dictionary: Schema$GooglePrivacyDlpV2Dictionary = null,
    excludeInfoTypes: Schema$GooglePrivacyDlpV2ExcludeInfoTypes = null,
    matchingType: String = null,
    regex: Schema$GooglePrivacyDlpV2Regex = null
  ): Schema$GooglePrivacyDlpV2ExclusionRule = {
    val __obj = js.Dynamic.literal()
    if (dictionary != null) __obj.updateDynamic("dictionary")(dictionary.asInstanceOf[js.Any])
    if (excludeInfoTypes != null) __obj.updateDynamic("excludeInfoTypes")(excludeInfoTypes.asInstanceOf[js.Any])
    if (matchingType != null) __obj.updateDynamic("matchingType")(matchingType.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2ExclusionRule]
  }
}

