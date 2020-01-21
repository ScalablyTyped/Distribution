package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLineStyleAnonColorCurvenessOpacityShadowBlur extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-sankey.links.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[AnonColorCurvenessOpacityShadowBlur] = js.undefined
}

object AnonLineStyleAnonColorCurvenessOpacityShadowBlur {
  @scala.inline
  def apply(lineStyle: AnonColorCurvenessOpacityShadowBlur = null): AnonLineStyleAnonColorCurvenessOpacityShadowBlur = {
    val __obj = js.Dynamic.literal()
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLineStyleAnonColorCurvenessOpacityShadowBlur]
  }
}

