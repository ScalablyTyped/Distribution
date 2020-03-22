package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.async
import typings.devextreme.devextremeStrings.compare
import typings.devextreme.devextremeStrings.custom
import typings.devextreme.devextremeStrings.email
import typings.devextreme.devextremeStrings.numeric
import typings.devextreme.devextremeStrings.pattern
import typings.devextreme.devextremeStrings.range
import typings.devextreme.devextremeStrings.required
import typings.devextreme.devextremeStrings.stringLength
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeRule extends js.Object {
  /** If set to true, empty values are valid. */
  var ignoreEmptyValue: js.UndefOr[Boolean] = js.undefined
  /** Specifies the maximum value allowed for the validated value. */
  var max: js.UndefOr[Date | Double] = js.undefined
  /** Specifies the message that is shown if the rule is broken. */
  var message: js.UndefOr[String] = js.undefined
  /** Specifies the minimum value allowed for the validated value. */
  var min: js.UndefOr[Date | Double] = js.undefined
  /** Indicates whether the rule should be always checked for the target value or only when the target value changes. */
  var reevaluate: js.UndefOr[Boolean] = js.undefined
  /** Specifies the rule type. Set it to "range" to use the RangeRule. */
  var `type`: js.UndefOr[
    required | numeric | range | stringLength | custom | compare | pattern | email | async
  ] = js.undefined
}

object RangeRule {
  @scala.inline
  def apply(
    ignoreEmptyValue: js.UndefOr[Boolean] = js.undefined,
    max: Date | Double = null,
    message: String = null,
    min: Date | Double = null,
    reevaluate: js.UndefOr[Boolean] = js.undefined,
    `type`: required | numeric | range | stringLength | custom | compare | pattern | email | async = null
  ): RangeRule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreEmptyValue)) __obj.updateDynamic("ignoreEmptyValue")(ignoreEmptyValue.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(reevaluate)) __obj.updateDynamic("reevaluate")(reevaluate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeRule]
  }
}

