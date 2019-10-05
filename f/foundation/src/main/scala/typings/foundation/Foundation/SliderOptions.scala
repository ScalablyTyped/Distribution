package typings.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/range_slider.html
trait SliderOptions extends js.Object {
  var end: js.UndefOr[Double] = js.undefined
  var initial: js.UndefOr[Double] = js.undefined
  var on_change: js.UndefOr[js.Function0[_]] = js.undefined
  var precision: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var trigger_input_change: js.UndefOr[Boolean] = js.undefined
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object SliderOptions {
  @scala.inline
  def apply(
    end: Int | Double = null,
    initial: Int | Double = null,
    on_change: () => _ = null,
    precision: Int | Double = null,
    start: Int | Double = null,
    step: Int | Double = null,
    trigger_input_change: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): SliderOptions = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (initial != null) __obj.updateDynamic("initial")(initial.asInstanceOf[js.Any])
    if (on_change != null) __obj.updateDynamic("on_change")(js.Any.fromFunction0(on_change))
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (!js.isUndefined(trigger_input_change)) __obj.updateDynamic("trigger_input_change")(trigger_input_change)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[SliderOptions]
  }
}

