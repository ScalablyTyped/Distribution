package typings.ejDotWebDotAll.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionType extends js.Object

@JSGlobal("ej.Gantt.SelectionType")
@js.native
object SelectionType extends js.Object {
  ///you can select a multiple row.
  @js.native
  sealed trait Multiple extends SelectionType
  
  ///you can select a single row.
  @js.native
  sealed trait Single extends SelectionType
  
  /* 1 */ val Multiple: typings.ejDotWebDotAll.ejNs.GanttNs.SelectionType.Multiple with Double = js.native
  /* 0 */ val Single: typings.ejDotWebDotAll.ejNs.GanttNs.SelectionType.Single with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionType with Double] = js.native
}

