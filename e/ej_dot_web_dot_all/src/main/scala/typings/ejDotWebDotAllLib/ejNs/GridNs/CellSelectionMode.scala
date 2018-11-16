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
  
  val Box: Box with java.lang.String = js.native
  val Flow: Flow with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.GridNs.CellSelectionMode with java.lang.String] = js.native
}

