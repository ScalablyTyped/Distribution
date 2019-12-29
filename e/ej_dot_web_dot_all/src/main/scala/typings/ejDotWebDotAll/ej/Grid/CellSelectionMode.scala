package typings.ejDotWebDotAll.ej.Grid

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CellSelectionMode with Double] = js.native
  /* 1 */ @js.native
  object Box extends TopLevel[Box with Double]
  
  /* 0 */ @js.native
  object Flow extends TopLevel[Flow with Double]
  
}

