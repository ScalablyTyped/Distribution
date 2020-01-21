package typings.ejWebAll.ej.Ribbon

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CustomItemType with Double] = js.native
  /* 0 */ @js.native
  object Button extends TopLevel[Button with Double]
  
  /* 1 */ @js.native
  object Menu extends TopLevel[Menu with Double]
  
}

