package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A BackendService resource. This resource defines a group of backend virtual
  * machines and their serving capacity. (== resource_for v1.backendService ==)
  * (== resource_for beta.backendService ==)
  */
@js.native
trait SchemaBackendService extends js.Object {
  
  /**
    * Lifetime of cookies in seconds if session_affinity is GENERATED_COOKIE.
    * If set to 0, the cookie is non-persistent and lasts only until the end of
    * the browser session (or equivalent). The maximum allowed value for TTL is
    * one day.  When the load balancing scheme is INTERNAL, this field is not
    * used.
    */
  var affinityCookieTtlSec: js.UndefOr[Double] = js.native
  
  /**
    * Directs request to an App Engine app. cloudFunctionBackend and backends[]
    * must be empty if this is set.
    */
  var appEngineBackend: js.UndefOr[SchemaBackendServiceAppEngineBackend] = js.native
  
  /**
    * The list of backends that serve this BackendService.
    */
  var backends: js.UndefOr[js.Array[SchemaBackend]] = js.native
  
  /**
    * Cloud CDN configuration for this BackendService.
    */
  var cdnPolicy: js.UndefOr[SchemaBackendServiceCdnPolicy] = js.native
  
  /**
    * Settings controlling the volume of connections to a backend service. This
    * field is applicable to either:   - A regional backend service with the
    * service_protocol set to HTTP, HTTPS, or HTTP2, and load_balancing_scheme
    * set to INTERNAL_MANAGED.  - A global backend service with the
    * load_balancing_scheme set to INTERNAL_SELF_MANAGED.
    */
  var circuitBreakers: js.UndefOr[SchemaCircuitBreakers] = js.native
  
  /**
    * Directs request to a cloud function. appEngineBackend and backends[] must
    * be empty if this is set.
    */
  var cloudFunctionBackend: js.UndefOr[SchemaBackendServiceCloudFunctionBackend] = js.native
  
  var connectionDraining: js.UndefOr[SchemaConnectionDraining] = js.native
  
  /**
    * Consistent Hash-based load balancing can be used to provide soft session
    * affinity based on HTTP headers, cookies or other properties. This load
    * balancing policy is applicable only for HTTP connections. The affinity to
    * a particular destination host will be lost when one or more hosts are
    * added/removed from the destination service. This field specifies
    * parameters that control consistent hashing. This field is only applicable
    * when localityLbPolicy is set to MAGLEV or RING_HASH.  This field is
    * applicable to either:   - A regional backend service with the
    * service_protocol set to HTTP, HTTPS, or HTTP2, and load_balancing_scheme
    * set to INTERNAL_MANAGED.  - A global backend service with the
    * load_balancing_scheme set to INTERNAL_SELF_MANAGED.
    */
  var consistentHash: js.UndefOr[SchemaConsistentHashLoadBalancerSettings] = js.native
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /**
    * Headers that the HTTP/S load balancer should add to proxied requests.
    */
  var customRequestHeaders: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * If true, enable Cloud CDN for this BackendService.  When the load
    * balancing scheme is INTERNAL, this field is not used.
    */
  var enableCDN: js.UndefOr[Boolean] = js.native
  
  var failoverPolicy: js.UndefOr[SchemaBackendServiceFailoverPolicy] = js.native
  
  /**
    * Fingerprint of this resource. A hash of the contents stored in this
    * object. This field is used in optimistic locking. This field will be
    * ignored when inserting a BackendService. An up-to-date fingerprint must
    * be provided in order to update the BackendService, otherwise the request
    * will fail with error 412 conditionNotMet.  To see the latest fingerprint,
    * make a get() request to retrieve a BackendService.
    */
  var fingerprint: js.UndefOr[String] = js.native
  
  /**
    * The list of URLs to the HttpHealthCheck or HttpsHealthCheck resource for
    * health checking this BackendService. Currently at most one health check
    * can be specified, and a health check is required for Compute Engine
    * backend services. A health check must not be specified for App Engine
    * backend and Cloud Function backend.  For internal load balancing, a URL
    * to a HealthCheck resource must be specified instead.
    */
  var healthChecks: js.UndefOr[js.Array[String]] = js.native
  
  var iap: js.UndefOr[SchemaBackendServiceIAP] = js.native
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Type of resource. Always compute#backendService for backend
    * services.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether the backend service will be used with internal or
    * external load balancing. A backend service created for one type of load
    * balancing cannot be used with the other. Possible values are INTERNAL and
    * EXTERNAL.
    */
  var loadBalancingScheme: js.UndefOr[String] = js.native
  
