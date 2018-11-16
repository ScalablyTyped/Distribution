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
  
  val Cluster: Cluster with java.lang.String = js.native
  val Point: Point with java.lang.String = js.native
  val Range: Range with java.lang.String = js.native
  val Series: Series with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.Mode with java.lang.String] = js.native
}

