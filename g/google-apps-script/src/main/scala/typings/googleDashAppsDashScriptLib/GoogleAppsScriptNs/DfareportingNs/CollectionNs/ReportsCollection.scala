package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportsCollection extends js.Object {
  var CompatibleFields: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.CollectionNs.ReportsNs.CompatibleFieldsCollection
  ] = js.native
  var Files: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.CollectionNs.ReportsNs.FilesCollection
  ] = js.native
  // Retrieves a report by its ID.
  def get(profileId: java.lang.String, reportId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.Report = js.native
  // Creates a report.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.Report,
    profileId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.Report = js.native
  // Retrieves list of reports.
  def list(profileId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.ReportList = js.native
  // Retrieves list of reports.
  def list(profileId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.ReportList = js.native
  // Updates a report. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.Report,
    profileId: java.lang.String,
    reportId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.Report = js.native
  // Deletes a report by its ID.
  def remove(profileId: java.lang.String, reportId: java.lang.String): scala.Unit = js.native
  // Runs a report.
  def run(profileId: java.lang.String, reportId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.File = js.native
  // Runs a report.
  def run(profileId: java.lang.String, reportId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.File = js.native
  // Updates a report.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.Report,
    profileId: java.lang.String,
    reportId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.Report = js.native
}

