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
  
  val Button: Button with java.lang.String = js.native
  val Custom: Custom with java.lang.String = js.native
  val DropDownList: DropDownList with java.lang.String = js.native
  val Gallery: Gallery with java.lang.String = js.native
  val SplitButton: SplitButton with java.lang.String = js.native
  val ToggleButton: ToggleButton with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.RibbonNs.Type with java.lang.String] = js.native
}

