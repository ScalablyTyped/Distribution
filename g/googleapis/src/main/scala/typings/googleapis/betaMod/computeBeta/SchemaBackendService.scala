package typings.googleapis.betaMod.computeBeta

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
    * The list of backends that serve this BackendService.
    */
  var backends: js.UndefOr[js.Array[SchemaBackend]] = js.native
  /**
    * Cloud CDN configuration for this BackendService.
    */
  var cdnPolicy: js.UndefOr[SchemaBackendServiceCdnPolicy] = js.native
  var connectionDraining: js.UndefOr[SchemaConnectionDraining] = js.native
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
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
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
    backends: js.Array[SchemaBackend] = null,
    cdnPolicy: SchemaBackendServiceCdnPolicy = null,
    connectionDraining: SchemaConnectionDraining = null,
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
    logConfig: SchemaBackendServiceLogConfig = null,
    name: String = null,
    port: Int | Double = null,
    portName: String = null,
    protocol: String = null,
    region: String = null,
    securityPolicy: String = null,
    selfLink: String = null,
    sessionAffinity: String = null,
    timeoutSec: Int | Double = null
  ): SchemaBackendService = {
    val __obj = js.Dynamic.literal()
    if (affinityCookieTtlSec != null) __obj.updateDynamic("affinityCookieTtlSec")(affinityCookieTtlSec.asInstanceOf[js.Any])
    if (backends != null) __obj.updateDynamic("backends")(backends.asInstanceOf[js.Any])
    if (cdnPolicy != null) __obj.updateDynamic("cdnPolicy")(cdnPolicy.asInstanceOf[js.Any])
    if (connectionDraining != null) __obj.updateDynamic("connectionDraining")(connectionDraining.asInstanceOf[js.Any])
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
    if (logConfig != null) __obj.updateDynamic("logConfig")(logConfig.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (portName != null) __obj.updateDynamic("portName")(portName.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (securityPolicy != null) __obj.updateDynamic("securityPolicy")(securityPolicy.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (sessionAffinity != null) __obj.updateDynamic("sessionAffinity")(sessionAffinity.asInstanceOf[js.Any])
    if (timeoutSec != null) __obj.updateDynamic("timeoutSec")(timeoutSec.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBackendService]
  }
}

