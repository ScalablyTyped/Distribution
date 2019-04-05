package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DriveActivity extends js.Object {
  var Activity: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveActivityNs.CollectionNs.ActivityCollection
  ] = js.undefined
  // Create a new instance of ConsolidationStrategy
  def newConsolidationStrategy(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveActivityNs.SchemaNs.ConsolidationStrategy
  // Create a new instance of Legacy
  def newLegacy(): js.Any
  // Create a new instance of NoConsolidation
  def newNoConsolidation(): js.Any
  // Create a new instance of QueryDriveActivityRequest
  def newQueryDriveActivityRequest(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveActivityNs.SchemaNs.QueryDriveActivityRequest
}

object DriveActivity {
  @scala.inline
  def apply(
    newConsolidationStrategy: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveActivityNs.SchemaNs.ConsolidationStrategy,
    newLegacy: () => js.Any,
    newNoConsolidation: () => js.Any,
    newQueryDriveActivityRequest: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveActivityNs.SchemaNs.QueryDriveActivityRequest,
    Activity: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveActivityNs.CollectionNs.ActivityCollection = null
  ): DriveActivity = {
    val __obj = js.Dynamic.literal(newConsolidationStrategy = js.Any.fromFunction0(newConsolidationStrategy), newLegacy = js.Any.fromFunction0(newLegacy), newNoConsolidation = js.Any.fromFunction0(newNoConsolidation), newQueryDriveActivityRequest = js.Any.fromFunction0(newQueryDriveActivityRequest))
    if (Activity != null) __obj.updateDynamic("Activity")(Activity)
    __obj.asInstanceOf[DriveActivity]
  }
}

