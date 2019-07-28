package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AreaColorAnonBorderColor extends js.Object {
  /**
    * Color of the area.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.data.itemStyle.areaColor
    */
  var areaColor: js.UndefOr[Anon_BorderColor] = js.undefined
}

object Anon_AreaColorAnonBorderColor {
  @scala.inline
  def apply(areaColor: Anon_BorderColor = null): Anon_AreaColorAnonBorderColor = {
    val __obj = js.Dynamic.literal()
    if (areaColor != null) __obj.updateDynamic("areaColor")(areaColor)
    __obj.asInstanceOf[Anon_AreaColorAnonBorderColor]
  }
}

