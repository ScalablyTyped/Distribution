package typings.googleMapReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapTypeStyle extends StObject {
  
  var elementType: js.UndefOr[String] = js.native
  
  var featureType: js.UndefOr[String] = js.native
  
  var stylers: js.Array[_] = js.native
}
object MapTypeStyle {
  
  @scala.inline
  def apply(stylers: js.Array[_]): MapTypeStyle = {
    val __obj = js.Dynamic.literal(stylers = stylers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapTypeStyle]
  }
  
  @scala.inline
  implicit class MapTypeStyleMutableBuilder[Self <: MapTypeStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElementType(value: String): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementTypeUndefined: Self = StObject.set(x, "elementType", js.undefined)
    
    @scala.inline
    def setFeatureType(value: String): Self = StObject.set(x, "featureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureTypeUndefined: Self = StObject.set(x, "featureType", js.undefined)
    
    @scala.inline
    def setStylers(value: js.Array[_]): Self = StObject.set(x, "stylers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylersVarargs(value: js.Any*): Self = StObject.set(x, "stylers", js.Array(value :_*))
  }
}
