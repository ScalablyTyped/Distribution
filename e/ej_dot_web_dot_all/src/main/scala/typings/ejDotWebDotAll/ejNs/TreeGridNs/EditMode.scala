package typings.ejDotWebDotAll.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EditMode extends js.Object

@JSGlobal("ej.TreeGrid.EditMode")
@js.native
object EditMode extends js.Object {
  ///you can edit and save bulk of records
  @js.native
  sealed trait BatchEditing extends EditMode
  
  ///you can edit a cell.
  @js.native
  sealed trait CellEditing extends EditMode
  
  ///you can edit a row in dialog form.
  @js.native
  sealed trait DialogEditing extends EditMode
  
  ///you can edit a row.
  @js.native
  sealed trait RowEditing extends EditMode
  
  /* 3 */ val BatchEditing: typings.ejDotWebDotAll.ejNs.TreeGridNs.EditMode.BatchEditing with Double = js.native
  /* 0 */ val CellEditing: typings.ejDotWebDotAll.ejNs.TreeGridNs.EditMode.CellEditing with Double = js.native
  /* 2 */ val DialogEditing: typings.ejDotWebDotAll.ejNs.TreeGridNs.EditMode.DialogEditing with Double = js.native
  /* 1 */ val RowEditing: typings.ejDotWebDotAll.ejNs.TreeGridNs.EditMode.RowEditing with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditMode with Double] = js.native
}

