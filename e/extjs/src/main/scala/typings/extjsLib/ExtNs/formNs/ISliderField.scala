package typings
package extjsLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISliderField
  extends extjsLib.ExtNs.sliderNs.IMulti {
  /** [Method] Returns the current value of the slider
  		* @returns any The current value of the slider
  		*/
  @JSName("getValue")
  var getValue_ISliderField: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Programmatically sets the value of the Slider
  		* @param value Number The value to set the slider to. (This will be constrained within minValue and maxValue)
  		* @param animate Boolean Turn on or off animation
  		*/
  @JSName("setValue")
  var setValue_ISliderField: js.UndefOr[
    js.Function2[
      /* value */ js.UndefOr[scala.Double], 
      /* animate */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
}

object ISliderField {
  @scala.inline
  def apply(
    IMulti: extjsLib.ExtNs.sliderNs.IMulti = null,
    getValue: () => _ = null,
    setValue: (/* value */ js.UndefOr[scala.Double], /* animate */ js.UndefOr[scala.Boolean]) => scala.Unit = null
  ): ISliderField = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IMulti)
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction0(getValue))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction2(setValue))
    __obj.asInstanceOf[ISliderField]
  }
}

