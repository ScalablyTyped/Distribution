package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelFontStyle extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-lines.emphasis.label
    */
  var label: js.UndefOr[FontStyle] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-lines.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowBlur] = js.undefined
}

object LabelFontStyle {
  @scala.inline
  def apply(label: FontStyle = null, lineStyle: ShadowBlur = null): LabelFontStyle = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelFontStyle]
  }
}

