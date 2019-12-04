package typings.dojo

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.dojo.dijit.ColorPalette
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dijit/ColorPalette", JSImport.Namespace)
@js.native
object dijitColorPaletteMod
  extends TopLevel[
      TypeofColorPalette with (Instantiable2[
        js.UndefOr[/* params */ js.Object], 
        js.UndefOr[/* srcNodeRef */ HTMLElement], 
        ColorPalette
      ])
    ] {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/ColorPalette._Color.html
    *
    * Object associated with each cell in a ColorPalette palette.
    * Implements dijit/Dye.
    * 
    * @param alias English name of the color.     
    * @param row Vertical position in grid.     
    * @param col     
    * @param title Localized name of the color.     
    */
  @js.native
  class _Color protected ()
    extends typings.dojo.dijit.ColorPalette._Color {
    def this(alias: String, row: Double, col: js.Any, title: String) = this()
  }
  
}

