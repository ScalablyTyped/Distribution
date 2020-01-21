package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HealthStatus extends js.Object {
  /** Health state of the instance. */
  var healthState: js.UndefOr[String] = js.undefined
  /** URL of the instance resource. */
  var instance: js.UndefOr[String] = js.undefined
  /** The IP address represented by this resource. */
  var ipAddress: js.UndefOr[String] = js.undefined
  /** The port on the instance. */
  var port: js.UndefOr[Double] = js.undefined
}

object HealthStatus {
  @scala.inline
  def apply(
    healthState: String = null,
    instance: String = null,
    ipAddress: String = null,
    port: Int | Double = null
  ): HealthStatus = {
    val __obj = js.Dynamic.literal()
    if (healthState != null) __obj.updateDynamic("healthState")(healthState.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[HealthStatus]
  }
}

