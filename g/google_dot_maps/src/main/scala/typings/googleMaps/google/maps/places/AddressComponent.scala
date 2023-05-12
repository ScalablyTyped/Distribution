package typings.googleMaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressComponent extends StObject {
  
  /**
    * The full text of the address component.
    */
  var longText: String | Null
  
  /**
    * The abbreviated, short text of the given address component.
    */
  var shortText: String | Null
  
  /**
    * An array of strings denoting the type of this address component. A list
    * of valid types can be found <a
    * href="https://developers.google.com/maps/documentation/javascript/geocoding#GeocodingAddressTypes">here</a>.
    */
  var types: js.Array[String]
}
object AddressComponent {
  
  inline def apply(types: js.Array[String]): AddressComponent = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any], longText = null, shortText = null)
    __obj.asInstanceOf[AddressComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddressComponent] (val x: Self) extends AnyVal {
    
    inline def setLongText(value: String): Self = StObject.set(x, "longText", value.asInstanceOf[js.Any])
    
    inline def setLongTextNull: Self = StObject.set(x, "longText", null)
    
    inline def setShortText(value: String): Self = StObject.set(x, "shortText", value.asInstanceOf[js.Any])
    
    inline def setShortTextNull: Self = StObject.set(x, "shortText", null)
    
    inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
