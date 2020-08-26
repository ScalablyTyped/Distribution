package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchBarSliderConstructorOptions extends js.Object {
  /**
    * Function to call when the slider is changed.
    */
  var change: js.UndefOr[js.Function1[/* newValue */ Double, Unit]] = js.native
  /**
    * Label text.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * Maximum value.
    */
  var maxValue: js.UndefOr[Double] = js.native
  /**
    * Minimum value.
    */
  var minValue: js.UndefOr[Double] = js.native
  /**
    * Selected value.
    */
  var value: js.UndefOr[Double] = js.native
}

object TouchBarSliderConstructorOptions {
  @scala.inline
  def apply(): TouchBarSliderConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchBarSliderConstructorOptions]
  }
  @scala.inline
  implicit class TouchBarSliderConstructorOptionsOps[Self <: TouchBarSliderConstructorOptions] (val x: Self) extends AnyVal {
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
    def setChange(value: /* newValue */ Double => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

