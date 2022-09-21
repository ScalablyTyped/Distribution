package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPathRule extends StObject {
  
  /**
    * customErrorResponsePolicy specifies how the Load Balancer returns error responses when BackendServiceor BackendBucket responds with an error. If a policy for an error code is not configured for the PathRule, a policy for the error code configured in pathMatcher.defaultCustomErrorResponsePolicy is applied. If one is not specified in pathMatcher.defaultCustomErrorResponsePolicy, the policy configured in UrlMap.defaultCustomErrorResponsePolicy takes effect. For example, consider a UrlMap with the following configuration: - UrlMap.defaultCustomErrorResponsePolicy are configured with policies for 5xx and 4xx errors - A PathRule for /coming_soon/ is configured for the error code 404. If the request is for www.myotherdomain.com and a 404 is encountered, the policy under UrlMap.defaultCustomErrorResponsePolicy takes effect. If a 404 response is encountered for the request www.example.com/current_events/, the pathMatcher's policy takes effect. If however, the request for www.example.com/coming_soon/ encounters a 404, the policy in PathRule.customErrorResponsePolicy takes effect. If any of the requests in this example encounter a 500 error code, the policy at UrlMap.defaultCustomErrorResponsePolicy takes effect. customErrorResponsePolicy is supported only for Global External HTTP(S) load balancing.
    */
  var customErrorResponsePolicy: js.UndefOr[SchemaCustomErrorResponsePolicy] = js.undefined
  
  /**
    * The list of path patterns to match. Each must start with / and the only place a * is allowed is at the end following a /. The string fed to the path matcher does not include any text after the first ? or #, and those chars are not allowed here.
    */
  var paths: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * In response to a matching path, the load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If routeAction specifies any weightedBackendServices, service must not be set. Conversely if service is set, routeAction cannot contain any weightedBackendServices. Only one of routeAction or urlRedirect must be set. URL maps for external HTTP(S) load balancers support only the urlRewrite action within a path rule's routeAction.
    */
  var routeAction: js.UndefOr[SchemaHttpRouteAction] = js.undefined
  
  /**
    * The full or partial URL of the backend service resource to which traffic is directed if this rule is matched. If routeAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if service is specified, routeAction cannot contain any weightedBackendServices. Conversely, if routeAction specifies any weightedBackendServices, service must not be specified. Only one of urlRedirect, service or routeAction.weightedBackendService must be set.
    */
  var service: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When a path pattern is matched, the request is redirected to a URL specified by urlRedirect. If urlRedirect is specified, service or routeAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
    */
  var urlRedirect: js.UndefOr[SchemaHttpRedirectAction] = js.undefined
}
object SchemaPathRule {
  
  inline def apply(): SchemaPathRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPathRule]
  }
  
  extension [Self <: SchemaPathRule](x: Self) {
    
    inline def setCustomErrorResponsePolicy(value: SchemaCustomErrorResponsePolicy): Self = StObject.set(x, "customErrorResponsePolicy", value.asInstanceOf[js.Any])
    
    inline def setCustomErrorResponsePolicyUndefined: Self = StObject.set(x, "customErrorResponsePolicy", js.undefined)
    
    inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsNull: Self = StObject.set(x, "paths", null)
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
    
    inline def setRouteAction(value: SchemaHttpRouteAction): Self = StObject.set(x, "routeAction", value.asInstanceOf[js.Any])
    
    inline def setRouteActionUndefined: Self = StObject.set(x, "routeAction", js.undefined)
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceNull: Self = StObject.set(x, "service", null)
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    inline def setUrlRedirect(value: SchemaHttpRedirectAction): Self = StObject.set(x, "urlRedirect", value.asInstanceOf[js.Any])
    
    inline def setUrlRedirectUndefined: Self = StObject.set(x, "urlRedirect", js.undefined)
  }
}
