package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An HttpRouteRule specifies how to match an HTTP request and the
  * corresponding routing action that load balancing proxies will perform.
  */
@js.native
trait SchemaHttpRouteRule extends js.Object {
  
  /**
    * Specifies changes to request and response headers that need to take
    * effect for the selected backendService. The headerAction specified here
    * are applied before the matching pathMatchers[].headerAction and after
    * pathMatchers[].routeRules[].routeAction.weightedBackendService.backendServiceWeightAction[].headerAction
    */
  var headerAction: js.UndefOr[SchemaHttpHeaderAction] = js.native
  
  var matchRules: js.UndefOr[js.Array[SchemaHttpRouteRuleMatch]] = js.native
  
  /**
    * In response to a matching matchRule, the load balancer performs advanced
    * routing actions like URL rewrites, header transformations, etc. prior to
    * forwarding the request to the selected backend. If  routeAction specifies
    * any  weightedBackendServices, service must not be set. Conversely if
    * service is set, routeAction cannot contain any  weightedBackendServices.
    * Only one of routeAction or urlRedirect must be set.
    */
  var routeAction: js.UndefOr[SchemaHttpRouteAction] = js.native
  
  /**
    * When this rule is matched, the request is redirected to a URL specified
    * by urlRedirect. If urlRedirect is specified, service or routeAction must
    * not be set.
    */
  var urlRedirect: js.UndefOr[SchemaHttpRedirectAction] = js.native
}
object SchemaHttpRouteRule {
  
  @scala.inline
  def apply(): SchemaHttpRouteRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpRouteRule]
  }
  
  @scala.inline
  implicit class SchemaHttpRouteRuleOps[Self <: SchemaHttpRouteRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHeaderAction(value: SchemaHttpHeaderAction): Self = this.set("headerAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderAction: Self = this.set("headerAction", js.undefined)
    
    @scala.inline
    def setMatchRulesVarargs(value: SchemaHttpRouteRuleMatch*): Self = this.set("matchRules", js.Array(value :_*))
    
    @scala.inline
    def setMatchRules(value: js.Array[SchemaHttpRouteRuleMatch]): Self = this.set("matchRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchRules: Self = this.set("matchRules", js.undefined)
    
    @scala.inline
    def setRouteAction(value: SchemaHttpRouteAction): Self = this.set("routeAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteAction: Self = this.set("routeAction", js.undefined)
    
    @scala.inline
    def setUrlRedirect(value: SchemaHttpRedirectAction): Self = this.set("urlRedirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlRedirect: Self = this.set("urlRedirect", js.undefined)
  }
}
