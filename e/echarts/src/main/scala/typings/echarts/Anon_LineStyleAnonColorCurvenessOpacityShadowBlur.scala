package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LineStyleAnonColorCurvenessOpacityShadowBlur extends js.Object {
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.links.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[Anon_ColorCurvenessOpacityShadowBlur] = js.undefined
}

object Anon_LineStyleAnonColorCurvenessOpacityShadowBlur {
  @scala.inline
  def apply(lineStyle: Anon_ColorCurvenessOpacityShadowBlur = null): Anon_LineStyleAnonColorCurvenessOpacityShadowBlur = {
    val __obj = js.Dynamic.literal()
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LineStyleAnonColorCurvenessOpacityShadowBlur]
  }
}

