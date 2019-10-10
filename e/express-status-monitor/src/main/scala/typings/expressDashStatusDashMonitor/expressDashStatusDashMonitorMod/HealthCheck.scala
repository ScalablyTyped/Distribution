package typings.expressDashStatusDashMonitor.expressDashStatusDashMonitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HealthCheck extends js.Object {
  var host: String
  var path: String
  var port: String | Double
  var protocol: String
}

object HealthCheck {
  @scala.inline
  def apply(host: String, path: String, port: String | Double, protocol: String): HealthCheck = {
    val __obj = js.Dynamic.literal(host = host, path = path, port = port.asInstanceOf[js.Any], protocol = protocol)
  
    __obj.asInstanceOf[HealthCheck]
  }
}

