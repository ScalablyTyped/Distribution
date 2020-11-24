package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BatchEditMode extends js.Object
@JSGlobal("ej.TreeGrid.BatchEditMode")
@js.native
object BatchEditMode extends js.Object {
  
  ///you can edit a cell
  @js.native
  sealed trait Cell extends BatchEditMode
  
  ///you can edit a row in dialog form
  @js.native
  sealed trait Dialog extends BatchEditMode
  
  ///you can edit a row
  @js.native
  sealed trait Row extends BatchEditMode
}
