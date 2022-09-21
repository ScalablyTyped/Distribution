package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUrlMapsValidateRequest extends StObject {
  
  /**
    * Specifies the load balancer type(s) this validation request is for. Use EXTERNAL_MANAGED for HTTP/HTTPS External Global Load Balancer with Advanced Traffic Management. Use EXTERNAL for Classic HTTP/HTTPS External Global Load Balancer. Other load balancer types are not supported. For more information, refer to Choosing a load balancer. If unspecified, the load balancing scheme will be inferred from the backend service resources this URL map references. If that can not be inferred (for example, this URL map only references backend buckets, or this Url map is for rewrites and redirects only and doesn't reference any backends), EXTERNAL will be used as the default type. If specified, the scheme(s) must not conflict with the load balancing scheme of the backend service resources this Url map references.
    */
  var loadBalancingSchemes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Content of the UrlMap to be validated.
    */
  var resource: js.UndefOr[SchemaUrlMap] = js.undefined
}
object SchemaUrlMapsValidateRequest {
  
  inline def apply(): SchemaUrlMapsValidateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlMapsValidateRequest]
  }
  
  extension [Self <: SchemaUrlMapsValidateRequest](x: Self) {
    
    inline def setLoadBalancingSchemes(value: js.Array[String]): Self = StObject.set(x, "loadBalancingSchemes", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancingSchemesNull: Self = StObject.set(x, "loadBalancingSchemes", null)
    
    inline def setLoadBalancingSchemesUndefined: Self = StObject.set(x, "loadBalancingSchemes", js.undefined)
    
    inline def setLoadBalancingSchemesVarargs(value: String*): Self = StObject.set(x, "loadBalancingSchemes", js.Array(value*))
    
    inline def setResource(value: SchemaUrlMap): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
