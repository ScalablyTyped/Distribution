package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of exclude infoTypes.
  */
@js.native
trait Schema$GooglePrivacyDlpV2ExcludeInfoTypes extends js.Object {
  /**
    * InfoType list in ExclusionRule rule drops a finding when it overlaps or
    * contained within with a finding of an infoType from this list. For
    * example, for `InspectionRuleSet.info_types` containing
    * &quot;PHONE_NUMBER&quot;` and `exclusion_rule` containing
    * `exclude_info_types.info_types` with &quot;EMAIL_ADDRESS&quot; the phone
    * number findings are dropped if they overlap with EMAIL_ADDRESS finding.
    * That leads to &quot;555-222-2222@example.org&quot; to generate only a
    * single finding, namely email address.
    */
  var infoTypes: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2InfoType]] = js.native
}

object Schema$GooglePrivacyDlpV2ExcludeInfoTypes {
  @scala.inline
  def apply(infoTypes: js.Array[Schema$GooglePrivacyDlpV2InfoType] = null): Schema$GooglePrivacyDlpV2ExcludeInfoTypes = {
    val __obj = js.Dynamic.literal()
    if (infoTypes != null) __obj.updateDynamic("infoTypes")(infoTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2ExcludeInfoTypes]
  }
}

