package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConnectorLineType extends js.Object

@JSGlobal("ej.datavisualization.Chart.ConnectorLineType")
@js.native
object ConnectorLineType extends js.Object {
  //string
  @js.native
  sealed trait Bezier
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ConnectorLineType
  
  //string
  @js.native
  sealed trait Line
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ConnectorLineType
  
  /* 1 */ val Bezier: Bezier with scala.Double = js.native
  /* 0 */ val Line: Line with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ConnectorLineType with scala.Double
  ] = js.native
}

