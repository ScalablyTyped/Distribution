package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabelAnonFontStyle extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-lines.emphasis.label
    */
  var label: js.UndefOr[AnonFontStyle] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-lines.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[AnonShadowBlur] = js.undefined
}

object AnonLabelAnonFontStyle {
  @scala.inline
  def apply(label: AnonFontStyle = null, lineStyle: AnonShadowBlur = null): AnonLabelAnonFontStyle = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabelAnonFontStyle]
  }
}

