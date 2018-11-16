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
  
  val All: All with java.lang.String = js.native
  val Card: Card with java.lang.String = js.native
  val Content: Content with java.lang.String = js.native
  val Header: Header with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.KanbanNs.Target with java.lang.String] = js.native
}

