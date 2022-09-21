package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApiOperation extends StObject {
  
  /**
    * API methods or permissions to allow. Method or permission must belong to the service specified by `service_name` field. A single MethodSelector entry with `*` specified for the `method` field will allow all methods AND permissions for the service specified in `service_name`.
    */
  var methodSelectors: js.UndefOr[js.Array[SchemaMethodSelector]] = js.undefined
  
  /**
    * The name of the API whose methods or permissions the IngressPolicy or EgressPolicy want to allow. A single ApiOperation with `service_name` field set to `*` will allow all methods AND permissions for all services.
    */
  var serviceName: js.UndefOr[String | Null] = js.undefined
}
object SchemaApiOperation {
  
  inline def apply(): SchemaApiOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApiOperation]
  }
  
  extension [Self <: SchemaApiOperation](x: Self) {
    
    inline def setMethodSelectors(value: js.Array[SchemaMethodSelector]): Self = StObject.set(x, "methodSelectors", value.asInstanceOf[js.Any])
    
    inline def setMethodSelectorsUndefined: Self = StObject.set(x, "methodSelectors", js.undefined)
    
    inline def setMethodSelectorsVarargs(value: SchemaMethodSelector*): Self = StObject.set(x, "methodSelectors", js.Array(value*))
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameNull: Self = StObject.set(x, "serviceName", null)
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
