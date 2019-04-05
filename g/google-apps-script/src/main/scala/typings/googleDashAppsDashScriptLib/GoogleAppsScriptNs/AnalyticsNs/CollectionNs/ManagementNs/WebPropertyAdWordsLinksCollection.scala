package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.CollectionNs.ManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebPropertyAdWordsLinksCollection extends js.Object {
  // Returns a web property-Google Ads link to which the user has access.
  def get(
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    webPropertyAdWordsLinkId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.EntityAdWordsLink = js.native
  // Creates a webProperty-Google Ads link.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.EntityAdWordsLink,
    accountId: java.lang.String,
    webPropertyId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.EntityAdWordsLink = js.native
  // Lists webProperty-Google Ads links for a given web property.
  def list(accountId: java.lang.String, webPropertyId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.EntityAdWordsLinks = js.native
  // Lists webProperty-Google Ads links for a given web property.
  def list(accountId: java.lang.String, webPropertyId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.EntityAdWordsLinks = js.native
  // Updates an existing webProperty-Google Ads link. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.EntityAdWordsLink,
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    webPropertyAdWordsLinkId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.EntityAdWordsLink = js.native
  // Deletes a web property-Google Ads link.
  def remove(
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    webPropertyAdWordsLinkId: java.lang.String
  ): scala.Unit = js.native
  // Updates an existing webProperty-Google Ads link.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.EntityAdWordsLink,
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    webPropertyAdWordsLinkId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.EntityAdWordsLink = js.native
}

