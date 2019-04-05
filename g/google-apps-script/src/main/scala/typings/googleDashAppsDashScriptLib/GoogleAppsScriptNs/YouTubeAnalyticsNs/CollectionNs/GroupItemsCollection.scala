package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupItemsCollection extends js.Object {
  // Creates a group item.
  def insert(resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.GroupItem): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.GroupItem = js.native
  // Creates a group item.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.GroupItem,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.GroupItem = js.native
  // Returns a collection of group items that match the API request parameters.
  def list(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.ListGroupItemsResponse = js.native
  // Returns a collection of group items that match the API request parameters.
  def list(optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.ListGroupItemsResponse = js.native
  // Removes an item from a group.
  def remove(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.EmptyResponse = js.native
  // Removes an item from a group.
  def remove(optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.EmptyResponse = js.native
}

