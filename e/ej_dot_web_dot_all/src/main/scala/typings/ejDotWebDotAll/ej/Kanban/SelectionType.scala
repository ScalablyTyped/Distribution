package typings.ejDotWebDotAll.ej.Kanban

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
  sealed trait Multiple extends SelectionType
  
  ///Support for Single selection in Kanban
  @js.native
  sealed trait Single extends SelectionType
  
  /* 1 */ val Multiple: typings.ejDotWebDotAll.ej.Kanban.SelectionType.Multiple with Double = js.native
  /* 0 */ val Single: typings.ejDotWebDotAll.ej.Kanban.SelectionType.Single with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionType with Double] = js.native
}

