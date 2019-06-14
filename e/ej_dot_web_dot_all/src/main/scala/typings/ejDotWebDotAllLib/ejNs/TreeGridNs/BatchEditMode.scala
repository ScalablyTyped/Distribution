package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BatchEditMode extends js.Object

@JSGlobal("ej.TreeGrid.BatchEditMode")
@js.native
object BatchEditMode extends js.Object {
  ///you can edit a cell
  @js.native
  sealed trait Cell
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.BatchEditMode
  
  ///you can edit a row in dialog form
  @js.native
  sealed trait Dialog
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.BatchEditMode
  
  ///you can edit a row
  @js.native
  sealed trait Row
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.BatchEditMode
  
  /* 0 */ val Cell: Cell with scala.Double = js.native
  /* 2 */ val Dialog: Dialog with scala.Double = js.native
  /* 1 */ val Row: Row with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.TreeGridNs.BatchEditMode with scala.Double] = js.native
}

