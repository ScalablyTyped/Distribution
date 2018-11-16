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
  
  val BatchEditing: BatchEditing with java.lang.String = js.native
  val CellEditing: CellEditing with java.lang.String = js.native
  val DialogEditing: DialogEditing with java.lang.String = js.native
  val RowEditing: RowEditing with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.TreeGridNs.EditMode with java.lang.String] = js.native
}

