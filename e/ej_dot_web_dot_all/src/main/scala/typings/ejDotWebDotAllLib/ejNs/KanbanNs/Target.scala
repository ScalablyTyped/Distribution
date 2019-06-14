package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

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
  sealed trait All
    extends ejDotWebDotAllLib.ejNs.KanbanNs.Target
  
  ///Sets context menu to Kanban card
  @js.native
  sealed trait Card
    extends ejDotWebDotAllLib.ejNs.KanbanNs.Target
  
  ///Sets context menu to Kanban content
  @js.native
  sealed trait Content
    extends ejDotWebDotAllLib.ejNs.KanbanNs.Target
  
  ///Sets context menu to Kanban header
  @js.native
  sealed trait Header
    extends ejDotWebDotAllLib.ejNs.KanbanNs.Target
  
  /* 3 */ val All: All with scala.Double = js.native
  /* 2 */ val Card: Card with scala.Double = js.native
  /* 1 */ val Content: Content with scala.Double = js.native
  /* 0 */ val Header: Header with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.KanbanNs.Target with scala.Double] = js.native
}

