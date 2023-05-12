package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapTypeStyle extends StObject {
  
  /**
    * The element to which a styler should be applied. An element is a visual
    * aspect of a feature on the map. Example: a label, an icon, the stroke or
    * fill applied to the geometry, and more. Optional. If
    * <code>elementType</code> is not specified, the value is assumed to be
    * <code>'all'</code>. For details of usage and allowed values, see the <a
    * href="https://developers.google.com/maps/documentation/javascript/style-reference#style-elements">style
    * reference</a>.
    */
  var elementType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The feature, or group of features, to which a styler should be applied.
    * Optional. If <code>featureType</code> is not specified, the value is
    * assumed to be <code>'all'</code>. For details of usage and allowed
    * values, see the <a
    * href="https://developers.google.com/maps/documentation/javascript/style-reference#style-features">style
    * reference</a>.
    */
  var featureType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The style rules to apply to the selected map features and elements. The
    * rules are applied in the order that you specify in this array. For
    * guidelines on usage and allowed values, see the <a
    * href="https://developers.google.com/maps/documentation/javascript/style-reference#stylers">style
    * reference</a>.
    */
  var stylers: js.Array[js.Object]
}
object MapTypeStyle {
  
  inline def apply(stylers: js.Array[js.Object]): MapTypeStyle = {
    val __obj = js.Dynamic.literal(stylers = stylers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapTypeStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapTypeStyle] (val x: Self) extends AnyVal {
    
    inline def setElementType(value: String): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    inline def setElementTypeNull: Self = StObject.set(x, "elementType", null)
    
    inline def setElementTypeUndefined: Self = StObject.set(x, "elementType", js.undefined)
    
    inline def setFeatureType(value: String): Self = StObject.set(x, "featureType", value.asInstanceOf[js.Any])
    
    inline def setFeatureTypeNull: Self = StObject.set(x, "featureType", null)
    
    inline def setFeatureTypeUndefined: Self = StObject.set(x, "featureType", js.undefined)
    
    inline def setStylers(value: js.Array[js.Object]): Self = StObject.set(x, "stylers", value.asInstanceOf[js.Any])
    
    inline def setStylersVarargs(value: js.Object*): Self = StObject.set(x, "stylers", js.Array(value*))
  }
}
