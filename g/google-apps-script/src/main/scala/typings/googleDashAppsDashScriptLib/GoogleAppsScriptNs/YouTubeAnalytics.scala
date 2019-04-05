package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YouTubeAnalytics extends js.Object {
  var GroupItems: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.CollectionNs.GroupItemsCollection
  ] = js.undefined
  var Groups: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.CollectionNs.GroupsCollection
  ] = js.undefined
  var Reports: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.CollectionNs.ReportsCollection
  ] = js.undefined
  // Create a new instance of ErrorProto
  def newErrorProto(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.ErrorProto
  // Create a new instance of Errors
  def newErrors(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.Errors
  // Create a new instance of Group
  def newGroup(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.Group
  // Create a new instance of GroupContentDetails
  def newGroupContentDetails(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.GroupContentDetails
  // Create a new instance of GroupItem
  def newGroupItem(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.GroupItem
  // Create a new instance of GroupItemResource
  def newGroupItemResource(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.GroupItemResource
  // Create a new instance of GroupSnippet
  def newGroupSnippet(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.GroupSnippet
}

object YouTubeAnalytics {
  @scala.inline
  def apply(
    newErrorProto: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.ErrorProto,
    newErrors: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.Errors,
    newGroup: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.Group,
    newGroupContentDetails: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.GroupContentDetails,
    newGroupItem: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.GroupItem,
    newGroupItemResource: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.GroupItemResource,
    newGroupSnippet: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.GroupSnippet,
    GroupItems: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.CollectionNs.GroupItemsCollection = null,
    Groups: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.CollectionNs.GroupsCollection = null,
    Reports: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.CollectionNs.ReportsCollection = null
  ): YouTubeAnalytics = {
    val __obj = js.Dynamic.literal(newErrorProto = js.Any.fromFunction0(newErrorProto), newErrors = js.Any.fromFunction0(newErrors), newGroup = js.Any.fromFunction0(newGroup), newGroupContentDetails = js.Any.fromFunction0(newGroupContentDetails), newGroupItem = js.Any.fromFunction0(newGroupItem), newGroupItemResource = js.Any.fromFunction0(newGroupItemResource), newGroupSnippet = js.Any.fromFunction0(newGroupSnippet))
    if (GroupItems != null) __obj.updateDynamic("GroupItems")(GroupItems)
    if (Groups != null) __obj.updateDynamic("Groups")(Groups)
    if (Reports != null) __obj.updateDynamic("Reports")(Reports)
    __obj.asInstanceOf[YouTubeAnalytics]
  }
}

