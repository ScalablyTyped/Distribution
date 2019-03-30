package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YoutubeAnalytics_v2 extends js.Object {
  var GroupItems: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeAnalyticsUnderscoreV2Ns.CollectionNs.GroupItemsCollection
  ] = js.undefined
  var Groups: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeAnalyticsUnderscoreV2Ns.CollectionNs.GroupsCollection
  ] = js.undefined
  var Reports: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeAnalyticsUnderscoreV2Ns.CollectionNs.ReportsCollection
  ] = js.undefined
  // Create a new instance of ErrorProto
  def newErrorProto(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeAnalyticsUnderscoreV2Ns.SchemaNs.ErrorProto
  // Create a new instance of Errors
  def newErrors(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeAnalyticsUnderscoreV2Ns.SchemaNs.Errors
  // Create a new instance of Group
  def newGroup(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeAnalyticsUnderscoreV2Ns.SchemaNs.Group
  // Create a new instance of GroupContentDetails
  def newGroupContentDetails(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeAnalyticsUnderscoreV2Ns.SchemaNs.GroupContentDetails
  // Create a new instance of GroupItem
  def newGroupItem(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeAnalyticsUnderscoreV2Ns.SchemaNs.GroupItem
  // Create a new instance of GroupItemResource
  def newGroupItemResource(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeAnalyticsUnderscoreV2Ns.SchemaNs.GroupItemResource
  // Create a new instance of GroupSnippet
  def newGroupSnippet(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeAnalyticsUnderscoreV2Ns.SchemaNs.GroupSnippet
}

object YoutubeAnalytics_v2 {
  @scala.inline
  def apply(
    newErrorProto: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeAnalyticsUnderscoreV2Ns.SchemaNs.ErrorProto,
    newErrors: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeAnalyticsUnderscoreV2Ns.SchemaNs.Errors,
    newGroup: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeAnalyticsUnderscoreV2Ns.SchemaNs.Group,
    newGroupContentDetails: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeAnalyticsUnderscoreV2Ns.SchemaNs.GroupContentDetails,
    newGroupItem: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeAnalyticsUnderscoreV2Ns.SchemaNs.GroupItem,
    newGroupItemResource: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeAnalyticsUnderscoreV2Ns.SchemaNs.GroupItemResource,
    newGroupSnippet: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeAnalyticsUnderscoreV2Ns.SchemaNs.GroupSnippet,
    GroupItems: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeAnalyticsUnderscoreV2Ns.CollectionNs.GroupItemsCollection = null,
    Groups: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeAnalyticsUnderscoreV2Ns.CollectionNs.GroupsCollection = null,
    Reports: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeAnalyticsUnderscoreV2Ns.CollectionNs.ReportsCollection = null
  ): YoutubeAnalytics_v2 = {
    val __obj = js.Dynamic.literal(newErrorProto = js.Any.fromFunction0(newErrorProto), newErrors = js.Any.fromFunction0(newErrors), newGroup = js.Any.fromFunction0(newGroup), newGroupContentDetails = js.Any.fromFunction0(newGroupContentDetails), newGroupItem = js.Any.fromFunction0(newGroupItem), newGroupItemResource = js.Any.fromFunction0(newGroupItemResource), newGroupSnippet = js.Any.fromFunction0(newGroupSnippet))
    if (GroupItems != null) __obj.updateDynamic("GroupItems")(GroupItems)
    if (Groups != null) __obj.updateDynamic("Groups")(Groups)
    if (Reports != null) __obj.updateDynamic("Reports")(Reports)
    __obj.asInstanceOf[YoutubeAnalytics_v2]
  }
}

