package typings.gapiClientMonitoring.gapi.client

import typings.gapiClientMonitoring.gapiClientMonitoringStrings.v3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client.load")
@js.native
object load extends js.Object {
  /** Load Stackdriver Monitoring API v3 */
  def apply(name: typings.gapiClientMonitoring.gapiClientMonitoringStrings.monitoring, version: v3): js.Thenable[Unit] = js.native
  def apply(
    name: typings.gapiClientMonitoring.gapiClientMonitoringStrings.monitoring,
    version: v3,
    callback: js.Function0[_]
  ): Unit = js.native
}

