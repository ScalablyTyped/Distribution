package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

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
  sealed trait BatchEditing
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.EditMode
  
  ///you can edit a cell.
  @js.native
  sealed trait CellEditing
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.EditMode
  
  ///you can edit a row in dialog form.
  @js.native
  sealed trait DialogEditing
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.EditMode
  
  ///you can edit a row.
  @js.native
  sealed trait RowEditing
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.EditMode
  
  /* 3 */ val BatchEditing: BatchEditing with scala.Double = js.native
  /* 0 */ val CellEditing: CellEditing with scala.Double = js.native
  /* 2 */ val DialogEditing: DialogEditing with scala.Double = js.native
  /* 1 */ val RowEditing: RowEditing with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.TreeGridNs.EditMode with scala.Double] = js.native
}

