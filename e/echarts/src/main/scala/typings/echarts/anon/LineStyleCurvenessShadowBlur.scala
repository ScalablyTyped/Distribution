package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineStyleCurvenessShadowBlur extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-tree.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-tree.emphasis.label
    */
  var label: js.UndefOr[BorderRadius] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-tree.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[CurvenessShadowBlur] = js.undefined
}

object LineStyleCurvenessShadowBlur {
  @scala.inline
  def apply(itemStyle: BorderType = null, label: BorderRadius = null, lineStyle: CurvenessShadowBlur = null): LineStyleCurvenessShadowBlur = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineStyleCurvenessShadowBlur]
  }
}

