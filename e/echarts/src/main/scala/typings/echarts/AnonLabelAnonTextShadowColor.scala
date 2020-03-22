package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabelAnonTextShadowColor extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderType] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.label
    */
  var label: js.UndefOr[AnonTextShadowColor] = js.undefined
}

object AnonLabelAnonTextShadowColor {
  @scala.inline
  def apply(itemStyle: AnonBorderType = null, label: AnonTextShadowColor = null): AnonLabelAnonTextShadowColor = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabelAnonTextShadowColor]
  }
}

