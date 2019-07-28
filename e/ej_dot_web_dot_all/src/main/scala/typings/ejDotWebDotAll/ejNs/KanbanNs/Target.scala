package typings.ejDotWebDotAll.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Target extends js.Object

@JSGlobal("ej.Kanban.Target")
@js.native
object Target extends js.Object {
  ///Sets context menu to Kanban
  @js.native
  sealed trait All extends Target
  
  ///Sets context menu to Kanban card
  @js.native
  sealed trait Card extends Target
  
  ///Sets context menu to Kanban content
  @js.native
  sealed trait Content extends Target
  
  ///Sets context menu to Kanban header
  @js.native
  sealed trait Header extends Target
  
  /* 3 */ val All: typings.ejDotWebDotAll.ejNs.KanbanNs.Target.All with Double = js.native
  /* 2 */ val Card: typings.ejDotWebDotAll.ejNs.KanbanNs.Target.Card with Double = js.native
  /* 1 */ val Content: typings.ejDotWebDotAll.ejNs.KanbanNs.Target.Content with Double = js.native
  /* 0 */ val Header: typings.ejDotWebDotAll.ejNs.KanbanNs.Target.Header with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Target with Double] = js.native
}

