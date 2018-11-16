package typings
package ejDotWebDotAllLib.ejNs.GridNs

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
  sealed trait Copy
    extends ejDotWebDotAllLib.ejNs.GridNs.DragBehavior
  
  ///Allows to move a record from one grid to another or within the grid.
  @js.native
  sealed trait Move
    extends ejDotWebDotAllLib.ejNs.GridNs.DragBehavior
  
  val Copy: Copy with java.lang.String = js.native
  val Move: Move with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.GridNs.DragBehavior with java.lang.String] = js.native
}

