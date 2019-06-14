package typings
package ejDotWebDotAllLib.ejNs.RibbonNs

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
  sealed trait Button
    extends ejDotWebDotAllLib.ejNs.RibbonNs.CustomItemType
  
  ///Specifies the menu type in customGalleryItems
  @js.native
  sealed trait Menu
    extends ejDotWebDotAllLib.ejNs.RibbonNs.CustomItemType
  
  /* 0 */ val Button: Button with scala.Double = js.native
  /* 1 */ val Menu: Menu with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.RibbonNs.CustomItemType with scala.Double] = js.native
}

