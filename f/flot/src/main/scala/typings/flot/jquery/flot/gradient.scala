package typings.flot.jquery.flot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait gradient extends StObject {
  
  var colors: js.Array[Any]
}
object gradient {
  
  inline def apply(colors: js.Array[Any]): gradient = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[gradient]
  }
  
  extension [Self <: gradient](x: Self) {
    
    inline def setColors(value: js.Array[Any]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsVarargs(value: Any*): Self = StObject.set(x, "colors", js.Array(value*))
  }
}
