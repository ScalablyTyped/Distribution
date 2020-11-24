package typings.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ColorPalette extends js.Object
@JSGlobal("ej.datavisualization.Map.ColorPalette")
@js.native
object ColorPalette extends js.Object {
  
  //specifies the custom color
  @js.native
  sealed trait Custompalette extends ColorPalette
  
  //specifies the palette1 color
  @js.native
  sealed trait Palette1 extends ColorPalette
  
  //specifies the palette2 color
  @js.native
  sealed trait Palette2 extends ColorPalette
  
  //specifies the palette3 color
  @js.native
  sealed trait Palette3 extends ColorPalette
}
