package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The available logging options for the load balancer traffic served by this
  * backend service.
  */
@js.native
trait SchemaBackendServiceLogConfig extends js.Object {
  /**
    * This field denotes whether to enable logging for the load balancer
    * traffic served by this backend service.
    */
  var enable: js.UndefOr[Boolean] = js.native
  /**
    * This field can only be specified if logging is enabled for this backend
    * service. The value of the field must be in [0, 1]. This configures the
    * sampling rate of requests to the load balancer where 1.0 means all logged
    * requests are reported and 0.0 means no logged requests are reported. The
    * default value is 1.0.
    */
  var sampleRate: js.UndefOr[Double] = js.native
}

object SchemaBackendServiceLogConfig {
  @scala.inline
  def apply(): SchemaBackendServiceLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendServiceLogConfig]
  }
  @scala.inline
  implicit class SchemaBackendServiceLogConfigOps[Self <: SchemaBackendServiceLogConfig] (val x: Self) extends AnyVal {
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
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    @scala.inline
    def setSampleRate(value: Double): Self = this.set("sampleRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleRate: Self = this.set("sampleRate", js.undefined)
  }
  
}

