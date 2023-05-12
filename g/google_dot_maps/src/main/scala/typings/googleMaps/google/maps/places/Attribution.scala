package typings.googleMaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attribution extends StObject {
  
  /**
    * Attribution text to be displayed for this Place result.
    */
  var provider: String | Null
  
  var providerURI: String | Null
}
object Attribution {
  
  inline def apply(): Attribution = {
    val __obj = js.Dynamic.literal(provider = null, providerURI = null)
    __obj.asInstanceOf[Attribution]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attribution] (val x: Self) extends AnyVal {
    
    inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderNull: Self = StObject.set(x, "provider", null)
    
    inline def setProviderURI(value: String): Self = StObject.set(x, "providerURI", value.asInstanceOf[js.Any])
    
    inline def setProviderURINull: Self = StObject.set(x, "providerURI", null)
  }
}
