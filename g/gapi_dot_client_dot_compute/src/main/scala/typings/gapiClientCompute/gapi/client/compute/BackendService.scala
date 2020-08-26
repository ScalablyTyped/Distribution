package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackendService extends js.Object {
  /**
    * Lifetime of cookies in seconds if session_affinity is GENERATED_COOKIE. If set to 0, the cookie is non-persistent and lasts only until the end of the
    * browser session (or equivalent). The maximum allowed value for TTL is one day.
    *
    * When the load balancing scheme is INTERNAL, this field is not used.
    */
  var affinityCookieTtlSec: js.UndefOr[Double] = js.native
  /** The list of backends that serve this BackendService. */
  var backends: js.UndefOr[js.Array[Backend]] = js.native
  /** Cloud CDN configuration for this BackendService. */
  var cdnPolicy: js.UndefOr[BackendServiceCdnPolicy] = js.native
  var connectionDraining: js.UndefOr[ConnectionDraining] = js.native
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.native
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.native
  /**
    * If true, enable Cloud CDN for this BackendService.
    *
    * When the load balancing scheme is INTERNAL, this field is not used.
    */
  var enableCDN: js.UndefOr[Boolean] = js.native
  /**
    * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when
    * inserting a BackendService. An up-to-date fingerprint must be provided in order to update the BackendService.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * The list of URLs to the HttpHealthCheck or HttpsHealthCheck resource for health checking this BackendService. Currently at most one health check can be
    * specified, and a health check is required for Compute Engine backend services. A health check must not be specified for App Engine backend and Cloud
    * Function backend.
    *
    * For internal load balancing, a URL to a HealthCheck resource must be specified instead.
    */
  var healthChecks: js.UndefOr[js.Array[String]] = js.native
  var iap: js.UndefOr[BackendServiceIAP] = js.native
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.native
  /** [Output Only] Type of resource. Always compute#backendService for backend services. */
  var kind: js.UndefOr[String] = js.native
  /**
    * Indicates whether the backend service will be used with internal or external load balancing. A backend service created for one type of load balancing
    * cannot be used with the other. Possible values are INTERNAL and EXTERNAL.
    */
  var loadBalancingScheme: js.UndefOr[String] = js.native
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be
    * a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Deprecated in favor of portName. The TCP port to connect on the backend. The default value is 80.
    *
    * This cannot be used for internal load balancing.
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * Name of backend port. The same name should appear in the instance groups referenced by this service. Required when the load balancing scheme is
    * EXTERNAL.
    *
    * When the load balancing scheme is INTERNAL, this field is not used.
    */
  var portName: js.UndefOr[String] = js.native
  /**
    * The protocol this BackendService uses to communicate with backends.
    *
    * Possible values are HTTP, HTTPS, TCP, and SSL. The default is HTTP.
    *
    * For internal load balancing, the possible values are TCP and UDP, and the default is TCP.
    */
  var protocol: js.UndefOr[String] = js.native
  /** [Output Only] URL of the region where the regional backend service resides. This field is not applicable to global backend services. */
  var region: js.UndefOr[String] = js.native
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * Type of session affinity to use. The default is NONE.
    *
    * When the load balancing scheme is EXTERNAL, can be NONE, CLIENT_IP, or GENERATED_COOKIE.
    *
    * When the load balancing scheme is INTERNAL, can be NONE, CLIENT_IP, CLIENT_IP_PROTO, or CLIENT_IP_PORT_PROTO.
    *
    * When the protocol is UDP, this field is not used.
    */
  var sessionAffinity: js.UndefOr[String] = js.native
  /** How many seconds to wait for the backend before considering it a failed request. Default is 30 seconds. */
  var timeoutSec: js.UndefOr[Double] = js.native
}

object BackendService {
  @scala.inline
  def apply(): BackendService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendService]
  }
  @scala.inline
  implicit class BackendServiceOps[Self <: BackendService] (val x: Self) extends AnyVal {
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
    def setBackendsVarargs(value: Backend*): Self = this.set("backends", js.Array(value :_*))
    @scala.inline
    def setBackends(value: js.Array[Backend]): Self = this.set("backends", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackends: Self = this.set("backends", js.undefined)
    @scala.inline
    def setCdnPolicy(value: BackendServiceCdnPolicy): Self = this.set("cdnPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCdnPolicy: Self = this.set("cdnPolicy", js.undefined)
    @scala.inline
    def setConnectionDraining(value: ConnectionDraining): Self = this.set("connectionDraining", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionDraining: Self = this.set("connectionDraining", js.undefined)
    @scala.inline
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEnableCDN(value: Boolean): Self = this.set("enableCDN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableCDN: Self = this.set("enableCDN", js.undefined)
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
    def setIap(value: BackendServiceIAP): Self = this.set("iap", value.asInstanceOf[js.Any])
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
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
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
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

