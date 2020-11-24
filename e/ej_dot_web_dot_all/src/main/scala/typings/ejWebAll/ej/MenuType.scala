package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MenuType extends js.Object
@JSGlobal("ej.MenuType")
@js.native
object MenuType extends js.Object {
  
  //string
  @js.native
  sealed trait ContextMenu extends MenuType
  
  //string
  @js.native
  sealed trait NormalMenu extends MenuType
}
