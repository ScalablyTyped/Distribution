package typings.echarts.echarts.EChartOption

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseTextStyleWithRich extends js.Object {
  var rich: js.UndefOr[RichStyle] = js.undefined
}

object BaseTextStyleWithRich {
  @scala.inline
  def apply(rich: RichStyle = null): BaseTextStyleWithRich = {
    val __obj = js.Dynamic.literal()
    if (rich != null) __obj.updateDynamic("rich")(rich)
    __obj.asInstanceOf[BaseTextStyleWithRich]
  }
}

