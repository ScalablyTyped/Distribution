package typings
package ejDotWebDotAllLib.ejNs.RibbonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Type extends js.Object

@JSGlobal("ej.Ribbon.Type")
@js.native
object Type extends js.Object {
  ///Specifies the button control
  @js.native
  sealed trait Button
    extends ejDotWebDotAllLib.ejNs.RibbonNs.Type
  
  ///To append external element's
  @js.native
  sealed trait Custom
    extends ejDotWebDotAllLib.ejNs.RibbonNs.Type
  
  ///Specifies the dropDown
  @js.native
  sealed trait DropDownList
    extends ejDotWebDotAllLib.ejNs.RibbonNs.Type
  
  ///Specifies the ribbon gallery
  @js.native
  sealed trait Gallery
    extends ejDotWebDotAllLib.ejNs.RibbonNs.Type
  
  ///Specifies the split button
  @js.native
  sealed trait SplitButton
    extends ejDotWebDotAllLib.ejNs.RibbonNs.Type
  
  ///Specifies the toggle button
  @js.native
  sealed trait ToggleButton
    extends ejDotWebDotAllLib.ejNs.RibbonNs.Type
  
  /* 0 */ val Button: Button with scala.Double = js.native
  /* 3 */ val Custom: Custom with scala.Double = js.native
  /* 2 */ val DropDownList: DropDownList with scala.Double = js.native
  /* 5 */ val Gallery: Gallery with scala.Double = js.native
  /* 1 */ val SplitButton: SplitButton with scala.Double = js.native
  /* 4 */ val ToggleButton: ToggleButton with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.RibbonNs.Type with scala.Double] = js.native
}

