package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.CollectionNs.ManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnsampledReportsCollection extends js.Object {
  // Returns a single unsampled report.
  def get(
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    profileId: java.lang.String,
    unsampledReportId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.UnsampledReport = js.native
  // Create a new unsampled report.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.UnsampledReport,
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    profileId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.UnsampledReport = js.native
  // Lists unsampled reports to which the user has access.
  def list(accountId: java.lang.String, webPropertyId: java.lang.String, profileId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.UnsampledReports = js.native
  // Lists unsampled reports to which the user has access.
  def list(
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    profileId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.UnsampledReports = js.native
  // Deletes an unsampled report.
  def remove(
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    profileId: java.lang.String,
    unsampledReportId: java.lang.String
  ): scala.Unit = js.native
}

