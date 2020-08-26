package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An HttpsHealthCheck resource. This resource defines a template for how
  * individual instances should be checked for health, via HTTPS.
  */
@js.native
trait SchemaHttpsHealthCheck extends js.Object {
  /**
    * How often (in seconds) to send a health check. The default value is 5
    * seconds.
    */
  var checkIntervalSec: js.UndefOr[Double] = js.native
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * A so-far unhealthy instance will be marked healthy after this many
    * consecutive successes. The default value is 2.
    */
  var healthyThreshold: js.UndefOr[Double] = js.native
  /**
    * The value of the host header in the HTTPS health check request. If left
    * empty (default value), the public IP on behalf of which this health check
    * is performed will be used.
    */
  var host: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Type of the resource.
    */
  var kind: js.UndefOr[String] = js.native
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
    * The TCP port number for the HTTPS health check request. The default value
    * is 443.
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * The request path of the HTTPS health check request. The default value is
    * &quot;/&quot;.
    */
  var requestPath: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String] = js.native
  /**
    * How long (in seconds) to wait before claiming failure. The default value
    * is 5 seconds. It is invalid for timeoutSec to have a greater value than
    * checkIntervalSec.
    */
  var timeoutSec: js.UndefOr[Double] = js.native
  /**
    * A so-far healthy instance will be marked unhealthy after this many
    * consecutive failures. The default value is 2.
    */
  var unhealthyThreshold: js.UndefOr[Double] = js.native
}

object SchemaHttpsHealthCheck {
  @scala.inline
  def apply(): SchemaHttpsHealthCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpsHealthCheck]
  }
  @scala.inline
  implicit class SchemaHttpsHealthCheckOps[Self <: SchemaHttpsHealthCheck] (val x: Self) extends AnyVal {
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
    def setCheckIntervalSec(value: Double): Self = this.set("checkIntervalSec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckIntervalSec: Self = this.set("checkIntervalSec", js.undefined)
    @scala.inline
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setHealthyThreshold(value: Double): Self = this.set("healthyThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHealthyThreshold: Self = this.set("healthyThreshold", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setRequestPath(value: String): Self = this.set("requestPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestPath: Self = this.set("requestPath", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setSelfLinkWithId(value: String): Self = this.set("selfLinkWithId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLinkWithId: Self = this.set("selfLinkWithId", js.undefined)
    @scala.inline
    def setTimeoutSec(value: Double): Self = this.set("timeoutSec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutSec: Self = this.set("timeoutSec", js.undefined)
    @scala.inline
    def setUnhealthyThreshold(value: Double): Self = this.set("unhealthyThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnhealthyThreshold: Self = this.set("unhealthyThreshold", js.undefined)
  }
  
}

