package typings
package flotLib.jqueryNs.flotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait datapointFormat extends js.Object {
  var defaultValue: js.UndefOr[scala.Double] = js.undefined
  var number: scala.Boolean
  var required: scala.Boolean
  var x: js.UndefOr[scala.Boolean] = js.undefined
  var y: js.UndefOr[scala.Boolean] = js.undefined
}

object datapointFormat {
  @scala.inline
  def apply(
    number: scala.Boolean,
    required: scala.Boolean,
    defaultValue: scala.Int | scala.Double = null,
    x: js.UndefOr[scala.Boolean] = js.undefined,
    y: js.UndefOr[scala.Boolean] = js.undefined
  ): datapointFormat = {
    val __obj = js.Dynamic.literal(number = number, required = required)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x)
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[datapointFormat]
  }
}

