package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about an agency that operates a transit line.
  */
trait TransitAgency extends StObject {
  
  /**
    * The name of this transit agency.
    */
  var name: String
  
  /**
    * The transit agency&#39;s phone number.
    */
  var phone: String
  
  /**
    * The transit agency&#39;s URL.
    */
  var url: String
}
object TransitAgency {
  
  inline def apply(name: String, phone: String, url: String): TransitAgency = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitAgency]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitAgency] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
