package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionType extends js.Object

@JSGlobal("ej.Kanban.SelectionType")
@js.native
object SelectionType extends js.Object {
  ///Support for multiple selections in Kanban
  @js.native
  sealed trait Multiple
    extends ejDotWebDotAllLib.ejNs.KanbanNs.SelectionType
  
  ///Support for Single selection in Kanban
  @js.native
  sealed trait Single
    extends ejDotWebDotAllLib.ejNs.KanbanNs.SelectionType
  
  val Multiple: Multiple with java.lang.String = js.native
  val Single: Single with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.KanbanNs.SelectionType with java.lang.String] = js.native
}

