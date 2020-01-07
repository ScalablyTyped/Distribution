package typings.googleapis.buildSrcApisReplicapoolV1beta1Mod.replicapool_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$HealthCheck extends js.Object {
  /**
    * How often (in seconds) to make HTTP requests for this healthcheck. The
    * default value is 5 seconds.
    */
  var checkIntervalSec: js.UndefOr[Double] = js.native
  /**
    * The description for this health check.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The number of consecutive health check requests that need to succeed
    * before the replica is considered healthy again. The default value is 2.
    */
  var healthyThreshold: js.UndefOr[Double] = js.native
  /**
    * The value of the host header in the HTTP health check request. If left
    * empty (default value), the localhost IP 127.0.0.1 will be used.
    */
  var host: js.UndefOr[String] = js.native
  /**
    * The name of this health check.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The localhost request path to send this health check, in the format
    * /path/to/use. For example, /healthcheck.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The TCP port for the health check requests.
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * How long (in seconds) to wait before a timeout failure for this
    * healthcheck. The default value is 5 seconds.
    */
  var timeoutSec: js.UndefOr[Double] = js.native
  /**
    * The number of consecutive health check requests that need to fail in
    * order to consider the replica unhealthy. The default value is 2.
    */
  var unhealthyThreshold: js.UndefOr[Double] = js.native
}

object Schema$HealthCheck {
  @scala.inline
  def apply(
    checkIntervalSec: Int | Double = null,
    description: String = null,
    healthyThreshold: Int | Double = null,
    host: String = null,
    name: String = null,
    path: String = null,
    port: Int | Double = null,
    timeoutSec: Int | Double = null,
    unhealthyThreshold: Int | Double = null
  ): Schema$HealthCheck = {
    val __obj = js.Dynamic.literal()
    if (checkIntervalSec != null) __obj.updateDynamic("checkIntervalSec")(checkIntervalSec.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (healthyThreshold != null) __obj.updateDynamic("healthyThreshold")(healthyThreshold.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (timeoutSec != null) __obj.updateDynamic("timeoutSec")(timeoutSec.asInstanceOf[js.Any])
    if (unhealthyThreshold != null) __obj.updateDynamic("unhealthyThreshold")(unhealthyThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HealthCheck]
  }
}

