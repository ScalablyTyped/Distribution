package typings.devextreme.mod.DevExpress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointSelector extends StObject {
  
  /**
    * Gets an endpoint with a specific key.
    */
  def urlFor(key: String): String
}
object EndpointSelector {
  
  inline def apply(urlFor: String => String): EndpointSelector = {
    val __obj = js.Dynamic.literal(urlFor = js.Any.fromFunction1(urlFor))
    __obj.asInstanceOf[EndpointSelector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndpointSelector] (val x: Self) extends AnyVal {
    
    inline def setUrlFor(value: String => String): Self = StObject.set(x, "urlFor", js.Any.fromFunction1(value))
  }
}
