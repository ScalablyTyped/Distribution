package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAreaColorAnonBorderColorBorderType extends js.Object {
  /**
    * Color of the area.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.data.itemStyle.areaColor
    */
  var areaColor: js.UndefOr[AnonBorderColorBorderType] = js.undefined
}

object AnonAreaColorAnonBorderColorBorderType {
  @scala.inline
  def apply(areaColor: AnonBorderColorBorderType = null): AnonAreaColorAnonBorderColorBorderType = {
    val __obj = js.Dynamic.literal()
    if (areaColor != null) __obj.updateDynamic("areaColor")(areaColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAreaColorAnonBorderColorBorderType]
  }
}

