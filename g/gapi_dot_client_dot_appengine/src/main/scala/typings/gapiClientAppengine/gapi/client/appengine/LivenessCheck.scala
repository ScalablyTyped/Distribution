package typings.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LivenessCheck extends js.Object {
  /** Interval between health checks. */
  var checkInterval: js.UndefOr[String] = js.native
  /** Number of consecutive failed checks required before considering the VM unhealthy. */
  var failureThreshold: js.UndefOr[Double] = js.native
  /** Host header to send when performing a HTTP Liveness check. Example: "myapp.appspot.com" */
  var host: js.UndefOr[String] = js.native
  /** The initial delay before starting to execute the checks. */
  var initialDelay: js.UndefOr[String] = js.native
  /** The request path. */
  var path: js.UndefOr[String] = js.native
  /** Number of consecutive successful checks required before considering the VM healthy. */
  var successThreshold: js.UndefOr[Double] = js.native
  /** Time before the check is considered failed. */
  var timeout: js.UndefOr[String] = js.native
}

object LivenessCheck {
  @scala.inline
  def apply(): LivenessCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LivenessCheck]
  }
  @scala.inline
  implicit class LivenessCheckOps[Self <: LivenessCheck] (val x: Self) extends AnyVal {
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
    def setFailureThreshold(value: Double): Self = this.set("failureThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureThreshold: Self = this.set("failureThreshold", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setInitialDelay(value: String): Self = this.set("initialDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialDelay: Self = this.set("initialDelay", js.undefined)
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

