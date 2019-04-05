package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.CollectionNs.ManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfileUserLinksCollection extends js.Object {
  // Adds a new user to the given view (profile).
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.EntityUserLink,
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    profileId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.EntityUserLink = js.native
  // Lists profile-user links for a given view (profile).
  def list(accountId: java.lang.String, webPropertyId: java.lang.String, profileId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.EntityUserLinks = js.native
  // Lists profile-user links for a given view (profile).
  def list(
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    profileId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.EntityUserLinks = js.native
  // Removes a user from the given view (profile).
  def remove(
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    profileId: java.lang.String,
    linkId: java.lang.String
  ): scala.Unit = js.native
  // Updates permissions for an existing user on the given view (profile).
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.EntityUserLink,
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    profileId: java.lang.String,
    linkId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.EntityUserLink = js.native
}

