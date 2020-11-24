package typings.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
