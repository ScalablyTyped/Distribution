package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminReports extends js.Object {
  var Activities: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminReportsNs.CollectionNs.ActivitiesCollection
  ] = js.undefined
  var Channels: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminReportsNs.CollectionNs.ChannelsCollection
  ] = js.undefined
  var CustomerUsageReports: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminReportsNs.CollectionNs.CustomerUsageReportsCollection
  ] = js.undefined
  var EntityUsageReports: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminReportsNs.CollectionNs.EntityUsageReportsCollection
  ] = js.undefined
  var UserUsageReport: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminReportsNs.CollectionNs.UserUsageReportCollection
  ] = js.undefined
  // Create a new instance of Channel
  def newChannel(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminReportsNs.SchemaNs.Channel
}

object AdminReports {
  @scala.inline
  def apply(
    newChannel: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminReportsNs.SchemaNs.Channel,
    Activities: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminReportsNs.CollectionNs.ActivitiesCollection = null,
    Channels: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminReportsNs.CollectionNs.ChannelsCollection = null,
    CustomerUsageReports: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminReportsNs.CollectionNs.CustomerUsageReportsCollection = null,
    EntityUsageReports: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminReportsNs.CollectionNs.EntityUsageReportsCollection = null,
    UserUsageReport: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminReportsNs.CollectionNs.UserUsageReportCollection = null
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

