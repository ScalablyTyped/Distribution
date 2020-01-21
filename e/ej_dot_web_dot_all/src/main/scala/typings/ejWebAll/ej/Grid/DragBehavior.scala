package typings.ejWebAll.ej.Grid

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DragBehavior with Double] = js.native
  /* 1 */ @js.native
  object Copy extends TopLevel[Copy with Double]
  
  /* 0 */ @js.native
  object Move extends TopLevel[Move with Double]
  
}

