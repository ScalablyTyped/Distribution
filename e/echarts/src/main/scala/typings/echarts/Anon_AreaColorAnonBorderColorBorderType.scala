package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AreaColorAnonBorderColorBorderType extends js.Object {
  /**
    * Color of the area.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.data.itemStyle.areaColor
    */
  var areaColor: js.UndefOr[Anon_BorderColorBorderType] = js.undefined
}

object Anon_AreaColorAnonBorderColorBorderType {
  @scala.inline
  def apply(areaColor: Anon_BorderColorBorderType = null): Anon_AreaColorAnonBorderColorBorderType = {
    val __obj = js.Dynamic.literal()
    if (areaColor != null) __obj.updateDynamic("areaColor")(areaColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AreaColorAnonBorderColorBorderType]
  }
}

