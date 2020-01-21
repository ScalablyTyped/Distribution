package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLineStyleAnonColorOpacityShadowBlur extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-parallel.data.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[AnonColorOpacityShadowBlur] = js.undefined
}

object AnonLineStyleAnonColorOpacityShadowBlur {
  @scala.inline
  def apply(lineStyle: AnonColorOpacityShadowBlur = null): AnonLineStyleAnonColorOpacityShadowBlur = {
    val __obj = js.Dynamic.literal()
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLineStyleAnonColorOpacityShadowBlur]
  }
}

