package typings.extjs.Ext.slider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISingleSlider extends IMulti {
  /** [Method] Returns the current value of the slider
  		* @returns any The current value of the slider
  		*/
  @JSName("getValue")
  var getValue_ISingleSlider: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Programmatically sets the value of the Slider
  		* @param value Number The value to set the slider to. (This will be constrained within minValue and maxValue)
  		* @param animate Boolean Turn on or off animation
  		*/
  @JSName("setValue")
  var setValue_ISingleSlider: js.UndefOr[
    js.Function2[/* value */ js.UndefOr[Double], /* animate */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
}

object ISingleSlider {
  @scala.inline
  def apply(
    IMulti: IMulti = null,
    getValue: () => _ = null,
    setValue: (/* value */ js.UndefOr[Double], /* animate */ js.UndefOr[Boolean]) => Unit = null
  ): ISingleSlider = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IMulti)
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction0(getValue))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction2(setValue))
    __obj.asInstanceOf[ISingleSlider]
  }
}

