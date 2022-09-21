package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUrlDispatchRule extends StObject {
  
  /**
    * Domain name to match against. The wildcard "*" is supported if specified before a period: "*.".Defaults to matching all domains: "*".
    */
  var domain: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Pathname within the host. Must start with a "/". A single "*" can be included at the end of the path.The sum of the lengths of the domain and path may not exceed 100 characters.
    */
  var path: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource ID of a service in this application that should serve the matched request. The service must already exist. Example: default.
    */
  var service: js.UndefOr[String | Null] = js.undefined
}
object SchemaUrlDispatchRule {
  
  inline def apply(): SchemaUrlDispatchRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlDispatchRule]
  }
  
  extension [Self <: SchemaUrlDispatchRule](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainNull: Self = StObject.set(x, "domain", null)
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceNull: Self = StObject.set(x, "service", null)
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
