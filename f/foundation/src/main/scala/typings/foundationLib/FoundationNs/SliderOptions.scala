package typings
package foundationLib.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/range_slider.html
trait SliderOptions extends js.Object {
  var end: js.UndefOr[scala.Double] = js.undefined
  var initial: js.UndefOr[scala.Double] = js.undefined
  var on_change: js.UndefOr[js.Function0[_]] = js.undefined
  var precision: js.UndefOr[scala.Double] = js.undefined
  var start: js.UndefOr[scala.Double] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
  var trigger_input_change: js.UndefOr[scala.Boolean] = js.undefined
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
}

object SliderOptions {
  @scala.inline
  def apply(
    end: scala.Int | scala.Double = null,
    initial: scala.Int | scala.Double = null,
    on_change: js.Function0[_] = null,
    precision: scala.Int | scala.Double = null,
    start: scala.Int | scala.Double = null,
    step: scala.Int | scala.Double = null,
    trigger_input_change: js.UndefOr[scala.Boolean] = js.undefined,
    vertical: js.UndefOr[scala.Boolean] = js.undefined
  ): SliderOptions = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (initial != null) __obj.updateDynamic("initial")(initial.asInstanceOf[js.Any])
    if (on_change != null) __obj.updateDynamic("on_change")(on_change)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (!js.isUndefined(trigger_input_change)) __obj.updateDynamic("trigger_input_change")(trigger_input_change)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[SliderOptions]
  }
}

