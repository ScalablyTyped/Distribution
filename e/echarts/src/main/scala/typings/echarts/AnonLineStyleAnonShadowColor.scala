package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLineStyleAnonShadowColor extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-lines.data.emphasis.label
    */
  var label: js.UndefOr[AnonFontStyle] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-lines.data.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[AnonShadowColor] = js.undefined
}

object AnonLineStyleAnonShadowColor {
  @scala.inline
  def apply(label: AnonFontStyle = null, lineStyle: AnonShadowColor = null): AnonLineStyleAnonShadowColor = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLineStyleAnonShadowColor]
  }
}

