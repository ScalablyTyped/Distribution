package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangesCollection extends js.Object {
  // Deprecated - Use changes.getStartPageToken and changes.list to retrieve recent changes.
  def get(changeId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.Change = js.native
  // Deprecated - Use changes.getStartPageToken and changes.list to retrieve recent changes.
  def get(changeId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.Change = js.native
  // Gets the starting pageToken for listing future changes.
  def getStartPageToken(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.StartPageToken = js.native
  // Gets the starting pageToken for listing future changes.
  def getStartPageToken(optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.StartPageToken = js.native
  // Lists the changes for a user or Team Drive.
  def list(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.ChangeList = js.native
  // Lists the changes for a user or Team Drive.
  def list(optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.ChangeList = js.native
  // Subscribe to changes for a user.
  def watch(resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.Channel): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.Channel = js.native
  // Subscribe to changes for a user.
  def watch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.Channel,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs.Channel = js.native
}