  /**
    * The load balancing algorithm used within the scope of the locality. The
    * possible values are:   - ROUND_ROBIN: This is a simple policy in which
    * each healthy backend is selected in round robin order. This is the
    * default.  - LEAST_REQUEST: An O(1) algorithm which selects two random
    * healthy hosts and picks the host which has fewer active requests.  -
    * RING_HASH: The ring/modulo hash load balancer implements consistent
    * hashing to backends. The algorithm has the property that the
    * addition/removal of a host from a set of N hosts only affects 1/N of the
    * requests.  - RANDOM: The load balancer selects a random healthy host.  -
    * ORIGINAL_DESTINATION: Backend host is selected based on the client
    * connection metadata, i.e., connections are opened to the same address as
    * the destination address of the incoming connection before the connection
    * was redirected to the load balancer.  - MAGLEV: used as a drop in
    * replacement for the ring hash load balancer. Maglev is not as stable as
    * ring hash but has faster table lookup build times and host selection
    * times. For more information about Maglev, refer to
    * https://ai.google/research/pubs/pub44824   This field is applicable to
    * either:   - A regional backend service with the service_protocol set to
    * HTTP, HTTPS, or HTTP2, and load_balancing_scheme set to INTERNAL_MANAGED.
    * - A global backend service with the load_balancing_scheme set to
    * INTERNAL_SELF_MANAGED.
    */
  var localityLbPolicy: js.UndefOr[String] = js.native
  
  /**
    * This field denotes the logging options for the load balancer traffic
    * served by this backend service. If logging is enabled, logs will be
    * exported to Stackdriver.
    */
  var logConfig: js.UndefOr[SchemaBackendServiceLogConfig] = js.native
  
  /**
    * Name of the resource. Provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Settings controlling eviction of unhealthy hosts from the load balancing
    * pool. This field is applicable to either:   - A regional backend service
    * with the service_protocol set to HTTP, HTTPS, or HTTP2, and
    * load_balancing_scheme set to INTERNAL_MANAGED.  - A global backend
    * service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED.
    */
  var outlierDetection: js.UndefOr[SchemaOutlierDetection] = js.native
  
  /**
    * Deprecated in favor of portName. The TCP port to connect on the backend.
    * The default value is 80.  This cannot be used for internal load
    * balancing.
    */
  var port: js.UndefOr[Double] = js.native
  
  /**
    * Name of backend port. The same name should appear in the instance groups
    * referenced by this service. Required when the load balancing scheme is
    * EXTERNAL.  When the load balancing scheme is INTERNAL, this field is not
    * used.
    */
  var portName: js.UndefOr[String] = js.native
  
  /**
    * The protocol this BackendService uses to communicate with backends.
    * Possible values are HTTP, HTTPS, TCP, and SSL. The default is HTTP.  For
    * internal load balancing, the possible values are TCP and UDP, and the
    * default is TCP.
    */
  var protocol: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] URL of the region where the regional backend service
    * resides. This field is not applicable to global backend services. You
    * must specify this field as part of the HTTP request URL. It is not
    * settable as a field in the request body.
    */
  var region: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The resource URL for the security policy associated with
    * this backend service.
    */
  var securityPolicy: js.UndefOr[String] = js.native
  
  /**
    * This field specifies the security policy that applies to this backend
    * service. This field is applicable to either:   - A regional backend
    * service with the service_protocol set to HTTP, HTTPS, or HTTP2, and
    * load_balancing_scheme set to INTERNAL_MANAGED.  - A global backend
    * service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED.
    */
  var securitySettings: js.UndefOr[SchemaSecuritySettings] = js.native
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String] = js.native
  
  /**
    * Type of session affinity to use. The default is NONE.  When the load
    * balancing scheme is EXTERNAL, can be NONE, CLIENT_IP, or
    * GENERATED_COOKIE.  When the load balancing scheme is INTERNAL, can be
    * NONE, CLIENT_IP, CLIENT_IP_PROTO, or CLIENT_IP_PORT_PROTO.  When the
    * protocol is UDP, this field is not used.
    */
  var sessionAffinity: js.UndefOr[String] = js.native
  
  /**
    * How many seconds to wait for the backend before considering it a failed
    * request. Default is 30 seconds.
    */
  var timeoutSec: js.UndefOr[Double] = js.native
}
object SchemaBackendService {
  
