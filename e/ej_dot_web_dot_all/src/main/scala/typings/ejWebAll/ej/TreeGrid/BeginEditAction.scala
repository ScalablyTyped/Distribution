package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BeginEditAction extends js.Object

@JSGlobal("ej.TreeGrid.BeginEditAction")
@js.native
object BeginEditAction extends js.Object {
  ///you can begin the editing at single click
  @js.native
  sealed trait Click extends BeginEditAction
  
  ///you can begin the editing at double click
  @js.native
  sealed trait DblClick extends BeginEditAction
  
}

