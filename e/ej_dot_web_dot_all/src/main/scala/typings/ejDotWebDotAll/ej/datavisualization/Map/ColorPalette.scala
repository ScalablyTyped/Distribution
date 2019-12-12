package typings.ejDotWebDotAll.ej.datavisualization.Map

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Map.ColorPalette.Custompalette
import typings.ejDotWebDotAll.ej.datavisualization.Map.ColorPalette.Palette1
import typings.ejDotWebDotAll.ej.datavisualization.Map.ColorPalette.Palette2
import typings.ejDotWebDotAll.ej.datavisualization.Map.ColorPalette.Palette3
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColorPalette with Double] = js.native
  /* 3 */ @js.native
  object Custompalette extends TopLevel[Custompalette with Double]
  
  /* 0 */ @js.native
  object Palette1 extends TopLevel[Palette1 with Double]
  
  /* 1 */ @js.native
  object Palette2 extends TopLevel[Palette2 with Double]
  
  /* 2 */ @js.native
  object Palette3 extends TopLevel[Palette3 with Double]
  
}

