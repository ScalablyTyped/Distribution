package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelStyle extends StObject {
  
  var color: String
  
  var fontName: String
  
  var fontSize: Double
}
object LabelStyle {
  
  inline def apply(color: String, fontName: String, fontSize: Double): LabelStyle = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontName = fontName.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelStyle] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setFontName(value: String): Self = StObject.set(x, "fontName", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
  }
}
