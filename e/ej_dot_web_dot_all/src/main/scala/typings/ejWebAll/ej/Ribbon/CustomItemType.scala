package typings.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CustomItemType extends js.Object
@JSGlobal("ej.Ribbon.CustomItemType")
@js.native
object CustomItemType extends js.Object {
  
  ///Specifies the button type in customGalleryItems
  @js.native
  sealed trait Button extends CustomItemType
  
  ///Specifies the menu type in customGalleryItems
  @js.native
  sealed trait Menu extends CustomItemType
}
