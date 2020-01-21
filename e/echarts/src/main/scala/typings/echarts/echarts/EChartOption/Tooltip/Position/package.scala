package typings.echarts.echarts.EChartOption.Tooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Position {
  type Fn = js.Function5[
    /* point */ js.Array[scala.Double | java.lang.String], 
    /* params */ js.Object | js.Array[js.Object], 
    /* element */ typings.std.HTMLElement, 
    /* rect */ js.Object, 
    /* size */ js.Object, 
    (js.Array[scala.Double | java.lang.String]) | typings.echarts.echarts.EChartOption.Tooltip.Position.Obj
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.echarts.echarts.EChartOption.Tooltip.Position.Str
    - typings.echarts.echarts.EChartOption.Tooltip.Position.Obj
    - js.Array[scala.Double | java.lang.String]
    - typings.echarts.echarts.EChartOption.Tooltip.Position.Fn
  */
  type Type = typings.echarts.echarts.EChartOption.Tooltip.Position._Type | (js.Array[scala.Double | java.lang.String]) | typings.echarts.echarts.EChartOption.Tooltip.Position.Fn
}
