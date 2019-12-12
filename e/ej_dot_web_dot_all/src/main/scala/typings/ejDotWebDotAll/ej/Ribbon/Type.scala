package typings.ejDotWebDotAll.ej.Ribbon

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.Ribbon.Type.Custom
import typings.ejDotWebDotAll.ej.Ribbon.Type.Gallery
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
    extends typings.ejDotWebDotAll.ej.Ribbon.Type
  
  ///To append external element's
  @js.native
  sealed trait Custom
    extends typings.ejDotWebDotAll.ej.Ribbon.Type
  
  ///Specifies the dropDown
  @js.native
  sealed trait DropDownList
    extends typings.ejDotWebDotAll.ej.Ribbon.Type
  
  ///Specifies the ribbon gallery
  @js.native
  sealed trait Gallery
    extends typings.ejDotWebDotAll.ej.Ribbon.Type
  
  ///Specifies the split button
  @js.native
  sealed trait SplitButton
    extends typings.ejDotWebDotAll.ej.Ribbon.Type
  
  ///Specifies the toggle button
  @js.native
  sealed trait ToggleButton
    extends typings.ejDotWebDotAll.ej.Ribbon.Type
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ej.Ribbon.Type with Double] = js.native
  /* 0 */ @js.native
  object Button
    extends TopLevel[typings.ejDotWebDotAll.ej.Ribbon.Type.Button with Double]
  
  /* 3 */ @js.native
  object Custom extends TopLevel[Custom with Double]
  
  /* 2 */ @js.native
  object DropDownList
    extends TopLevel[typings.ejDotWebDotAll.ej.Ribbon.Type.DropDownList with Double]
  
  /* 5 */ @js.native
  object Gallery extends TopLevel[Gallery with Double]
  
  /* 1 */ @js.native
  object SplitButton
    extends TopLevel[typings.ejDotWebDotAll.ej.Ribbon.Type.SplitButton with Double]
  
  /* 4 */ @js.native
  object ToggleButton
    extends TopLevel[typings.ejDotWebDotAll.ej.Ribbon.Type.ToggleButton with Double]
  
}

