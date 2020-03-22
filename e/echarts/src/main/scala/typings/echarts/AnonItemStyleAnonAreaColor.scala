package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemStyleAnonAreaColor extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-map.data.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AnonAreaColor] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-map.data.emphasis.label
    */
  var label: js.UndefOr[AnonRotate] = js.undefined
}

object AnonItemStyleAnonAreaColor {
  @scala.inline
  def apply(itemStyle: AnonAreaColor = null, label: AnonRotate = null): AnonItemStyleAnonAreaColor = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemStyleAnonAreaColor]
  }
}

