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
  def apply(enable: js.UndefOr[Boolean] = js.undefined, sampleRate: Int | Double = null): SchemaBackendServiceLogConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBackendServiceLogConfig]
  }
}

