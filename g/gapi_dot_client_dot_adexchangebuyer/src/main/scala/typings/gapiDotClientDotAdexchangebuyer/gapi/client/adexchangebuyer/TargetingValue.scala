package typings.gapiDotClientDotAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetingValue extends js.Object {
  /** The creative size value to exclude/include. */
  var creativeSizeValue: js.UndefOr[TargetingValueCreativeSize] = js.undefined
  /** The daypart targeting to include / exclude. Filled in when the key is GOOG_DAYPART_TARGETING. */
  var dayPartTargetingValue: js.UndefOr[TargetingValueDayPartTargeting] = js.undefined
  /** The long value to exclude/include. */
  var longValue: js.UndefOr[String] = js.undefined
  /** The string value to exclude/include. */
  var stringValue: js.UndefOr[String] = js.undefined
}

object TargetingValue {
  @scala.inline
  def apply(
    creativeSizeValue: TargetingValueCreativeSize = null,
    dayPartTargetingValue: TargetingValueDayPartTargeting = null,
    longValue: String = null,
    stringValue: String = null
  ): TargetingValue = {
    val __obj = js.Dynamic.literal()
    if (creativeSizeValue != null) __obj.updateDynamic("creativeSizeValue")(creativeSizeValue)
    if (dayPartTargetingValue != null) __obj.updateDynamic("dayPartTargetingValue")(dayPartTargetingValue)
    if (longValue != null) __obj.updateDynamic("longValue")(longValue)
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue)
    __obj.asInstanceOf[TargetingValue]
  }
}

