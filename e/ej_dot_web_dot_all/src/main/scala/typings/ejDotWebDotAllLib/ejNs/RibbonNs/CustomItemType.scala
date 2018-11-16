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
  
  val Button: Button with java.lang.String = js.native
  val Menu: Menu with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.RibbonNs.CustomItemType with java.lang.String] = js.native
}

