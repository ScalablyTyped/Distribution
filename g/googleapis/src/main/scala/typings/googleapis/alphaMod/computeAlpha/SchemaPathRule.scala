package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A path-matching rule for a URL. If matched, will use the specified
  * BackendService to handle the traffic arriving at this URL.
  */
@js.native
trait SchemaPathRule extends js.Object {
  /**
    * The list of path patterns to match. Each must start with / and the only
    * place a * is allowed is at the end following a /. The string fed to the
    * path matcher does not include any text after the first ? or #, and those
    * chars are not allowed here.
    */
  var paths: js.UndefOr[js.Array[String]] = js.native
  /**
    * In response to a matching path, the load balancer performs advanced
    * routing actions like URL rewrites, header transformations, etc. prior to
    * forwarding the request to the selected backend. If routeAction specifies
    * any  weightedBackendServices, service must not be set. Conversely if
    * service is set, routeAction cannot contain any  weightedBackendServices.
    * Only one of routeAction or urlRedirect must be set.
    */
  var routeAction: js.UndefOr[SchemaHttpRouteAction] = js.native
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
  var service: js.UndefOr[String] = js.native
  /**
    * When a path pattern is matched, the request is redirected to a URL
    * specified by urlRedirect. If urlRedirect is specified, service or
    * routeAction must not be set.
    */
  var urlRedirect: js.UndefOr[SchemaHttpRedirectAction] = js.native
}

object SchemaPathRule {
  @scala.inline
  def apply(
    paths: js.Array[String] = null,
    routeAction: SchemaHttpRouteAction = null,
    service: String = null,
    urlRedirect: SchemaHttpRedirectAction = null
  ): SchemaPathRule = {
    val __obj = js.Dynamic.literal()
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (routeAction != null) __obj.updateDynamic("routeAction")(routeAction.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (urlRedirect != null) __obj.updateDynamic("urlRedirect")(urlRedirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPathRule]
  }
}

