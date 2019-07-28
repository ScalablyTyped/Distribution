package typings.ejDotWebDotAll.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CellSelectionMode extends js.Object

@JSGlobal("ej.Grid.CellSelectionMode")
@js.native
object CellSelectionMode extends js.Object {
  ///It selects range of cells as a block from start cell to the end cell.
  @js.native
  sealed trait Box extends CellSelectionMode
  
  ///It selects cells continuously from the start cell to end cell.
  @js.native
  sealed trait Flow extends CellSelectionMode
  
  /* 1 */ val Box: typings.ejDotWebDotAll.ejNs.GridNs.CellSelectionMode.Box with Double = js.native
  /* 0 */ val Flow: typings.ejDotWebDotAll.ejNs.GridNs.CellSelectionMode.Flow with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CellSelectionMode with Double] = js.native
}

