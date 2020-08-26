package typings.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/range_slider.html
@js.native
trait SliderOptions extends js.Object {
  var end: js.UndefOr[Double] = js.native
  var initial: js.UndefOr[Double] = js.native
  var on_change: js.UndefOr[js.Function0[_]] = js.native
  var precision: js.UndefOr[Double] = js.native
  var start: js.UndefOr[Double] = js.native
  var step: js.UndefOr[Double] = js.native
  var trigger_input_change: js.UndefOr[Boolean] = js.native
  var vertical: js.UndefOr[Boolean] = js.native
}

object SliderOptions {
  @scala.inline
  def apply(): SliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderOptions]
  }
  @scala.inline
  implicit class SliderOptionsOps[Self <: SliderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setInitial(value: Double): Self = this.set("initial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitial: Self = this.set("initial", js.undefined)
    @scala.inline
    def setOn_change(value: () => _): Self = this.set("on_change", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOn_change: Self = this.set("on_change", js.undefined)
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setTrigger_input_change(value: Boolean): Self = this.set("trigger_input_change", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrigger_input_change: Self = this.set("trigger_input_change", js.undefined)
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
  
}

