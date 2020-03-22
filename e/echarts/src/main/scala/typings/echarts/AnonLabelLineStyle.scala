package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabelLineStyle extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.links.emphasis.label
    */
  var label: js.UndefOr[AnonFontStyle] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.links.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[AnonShadowBlur] = js.undefined
}

object AnonLabelLineStyle {
  @scala.inline
  def apply(label: AnonFontStyle = null, lineStyle: AnonShadowBlur = null): AnonLabelLineStyle = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabelLineStyle]
  }
}

