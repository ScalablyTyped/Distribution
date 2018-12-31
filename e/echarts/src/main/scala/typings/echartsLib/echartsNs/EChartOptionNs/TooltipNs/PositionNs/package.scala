package typings
package echartsLib.echartsNs.EChartOptionNs.TooltipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PositionNs {
  type Fn = js.Function5[
    /* point */ js.Array[scala.Double | java.lang.String], 
    /* params */ js.Object | js.Array[js.Object], 
    /* element */ stdLib.HTMLElement, 
    /* rect */ js.Object, 
    /* size */ js.Object, 
    (js.Array[scala.Double | java.lang.String]) | Obj
  ]
  type Str = echartsLib.echartsLibStrings.inside | echartsLib.echartsLibStrings.top | echartsLib.echartsLibStrings.left | echartsLib.echartsLibStrings.right | echartsLib.echartsLibStrings.bottom
  type Type = Str | Obj | (js.Array[scala.Double | java.lang.String]) | Fn
}
