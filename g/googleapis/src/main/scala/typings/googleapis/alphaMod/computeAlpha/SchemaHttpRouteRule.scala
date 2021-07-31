package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An HttpRouteRule specifies how to match an HTTP request and the
  * corresponding routing action that load balancing proxies will perform.
  */
trait SchemaHttpRouteRule extends StObject {
  
  /**
    * Specifies changes to request and response headers that need to take
    * effect for the selected backendService. The headerAction specified here
    * are applied before the matching pathMatchers[].headerAction and after
    * pathMatchers[].routeRules[].routeAction.weightedBackendService.backendServiceWeightAction[].headerAction
    */
  var headerAction: js.UndefOr[SchemaHttpHeaderAction] = js.undefined
  
  var matchRules: js.UndefOr[js.Array[SchemaHttpRouteRuleMatch]] = js.undefined
  
  /**
    * In response to a matching matchRule, the load balancer performs advanced
    * routing actions like URL rewrites, header transformations, etc. prior to
    * forwarding the request to the selected backend. If  routeAction specifies
    * any  weightedBackendServices, service must not be set. Conversely if
    * service is set, routeAction cannot contain any  weightedBackendServices.
    * Only one of routeAction or urlRedirect must be set.
    */
  var routeAction: js.UndefOr[SchemaHttpRouteAction] = js.undefined
  
  /**
    * When this rule is matched, the request is redirected to a URL specified
    * by urlRedirect. If urlRedirect is specified, service or routeAction must
    * not be set.
    */
  var urlRedirect: js.UndefOr[SchemaHttpRedirectAction] = js.undefined
}
object SchemaHttpRouteRule {
  
  @scala.inline
  def apply(): SchemaHttpRouteRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpRouteRule]
  }
  
  @scala.inline
  implicit class SchemaHttpRouteRuleMutableBuilder[Self <: SchemaHttpRouteRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaderAction(value: SchemaHttpHeaderAction): Self = StObject.set(x, "headerAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderActionUndefined: Self = StObject.set(x, "headerAction", js.undefined)
    
    @scala.inline
    def setMatchRules(value: js.Array[SchemaHttpRouteRuleMatch]): Self = StObject.set(x, "matchRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchRulesUndefined: Self = StObject.set(x, "matchRules", js.undefined)
    
    @scala.inline
    def setMatchRulesVarargs(value: SchemaHttpRouteRuleMatch*): Self = StObject.set(x, "matchRules", js.Array(value :_*))
    
    @scala.inline
    def setRouteAction(value: SchemaHttpRouteAction): Self = StObject.set(x, "routeAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteActionUndefined: Self = StObject.set(x, "routeAction", js.undefined)
    
    @scala.inline
    def setUrlRedirect(value: SchemaHttpRedirectAction): Self = StObject.set(x, "urlRedirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlRedirectUndefined: Self = StObject.set(x, "urlRedirect", js.undefined)
  }
}
