package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EdgeLabelPlacement extends js.Object

@JSGlobal("ej.datavisualization.Chart.EdgeLabelPlacement")
@js.native
object EdgeLabelPlacement extends js.Object {
  //string
  @js.native
  sealed trait Hide
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.EdgeLabelPlacement
  
  //string
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.EdgeLabelPlacement
  
  //string
  @js.native
  sealed trait Shift
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.EdgeLabelPlacement
  
  val Hide: Hide with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val Shift: Shift with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.EdgeLabelPlacement with java.lang.String
  ] = js.native
}

