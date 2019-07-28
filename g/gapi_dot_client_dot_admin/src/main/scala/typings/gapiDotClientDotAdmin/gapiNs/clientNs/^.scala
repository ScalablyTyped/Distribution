package typings.gapiDotClientDotAdmin.gapiNs.clientNs

import typings.gapiDotClientDotAdmin.gapiDotClientDotAdminStrings.admin
import typings.gapiDotClientDotAdmin.gapiDotClientDotAdminStrings.reports_v1
import typings.gapiDotClientDotAdmin.gapiNs.clientNs.adminNs.ActivitiesResource
import typings.gapiDotClientDotAdmin.gapiNs.clientNs.adminNs.ChannelsResource
import typings.gapiDotClientDotAdmin.gapiNs.clientNs.adminNs.CustomerUsageReportsResource
import typings.gapiDotClientDotAdmin.gapiNs.clientNs.adminNs.UserUsageReportResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val activities: ActivitiesResource = js.native
  val channels: ChannelsResource = js.native
  val customerUsageReports: CustomerUsageReportsResource = js.native
  val userUsageReport: UserUsageReportResource = js.native
  /** Load Admin Reports API reports_v1 */
  def load(name: admin, version: reports_v1): js.Thenable[Unit] = js.native
  def load(name: admin, version: reports_v1, callback: js.Function0[_]): Unit = js.native
}

