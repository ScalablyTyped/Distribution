package typings.ejDotWebDotAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 3 */ val Custompalette: typings.ejDotWebDotAll.ej.datavisualization.Map.ColorPalette.Custompalette with Double = js.native
  /* 0 */ val Palette1: typings.ejDotWebDotAll.ej.datavisualization.Map.ColorPalette.Palette1 with Double = js.native
  /* 1 */ val Palette2: typings.ejDotWebDotAll.ej.datavisualization.Map.ColorPalette.Palette2 with Double = js.native
  /* 2 */ val Palette3: typings.ejDotWebDotAll.ej.datavisualization.Map.ColorPalette.Palette3 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColorPalette with Double] = js.native
}

