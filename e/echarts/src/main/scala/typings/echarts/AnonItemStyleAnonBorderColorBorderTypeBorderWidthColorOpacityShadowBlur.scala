package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemStyleAnonBorderColorBorderTypeBorderWidthColorOpacityShadowBlur extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderColorBorderTypeBorderWidthColorOpacityShadowBlur] = js.undefined
}

object AnonItemStyleAnonBorderColorBorderTypeBorderWidthColorOpacityShadowBlur {
  @scala.inline
  def apply(itemStyle: AnonBorderColorBorderTypeBorderWidthColorOpacityShadowBlur = null): AnonItemStyleAnonBorderColorBorderTypeBorderWidthColorOpacityShadowBlur = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemStyleAnonBorderColorBorderTypeBorderWidthColorOpacityShadowBlur]
  }
}

