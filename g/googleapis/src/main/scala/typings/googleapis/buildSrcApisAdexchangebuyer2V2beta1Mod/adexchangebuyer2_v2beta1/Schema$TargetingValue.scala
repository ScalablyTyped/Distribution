package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A polymorphic targeting value used as part of Shared Targeting.
  */
@js.native
trait Schema$TargetingValue extends js.Object {
  /**
    * The creative size value to include/exclude. Filled in when key =
    * GOOG_CREATIVE_SIZE
    */
  var creativeSizeValue: js.UndefOr[Schema$CreativeSize] = js.native
  /**
    * The daypart targeting to include / exclude. Filled in when the key is
    * GOOG_DAYPART_TARGETING. The definition of this targeting is derived from
    * the structure used by Ad Manager.
    */
  var dayPartTargetingValue: js.UndefOr[Schema$DayPartTargeting] = js.native
  /**
    * The long value to include/exclude.
    */
  var longValue: js.UndefOr[String] = js.native
  /**
    * The string value to include/exclude.
    */
  var stringValue: js.UndefOr[String] = js.native
}

object Schema$TargetingValue {
  @scala.inline
  def apply(
    creativeSizeValue: Schema$CreativeSize = null,
    dayPartTargetingValue: Schema$DayPartTargeting = null,
    longValue: String = null,
    stringValue: String = null
  ): Schema$TargetingValue = {
    val __obj = js.Dynamic.literal()
    if (creativeSizeValue != null) __obj.updateDynamic("creativeSizeValue")(creativeSizeValue.asInstanceOf[js.Any])
    if (dayPartTargetingValue != null) __obj.updateDynamic("dayPartTargetingValue")(dayPartTargetingValue.asInstanceOf[js.Any])
    if (longValue != null) __obj.updateDynamic("longValue")(longValue.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TargetingValue]
  }
}

