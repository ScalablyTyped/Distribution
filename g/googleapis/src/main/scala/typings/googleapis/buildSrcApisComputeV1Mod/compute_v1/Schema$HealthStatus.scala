package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$HealthStatus extends js.Object {
  /**
    * Health state of the instance.
    */
  var healthState: js.UndefOr[String] = js.native
  /**
    * URL of the instance resource.
    */
  var instance: js.UndefOr[String] = js.native
  /**
    * The IP address represented by this resource.
    */
  var ipAddress: js.UndefOr[String] = js.native
  /**
    * The port on the instance.
    */
  var port: js.UndefOr[Double] = js.native
}

object Schema$HealthStatus {
  @scala.inline
  def apply(
    healthState: String = null,
    instance: String = null,
    ipAddress: String = null,
    port: Int | Double = null
  ): Schema$HealthStatus = {
    val __obj = js.Dynamic.literal()
    if (healthState != null) __obj.updateDynamic("healthState")(healthState.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HealthStatus]
  }
}

