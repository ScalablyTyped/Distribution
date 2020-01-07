package typings.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information required for a TCP uptime check request.
  */
@js.native
trait Schema$TcpCheck extends js.Object {
  /**
    * The port to the page to run the check against. Will be combined with host
    * (specified within the MonitoredResource) to construct the full URL.
    * Required.
    */
  var port: js.UndefOr[Double] = js.native
}

object Schema$TcpCheck {
  @scala.inline
  def apply(port: Int | Double = null): Schema$TcpCheck = {
    val __obj = js.Dynamic.literal()
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TcpCheck]
  }
}

