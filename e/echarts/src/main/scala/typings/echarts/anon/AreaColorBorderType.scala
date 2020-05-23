package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaColorBorderType extends js.Object {
  /**
    * Color of the area.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.data.itemStyle.areaColor
    */
  var areaColor: js.UndefOr[BorderType] = js.undefined
}

object AreaColorBorderType {
  @scala.inline
  def apply(areaColor: BorderType = null): AreaColorBorderType = {
    val __obj = js.Dynamic.literal()
    if (areaColor != null) __obj.updateDynamic("areaColor")(areaColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaColorBorderType]
  }
}

