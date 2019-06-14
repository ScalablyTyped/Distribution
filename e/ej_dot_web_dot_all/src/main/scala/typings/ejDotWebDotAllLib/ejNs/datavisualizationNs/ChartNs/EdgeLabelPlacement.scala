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
  
  /* 2 */ val Hide: Hide with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val Shift: Shift with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.EdgeLabelPlacement with scala.Double
  ] = js.native
}

