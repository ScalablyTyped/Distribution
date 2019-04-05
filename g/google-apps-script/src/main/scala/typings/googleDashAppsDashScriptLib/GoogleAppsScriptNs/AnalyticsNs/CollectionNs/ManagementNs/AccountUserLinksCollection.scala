package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.CollectionNs.ManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountUserLinksCollection extends js.Object {
  // Adds a new user to the given account.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.EntityUserLink,
    accountId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.EntityUserLink = js.native
  // Lists account-user links for a given account.
  def list(accountId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.EntityUserLinks = js.native
  // Lists account-user links for a given account.
  def list(accountId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.EntityUserLinks = js.native
  // Removes a user from the given account.
  def remove(accountId: java.lang.String, linkId: java.lang.String): scala.Unit = js.native
  // Updates permissions for an existing user on the given account.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.EntityUserLink,
    accountId: java.lang.String,
    linkId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.EntityUserLink = js.native
}

