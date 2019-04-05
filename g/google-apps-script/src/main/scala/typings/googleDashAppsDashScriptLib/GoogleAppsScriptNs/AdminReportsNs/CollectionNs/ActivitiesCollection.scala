package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminReportsNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivitiesCollection extends js.Object {
  // Retrieves a list of activities for a specific customer and application.
  def list(userKey: java.lang.String, applicationName: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminReportsNs.SchemaNs.Activities = js.native
  // Retrieves a list of activities for a specific customer and application.
  def list(userKey: java.lang.String, applicationName: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminReportsNs.SchemaNs.Activities = js.native
  // Push changes to activities
  def watch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminReportsNs.SchemaNs.Channel,
    userKey: java.lang.String,
    applicationName: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminReportsNs.SchemaNs.Channel = js.native
  // Push changes to activities
  def watch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminReportsNs.SchemaNs.Channel,
    userKey: java.lang.String,
    applicationName: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminReportsNs.SchemaNs.Channel = js.native
}

