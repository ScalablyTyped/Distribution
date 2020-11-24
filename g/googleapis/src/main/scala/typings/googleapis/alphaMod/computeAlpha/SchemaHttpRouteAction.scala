package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaHttpRouteAction extends js.Object {
  
  /**
    * The specification for allowing client side cross-origin requests. Please
    * see W3C Recommendation for Cross Origin Resource Sharing
    */
  var corsPolicy: js.UndefOr[SchemaCorsPolicy] = js.native
  
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
  var faultInjectionPolicy: js.UndefOr[SchemaHttpFaultInjection] = js.native
  
  /**
    * Specifies the policy on how requests intended for the route&#39;s
    * backends are shadowed to a separate mirrored backend service.
    * Loadbalancer does not wait for responses from the shadow service. Prior
    * to sending traffic to the shadow service, the host / authority header is
    * suffixed with -shadow.
    */
  var requestMirrorPolicy: js.UndefOr[SchemaRequestMirrorPolicy] = js.native
  
  /**
    * Specifies the retry policy associated with this route.
    */
  var retryPolicy: js.UndefOr[SchemaHttpRetryPolicy] = js.native
  
  /**
    * Specifies the timeout for the selected route. Timeout is computed from
    * the time the request is has been fully processed (i.e. end-of-stream) up
    * until the response has been completely processed. Timeout includes all
    * retries. If not specified, the default value is 15 seconds.
    */
  var timeout: js.UndefOr[SchemaDuration] = js.native
  
  /**
    * The spec to modify the URL of the request, prior to forwarding the
    * request to the matched service
    */
  var urlRewrite: js.UndefOr[SchemaUrlRewrite] = js.native
  
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
  var weightedBackendServices: js.UndefOr[js.Array[SchemaWeightedBackendService]] = js.native
}
object SchemaHttpRouteAction {
  
  @scala.inline
  def apply(): SchemaHttpRouteAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpRouteAction]
  }
  
  @scala.inline
  implicit class SchemaHttpRouteActionOps[Self <: SchemaHttpRouteAction] (val x: Self) extends AnyVal {
    
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
    def setCorsPolicy(value: SchemaCorsPolicy): Self = this.set("corsPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorsPolicy: Self = this.set("corsPolicy", js.undefined)
    
    @scala.inline
    def setFaultInjectionPolicy(value: SchemaHttpFaultInjection): Self = this.set("faultInjectionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaultInjectionPolicy: Self = this.set("faultInjectionPolicy", js.undefined)
    
    @scala.inline
    def setRequestMirrorPolicy(value: SchemaRequestMirrorPolicy): Self = this.set("requestMirrorPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestMirrorPolicy: Self = this.set("requestMirrorPolicy", js.undefined)
    
    @scala.inline
    def setRetryPolicy(value: SchemaHttpRetryPolicy): Self = this.set("retryPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryPolicy: Self = this.set("retryPolicy", js.undefined)
    
    @scala.inline
    def setTimeout(value: SchemaDuration): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setUrlRewrite(value: SchemaUrlRewrite): Self = this.set("urlRewrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlRewrite: Self = this.set("urlRewrite", js.undefined)
    
    @scala.inline
    def setWeightedBackendServicesVarargs(value: SchemaWeightedBackendService*): Self = this.set("weightedBackendServices", js.Array(value :_*))
    
    @scala.inline
    def setWeightedBackendServices(value: js.Array[SchemaWeightedBackendService]): Self = this.set("weightedBackendServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeightedBackendServices: Self = this.set("weightedBackendServices", js.undefined)
  }
}
