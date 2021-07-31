package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  /**
  	 * Hex string for alpha-red-green-blue e.g. FF00FF00
  	 */
  var argb: String
  
  /**
  	 * Choose a theme by index
  	 */
  var theme: Double
}
object Color {
  
  @scala.inline
  def apply(argb: String, theme: Double): Color = {
    val __obj = js.Dynamic.literal(argb = argb.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgb(value: String): Self = StObject.set(x, "argb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: Double): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
