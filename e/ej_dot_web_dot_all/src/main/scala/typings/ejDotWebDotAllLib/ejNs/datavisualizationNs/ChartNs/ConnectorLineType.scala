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
  
  val Bezier: Bezier with java.lang.String = js.native
  val Line: Line with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ConnectorLineType with java.lang.String
  ] = js.native
}

