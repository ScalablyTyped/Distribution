package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.CollectionNs.ManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadsCollection extends js.Object {
  // Delete data associated with a previous upload.
  def deleteUploadData(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.AnalyticsDataimportDeleteUploadDataRequest,
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    customDataSourceId: java.lang.String
  ): scala.Unit = js.native
  // List uploads to which the user has access.
  def get(
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    customDataSourceId: java.lang.String,
    uploadId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.Upload = js.native
  // List uploads to which the user has access.
  def list(accountId: java.lang.String, webPropertyId: java.lang.String, customDataSourceId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.Uploads = js.native
  // List uploads to which the user has access.
  def list(
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    customDataSourceId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.Uploads = js.native
  // Upload data for a custom data source.
  def uploadData(accountId: java.lang.String, webPropertyId: java.lang.String, customDataSourceId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.Upload = js.native
  // Upload data for a custom data source.
  def uploadData(
    accountId: java.lang.String,
    webPropertyId: java.lang.String,
    customDataSourceId: java.lang.String,
    mediaData: js.Any
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.Upload = js.native
}

