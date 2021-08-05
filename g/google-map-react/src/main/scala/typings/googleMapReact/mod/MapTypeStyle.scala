package typings.googleMapReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapTypeStyle extends StObject {
  
  var elementType: js.UndefOr[String] = js.undefined
  
  var featureType: js.UndefOr[String] = js.undefined
  
  var stylers: js.Array[js.Any]
}
object MapTypeStyle {
  
  inline def apply(stylers: js.Array[js.Any]): MapTypeStyle = {
    val __obj = js.Dynamic.literal(stylers = stylers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapTypeStyle]
  }
  
  extension [Self <: MapTypeStyle](x: Self) {
    
    inline def setElementType(value: String): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    inline def setElementTypeUndefined: Self = StObject.set(x, "elementType", js.undefined)
    
    inline def setFeatureType(value: String): Self = StObject.set(x, "featureType", value.asInstanceOf[js.Any])
    
    inline def setFeatureTypeUndefined: Self = StObject.set(x, "featureType", js.undefined)
    
    inline def setStylers(value: js.Array[js.Any]): Self = StObject.set(x, "stylers", value.asInstanceOf[js.Any])
    
    inline def setStylersVarargs(value: js.Any*): Self = StObject.set(x, "stylers", js.Array(value :_*))
  }
}