  @scala.inline
  def apply(): SchemaBackendService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendService]
  }
  
  @scala.inline
  implicit class SchemaBackendServiceOps[Self <: SchemaBackendService] (val x: Self) extends AnyVal {
    
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
    def setAffinityCookieTtlSec(value: Double): Self = this.set("affinityCookieTtlSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAffinityCookieTtlSec: Self = this.set("affinityCookieTtlSec", js.undefined)
    
    @scala.inline
    def setAppEngineBackend(value: SchemaBackendServiceAppEngineBackend): Self = this.set("appEngineBackend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppEngineBackend: Self = this.set("appEngineBackend", js.undefined)
    
    @scala.inline
    def setBackendsVarargs(value: SchemaBackend*): Self = this.set("backends", js.Array(value :_*))
    
    @scala.inline
    def setBackends(value: js.Array[SchemaBackend]): Self = this.set("backends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackends: Self = this.set("backends", js.undefined)
    
    @scala.inline
    def setCdnPolicy(value: SchemaBackendServiceCdnPolicy): Self = this.set("cdnPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCdnPolicy: Self = this.set("cdnPolicy", js.undefined)
    
    @scala.inline
    def setCircuitBreakers(value: SchemaCircuitBreakers): Self = this.set("circuitBreakers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCircuitBreakers: Self = this.set("circuitBreakers", js.undefined)
    
    @scala.inline
    def setCloudFunctionBackend(value: SchemaBackendServiceCloudFunctionBackend): Self = this.set("cloudFunctionBackend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudFunctionBackend: Self = this.set("cloudFunctionBackend", js.undefined)
    
    @scala.inline
    def setConnectionDraining(value: SchemaConnectionDraining): Self = this.set("connectionDraining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionDraining: Self = this.set("connectionDraining", js.undefined)
    
    @scala.inline
    def setConsistentHash(value: SchemaConsistentHashLoadBalancerSettings): Self = this.set("consistentHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsistentHash: Self = this.set("consistentHash", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    
    @scala.inline
    def setCustomRequestHeadersVarargs(value: String*): Self = this.set("customRequestHeaders", js.Array(value :_*))
    
    @scala.inline
    def setCustomRequestHeaders(value: js.Array[String]): Self = this.set("customRequestHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomRequestHeaders: Self = this.set("customRequestHeaders", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEnableCDN(value: Boolean): Self = this.set("enableCDN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCDN: Self = this.set("enableCDN", js.undefined)
    
    @scala.inline
    def setFailoverPolicy(value: SchemaBackendServiceFailoverPolicy): Self = this.set("failoverPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailoverPolicy: Self = this.set("failoverPolicy", js.undefined)
    
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    
    @scala.inline
    def setHealthChecksVarargs(value: String*): Self = this.set("healthChecks", js.Array(value :_*))
    
    @scala.inline
    def setHealthChecks(value: js.Array[String]): Self = this.set("healthChecks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthChecks: Self = this.set("healthChecks", js.undefined)
    
    @scala.inline
    def setIap(value: SchemaBackendServiceIAP): Self = this.set("iap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIap: Self = this.set("iap", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLoadBalancingScheme(value: String): Self = this.set("loadBalancingScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadBalancingScheme: Self = this.set("loadBalancingScheme", js.undefined)
    
    @scala.inline
    def setLocalityLbPolicy(value: String): Self = this.set("localityLbPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalityLbPolicy: Self = this.set("localityLbPolicy", js.undefined)
    
    @scala.inline
    def setLogConfig(value: SchemaBackendServiceLogConfig): Self = this.set("logConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogConfig: Self = this.set("logConfig", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOutlierDetection(value: SchemaOutlierDetection): Self = this.set("outlierDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlierDetection: Self = this.set("outlierDetection", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setPortName(value: String): Self = this.set("portName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortName: Self = this.set("portName", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setSecurityPolicy(value: String): Self = this.set("securityPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityPolicy: Self = this.set("securityPolicy", js.undefined)
    
    @scala.inline
    def setSecuritySettings(value: SchemaSecuritySettings): Self = this.set("securitySettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecuritySettings: Self = this.set("securitySettings", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setSelfLinkWithId(value: String): Self = this.set("selfLinkWithId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLinkWithId: Self = this.set("selfLinkWithId", js.undefined)
    
    @scala.inline
    def setSessionAffinity(value: String): Self = this.set("sessionAffinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionAffinity: Self = this.set("sessionAffinity", js.undefined)
    
    @scala.inline
    def setTimeoutSec(value: Double): Self = this.set("timeoutSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeoutSec: Self = this.set("timeoutSec", js.undefined)
  }
}
