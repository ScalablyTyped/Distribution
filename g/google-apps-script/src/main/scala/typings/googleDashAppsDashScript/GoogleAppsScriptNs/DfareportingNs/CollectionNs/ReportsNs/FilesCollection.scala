package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.CollectionNs.ReportsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs.File
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs.FileList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilesCollection extends js.Object {
  // Retrieves a report file. This method supports media download.
  def get(profileId: String, reportId: String, fileId: String): File = js.native
  // Lists files for a report.
  def list(profileId: String, reportId: String): FileList = js.native
  // Lists files for a report.
  def list(profileId: String, reportId: String, optionalArgs: js.Object): FileList = js.native
}

