package typings.ejDotWebDotAll.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BeginEditAction extends js.Object

@JSGlobal("ej.Gantt.BeginEditAction")
@js.native
object BeginEditAction extends js.Object {
  ///you can begin the editing at single click
  @js.native
  sealed trait Click extends BeginEditAction
  
  ///you can begin the editing at double click
  @js.native
  sealed trait DblClick extends BeginEditAction
  
  /* 1 */ val Click: typings.ejDotWebDotAll.ejNs.GanttNs.BeginEditAction.Click with Double = js.native
  /* 0 */ val DblClick: typings.ejDotWebDotAll.ejNs.GanttNs.BeginEditAction.DblClick with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BeginEditAction with Double] = js.native
}

