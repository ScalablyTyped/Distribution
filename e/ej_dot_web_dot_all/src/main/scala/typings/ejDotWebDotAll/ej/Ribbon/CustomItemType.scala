package typings.ejDotWebDotAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 0 */ val Button: typings.ejDotWebDotAll.ej.Ribbon.CustomItemType.Button with Double = js.native
  /* 1 */ val Menu: typings.ejDotWebDotAll.ej.Ribbon.CustomItemType.Menu with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CustomItemType with Double] = js.native
}

