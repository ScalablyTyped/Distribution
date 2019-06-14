package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Mode extends js.Object

@JSGlobal("ej.datavisualization.Chart.Mode")
@js.native
object Mode extends js.Object {
  //string
  @js.native
  sealed trait Cluster
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.Mode
  
  //string
  @js.native
  sealed trait Point
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.Mode
  
  //string
  @js.native
  sealed trait Range
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.Mode
  
  //string
  @js.native
  sealed trait Series
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.Mode
  
  /* 2 */ val Cluster: Cluster with scala.Double = js.native
  /* 1 */ val Point: Point with scala.Double = js.native
  /* 3 */ val Range: Range with scala.Double = js.native
  /* 0 */ val Series: Series with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.Mode with scala.Double] = js.native
}

