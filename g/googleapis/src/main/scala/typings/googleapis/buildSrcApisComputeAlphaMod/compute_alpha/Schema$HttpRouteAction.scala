package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$HttpRouteAction extends js.Object {
  /**
    * The specification for allowing client side cross-origin requests. Please
    * see W3C Recommendation for Cross Origin Resource Sharing
    */
  var corsPolicy: js.UndefOr[Schema$CorsPolicy] = js.native
  /**
    * The specification for fault injection introduced into traffic to test the
    * resiliency of clients to backend service failure. As part of fault
    * injection, when clients send requests to a backend service, delays can be
    * introduced by Loadbalancer on a percentage of requests before sending
    * those request to the backend service. Similarly requests from clients can
    * be aborted by the Loadbalancer for a percentage of requests. timeout and
    * retry_policy will be ignored by clients that are configured with a
    * fault_injection_policy.
    */
  var faultInjectionPolicy: js.UndefOr[Schema$HttpFaultInjection] = js.native
  /**
    * Specifies the policy on how requests intended for the route&#39;s
    * backends are shadowed to a separate mirrored backend service.
    * Loadbalancer does not wait for responses from the shadow service. Prior
    * to sending traffic to the shadow service, the host / authority header is
    * suffixed with -shadow.
    */
  var requestMirrorPolicy: js.UndefOr[Schema$RequestMirrorPolicy] = js.native
  /**
    * Specifies the retry policy associated with this route.
    */
  var retryPolicy: js.UndefOr[Schema$HttpRetryPolicy] = js.native
  /**
    * Specifies the timeout for the selected route. Timeout is computed from
    * the time the request is has been fully processed (i.e. end-of-stream) up
    * until the response has been completely processed. Timeout includes all
    * retries. If not specified, the default value is 15 seconds.
    */
  var timeout: js.UndefOr[Schema$Duration] = js.native
  /**
    * The spec to modify the URL of the request, prior to forwarding the
    * request to the matched service
    */
  var urlRewrite: js.UndefOr[Schema$UrlRewrite] = js.native
  /**
    * A list of weighted backend services to send traffic to when a route match
    * occurs. The weights determine the fraction of traffic that flows to their
    * corresponding backend service. If all traffic needs to go to a single
    * backend service, there must be one  weightedBackendService with weight
    * set to a non 0 number. Once a backendService is identified and before
    * forwarding the request to the backend service, advanced routing actions
    * like Url rewrites and header transformations are applied depending on
    * additional settings specified in this HttpRouteAction.
    */
  var weightedBackendServices: js.UndefOr[js.Array[Schema$WeightedBackendService]] = js.native
}

object Schema$HttpRouteAction {
  @scala.inline
  def apply(
    corsPolicy: Schema$CorsPolicy = null,
    faultInjectionPolicy: Schema$HttpFaultInjection = null,
    requestMirrorPolicy: Schema$RequestMirrorPolicy = null,
    retryPolicy: Schema$HttpRetryPolicy = null,
    timeout: Schema$Duration = null,
    urlRewrite: Schema$UrlRewrite = null,
    weightedBackendServices: js.Array[Schema$WeightedBackendService] = null
  ): Schema$HttpRouteAction = {
    val __obj = js.Dynamic.literal()
    if (corsPolicy != null) __obj.updateDynamic("corsPolicy")(corsPolicy.asInstanceOf[js.Any])
    if (faultInjectionPolicy != null) __obj.updateDynamic("faultInjectionPolicy")(faultInjectionPolicy.asInstanceOf[js.Any])
    if (requestMirrorPolicy != null) __obj.updateDynamic("requestMirrorPolicy")(requestMirrorPolicy.asInstanceOf[js.Any])
    if (retryPolicy != null) __obj.updateDynamic("retryPolicy")(retryPolicy.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (urlRewrite != null) __obj.updateDynamic("urlRewrite")(urlRewrite.asInstanceOf[js.Any])
    if (weightedBackendServices != null) __obj.updateDynamic("weightedBackendServices")(weightedBackendServices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HttpRouteAction]
  }
}

