package typings.ejDotWebDotAll.ejNs.RibbonNs

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
    extends typings.ejDotWebDotAll.ejNs.RibbonNs.Type
  
  ///To append external element's
  @js.native
  sealed trait Custom
    extends typings.ejDotWebDotAll.ejNs.RibbonNs.Type
  
  ///Specifies the dropDown
  @js.native
  sealed trait DropDownList
    extends typings.ejDotWebDotAll.ejNs.RibbonNs.Type
  
  ///Specifies the ribbon gallery
  @js.native
  sealed trait Gallery
    extends typings.ejDotWebDotAll.ejNs.RibbonNs.Type
  
  ///Specifies the split button
  @js.native
  sealed trait SplitButton
    extends typings.ejDotWebDotAll.ejNs.RibbonNs.Type
  
  ///Specifies the toggle button
  @js.native
  sealed trait ToggleButton
    extends typings.ejDotWebDotAll.ejNs.RibbonNs.Type
  
  /* 0 */ val Button: typings.ejDotWebDotAll.ejNs.RibbonNs.Type.Button with Double = js.native
  /* 3 */ val Custom: typings.ejDotWebDotAll.ejNs.RibbonNs.Type.Custom with Double = js.native
  /* 2 */ val DropDownList: typings.ejDotWebDotAll.ejNs.RibbonNs.Type.DropDownList with Double = js.native
  /* 5 */ val Gallery: typings.ejDotWebDotAll.ejNs.RibbonNs.Type.Gallery with Double = js.native
  /* 1 */ val SplitButton: typings.ejDotWebDotAll.ejNs.RibbonNs.Type.SplitButton with Double = js.native
  /* 4 */ val ToggleButton: typings.ejDotWebDotAll.ejNs.RibbonNs.Type.ToggleButton with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ejNs.RibbonNs.Type with Double] = js.native
}

