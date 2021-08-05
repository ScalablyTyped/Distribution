package typings.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFamily extends StObject {
  
  var fontFamily: String
  
  var fontSize: Double
  
  var fontStyle: String
  
  var fontWieght: String
}
object FontFamily {
  
  inline def apply(fontFamily: String, fontSize: Double, fontStyle: String, fontWieght: String): FontFamily = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], fontWieght = fontWieght.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFamily]
  }
  
  extension [Self <: FontFamily](x: Self) {
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontWieght(value: String): Self = StObject.set(x, "fontWieght", value.asInstanceOf[js.Any])
  }
}
