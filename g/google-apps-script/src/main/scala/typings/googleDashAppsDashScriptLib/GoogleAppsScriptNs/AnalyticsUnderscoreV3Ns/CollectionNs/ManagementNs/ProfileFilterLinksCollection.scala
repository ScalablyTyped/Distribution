package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.CollectionNs.ManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfileFilterLinksCollection extends js.Object {
  // Returns a single profile filter link.
  def get(
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    profileId: java.lang.String,
    linkId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.ProfileFilterLink = js.native
  // Create a new profile filter link.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.ProfileFilterLink,
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    profileId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.ProfileFilterLink = js.native
  // Lists all profile filter links for a profile.
  def list(accountId: java.lang.String, webPropertyId: java.lang.String, profileId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.ProfileFilterLinks = js.native
  // Lists all profile filter links for a profile.
  def list(
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    profileId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.ProfileFilterLinks = js.native
  // Update an existing profile filter link. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.ProfileFilterLink,
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    profileId: java.lang.String,
    linkId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.ProfileFilterLink = js.native
  // Delete a profile filter link.
  def remove(
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    profileId: java.lang.String,
    linkId: java.lang.String
  ): scala.Unit = js.native
  // Update an existing profile filter link.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.ProfileFilterLink,
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    profileId: java.lang.String,
    linkId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.ProfileFilterLink = js.native
}

