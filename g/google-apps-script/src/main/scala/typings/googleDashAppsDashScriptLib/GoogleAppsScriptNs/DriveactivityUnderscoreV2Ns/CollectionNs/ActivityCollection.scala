package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveactivityUnderscoreV2Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityCollection extends js.Object {
  // Query past activity in Google Drive.
  def query(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveactivityUnderscoreV2Ns.SchemaNs.QueryDriveActivityRequest
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveactivityUnderscoreV2Ns.SchemaNs.QueryDriveActivityResponse
}

object ActivityCollection {
  @scala.inline
  def apply(
    query: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveactivityUnderscoreV2Ns.SchemaNs.QueryDriveActivityRequest => googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveactivityUnderscoreV2Ns.SchemaNs.QueryDriveActivityResponse
  ): ActivityCollection = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
  
    __obj.asInstanceOf[ActivityCollection]
  }
}

