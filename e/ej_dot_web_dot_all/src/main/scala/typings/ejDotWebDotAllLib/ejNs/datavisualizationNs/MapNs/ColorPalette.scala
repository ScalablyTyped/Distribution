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
  
  val Custompalette: Custompalette with java.lang.String = js.native
  val Palette1: Palette1 with java.lang.String = js.native
  val Palette2: Palette2 with java.lang.String = js.native
  val Palette3: Palette3 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.ColorPalette with java.lang.String
  ] = js.native
}

