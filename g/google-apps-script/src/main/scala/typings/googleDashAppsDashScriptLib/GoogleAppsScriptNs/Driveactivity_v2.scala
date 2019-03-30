package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Driveactivity_v2 extends js.Object {
  var Activity: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveactivityUnderscoreV2Ns.CollectionNs.ActivityCollection
  ] = js.undefined
  // Create a new instance of ConsolidationStrategy
  def newConsolidationStrategy(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveactivityUnderscoreV2Ns.SchemaNs.ConsolidationStrategy
  // Create a new instance of Legacy
  def newLegacy(): js.Any
  // Create a new instance of NoConsolidation
  def newNoConsolidation(): js.Any
  // Create a new instance of QueryDriveActivityRequest
  def newQueryDriveActivityRequest(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveactivityUnderscoreV2Ns.SchemaNs.QueryDriveActivityRequest
}

object Driveactivity_v2 {
  @scala.inline
  def apply(
    newConsolidationStrategy: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveactivityUnderscoreV2Ns.SchemaNs.ConsolidationStrategy,
    newLegacy: () => js.Any,
    newNoConsolidation: () => js.Any,
    newQueryDriveActivityRequest: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveactivityUnderscoreV2Ns.SchemaNs.QueryDriveActivityRequest,
    Activity: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveactivityUnderscoreV2Ns.CollectionNs.ActivityCollection = null
  ): Driveactivity_v2 = {
    val __obj = js.Dynamic.literal(newConsolidationStrategy = js.Any.fromFunction0(newConsolidationStrategy), newLegacy = js.Any.fromFunction0(newLegacy), newNoConsolidation = js.Any.fromFunction0(newNoConsolidation), newQueryDriveActivityRequest = js.Any.fromFunction0(newQueryDriveActivityRequest))
    if (Activity != null) __obj.updateDynamic("Activity")(Activity)
    __obj.asInstanceOf[Driveactivity_v2]
  }
}

