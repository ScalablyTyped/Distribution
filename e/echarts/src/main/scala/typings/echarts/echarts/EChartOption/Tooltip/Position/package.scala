package typings.echarts.echarts.EChartOption.Tooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Position {
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
    - typings.echarts.echarts.EChartOption.Tooltip.Position.Str
    - typings.echarts.echarts.EChartOption.Tooltip.Position.Obj
    - js.Array[scala.Double | java.lang.String]
    - typings.echarts.echarts.EChartOption.Tooltip.Position.Fn
  */
  type Type = _Type | (js.Array[Double | String]) | Fn
}
