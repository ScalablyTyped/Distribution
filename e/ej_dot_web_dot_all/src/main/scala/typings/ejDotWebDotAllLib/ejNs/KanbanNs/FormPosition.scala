package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FormPosition extends js.Object

@JSGlobal("ej.Kanban.FormPosition")
@js.native
object FormPosition extends js.Object {
  ///Form position is bottom.
  @js.native
  sealed trait Bottom
    extends ejDotWebDotAllLib.ejNs.KanbanNs.FormPosition
  
  ///Form position is right.
  @js.native
  sealed trait Right
    extends ejDotWebDotAllLib.ejNs.KanbanNs.FormPosition
  
  /* 0 */ val Bottom: Bottom with scala.Double = js.native
  /* 1 */ val Right: Right with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.KanbanNs.FormPosition with scala.Double] = js.native
}

