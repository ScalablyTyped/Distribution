package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Collection.GroupItemsCollection
import typings.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Collection.GroupsCollection
import typings.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Collection.ReportsCollection
import typings.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema.ErrorProto
import typings.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema.Errors
import typings.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema.Group
import typings.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema.GroupContentDetails
import typings.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema.GroupItem
import typings.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema.GroupItemResource
import typings.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema.GroupSnippet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YouTubeAnalytics_ extends js.Object {
  var GroupItems: js.UndefOr[GroupItemsCollection] = js.undefined
  var Groups: js.UndefOr[GroupsCollection] = js.undefined
  var Reports: js.UndefOr[ReportsCollection] = js.undefined
  // Create a new instance of ErrorProto
  def newErrorProto(): ErrorProto
  // Create a new instance of Errors
  def newErrors(): Errors
  // Create a new instance of Group
  def newGroup(): Group
  // Create a new instance of GroupContentDetails
  def newGroupContentDetails(): GroupContentDetails
  // Create a new instance of GroupItem
  def newGroupItem(): GroupItem
  // Create a new instance of GroupItemResource
  def newGroupItemResource(): GroupItemResource
  // Create a new instance of GroupSnippet
  def newGroupSnippet(): GroupSnippet
}

object YouTubeAnalytics_ {
  @scala.inline
  def apply(
    newErrorProto: () => ErrorProto,
    newErrors: () => Errors,
    newGroup: () => Group,
    newGroupContentDetails: () => GroupContentDetails,
    newGroupItem: () => GroupItem,
    newGroupItemResource: () => GroupItemResource,
    newGroupSnippet: () => GroupSnippet,
    GroupItems: GroupItemsCollection = null,
    Groups: GroupsCollection = null,
    Reports: ReportsCollection = null
  ): YouTubeAnalytics_ = {
    val __obj = js.Dynamic.literal(newErrorProto = js.Any.fromFunction0(newErrorProto), newErrors = js.Any.fromFunction0(newErrors), newGroup = js.Any.fromFunction0(newGroup), newGroupContentDetails = js.Any.fromFunction0(newGroupContentDetails), newGroupItem = js.Any.fromFunction0(newGroupItem), newGroupItemResource = js.Any.fromFunction0(newGroupItemResource), newGroupSnippet = js.Any.fromFunction0(newGroupSnippet))
    if (GroupItems != null) __obj.updateDynamic("GroupItems")(GroupItems.asInstanceOf[js.Any])
    if (Groups != null) __obj.updateDynamic("Groups")(Groups.asInstanceOf[js.Any])
    if (Reports != null) __obj.updateDynamic("Reports")(Reports.asInstanceOf[js.Any])
    __obj.asInstanceOf[YouTubeAnalytics_]
  }
}

