package typings.flot.jquery.flot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait datapointFormat extends js.Object {
  var defaultValue: js.UndefOr[Double] = js.undefined
  var number: Boolean
  var required: Boolean
  var x: js.UndefOr[Boolean] = js.undefined
  var y: js.UndefOr[Boolean] = js.undefined
}

object datapointFormat {
  @scala.inline
  def apply(
    number: Boolean,
    required: Boolean,
    defaultValue: Int | Double = null,
    x: js.UndefOr[Boolean] = js.undefined,
    y: js.UndefOr[Boolean] = js.undefined
  ): datapointFormat = {
    val __obj = js.Dynamic.literal(number = number, required = required)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x)
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[datapointFormat]
  }
}

