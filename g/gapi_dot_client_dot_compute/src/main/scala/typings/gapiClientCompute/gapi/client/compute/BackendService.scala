package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackendService extends js.Object {
  /**
    * Lifetime of cookies in seconds if session_affinity is GENERATED_COOKIE. If set to 0, the cookie is non-persistent and lasts only until the end of the
    * browser session (or equivalent). The maximum allowed value for TTL is one day.
    *
    * When the load balancing scheme is INTERNAL, this field is not used.
    */
  var affinityCookieTtlSec: js.UndefOr[Double] = js.undefined
  /** The list of backends that serve this BackendService. */
  var backends: js.UndefOr[js.Array[Backend]] = js.undefined
  /** Cloud CDN configuration for this BackendService. */
  var cdnPolicy: js.UndefOr[BackendServiceCdnPolicy] = js.undefined
  var connectionDraining: js.UndefOr[ConnectionDraining] = js.undefined
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.undefined
  /**
    * If true, enable Cloud CDN for this BackendService.
    *
    * When the load balancing scheme is INTERNAL, this field is not used.
    */
  var enableCDN: js.UndefOr[Boolean] = js.undefined
  /**
    * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when
    * inserting a BackendService. An up-to-date fingerprint must be provided in order to update the BackendService.
    */
  var fingerprint: js.UndefOr[String] = js.undefined
  /**
    * The list of URLs to the HttpHealthCheck or HttpsHealthCheck resource for health checking this BackendService. Currently at most one health check can be
    * specified, and a health check is required for Compute Engine backend services. A health check must not be specified for App Engine backend and Cloud
    * Function backend.
    *
    * For internal load balancing, a URL to a HealthCheck resource must be specified instead.
    */
  var healthChecks: js.UndefOr[js.Array[String]] = js.undefined
  var iap: js.UndefOr[BackendServiceIAP] = js.undefined
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  /** [Output Only] Type of resource. Always compute#backendService for backend services. */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether the backend service will be used with internal or external load balancing. A backend service created for one type of load balancing
    * cannot be used with the other. Possible values are INTERNAL and EXTERNAL.
    */
  var loadBalancingScheme: js.UndefOr[String] = js.undefined
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be
    * a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Deprecated in favor of portName. The TCP port to connect on the backend. The default value is 80.
    *
    * This cannot be used for internal load balancing.
    */
  var port: js.UndefOr[Double] = js.undefined
  /**
    * Name of backend port. The same name should appear in the instance groups referenced by this service. Required when the load balancing scheme is
    * EXTERNAL.
    *
    * When the load balancing scheme is INTERNAL, this field is not used.
    */
  var portName: js.UndefOr[String] = js.undefined
  /**
    * The protocol this BackendService uses to communicate with backends.
    *
    * Possible values are HTTP, HTTPS, TCP, and SSL. The default is HTTP.
    *
    * For internal load balancing, the possible values are TCP and UDP, and the default is TCP.
    */
  var protocol: js.UndefOr[String] = js.undefined
  /** [Output Only] URL of the region where the regional backend service resides. This field is not applicable to global backend services. */
  var region: js.UndefOr[String] = js.undefined
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  /**
    * Type of session affinity to use. The default is NONE.
    *
    * When the load balancing scheme is EXTERNAL, can be NONE, CLIENT_IP, or GENERATED_COOKIE.
    *
    * When the load balancing scheme is INTERNAL, can be NONE, CLIENT_IP, CLIENT_IP_PROTO, or CLIENT_IP_PORT_PROTO.
    *
    * When the protocol is UDP, this field is not used.
    */
  var sessionAffinity: js.UndefOr[String] = js.undefined
  /** How many seconds to wait for the backend before considering it a failed request. Default is 30 seconds. */
  var timeoutSec: js.UndefOr[Double] = js.undefined
}

object BackendService {
  @scala.inline
  def apply(
    affinityCookieTtlSec: js.UndefOr[Double] = js.undefined,
    backends: js.Array[Backend] = null,
    cdnPolicy: BackendServiceCdnPolicy = null,
    connectionDraining: ConnectionDraining = null,
    creationTimestamp: String = null,
    description: String = null,
    enableCDN: js.UndefOr[Boolean] = js.undefined,
    fingerprint: String = null,
    healthChecks: js.Array[String] = null,
    iap: BackendServiceIAP = null,
    id: String = null,
    kind: String = null,
    loadBalancingScheme: String = null,
    name: String = null,
    port: js.UndefOr[Double] = js.undefined,
    portName: String = null,
    protocol: String = null,
    region: String = null,
    selfLink: String = null,
    sessionAffinity: String = null,
    timeoutSec: js.UndefOr[Double] = js.undefined
  ): BackendService = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(affinityCookieTtlSec)) __obj.updateDynamic("affinityCookieTtlSec")(affinityCookieTtlSec.get.asInstanceOf[js.Any])
    if (backends != null) __obj.updateDynamic("backends")(backends.asInstanceOf[js.Any])
    if (cdnPolicy != null) __obj.updateDynamic("cdnPolicy")(cdnPolicy.asInstanceOf[js.Any])
    if (connectionDraining != null) __obj.updateDynamic("connectionDraining")(connectionDraining.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCDN)) __obj.updateDynamic("enableCDN")(enableCDN.get.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (healthChecks != null) __obj.updateDynamic("healthChecks")(healthChecks.asInstanceOf[js.Any])
    if (iap != null) __obj.updateDynamic("iap")(iap.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (loadBalancingScheme != null) __obj.updateDynamic("loadBalancingScheme")(loadBalancingScheme.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (portName != null) __obj.updateDynamic("portName")(portName.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (sessionAffinity != null) __obj.updateDynamic("sessionAffinity")(sessionAffinity.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutSec)) __obj.updateDynamic("timeoutSec")(timeoutSec.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendService]
  }
}

