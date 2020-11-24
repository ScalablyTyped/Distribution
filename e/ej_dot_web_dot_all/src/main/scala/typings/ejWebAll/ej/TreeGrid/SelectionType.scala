package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SelectionType extends js.Object
@JSGlobal("ej.TreeGrid.SelectionType")
@js.native
object SelectionType extends js.Object {
  
  ///you can select rows using checkbox.
  @js.native
  sealed trait Checkbox extends SelectionType
  
  ///you can select a multiple row.
  @js.native
  sealed trait Multiple extends SelectionType
  
  ///you can select a single row.
  @js.native
  sealed trait Single extends SelectionType
}
