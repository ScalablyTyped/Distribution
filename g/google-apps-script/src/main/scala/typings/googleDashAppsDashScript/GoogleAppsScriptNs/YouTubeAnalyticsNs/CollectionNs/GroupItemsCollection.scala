package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeAnalyticsNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.EmptyResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.GroupItem
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.ListGroupItemsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

