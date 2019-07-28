package typings.ejDotWebDotAll.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DragBehavior extends js.Object

@JSGlobal("ej.Grid.DragBehavior")
@js.native
object DragBehavior extends js.Object {
  ///Allows to copy a record from one grid to another or within the grid.
  @js.native
  sealed trait Copy extends DragBehavior
  
  ///Allows to move a record from one grid to another or within the grid.
  @js.native
  sealed trait Move extends DragBehavior
  
  /* 1 */ val Copy: typings.ejDotWebDotAll.ejNs.GridNs.DragBehavior.Copy with Double = js.native
  /* 0 */ val Move: typings.ejDotWebDotAll.ejNs.GridNs.DragBehavior.Move with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DragBehavior with Double] = js.native
}

