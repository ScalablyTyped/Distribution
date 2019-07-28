package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeAnalyticsNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.EmptyResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.Group
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.ListGroupsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

