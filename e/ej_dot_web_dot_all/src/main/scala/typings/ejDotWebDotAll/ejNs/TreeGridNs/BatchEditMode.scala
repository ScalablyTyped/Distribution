package typings.ejDotWebDotAll.ejNs.TreeGridNs

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
  sealed trait Cell extends BatchEditMode
  
  ///you can edit a row in dialog form
  @js.native
  sealed trait Dialog extends BatchEditMode
  
  ///you can edit a row
  @js.native
  sealed trait Row extends BatchEditMode
  
  /* 0 */ val Cell: typings.ejDotWebDotAll.ejNs.TreeGridNs.BatchEditMode.Cell with Double = js.native
  /* 2 */ val Dialog: typings.ejDotWebDotAll.ejNs.TreeGridNs.BatchEditMode.Dialog with Double = js.native
  /* 1 */ val Row: typings.ejDotWebDotAll.ejNs.TreeGridNs.BatchEditMode.Row with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BatchEditMode with Double] = js.native
}

