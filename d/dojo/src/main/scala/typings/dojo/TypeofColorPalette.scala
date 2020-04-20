package typings.dojo

import org.scalablytyped.runtime.Instantiable4
import typings.dojo.dijit.ColorPalette.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofColorPalette extends js.Object {
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
  var _Color: Instantiable4[/* alias */ String, /* row */ Double, /* col */ js.Any, /* title */ String, Color]
}

object TypeofColorPalette {
  @scala.inline
  def apply(
    _Color: Instantiable4[/* alias */ String, /* row */ Double, /* col */ js.Any, /* title */ String, Color]
  ): TypeofColorPalette = {
    val __obj = js.Dynamic.literal(_Color = _Color.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofColorPalette]
  }
}

