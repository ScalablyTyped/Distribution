package typings
package extjsLib.ExtNs.sliderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISlider extends IMulti {
  /** [Method] Programmatically sets the value of the Slider
  		* @param value Number The value to set the slider to. (This will be constrained within minValue and maxValue)
  		* @param animate Boolean Turn on or off animation
  		*/
  @JSName("setValue")
  var setValue_ISlider: js.UndefOr[
    js.Function2[
      /* value */ js.UndefOr[scala.Double], 
      /* animate */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
}

object ISlider {
  @scala.inline
  def apply(
    IMulti: IMulti = null,
    getValue: js.Function0[_] = null,
    setValue: js.Function2[
      /* value */ js.UndefOr[scala.Double], 
      /* animate */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null
  ): ISlider = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IMulti)
    if (getValue != null) __obj.updateDynamic("getValue")(getValue)
    if (setValue != null) __obj.updateDynamic("setValue")(setValue)
    __obj.asInstanceOf[ISlider]
  }
}

