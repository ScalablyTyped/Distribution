package typings.googleapis.cloudbuildV1alpha2Mod.cloudbuildV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHTTPDelivery extends StObject {
  
  /**
    * The URI to which JSON-containing HTTP POST requests should be sent.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaHTTPDelivery {
  
  inline def apply(): SchemaHTTPDelivery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHTTPDelivery]
  }
  
  extension [Self <: SchemaHTTPDelivery](x: Self) {
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
