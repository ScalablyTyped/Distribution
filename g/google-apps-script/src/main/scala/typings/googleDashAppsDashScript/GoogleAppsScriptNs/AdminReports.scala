package typings.googleDashAppsDashScript.GoogleAppsScriptNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminReportsNs.CollectionNs.ActivitiesCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminReportsNs.CollectionNs.ChannelsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminReportsNs.CollectionNs.CustomerUsageReportsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminReportsNs.CollectionNs.EntityUsageReportsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminReportsNs.CollectionNs.UserUsageReportCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminReportsNs.SchemaNs.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminReports extends js.Object {
  var Activities: js.UndefOr[ActivitiesCollection] = js.undefined
  var Channels: js.UndefOr[ChannelsCollection] = js.undefined
  var CustomerUsageReports: js.UndefOr[CustomerUsageReportsCollection] = js.undefined
  var EntityUsageReports: js.UndefOr[EntityUsageReportsCollection] = js.undefined
  var UserUsageReport: js.UndefOr[UserUsageReportCollection] = js.undefined
  // Create a new instance of Channel
  def newChannel(): Channel
}

object AdminReports {
  @scala.inline
  def apply(
    newChannel: () => Channel,
    Activities: ActivitiesCollection = null,
    Channels: ChannelsCollection = null,
    CustomerUsageReports: CustomerUsageReportsCollection = null,
    EntityUsageReports: EntityUsageReportsCollection = null,
    UserUsageReport: UserUsageReportCollection = null
  ): AdminReports = {
    val __obj = js.Dynamic.literal(newChannel = js.Any.fromFunction0(newChannel))
    if (Activities != null) __obj.updateDynamic("Activities")(Activities)
    if (Channels != null) __obj.updateDynamic("Channels")(Channels)
    if (CustomerUsageReports != null) __obj.updateDynamic("CustomerUsageReports")(CustomerUsageReports)
    if (EntityUsageReports != null) __obj.updateDynamic("EntityUsageReports")(EntityUsageReports)
    if (UserUsageReport != null) __obj.updateDynamic("UserUsageReport")(UserUsageReport)
    __obj.asInstanceOf[AdminReports]
  }
}

