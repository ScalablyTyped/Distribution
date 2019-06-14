package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExportingMode extends js.Object

@JSGlobal("ej.datavisualization.Chart.ExportingMode")
@js.native
object ExportingMode extends js.Object {
  //string
  @js.native
  sealed trait ClientSide
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ExportingMode
  
  //string
  @js.native
  sealed trait ServerSide
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ExportingMode
  
  /* 1 */ val ClientSide: ClientSide with scala.Double = js.native
  /* 0 */ val ServerSide: ServerSide with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ExportingMode with scala.Double
  ] = js.native
}

