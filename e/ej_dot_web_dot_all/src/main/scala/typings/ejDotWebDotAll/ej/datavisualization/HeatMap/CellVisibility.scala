package typings.ejDotWebDotAll.ej.datavisualization.HeatMap

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
  sealed trait Hidden extends CellVisibility
  
  //Display the content of the cell
  @js.native
  sealed trait Visible extends CellVisibility
  
  /* 1 */ val Hidden: typings.ejDotWebDotAll.ej.datavisualization.HeatMap.CellVisibility.Hidden with Double = js.native
  /* 0 */ val Visible: typings.ejDotWebDotAll.ej.datavisualization.HeatMap.CellVisibility.Visible with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CellVisibility with Double] = js.native
}

