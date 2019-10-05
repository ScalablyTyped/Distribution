package typings.ejDotWebDotAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RowPosition extends js.Object

@JSGlobal("ej.Gantt.RowPosition")
@js.native
object RowPosition extends js.Object {
  ///you can add a new row to above selected row.
  @js.native
  sealed trait AboveSelectedRow extends RowPosition
  
  ///you can add a new row to below selected row.
  @js.native
  sealed trait BelowSelectedRow extends RowPosition
  
  ///you can add a new row at bottom.
  @js.native
  sealed trait Bottom extends RowPosition
  
  ///you can add a new row as a child for selected row.
  @js.native
  sealed trait Child extends RowPosition
  
  ///you can add a new row at top.
  @js.native
  sealed trait Top extends RowPosition
  
  /* 2 */ val AboveSelectedRow: typings.ejDotWebDotAll.ej.Gantt.RowPosition.AboveSelectedRow with Double = js.native
  /* 3 */ val BelowSelectedRow: typings.ejDotWebDotAll.ej.Gantt.RowPosition.BelowSelectedRow with Double = js.native
  /* 1 */ val Bottom: typings.ejDotWebDotAll.ej.Gantt.RowPosition.Bottom with Double = js.native
  /* 4 */ val Child: typings.ejDotWebDotAll.ej.Gantt.RowPosition.Child with Double = js.native
  /* 0 */ val Top: typings.ejDotWebDotAll.ej.Gantt.RowPosition.Top with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RowPosition with Double] = js.native
}

