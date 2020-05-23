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
    end: js.UndefOr[Double] = js.undefined,
    initial: js.UndefOr[Double] = js.undefined,
    on_change: () => _ = null,
    precision: js.UndefOr[Double] = js.undefined,
    start: js.UndefOr[Double] = js.undefined,
    step: js.UndefOr[Double] = js.undefined,
    trigger_input_change: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): SliderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initial)) __obj.updateDynamic("initial")(initial.get.asInstanceOf[js.Any])
    if (on_change != null) __obj.updateDynamic("on_change")(js.Any.fromFunction0(on_change))
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trigger_input_change)) __obj.updateDynamic("trigger_input_change")(trigger_input_change.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderOptions]
  }
}

