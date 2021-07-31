package typings.googleSpreadsheet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeColorPair extends StObject {
  
  var color: ColorStyle
  
  var colorType: ThemeColorType
}
object ThemeColorPair {
  
  @scala.inline
  def apply(color: ColorStyle, colorType: ThemeColorType): ThemeColorPair = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], colorType = colorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeColorPair]
  }
  
  @scala.inline
  implicit class ThemeColorPairMutableBuilder[Self <: ThemeColorPair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: ColorStyle): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorType(value: ThemeColorType): Self = StObject.set(x, "colorType", value.asInstanceOf[js.Any])
  }
}
