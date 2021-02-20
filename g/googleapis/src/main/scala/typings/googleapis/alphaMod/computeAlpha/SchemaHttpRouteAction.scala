package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaHttpRouteAction extends StObject {
  
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
  implicit class SchemaHttpRouteActionMutableBuilder[Self <: SchemaHttpRouteAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCorsPolicy(value: SchemaCorsPolicy): Self = StObject.set(x, "corsPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorsPolicyUndefined: Self = StObject.set(x, "corsPolicy", js.undefined)
    
    @scala.inline
    def setFaultInjectionPolicy(value: SchemaHttpFaultInjection): Self = StObject.set(x, "faultInjectionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaultInjectionPolicyUndefined: Self = StObject.set(x, "faultInjectionPolicy", js.undefined)
    
    @scala.inline
    def setRequestMirrorPolicy(value: SchemaRequestMirrorPolicy): Self = StObject.set(x, "requestMirrorPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestMirrorPolicyUndefined: Self = StObject.set(x, "requestMirrorPolicy", js.undefined)
    
    @scala.inline
    def setRetryPolicy(value: SchemaHttpRetryPolicy): Self = StObject.set(x, "retryPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryPolicyUndefined: Self = StObject.set(x, "retryPolicy", js.undefined)
    
    @scala.inline
    def setTimeout(value: SchemaDuration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUrlRewrite(value: SchemaUrlRewrite): Self = StObject.set(x, "urlRewrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlRewriteUndefined: Self = StObject.set(x, "urlRewrite", js.undefined)
    
    @scala.inline
    def setWeightedBackendServices(value: js.Array[SchemaWeightedBackendService]): Self = StObject.set(x, "weightedBackendServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightedBackendServicesUndefined: Self = StObject.set(x, "weightedBackendServices", js.undefined)
    
    @scala.inline
    def setWeightedBackendServicesVarargs(value: SchemaWeightedBackendService*): Self = StObject.set(x, "weightedBackendServices", js.Array(value :_*))
  }
}
