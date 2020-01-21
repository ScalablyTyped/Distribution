package typings.ejWebAll.ej.Kanban

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionType with Double] = js.native
  /* 1 */ @js.native
  object Multiple extends TopLevel[Multiple with Double]
  
  /* 0 */ @js.native
  object Single extends TopLevel[Single with Double]
  
}

