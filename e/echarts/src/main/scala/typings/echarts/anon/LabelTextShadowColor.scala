package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelTextShadowColor extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.label
    */
  var label: js.UndefOr[TextShadowColor] = js.undefined
}

object LabelTextShadowColor {
  @scala.inline
  def apply(itemStyle: BorderType = null, label: TextShadowColor = null): LabelTextShadowColor = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelTextShadowColor]
  }
}

