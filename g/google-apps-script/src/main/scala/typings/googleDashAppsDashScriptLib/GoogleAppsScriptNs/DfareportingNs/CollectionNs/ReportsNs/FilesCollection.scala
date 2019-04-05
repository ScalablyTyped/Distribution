package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.CollectionNs.ReportsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilesCollection extends js.Object {
  // Retrieves a report file. This method supports media download.
  def get(profileId: java.lang.String, reportId: java.lang.String, fileId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.File = js.native
  // Lists files for a report.
  def list(profileId: java.lang.String, reportId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.FileList = js.native
  // Lists files for a report.
  def list(profileId: java.lang.String, reportId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.FileList = js.native
}

