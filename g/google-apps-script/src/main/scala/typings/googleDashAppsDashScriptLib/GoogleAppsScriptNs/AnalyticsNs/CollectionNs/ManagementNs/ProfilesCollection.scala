package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.CollectionNs.ManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfilesCollection extends js.Object {
  // Gets a view (profile) to which the user has access.
  def get(accountId: java.lang.String, webPropertyId: java.lang.String, profileId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.Profile = js.native
  // Create a new view (profile).
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.Profile,
    accountId: java.lang.String,
    webPropertyId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.Profile = js.native
  // Lists views (profiles) to which the user has access.
  def list(accountId: java.lang.String, webPropertyId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.Profiles = js.native
  // Lists views (profiles) to which the user has access.
  def list(accountId: java.lang.String, webPropertyId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.Profiles = js.native
  // Updates an existing view (profile). This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.Profile,
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    profileId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.Profile = js.native
  // Deletes a view (profile).
  def remove(accountId: java.lang.String, webPropertyId: java.lang.String, profileId: java.lang.String): scala.Unit = js.native
  // Updates an existing view (profile).
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.Profile,
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    profileId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.Profile = js.native
}

