package typings.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CharHeight extends StObject {
  
  var charHeight: Double
  
  var fontSize: String
  
  var left: String
  
  var top: String
}
object CharHeight {
  
  inline def apply(charHeight: Double, fontSize: String, left: String, top: String): CharHeight = {
    val __obj = js.Dynamic.literal(charHeight = charHeight.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharHeight]
  }
  
  extension [Self <: CharHeight](x: Self) {
    
    inline def setCharHeight(value: Double): Self = StObject.set(x, "charHeight", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
