package typings.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Readiness checking configuration for VM instances. Unhealthy instances are
  * removed from traffic rotation.
  */
@js.native
trait SchemaReadinessCheck extends js.Object {
  /**
    * A maximum time limit on application initialization, measured from moment
    * the application successfully replies to a healthcheck until it is ready
    * to serve traffic.
    */
  var appStartTimeout: js.UndefOr[String] = js.native
  /**
    * Interval between health checks.
    */
  var checkInterval: js.UndefOr[String] = js.native
  /**
    * Number of consecutive failed checks required before removing traffic.
    */
  var failureThreshold: js.UndefOr[Double] = js.native
  /**
    * Host header to send when performing a HTTP Readiness check. Example:
    * &quot;myapp.appspot.com&quot;
    */
  var host: js.UndefOr[String] = js.native
  /**
    * The request path.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Number of consecutive successful checks required before receiving
    * traffic.
    */
  var successThreshold: js.UndefOr[Double] = js.native
  /**
    * Time before the check is considered failed.
    */
  var timeout: js.UndefOr[String] = js.native
}

object SchemaReadinessCheck {
  @scala.inline
  def apply(): SchemaReadinessCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReadinessCheck]
  }
  @scala.inline
  implicit class SchemaReadinessCheckOps[Self <: SchemaReadinessCheck] (val x: Self) extends AnyVal {
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
    def setAppStartTimeout(value: String): Self = this.set("appStartTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppStartTimeout: Self = this.set("appStartTimeout", js.undefined)
    @scala.inline
    def setCheckInterval(value: String): Self = this.set("checkInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckInterval: Self = this.set("checkInterval", js.undefined)
    @scala.inline
    def setFailureThreshold(value: Double): Self = this.set("failureThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureThreshold: Self = this.set("failureThreshold", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setSuccessThreshold(value: Double): Self = this.set("successThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessThreshold: Self = this.set("successThreshold", js.undefined)
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

