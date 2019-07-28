package typings.ejDotWebDotAll.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RowPosition extends js.Object

@JSGlobal("ej.TreeGrid.RowPosition")
@js.native
object RowPosition extends js.Object {
  ///you can add a new row to above selected row.
  @js.native
  sealed trait Above extends RowPosition
  
  ///you can add a new row to below selected row.
  @js.native
  sealed trait Below extends RowPosition
  
  ///you can add a new row at bottom.
  @js.native
  sealed trait Bottom extends RowPosition
  
  ///you can add a new row as a child for selected row.
  @js.native
  sealed trait Child extends RowPosition
  
  ///you can add a new row at top.
  @js.native
  sealed trait Top extends RowPosition
  
  /* 2 */ val Above: typings.ejDotWebDotAll.ejNs.TreeGridNs.RowPosition.Above with Double = js.native
  /* 3 */ val Below: typings.ejDotWebDotAll.ejNs.TreeGridNs.RowPosition.Below with Double = js.native
  /* 1 */ val Bottom: typings.ejDotWebDotAll.ejNs.TreeGridNs.RowPosition.Bottom with Double = js.native
  /* 4 */ val Child: typings.ejDotWebDotAll.ejNs.TreeGridNs.RowPosition.Child with Double = js.native
  /* 0 */ val Top: typings.ejDotWebDotAll.ejNs.TreeGridNs.RowPosition.Top with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RowPosition with Double] = js.native
}

