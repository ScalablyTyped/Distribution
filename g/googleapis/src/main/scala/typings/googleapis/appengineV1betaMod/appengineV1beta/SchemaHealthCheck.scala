package typings.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Health checking configuration for VM instances. Unhealthy instances are
  * killed and replaced with new instances. Only applicable for instances in
  * App Engine flexible environment.
  */
@js.native
trait SchemaHealthCheck extends js.Object {
  /**
    * Interval between health checks.
    */
  var checkInterval: js.UndefOr[String] = js.native
  /**
    * Whether to explicitly disable health checks for this instance.
    */
  var disableHealthCheck: js.UndefOr[Boolean] = js.native
  /**
    * Number of consecutive successful health checks required before receiving
    * traffic.
    */
  var healthyThreshold: js.UndefOr[Double] = js.native
  /**
    * Host header to send when performing an HTTP health check. Example:
    * &quot;myapp.appspot.com&quot;
    */
  var host: js.UndefOr[String] = js.native
  /**
    * Number of consecutive failed health checks required before an instance is
    * restarted.
    */
  var restartThreshold: js.UndefOr[Double] = js.native
  /**
    * Time before the health check is considered failed.
    */
  var timeout: js.UndefOr[String] = js.native
  /**
    * Number of consecutive failed health checks required before removing
    * traffic.
    */
  var unhealthyThreshold: js.UndefOr[Double] = js.native
}

object SchemaHealthCheck {
  @scala.inline
  def apply(): SchemaHealthCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHealthCheck]
  }
  @scala.inline
  implicit class SchemaHealthCheckOps[Self <: SchemaHealthCheck] (val x: Self) extends AnyVal {
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
    def setCheckInterval(value: String): Self = this.set("checkInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckInterval: Self = this.set("checkInterval", js.undefined)
    @scala.inline
    def setDisableHealthCheck(value: Boolean): Self = this.set("disableHealthCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableHealthCheck: Self = this.set("disableHealthCheck", js.undefined)
    @scala.inline
    def setHealthyThreshold(value: Double): Self = this.set("healthyThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHealthyThreshold: Self = this.set("healthyThreshold", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setRestartThreshold(value: Double): Self = this.set("restartThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestartThreshold: Self = this.set("restartThreshold", js.undefined)
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setUnhealthyThreshold(value: Double): Self = this.set("unhealthyThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnhealthyThreshold: Self = this.set("unhealthyThreshold", js.undefined)
  }
  
}

