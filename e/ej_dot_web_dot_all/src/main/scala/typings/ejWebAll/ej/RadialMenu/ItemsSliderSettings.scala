package typings.ejWebAll.ej.RadialMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsSliderSettings extends js.Object {
  /** Specifies the value of sliderSettings labelSpace .
    */
  var labelSpace: js.UndefOr[Double] = js.undefined
  /** Specifies the sliderSettings stroke Width value.
    */
  var strokeWidth: js.UndefOr[Double] = js.undefined
  /** Specifies the sliderSettings ticks values of nested radial menu items.
    */
  var ticks: js.UndefOr[js.Array[_]] = js.undefined
}

object ItemsSliderSettings {
  @scala.inline
  def apply(
    labelSpace: js.UndefOr[Double] = js.undefined,
    strokeWidth: js.UndefOr[Double] = js.undefined,
    ticks: js.Array[_] = null
  ): ItemsSliderSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(labelSpace)) __obj.updateDynamic("labelSpace")(labelSpace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeWidth)) __obj.updateDynamic("strokeWidth")(strokeWidth.get.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsSliderSettings]
  }
}

