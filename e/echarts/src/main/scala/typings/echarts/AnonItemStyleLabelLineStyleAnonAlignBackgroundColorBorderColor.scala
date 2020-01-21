package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemStyleLabelLineStyleAnonAlignBackgroundColorBorderColor extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-tree.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderColorBorderType] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-tree.emphasis.label
    */
  var label: js.UndefOr[AnonAlignBackgroundColorBorderColor] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-tree.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[AnonColorCurvenessShadowBlur] = js.undefined
}

object AnonItemStyleLabelLineStyleAnonAlignBackgroundColorBorderColor {
  @scala.inline
  def apply(
    itemStyle: AnonBorderColorBorderType = null,
    label: AnonAlignBackgroundColorBorderColor = null,
    lineStyle: AnonColorCurvenessShadowBlur = null
  ): AnonItemStyleLabelLineStyleAnonAlignBackgroundColorBorderColor = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemStyleLabelLineStyleAnonAlignBackgroundColorBorderColor]
  }
}

