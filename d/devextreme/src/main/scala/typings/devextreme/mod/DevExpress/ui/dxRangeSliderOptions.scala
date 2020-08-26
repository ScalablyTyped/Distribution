package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxRangeSliderOptions extends dxSliderBaseOptions[dxRangeSlider] {
  /** @name dxRangeSlider.Options.end */
  var end: js.UndefOr[Double] = js.native
  /** @name dxRangeSlider.Options.endName */
  var endName: js.UndefOr[String] = js.native
  /** @name dxRangeSlider.Options.onValueChanged */
  @JSName("onValueChanged")
  var onValueChanged_dxRangeSliderOptions: js.UndefOr[js.Function1[/* e */ End, _]] = js.native
  /** @name dxRangeSlider.Options.start */
  var start: js.UndefOr[Double] = js.native
  /** @name dxRangeSlider.Options.startName */
  var startName: js.UndefOr[String] = js.native
  /** @name dxRangeSlider.Options.value */
  @JSName("value")
  var value_dxRangeSliderOptions: js.UndefOr[js.Array[Double]] = js.native
}

object dxRangeSliderOptions {
  @scala.inline
  def apply(): dxRangeSliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxRangeSliderOptions]
  }
  @scala.inline
  implicit class dxRangeSliderOptionsOps[Self <: dxRangeSliderOptions] (val x: Self) extends AnyVal {
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
    def setEndName(value: String): Self = this.set("endName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndName: Self = this.set("endName", js.undefined)
    @scala.inline
    def setOnValueChanged(value: /* e */ End => _): Self = this.set("onValueChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnValueChanged: Self = this.set("onValueChanged", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStartName(value: String): Self = this.set("startName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartName: Self = this.set("startName", js.undefined)
    @scala.inline
    def setValueVarargs(value: Double*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: js.Array[Double]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

