package typings.ejDotWebDotAll.ejNs.KanbanNs

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
  sealed trait Bottom extends FormPosition
  
  ///Form position is right.
  @js.native
  sealed trait Right extends FormPosition
  
  /* 0 */ val Bottom: typings.ejDotWebDotAll.ejNs.KanbanNs.FormPosition.Bottom with Double = js.native
  /* 1 */ val Right: typings.ejDotWebDotAll.ejNs.KanbanNs.FormPosition.Right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FormPosition with Double] = js.native
}

