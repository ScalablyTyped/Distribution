package typings.googleMaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentRestrictions extends StObject {
  
  /**
    * Restricts predictions to the specified country (ISO 3166-1 Alpha-2
    * country code, case insensitive). For example, <code>'us'</code>,
    * <code>'br'</code>, or <code>'au'</code>. You can provide a single one, or
    * an array of up to five country code strings.
    */
  var country: String | js.Array[String] | Null
}
object ComponentRestrictions {
  
  inline def apply(): ComponentRestrictions = {
    val __obj = js.Dynamic.literal(country = null)
    __obj.asInstanceOf[ComponentRestrictions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentRestrictions] (val x: Self) extends AnyVal {
    
    inline def setCountry(value: String | js.Array[String]): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryNull: Self = StObject.set(x, "country", null)
    
    inline def setCountryVarargs(value: String*): Self = StObject.set(x, "country", js.Array(value*))
  }
}
