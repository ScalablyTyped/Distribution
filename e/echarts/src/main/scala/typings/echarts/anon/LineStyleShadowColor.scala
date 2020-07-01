package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineStyleShadowColor extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-lines.data.emphasis.label
    */
  var label: js.UndefOr[FontSize] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-lines.data.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowColor] = js.undefined
}

object LineStyleShadowColor {
  @scala.inline
  def apply(label: FontSize = null, lineStyle: ShadowColor = null): LineStyleShadowColor = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineStyleShadowColor]
  }
}

