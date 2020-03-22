package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAreaColorEmphasis extends js.Object {
  /**
    * Area filling color.
    *
    *
    * @default
    * "#eee"
    * @see https://echarts.apache.org/en/option.html#series-map.itemStyle.areaColor
    */
  var areaColor: js.UndefOr[AnonBorderType] = js.undefined
  /**
    * Map area style in highlighted state.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.itemStyle.emphasis
    */
  var emphasis: js.UndefOr[AnonAreaColor] = js.undefined
}

object AnonAreaColorEmphasis {
  @scala.inline
  def apply(areaColor: AnonBorderType = null, emphasis: AnonAreaColor = null): AnonAreaColorEmphasis = {
    val __obj = js.Dynamic.literal()
    if (areaColor != null) __obj.updateDynamic("areaColor")(areaColor.asInstanceOf[js.Any])
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAreaColorEmphasis]
  }
}

