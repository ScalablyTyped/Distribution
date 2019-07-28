package typings.gapiDotClientDotMonitoring.gapiNs.clientNs

import typings.gapiDotClientDotMonitoring.gapiDotClientDotMonitoringStrings.monitoring
import typings.gapiDotClientDotMonitoring.gapiDotClientDotMonitoringStrings.v3
import typings.gapiDotClientDotMonitoring.gapiNs.clientNs.monitoringNs.ProjectsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val projects: ProjectsResource = js.native
  /** Load Stackdriver Monitoring API v3 */
  def load(name: monitoring, version: v3): js.Thenable[Unit] = js.native
  def load(name: monitoring, version: v3, callback: js.Function0[_]): Unit = js.native
}

