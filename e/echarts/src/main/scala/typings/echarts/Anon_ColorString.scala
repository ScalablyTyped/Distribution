package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorString extends js.Object {
  /**
    * The color of a node. It use global palette
    * [option.color](https://ecomfe.github.io/echarts-doc/public/en/option.html#color)
    * by default.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis.itemStyle.color
    */
  var color: js.UndefOr[String] = js.undefined
}

object Anon_ColorString {
  @scala.inline
  def apply(color: String = null): Anon_ColorString = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorString]
  }
}

