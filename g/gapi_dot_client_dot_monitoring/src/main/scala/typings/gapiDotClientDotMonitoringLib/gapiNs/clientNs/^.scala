package typings
package gapiDotClientDotMonitoringLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val projects: gapiDotClientDotMonitoringLib.gapiNs.clientNs.monitoringNs.ProjectsResource = js.native
  /** Load Stackdriver Monitoring API v3 */
  def load(
    name: gapiDotClientDotMonitoringLib.gapiDotClientDotMonitoringLibStrings.monitoring,
    version: gapiDotClientDotMonitoringLib.gapiDotClientDotMonitoringLibStrings.v3
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotMonitoringLib.gapiDotClientDotMonitoringLibStrings.monitoring,
    version: gapiDotClientDotMonitoringLib.gapiDotClientDotMonitoringLibStrings.v3,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

