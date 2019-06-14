package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs

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
  sealed trait Custompalette
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.ColorPalette
  
  //specifies the palette1 color
  @js.native
  sealed trait Palette1
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.ColorPalette
  
  //specifies the palette2 color
  @js.native
  sealed trait Palette2
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.ColorPalette
  
  //specifies the palette3 color
  @js.native
  sealed trait Palette3
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.ColorPalette
  
  /* 3 */ val Custompalette: Custompalette with scala.Double = js.native
  /* 0 */ val Palette1: Palette1 with scala.Double = js.native
  /* 1 */ val Palette2: Palette2 with scala.Double = js.native
  /* 2 */ val Palette3: Palette3 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.ColorPalette with scala.Double] = js.native
}

