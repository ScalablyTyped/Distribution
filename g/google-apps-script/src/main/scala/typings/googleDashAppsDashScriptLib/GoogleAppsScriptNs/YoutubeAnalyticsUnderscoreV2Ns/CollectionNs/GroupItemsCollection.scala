package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeAnalyticsUnderscoreV2Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupItemsCollection extends js.Object {
  // Creates a group item.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeAnalyticsUnderscoreV2Ns.SchemaNs.GroupItem
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeAnalyticsUnderscoreV2Ns.SchemaNs.GroupItem = js.native
  // Creates a group item.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeAnalyticsUnderscoreV2Ns.SchemaNs.GroupItem,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeAnalyticsUnderscoreV2Ns.SchemaNs.GroupItem = js.native
  // Returns a collection of group items that match the API request parameters.
  def list(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeAnalyticsUnderscoreV2Ns.SchemaNs.ListGroupItemsResponse = js.native
  // Returns a collection of group items that match the API request parameters.
  def list(optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeAnalyticsUnderscoreV2Ns.SchemaNs.ListGroupItemsResponse = js.native
  // Removes an item from a group.
  def remove(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeAnalyticsUnderscoreV2Ns.SchemaNs.EmptyResponse = js.native
  // Removes an item from a group.
  def remove(optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeAnalyticsUnderscoreV2Ns.SchemaNs.EmptyResponse = js.native
}

