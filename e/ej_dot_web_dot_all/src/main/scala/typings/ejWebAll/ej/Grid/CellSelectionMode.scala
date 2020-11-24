package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
