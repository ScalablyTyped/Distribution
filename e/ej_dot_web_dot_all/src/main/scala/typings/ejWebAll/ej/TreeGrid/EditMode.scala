package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
