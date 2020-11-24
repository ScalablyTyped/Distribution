package typings.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ItemType extends js.Object
@JSGlobal("ej.Ribbon.ItemType")
@js.native
object ItemType extends js.Object {
  
  ///To render the button for ribbon backstage pageâ€™s contents
  @js.native
  sealed trait Button extends ItemType
  
  ///To render the tab for ribbon backstage pageâ€™s contents
  @js.native
  sealed trait Tab extends ItemType
}
