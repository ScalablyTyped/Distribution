package typings.ejDotWebDotAll.ej.TreeGrid

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.TreeGrid.EditMode.BatchEditing
import typings.ejDotWebDotAll.ej.TreeGrid.EditMode.CellEditing
import typings.ejDotWebDotAll.ej.TreeGrid.EditMode.DialogEditing
import typings.ejDotWebDotAll.ej.TreeGrid.EditMode.RowEditing
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditMode with Double] = js.native
  /* 3 */ @js.native
  object BatchEditing extends TopLevel[BatchEditing with Double]
  
  /* 0 */ @js.native
  object CellEditing extends TopLevel[CellEditing with Double]
  
  /* 2 */ @js.native
  object DialogEditing extends TopLevel[DialogEditing with Double]
  
  /* 1 */ @js.native
  object RowEditing extends TopLevel[RowEditing with Double]
  
}

