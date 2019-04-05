package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilesCollection extends js.Object {
  // Retrieves a report file by its report ID and file ID. This method supports media download.
  def get(reportId: java.lang.String, fileId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.File = js.native
  // Lists files for a user profile.
  def list(profileId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.FileList = js.native
  // Lists files for a user profile.
  def list(profileId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.FileList = js.native
}

