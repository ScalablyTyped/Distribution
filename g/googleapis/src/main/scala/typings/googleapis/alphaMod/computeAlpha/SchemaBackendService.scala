package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    affinityCookieTtlSec: Int | Double = null,
    appEngineBackend: SchemaBackendServiceAppEngineBackend = null,
    backends: js.Array[SchemaBackend] = null,
    cdnPolicy: SchemaBackendServiceCdnPolicy = null,
    circuitBreakers: SchemaCircuitBreakers = null,
    cloudFunctionBackend: SchemaBackendServiceCloudFunctionBackend = null,
    connectionDraining: SchemaConnectionDraining = null,
    consistentHash: SchemaConsistentHashLoadBalancerSettings = null,
    creationTimestamp: String = null,
    customRequestHeaders: js.Array[String] = null,
    description: String = null,
    enableCDN: js.UndefOr[Boolean] = js.undefined,
    failoverPolicy: SchemaBackendServiceFailoverPolicy = null,
    fingerprint: String = null,
    healthChecks: js.Array[String] = null,
    iap: SchemaBackendServiceIAP = null,
    id: String = null,
    kind: String = null,
    loadBalancingScheme: String = null,
    localityLbPolicy: String = null,
    logConfig: SchemaBackendServiceLogConfig = null,
    name: String = null,
    outlierDetection: SchemaOutlierDetection = null,
    port: Int | Double = null,
    portName: String = null,
    protocol: String = null,
    region: String = null,
    securityPolicy: String = null,
    securitySettings: SchemaSecuritySettings = null,
    selfLink: String = null,
    selfLinkWithId: String = null,
    sessionAffinity: String = null,
    timeoutSec: Int | Double = null
  ): SchemaBackendService = {
    val __obj = js.Dynamic.literal()
    if (affinityCookieTtlSec != null) __obj.updateDynamic("affinityCookieTtlSec")(affinityCookieTtlSec.asInstanceOf[js.Any])
    if (appEngineBackend != null) __obj.updateDynamic("appEngineBackend")(appEngineBackend.asInstanceOf[js.Any])
    if (backends != null) __obj.updateDynamic("backends")(backends.asInstanceOf[js.Any])
    if (cdnPolicy != null) __obj.updateDynamic("cdnPolicy")(cdnPolicy.asInstanceOf[js.Any])
    if (circuitBreakers != null) __obj.updateDynamic("circuitBreakers")(circuitBreakers.asInstanceOf[js.Any])
    if (cloudFunctionBackend != null) __obj.updateDynamic("cloudFunctionBackend")(cloudFunctionBackend.asInstanceOf[js.Any])
    if (connectionDraining != null) __obj.updateDynamic("connectionDraining")(connectionDraining.asInstanceOf[js.Any])
    if (consistentHash != null) __obj.updateDynamic("consistentHash")(consistentHash.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (customRequestHeaders != null) __obj.updateDynamic("customRequestHeaders")(customRequestHeaders.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCDN)) __obj.updateDynamic("enableCDN")(enableCDN.asInstanceOf[js.Any])
    if (failoverPolicy != null) __obj.updateDynamic("failoverPolicy")(failoverPolicy.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (healthChecks != null) __obj.updateDynamic("healthChecks")(healthChecks.asInstanceOf[js.Any])
    if (iap != null) __obj.updateDynamic("iap")(iap.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (loadBalancingScheme != null) __obj.updateDynamic("loadBalancingScheme")(loadBalancingScheme.asInstanceOf[js.Any])
    if (localityLbPolicy != null) __obj.updateDynamic("localityLbPolicy")(localityLbPolicy.asInstanceOf[js.Any])
    if (logConfig != null) __obj.updateDynamic("logConfig")(logConfig.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (outlierDetection != null) __obj.updateDynamic("outlierDetection")(outlierDetection.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (portName != null) __obj.updateDynamic("portName")(portName.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (securityPolicy != null) __obj.updateDynamic("securityPolicy")(securityPolicy.asInstanceOf[js.Any])
    if (securitySettings != null) __obj.updateDynamic("securitySettings")(securitySettings.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (selfLinkWithId != null) __obj.updateDynamic("selfLinkWithId")(selfLinkWithId.asInstanceOf[js.Any])
    if (sessionAffinity != null) __obj.updateDynamic("sessionAffinity")(sessionAffinity.asInstanceOf[js.Any])
    if (timeoutSec != null) __obj.updateDynamic("timeoutSec")(timeoutSec.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBackendService]
  }
}

