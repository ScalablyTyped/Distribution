package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemStyleAnonBorderColorBorderTypeBorderWidthColorOpacityShadowBlur extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-treemap.breadcrumb.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_BorderColorBorderTypeBorderWidthColorOpacityShadowBlur] = js.undefined
}

object Anon_ItemStyleAnonBorderColorBorderTypeBorderWidthColorOpacityShadowBlur {
  @scala.inline
  def apply(itemStyle: Anon_BorderColorBorderTypeBorderWidthColorOpacityShadowBlur = null): Anon_ItemStyleAnonBorderColorBorderTypeBorderWidthColorOpacityShadowBlur = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ItemStyleAnonBorderColorBorderTypeBorderWidthColorOpacityShadowBlur]
  }
}

