package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An HttpRouteRule specifies how to match an HTTP request and the
  * corresponding routing action that load balancing proxies will perform.
  */
@js.native
trait Schema$HttpRouteRule extends js.Object {
  /**
    * Specifies changes to request and response headers that need to take
    * effect for the selected backendService. The headerAction specified here
    * are applied before the matching pathMatchers[].headerAction and after
    * pathMatchers[].routeRules[].routeAction.weightedBackendService.backendServiceWeightAction[].headerAction
    */
  var headerAction: js.UndefOr[Schema$HttpHeaderAction] = js.native
  var matchRules: js.UndefOr[js.Array[Schema$HttpRouteRuleMatch]] = js.native
  /**
    * In response to a matching matchRule, the load balancer performs advanced
    * routing actions like URL rewrites, header transformations, etc. prior to
    * forwarding the request to the selected backend. If  routeAction specifies
    * any  weightedBackendServices, service must not be set. Conversely if
    * service is set, routeAction cannot contain any  weightedBackendServices.
    * Only one of routeAction or urlRedirect must be set.
    */
  var routeAction: js.UndefOr[Schema$HttpRouteAction] = js.native
  /**
    * When this rule is matched, the request is redirected to a URL specified
    * by urlRedirect. If urlRedirect is specified, service or routeAction must
    * not be set.
    */
  var urlRedirect: js.UndefOr[Schema$HttpRedirectAction] = js.native
}

object Schema$HttpRouteRule {
  @scala.inline
  def apply(
    headerAction: Schema$HttpHeaderAction = null,
    matchRules: js.Array[Schema$HttpRouteRuleMatch] = null,
    routeAction: Schema$HttpRouteAction = null,
    urlRedirect: Schema$HttpRedirectAction = null
  ): Schema$HttpRouteRule = {
    val __obj = js.Dynamic.literal()
    if (headerAction != null) __obj.updateDynamic("headerAction")(headerAction.asInstanceOf[js.Any])
    if (matchRules != null) __obj.updateDynamic("matchRules")(matchRules.asInstanceOf[js.Any])
    if (routeAction != null) __obj.updateDynamic("routeAction")(routeAction.asInstanceOf[js.Any])
    if (urlRedirect != null) __obj.updateDynamic("urlRedirect")(urlRedirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HttpRouteRule]
  }
}

