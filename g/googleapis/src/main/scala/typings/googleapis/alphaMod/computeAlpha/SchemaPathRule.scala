package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A path-matching rule for a URL. If matched, will use the specified
  * BackendService to handle the traffic arriving at this URL.
  */
trait SchemaPathRule extends StObject {
  
  /**
    * The list of path patterns to match. Each must start with / and the only
    * place a * is allowed is at the end following a /. The string fed to the
    * path matcher does not include any text after the first ? or #, and those
    * chars are not allowed here.
    */
  var paths: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * In response to a matching path, the load balancer performs advanced
    * routing actions like URL rewrites, header transformations, etc. prior to
    * forwarding the request to the selected backend. If routeAction specifies
    * any  weightedBackendServices, service must not be set. Conversely if
    * service is set, routeAction cannot contain any  weightedBackendServices.
    * Only one of routeAction or urlRedirect must be set.
    */
  var routeAction: js.UndefOr[SchemaHttpRouteAction] = js.undefined
  
  /**
    * The full or partial URL of the backend service resource to which traffic
    * is directed if this rule is matched. If routeAction is additionally
    * specified, advanced routing actions like URL Rewrites, etc. take effect
    * prior to sending the request to the backend. However, if service is
    * specified, routeAction cannot contain any weightedBackendService s.
    * Conversely, if routeAction specifies any  weightedBackendServices,
    * service must not be specified. Only one of urlRedirect, service or
    * routeAction.weightedBackendService must be set.
    */
  var service: js.UndefOr[String] = js.undefined
  
  /**
    * When a path pattern is matched, the request is redirected to a URL
    * specified by urlRedirect. If urlRedirect is specified, service or
    * routeAction must not be set.
    */
  var urlRedirect: js.UndefOr[SchemaHttpRedirectAction] = js.undefined
}
object SchemaPathRule {
  
  inline def apply(): SchemaPathRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPathRule]
  }
  
  extension [Self <: SchemaPathRule](x: Self) {
    
    inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value :_*))
    
    inline def setRouteAction(value: SchemaHttpRouteAction): Self = StObject.set(x, "routeAction", value.asInstanceOf[js.Any])
    
    inline def setRouteActionUndefined: Self = StObject.set(x, "routeAction", js.undefined)
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    inline def setUrlRedirect(value: SchemaHttpRedirectAction): Self = StObject.set(x, "urlRedirect", value.asInstanceOf[js.Any])
    
    inline def setUrlRedirectUndefined: Self = StObject.set(x, "urlRedirect", js.undefined)
  }
}
