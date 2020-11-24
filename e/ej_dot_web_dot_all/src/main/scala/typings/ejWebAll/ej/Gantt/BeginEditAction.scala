package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BeginEditAction extends js.Object
@JSGlobal("ej.Gantt.BeginEditAction")
@js.native
object BeginEditAction extends js.Object {
  
  ///you can begin the editing at single click
  @js.native
  sealed trait Click extends BeginEditAction
  
  ///you can begin the editing at double click
  @js.native
  sealed trait DblClick extends BeginEditAction
}
