package typings.ejDotWebDotAll.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionMode extends js.Object

@JSGlobal("ej.Gantt.SelectionMode")
@js.native
object SelectionMode extends js.Object {
  ///you can select a cell.
  @js.native
  sealed trait Cell extends SelectionMode
  
  ///you can select a row.
  @js.native
  sealed trait Row extends SelectionMode
  
  /* 1 */ val Cell: typings.ejDotWebDotAll.ejNs.GanttNs.SelectionMode.Cell with Double = js.native
  /* 0 */ val Row: typings.ejDotWebDotAll.ejNs.GanttNs.SelectionMode.Row with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionMode with Double] = js.native
}

