package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CellVisibility extends js.Object

@JSGlobal("ej.datavisualization.HeatMap.CellVisibility")
@js.native
object CellVisibility extends js.Object {
  //Hide the content of the cell
  @js.native
  sealed trait Hidden
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.CellVisibility
  
  //Display the content of the cell
  @js.native
  sealed trait Visible
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.CellVisibility
  
  val Hidden: Hidden with java.lang.String = js.native
  val Visible: Visible with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.CellVisibility with java.lang.String
  ] = js.native
}

