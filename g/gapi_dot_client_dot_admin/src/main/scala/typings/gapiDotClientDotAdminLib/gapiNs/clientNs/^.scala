package typings
package gapiDotClientDotAdminLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val activities: gapiDotClientDotAdminLib.gapiNs.clientNs.adminNs.ActivitiesResource = js.native
  val channels: gapiDotClientDotAdminLib.gapiNs.clientNs.adminNs.ChannelsResource = js.native
  val customerUsageReports: gapiDotClientDotAdminLib.gapiNs.clientNs.adminNs.CustomerUsageReportsResource = js.native
  val userUsageReport: gapiDotClientDotAdminLib.gapiNs.clientNs.adminNs.UserUsageReportResource = js.native
  /** Load Admin Reports API reports_v1 */
  def load(
    name: gapiDotClientDotAdminLib.gapiDotClientDotAdminLibStrings.admin,
    version: gapiDotClientDotAdminLib.gapiDotClientDotAdminLibStrings.reports_v1
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotAdminLib.gapiDotClientDotAdminLibStrings.admin,
    version: gapiDotClientDotAdminLib.gapiDotClientDotAdminLibStrings.reports_v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

