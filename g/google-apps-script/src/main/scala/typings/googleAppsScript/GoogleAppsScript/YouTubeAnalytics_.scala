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

@js.native
trait YouTubeAnalytics_ extends js.Object {
  var GroupItems: js.UndefOr[GroupItemsCollection] = js.native
  var Groups: js.UndefOr[GroupsCollection] = js.native
  var Reports: js.UndefOr[ReportsCollection] = js.native
  // Create a new instance of ErrorProto
  def newErrorProto(): ErrorProto = js.native
  // Create a new instance of Errors
  def newErrors(): Errors = js.native
  // Create a new instance of Group
  def newGroup(): Group = js.native
  // Create a new instance of GroupContentDetails
  def newGroupContentDetails(): GroupContentDetails = js.native
  // Create a new instance of GroupItem
  def newGroupItem(): GroupItem = js.native
  // Create a new instance of GroupItemResource
  def newGroupItemResource(): GroupItemResource = js.native
  // Create a new instance of GroupSnippet
  def newGroupSnippet(): GroupSnippet = js.native
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
    newGroupSnippet: () => GroupSnippet
  ): YouTubeAnalytics_ = {
    val __obj = js.Dynamic.literal(newErrorProto = js.Any.fromFunction0(newErrorProto), newErrors = js.Any.fromFunction0(newErrors), newGroup = js.Any.fromFunction0(newGroup), newGroupContentDetails = js.Any.fromFunction0(newGroupContentDetails), newGroupItem = js.Any.fromFunction0(newGroupItem), newGroupItemResource = js.Any.fromFunction0(newGroupItemResource), newGroupSnippet = js.Any.fromFunction0(newGroupSnippet))
    __obj.asInstanceOf[YouTubeAnalytics_]
  }
  @scala.inline
  implicit class YouTubeAnalytics_Ops[Self <: YouTubeAnalytics_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNewErrorProto(value: () => ErrorProto): Self = this.set("newErrorProto", js.Any.fromFunction0(value))
    @scala.inline
    def setNewErrors(value: () => Errors): Self = this.set("newErrors", js.Any.fromFunction0(value))
    @scala.inline
    def setNewGroup(value: () => Group): Self = this.set("newGroup", js.Any.fromFunction0(value))
    @scala.inline
    def setNewGroupContentDetails(value: () => GroupContentDetails): Self = this.set("newGroupContentDetails", js.Any.fromFunction0(value))
    @scala.inline
    def setNewGroupItem(value: () => GroupItem): Self = this.set("newGroupItem", js.Any.fromFunction0(value))
    @scala.inline
    def setNewGroupItemResource(value: () => GroupItemResource): Self = this.set("newGroupItemResource", js.Any.fromFunction0(value))
    @scala.inline
    def setNewGroupSnippet(value: () => GroupSnippet): Self = this.set("newGroupSnippet", js.Any.fromFunction0(value))
    @scala.inline
    def setGroupItems(value: GroupItemsCollection): Self = this.set("GroupItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupItems: Self = this.set("GroupItems", js.undefined)
    @scala.inline
    def setGroups(value: GroupsCollection): Self = this.set("Groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("Groups", js.undefined)
    @scala.inline
    def setReports(value: ReportsCollection): Self = this.set("Reports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReports: Self = this.set("Reports", js.undefined)
  }
  
}

