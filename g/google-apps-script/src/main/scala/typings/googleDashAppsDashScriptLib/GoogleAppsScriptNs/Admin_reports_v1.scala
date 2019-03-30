package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Admin_reports_v1 extends js.Object {
  var Activities: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreReportsUnderscoreV1Ns.CollectionNs.ActivitiesCollection
  ] = js.undefined
  var Channels: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreReportsUnderscoreV1Ns.CollectionNs.ChannelsCollection
  ] = js.undefined
  var CustomerUsageReports: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreReportsUnderscoreV1Ns.CollectionNs.CustomerUsageReportsCollection
  ] = js.undefined
  var EntityUsageReports: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreReportsUnderscoreV1Ns.CollectionNs.EntityUsageReportsCollection
  ] = js.undefined
  var UserUsageReport: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreReportsUnderscoreV1Ns.CollectionNs.UserUsageReportCollection
  ] = js.undefined
  // Create a new instance of Channel
  def newChannel(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreReportsUnderscoreV1Ns.SchemaNs.Channel
}

object Admin_reports_v1 {
  @scala.inline
  def apply(
    newChannel: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreReportsUnderscoreV1Ns.SchemaNs.Channel,
    Activities: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreReportsUnderscoreV1Ns.CollectionNs.ActivitiesCollection = null,
    Channels: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreReportsUnderscoreV1Ns.CollectionNs.ChannelsCollection = null,
    CustomerUsageReports: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreReportsUnderscoreV1Ns.CollectionNs.CustomerUsageReportsCollection = null,
    EntityUsageReports: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreReportsUnderscoreV1Ns.CollectionNs.EntityUsageReportsCollection = null,
    UserUsageReport: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreReportsUnderscoreV1Ns.CollectionNs.UserUsageReportCollection = null
  ): Admin_reports_v1 = {
    val __obj = js.Dynamic.literal(newChannel = js.Any.fromFunction0(newChannel))
    if (Activities != null) __obj.updateDynamic("Activities")(Activities)
    if (Channels != null) __obj.updateDynamic("Channels")(Channels)
    if (CustomerUsageReports != null) __obj.updateDynamic("CustomerUsageReports")(CustomerUsageReports)
    if (EntityUsageReports != null) __obj.updateDynamic("EntityUsageReports")(EntityUsageReports)
    if (UserUsageReport != null) __obj.updateDynamic("UserUsageReport")(UserUsageReport)
    __obj.asInstanceOf[Admin_reports_v1]
  }
}

