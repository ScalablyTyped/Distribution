package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeocoderAddressComponent extends StObject {
  
  /**
    * The full text of the address component
    */
  var long_name: String
  
  /**
    * The abbreviated, short text of the given address component
    */
  var short_name: String
  
  /**
    * An array of strings denoting the type of this address component. A list
    * of valid types can be found <a
    * href="https://developers.google.com/maps/documentation/javascript/geocoding#GeocodingAddressTypes">here</a>
    */
  var types: js.Array[String]
}
object GeocoderAddressComponent {
  
  inline def apply(long_name: String, short_name: String, types: js.Array[String]): GeocoderAddressComponent = {
    val __obj = js.Dynamic.literal(long_name = long_name.asInstanceOf[js.Any], short_name = short_name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocoderAddressComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeocoderAddressComponent] (val x: Self) extends AnyVal {
    
    inline def setLong_name(value: String): Self = StObject.set(x, "long_name", value.asInstanceOf[js.Any])
    
    inline def setShort_name(value: String): Self = StObject.set(x, "short_name", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
