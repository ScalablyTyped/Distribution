package typings
package echartsLib.echartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EChartsMediaOption extends js.Object {
  var option: EChartOption[echartsLib.echartsNs.EChartOptionNs.Series]
  var query: echartsLib.Anon_AspectRatio
}

object EChartsMediaOption {
  @scala.inline
  def apply(
    option: EChartOption[echartsLib.echartsNs.EChartOptionNs.Series],
    query: echartsLib.Anon_AspectRatio
  ): EChartsMediaOption = {
    val __obj = js.Dynamic.literal(option = option, query = query)
  
    __obj.asInstanceOf[EChartsMediaOption]
  }
}

