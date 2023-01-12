package typings.googleMapReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapTypeStyle extends StObject {
  
  var elementType: js.UndefOr[String] = js.undefined
  
  var featureType: js.UndefOr[String] = js.undefined
  
  var stylers: js.Array[Any]
}
object MapTypeStyle {
  
  inline def apply(stylers: js.Array[Any]): MapTypeStyle = {
    val __obj = js.Dynamic.literal(stylers = stylers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapTypeStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapTypeStyle] (val x: Self) extends AnyVal {
    
    inline def setElementType(value: String): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    inline def setElementTypeUndefined: Self = StObject.set(x, "elementType", js.undefined)
    
    inline def setFeatureType(value: String): Self = StObject.set(x, "featureType", value.asInstanceOf[js.Any])
    
    inline def setFeatureTypeUndefined: Self = StObject.set(x, "featureType", js.undefined)
    
    inline def setStylers(value: js.Array[Any]): Self = StObject.set(x, "stylers", value.asInstanceOf[js.Any])
    
    inline def setStylersVarargs(value: Any*): Self = StObject.set(x, "stylers", js.Array(value*))
  }
}
