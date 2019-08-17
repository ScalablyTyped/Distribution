package typings.echarts.echartsNs.EChartOptionNs.TooltipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PositionNs {
  import typings.std.HTMLElement

  type Fn = js.Function5[
    /* point */ js.Array[Double | String], 
    /* params */ js.Object | js.Array[js.Object], 
    /* element */ HTMLElement, 
    /* rect */ js.Object, 
    /* size */ js.Object, 
    (js.Array[Double | String]) | Obj
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.echarts.echartsNs.EChartOptionNs.TooltipNs.PositionNs.Str
    - typings.echarts.echartsNs.EChartOptionNs.TooltipNs.PositionNs.Obj
    - js.Array[scala.Double | java.lang.String]
    - typings.echarts.echartsNs.EChartOptionNs.TooltipNs.PositionNs.Fn
  */
  type Type = _Type | (js.Array[Double | String]) | Fn
}
