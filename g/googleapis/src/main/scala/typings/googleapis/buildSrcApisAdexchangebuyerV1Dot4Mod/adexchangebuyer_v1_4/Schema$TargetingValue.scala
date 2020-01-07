package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TargetingValue extends js.Object {
  /**
    * The creative size value to exclude/include.
    */
  var creativeSizeValue: js.UndefOr[Schema$TargetingValueCreativeSize] = js.native
  /**
    * The daypart targeting to include / exclude. Filled in when the key is
    * GOOG_DAYPART_TARGETING.
    */
  var dayPartTargetingValue: js.UndefOr[Schema$TargetingValueDayPartTargeting] = js.native
  var demogAgeCriteriaValue: js.UndefOr[Schema$TargetingValueDemogAgeCriteria] = js.native
  var demogGenderCriteriaValue: js.UndefOr[Schema$TargetingValueDemogGenderCriteria] = js.native
  /**
    * The long value to exclude/include.
    */
  var longValue: js.UndefOr[String] = js.native
  /**
    * The string value to exclude/include.
    */
  var stringValue: js.UndefOr[String] = js.native
}

object Schema$TargetingValue {
  @scala.inline
  def apply(
    creativeSizeValue: Schema$TargetingValueCreativeSize = null,
    dayPartTargetingValue: Schema$TargetingValueDayPartTargeting = null,
    demogAgeCriteriaValue: Schema$TargetingValueDemogAgeCriteria = null,
    demogGenderCriteriaValue: Schema$TargetingValueDemogGenderCriteria = null,
    longValue: String = null,
    stringValue: String = null
  ): Schema$TargetingValue = {
    val __obj = js.Dynamic.literal()
    if (creativeSizeValue != null) __obj.updateDynamic("creativeSizeValue")(creativeSizeValue.asInstanceOf[js.Any])
    if (dayPartTargetingValue != null) __obj.updateDynamic("dayPartTargetingValue")(dayPartTargetingValue.asInstanceOf[js.Any])
    if (demogAgeCriteriaValue != null) __obj.updateDynamic("demogAgeCriteriaValue")(demogAgeCriteriaValue.asInstanceOf[js.Any])
    if (demogGenderCriteriaValue != null) __obj.updateDynamic("demogGenderCriteriaValue")(demogGenderCriteriaValue.asInstanceOf[js.Any])
    if (longValue != null) __obj.updateDynamic("longValue")(longValue.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TargetingValue]
  }
}

