package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.CollectionNs.ManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemarketingAudienceCollection extends js.Object {
  // Gets a remarketing audience to which the user has access.
  def get(
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    remarketingAudienceId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.RemarketingAudience = js.native
  // Creates a new remarketing audience.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.RemarketingAudience,
    accountId: java.lang.String,
    webPropertyId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.RemarketingAudience = js.native
  // Lists remarketing audiences to which the user has access.
  def list(accountId: java.lang.String, webPropertyId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.RemarketingAudiences = js.native
  // Lists remarketing audiences to which the user has access.
  def list(accountId: java.lang.String, webPropertyId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.RemarketingAudiences = js.native
  // Updates an existing remarketing audience. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.RemarketingAudience,
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    remarketingAudienceId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.RemarketingAudience = js.native
  // Delete a remarketing audience.
  def remove(
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    remarketingAudienceId: java.lang.String
  ): scala.Unit = js.native
  // Updates an existing remarketing audience.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.RemarketingAudience,
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    remarketingAudienceId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.RemarketingAudience = js.native
}

