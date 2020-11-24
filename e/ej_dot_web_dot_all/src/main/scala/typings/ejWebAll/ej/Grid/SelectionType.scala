package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SelectionType extends js.Object
@JSGlobal("ej.Grid.SelectionType")
@js.native
object SelectionType extends js.Object {
  
  ///Specifies the selection type as multiple.
  @js.native
  sealed trait Multiple extends SelectionType
  
  ///Specifies the selection type as single.
  @js.native
  sealed trait Single extends SelectionType
}
