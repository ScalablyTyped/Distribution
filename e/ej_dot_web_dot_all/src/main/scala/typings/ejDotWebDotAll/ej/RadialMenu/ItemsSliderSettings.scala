package typings.ejDotWebDotAll.ej.RadialMenu

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
  def apply(labelSpace: Int | Double = null, strokeWidth: Int | Double = null, ticks: js.Array[_] = null): ItemsSliderSettings = {
    val __obj = js.Dynamic.literal()
    if (labelSpace != null) __obj.updateDynamic("labelSpace")(labelSpace.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks)
    __obj.asInstanceOf[ItemsSliderSettings]
  }
}

