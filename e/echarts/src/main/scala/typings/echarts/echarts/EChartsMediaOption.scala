package typings.echarts.echarts

import typings.echarts.Anon_AspectRatio
import typings.echarts.echarts.EChartOption.Series
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EChartsMediaOption extends js.Object {
  var option: EChartOption[Series]
  var query: Anon_AspectRatio
}

object EChartsMediaOption {
  @scala.inline
  def apply(option: EChartOption[Series], query: Anon_AspectRatio): EChartsMediaOption = {
    val __obj = js.Dynamic.literal(option = option, query = query)
  
    __obj.asInstanceOf[EChartsMediaOption]
  }
}

