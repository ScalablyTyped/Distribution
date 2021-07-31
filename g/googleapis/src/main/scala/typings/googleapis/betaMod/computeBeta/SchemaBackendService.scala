package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A BackendService resource. This resource defines a group of backend virtual
  * machines and their serving capacity. (== resource_for v1.backendService ==)
  * (== resource_for beta.backendService ==)
  */
trait SchemaBackendService extends StObject {
  
  /**
    * Lifetime of cookies in seconds if session_affinity is GENERATED_COOKIE.
    * If set to 0, the cookie is non-persistent and lasts only until the end of
    * the browser session (or equivalent). The maximum allowed value for TTL is
    * one day.  When the load balancing scheme is INTERNAL, this field is not
    * used.
    */
  var affinityCookieTtlSec: js.UndefOr[Double] = js.undefined
  
  /**
    * The list of backends that serve this BackendService.
    */
  var backends: js.UndefOr[js.Array[SchemaBackend]] = js.undefined
  
  /**
    * Cloud CDN configuration for this BackendService.
    */
  var cdnPolicy: js.UndefOr[SchemaBackendServiceCdnPolicy] = js.undefined
  
  var connectionDraining: js.UndefOr[SchemaConnectionDraining] = js.undefined
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /**
    * Headers that the HTTP/S load balancer should add to proxied requests.
    */
  var customRequestHeaders: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * If true, enable Cloud CDN for this BackendService.  When the load
    * balancing scheme is INTERNAL, this field is not used.
    */
  var enableCDN: js.UndefOr[Boolean] = js.undefined
  
  var failoverPolicy: js.UndefOr[SchemaBackendServiceFailoverPolicy] = js.undefined
  
  /**
    * Fingerprint of this resource. A hash of the contents stored in this
    * object. This field is used in optimistic locking. This field will be
    * ignored when inserting a BackendService. An up-to-date fingerprint must
    * be provided in order to update the BackendService, otherwise the request
    * will fail with error 412 conditionNotMet.  To see the latest fingerprint,
    * make a get() request to retrieve a BackendService.
    */
  var fingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * The list of URLs to the HttpHealthCheck or HttpsHealthCheck resource for
    * health checking this BackendService. Currently at most one health check
    * can be specified, and a health check is required for Compute Engine
    * backend services. A health check must not be specified for App Engine
    * backend and Cloud Function backend.  For internal load balancing, a URL
    * to a HealthCheck resource must be specified instead.
    */
  var healthChecks: js.UndefOr[js.Array[String]] = js.undefined
  
  var iap: js.UndefOr[SchemaBackendServiceIAP] = js.undefined
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Type of resource. Always compute#backendService for backend
    * services.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the backend service will be used with internal or
    * external load balancing. A backend service created for one type of load
    * balancing cannot be used with the other. Possible values are INTERNAL and
    * EXTERNAL.
    */
  var loadBalancingScheme: js.UndefOr[String] = js.undefined
  
  /**
    * This field denotes the logging options for the load balancer traffic
    * served by this backend service. If logging is enabled, logs will be
    * exported to Stackdriver.
    */
  var logConfig: js.UndefOr[SchemaBackendServiceLogConfig] = js.undefined
  
  /**
    * Name of the resource. Provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated in favor of portName. The TCP port to connect on the backend.
    * The default value is 80.  This cannot be used for internal load
    * balancing.
    */
  var port: js.UndefOr[Double] = js.undefined
  
  /**
    * Name of backend port. The same name should appear in the instance groups
    * referenced by this service. Required when the load balancing scheme is
    * EXTERNAL.  When the load balancing scheme is INTERNAL, this field is not
    * used.
    */
  var portName: js.UndefOr[String] = js.undefined
  
