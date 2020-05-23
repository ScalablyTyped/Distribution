package typings.extjs.Ext.slider

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
    js.Function2[/* value */ js.UndefOr[Double], /* animate */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
}

object ISlider {
  @scala.inline
  def apply(
    IMulti: IMulti = null,
    setValue: (/* value */ js.UndefOr[Double], /* animate */ js.UndefOr[Boolean]) => Unit = null
  ): ISlider = {
    val __obj = js.Dynamic.literal()
    if (IMulti != null) js.Dynamic.global.Object.assign(__obj, IMulti)
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction2(setValue))
    __obj.asInstanceOf[ISlider]
  }
}

