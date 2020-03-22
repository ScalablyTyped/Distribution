package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBetween extends js.Object {
  var between: js.UndefOr[String] = js.undefined
  var contains: js.UndefOr[String] = js.undefined
  var endsWith: js.UndefOr[String] = js.undefined
  var equal: js.UndefOr[String] = js.undefined
  var greaterThan: js.UndefOr[String] = js.undefined
  var greaterThanOrEqual: js.UndefOr[String] = js.undefined
  var lessThan: js.UndefOr[String] = js.undefined
  var lessThanOrEqual: js.UndefOr[String] = js.undefined
  var notContains: js.UndefOr[String] = js.undefined
  var notEqual: js.UndefOr[String] = js.undefined
  var startsWith: js.UndefOr[String] = js.undefined
}

object AnonBetween {
  @scala.inline
  def apply(
    between: String = null,
    contains: String = null,
    endsWith: String = null,
    equal: String = null,
    greaterThan: String = null,
    greaterThanOrEqual: String = null,
    lessThan: String = null,
    lessThanOrEqual: String = null,
    notContains: String = null,
    notEqual: String = null,
    startsWith: String = null
  ): AnonBetween = {
    val __obj = js.Dynamic.literal()
    if (between != null) __obj.updateDynamic("between")(between.asInstanceOf[js.Any])
    if (contains != null) __obj.updateDynamic("contains")(contains.asInstanceOf[js.Any])
    if (endsWith != null) __obj.updateDynamic("endsWith")(endsWith.asInstanceOf[js.Any])
    if (equal != null) __obj.updateDynamic("equal")(equal.asInstanceOf[js.Any])
    if (greaterThan != null) __obj.updateDynamic("greaterThan")(greaterThan.asInstanceOf[js.Any])
    if (greaterThanOrEqual != null) __obj.updateDynamic("greaterThanOrEqual")(greaterThanOrEqual.asInstanceOf[js.Any])
    if (lessThan != null) __obj.updateDynamic("lessThan")(lessThan.asInstanceOf[js.Any])
    if (lessThanOrEqual != null) __obj.updateDynamic("lessThanOrEqual")(lessThanOrEqual.asInstanceOf[js.Any])
    if (notContains != null) __obj.updateDynamic("notContains")(notContains.asInstanceOf[js.Any])
    if (notEqual != null) __obj.updateDynamic("notEqual")(notEqual.asInstanceOf[js.Any])
    if (startsWith != null) __obj.updateDynamic("startsWith")(startsWith.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBetween]
  }
}