  /**
    * The protocol this BackendService uses to communicate with backends.
    * Possible values are HTTP, HTTPS, TCP, and SSL. The default is HTTP.  For
    * internal load balancing, the possible values are TCP and UDP, and the
    * default is TCP.
    */
  var protocol: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] URL of the region where the regional backend service
    * resides. This field is not applicable to global backend services. You
    * must specify this field as part of the HTTP request URL. It is not
    * settable as a field in the request body.
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The resource URL for the security policy associated with
    * this backend service.
    */
  var securityPolicy: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * Type of session affinity to use. The default is NONE.  When the load
    * balancing scheme is EXTERNAL, can be NONE, CLIENT_IP, or
    * GENERATED_COOKIE.  When the load balancing scheme is INTERNAL, can be
    * NONE, CLIENT_IP, CLIENT_IP_PROTO, or CLIENT_IP_PORT_PROTO.  When the
    * protocol is UDP, this field is not used.
    */
  var sessionAffinity: js.UndefOr[String] = js.undefined
  
  /**
    * How many seconds to wait for the backend before considering it a failed
    * request. Default is 30 seconds.
    */
  var timeoutSec: js.UndefOr[Double] = js.undefined
}
object SchemaBackendService {
  
  @scala.inline
  def apply(): SchemaBackendService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendService]
  }
  
  @scala.inline
  implicit class SchemaBackendServiceMutableBuilder[Self <: SchemaBackendService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAffinityCookieTtlSec(value: Double): Self = StObject.set(x, "affinityCookieTtlSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffinityCookieTtlSecUndefined: Self = StObject.set(x, "affinityCookieTtlSec", js.undefined)
    
    @scala.inline
    def setBackends(value: js.Array[SchemaBackend]): Self = StObject.set(x, "backends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendsUndefined: Self = StObject.set(x, "backends", js.undefined)
    
    @scala.inline
    def setBackendsVarargs(value: SchemaBackend*): Self = StObject.set(x, "backends", js.Array(value :_*))
    
    @scala.inline
    def setCdnPolicy(value: SchemaBackendServiceCdnPolicy): Self = StObject.set(x, "cdnPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCdnPolicyUndefined: Self = StObject.set(x, "cdnPolicy", js.undefined)
    
    @scala.inline
    def setConnectionDraining(value: SchemaConnectionDraining): Self = StObject.set(x, "connectionDraining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionDrainingUndefined: Self = StObject.set(x, "connectionDraining", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    @scala.inline
    def setCustomRequestHeaders(value: js.Array[String]): Self = StObject.set(x, "customRequestHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomRequestHeadersUndefined: Self = StObject.set(x, "customRequestHeaders", js.undefined)
    
    @scala.inline
    def setCustomRequestHeadersVarargs(value: String*): Self = StObject.set(x, "customRequestHeaders", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEnableCDN(value: Boolean): Self = StObject.set(x, "enableCDN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableCDNUndefined: Self = StObject.set(x, "enableCDN", js.undefined)
    
    @scala.inline
    def setFailoverPolicy(value: SchemaBackendServiceFailoverPolicy): Self = StObject.set(x, "failoverPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailoverPolicyUndefined: Self = StObject.set(x, "failoverPolicy", js.undefined)
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    @scala.inline
    def setHealthChecks(value: js.Array[String]): Self = StObject.set(x, "healthChecks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthChecksUndefined: Self = StObject.set(x, "healthChecks", js.undefined)
    
    @scala.inline
    def setHealthChecksVarargs(value: String*): Self = StObject.set(x, "healthChecks", js.Array(value :_*))
    
    @scala.inline
    def setIap(value: SchemaBackendServiceIAP): Self = StObject.set(x, "iap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIapUndefined: Self = StObject.set(x, "iap", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLoadBalancingScheme(value: String): Self = StObject.set(x, "loadBalancingScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancingSchemeUndefined: Self = StObject.set(x, "loadBalancingScheme", js.undefined)
    
    @scala.inline
    def setLogConfig(value: SchemaBackendServiceLogConfig): Self = StObject.set(x, "logConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogConfigUndefined: Self = StObject.set(x, "logConfig", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortName(value: String): Self = StObject.set(x, "portName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortNameUndefined: Self = StObject.set(x, "portName", js.undefined)
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setSecurityPolicy(value: String): Self = StObject.set(x, "securityPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityPolicyUndefined: Self = StObject.set(x, "securityPolicy", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setSessionAffinity(value: String): Self = StObject.set(x, "sessionAffinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionAffinityUndefined: Self = StObject.set(x, "sessionAffinity", js.undefined)
    
    @scala.inline
    def setTimeoutSec(value: Double): Self = StObject.set(x, "timeoutSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutSecUndefined: Self = StObject.set(x, "timeoutSec", js.undefined)
  }
}
