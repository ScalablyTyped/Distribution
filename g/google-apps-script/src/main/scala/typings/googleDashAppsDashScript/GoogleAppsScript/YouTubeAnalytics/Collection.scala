package typings.googleDashAppsDashScript.GoogleAppsScript.YouTubeAnalytics

import typings.googleDashAppsDashScript.GoogleAppsScript.YouTubeAnalytics.Schema.EmptyResponse
import typings.googleDashAppsDashScript.GoogleAppsScript.YouTubeAnalytics.Schema.Group
import typings.googleDashAppsDashScript.GoogleAppsScript.YouTubeAnalytics.Schema.GroupItem
import typings.googleDashAppsDashScript.GoogleAppsScript.YouTubeAnalytics.Schema.ListGroupItemsResponse
import typings.googleDashAppsDashScript.GoogleAppsScript.YouTubeAnalytics.Schema.ListGroupsResponse
import typings.googleDashAppsDashScript.GoogleAppsScript.YouTubeAnalytics.Schema.QueryResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GoogleAppsScript.YouTubeAnalytics.Collection")
@js.native
object Collection extends js.Object {
  @js.native
  trait GroupItemsCollection extends js.Object {
    // Creates a group item.
    def insert(resource: GroupItem): GroupItem = js.native
    // Creates a group item.
    def insert(resource: GroupItem, optionalArgs: js.Object): GroupItem = js.native
    // Returns a collection of group items that match the API request parameters.
    def list(): ListGroupItemsResponse = js.native
    // Returns a collection of group items that match the API request parameters.
    def list(optionalArgs: js.Object): ListGroupItemsResponse = js.native
    // Removes an item from a group.
    def remove(): EmptyResponse = js.native
    // Removes an item from a group.
    def remove(optionalArgs: js.Object): EmptyResponse = js.native
  }
  
  @js.native
  trait GroupsCollection extends js.Object {
    // Creates a group.
    def insert(resource: Group): Group = js.native
    // Creates a group.
    def insert(resource: Group, optionalArgs: js.Object): Group = js.native
    // Returns a collection of groups that match the API request parameters. For
    // example, you can retrieve all groups that the authenticated user owns,
    // or you can retrieve one or more groups by their unique IDs.
    def list(): ListGroupsResponse = js.native
    // Returns a collection of groups that match the API request parameters. For
    // example, you can retrieve all groups that the authenticated user owns,
    // or you can retrieve one or more groups by their unique IDs.
    def list(optionalArgs: js.Object): ListGroupsResponse = js.native
    // Deletes a group.
    def remove(): EmptyResponse = js.native
    // Deletes a group.
    def remove(optionalArgs: js.Object): EmptyResponse = js.native
    // Modifies a group. For example, you could change a group's title.
    def update(resource: Group): Group = js.native
    // Modifies a group. For example, you could change a group's title.
    def update(resource: Group, optionalArgs: js.Object): Group = js.native
  }
  
  @js.native
  trait ReportsCollection extends js.Object {
    // Retrieve your YouTube Analytics reports.
    def query(): QueryResponse = js.native
    // Retrieve your YouTube Analytics reports.
    def query(optionalArgs: js.Object): QueryResponse = js.native
  }
  
}

