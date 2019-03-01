package typings
package extjsLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISliderField
  extends extjsLib.ExtNs.sliderNs.IMulti {
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
    getValue: js.Function0[_] = null,
    setValue: js.Function2[
      /* value */ js.UndefOr[scala.Double], 
      /* animate */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null
  ): ISliderField = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IMulti)
    if (getValue != null) __obj.updateDynamic("getValue")(getValue)
    if (setValue != null) __obj.updateDynamic("setValue")(setValue)
    __obj.asInstanceOf[ISliderField]
  }
}

