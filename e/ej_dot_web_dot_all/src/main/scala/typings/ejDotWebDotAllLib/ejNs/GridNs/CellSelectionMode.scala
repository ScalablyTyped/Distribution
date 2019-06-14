package typings
package ejDotWebDotAllLib.ejNs.GridNs

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
  sealed trait Box
    extends ejDotWebDotAllLib.ejNs.GridNs.CellSelectionMode
  
  ///It selects cells continuously from the start cell to end cell.
  @js.native
  sealed trait Flow
    extends ejDotWebDotAllLib.ejNs.GridNs.CellSelectionMode
  
  /* 1 */ val Box: Box with scala.Double = js.native
  /* 0 */ val Flow: Flow with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.GridNs.CellSelectionMode with scala.Double] = js.native
}

