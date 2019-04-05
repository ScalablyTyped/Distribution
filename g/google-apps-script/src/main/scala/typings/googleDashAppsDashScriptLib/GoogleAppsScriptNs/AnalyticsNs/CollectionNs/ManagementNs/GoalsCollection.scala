package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.CollectionNs.ManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoalsCollection extends js.Object {
  // Gets a goal to which the user has access.
  def get(
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    profileId: java.lang.String,
    goalId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.Goal = js.native
  // Create a new goal.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.Goal,
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    profileId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.Goal = js.native
  // Lists goals to which the user has access.
  def list(accountId: java.lang.String, webPropertyId: java.lang.String, profileId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.Goals = js.native
  // Lists goals to which the user has access.
  def list(
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    profileId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.Goals = js.native
  // Updates an existing goal. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.Goal,
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    profileId: java.lang.String,
    goalId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.Goal = js.native
  // Updates an existing goal.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.Goal,
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    profileId: java.lang.String,
    goalId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.Goal = js.native
}

