package typings.gapiClientAdmin

import typings.gapiClientAdmin.gapi.client.admin.ActivitiesResource
import typings.gapiClientAdmin.gapi.client.admin.ChannelsResource
import typings.gapiClientAdmin.gapi.client.admin.CustomerUsageReportsResource
import typings.gapiClientAdmin.gapi.client.admin.UserUsageReportResource
import typings.gapiClientAdmin.gapiClientAdminStrings.admin
import typings.gapiClientAdmin.gapiClientAdminStrings.reports_v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      val activities: ActivitiesResource = js.native
      val channels: ChannelsResource = js.native
      val customerUsageReports: CustomerUsageReportsResource = js.native
      val userUsageReport: UserUsageReportResource = js.native
      /** Load Admin Reports API reports_v1 */
      def load(name: admin, version: reports_v1): js.Thenable[Unit] = js.native
      def load(name: admin, version: reports_v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

