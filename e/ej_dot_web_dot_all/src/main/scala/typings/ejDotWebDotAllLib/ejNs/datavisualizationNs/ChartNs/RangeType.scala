package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RangeType extends js.Object

@JSGlobal("ej.datavisualization.Chart.RangeType")
@js.native
object RangeType extends js.Object {
  //string
  @js.native
  sealed trait X
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.RangeType
  
  //string
  @js.native
  sealed trait XY
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.RangeType
  
  //string
  @js.native
  sealed trait Y
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.RangeType
  
  /* 1 */ val X: X with scala.Double = js.native
  /* 0 */ val XY: XY with scala.Double = js.native
  /* 2 */ val Y: Y with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.RangeType with scala.Double] = js.native
}

