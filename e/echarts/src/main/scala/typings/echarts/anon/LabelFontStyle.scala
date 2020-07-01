package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelFontStyle extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-pie.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-pie.emphasis.label
    */
  var label: js.UndefOr[FontStyle] = js.undefined
}

object LabelFontStyle {
  @scala.inline
  def apply(itemStyle: BorderType = null, label: FontStyle = null): LabelFontStyle = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelFontStyle]
  }
}

