package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectsCollection extends js.Object {
  // Returns the email address of the service account for your project used for interactions with Google Cloud KMS.
  def getServiceAccount(projectId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs.GetServiceAccountResponse = js.native
  // Lists all projects to which you have been granted any project role.
  def list(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs.ProjectList = js.native
  // Lists all projects to which you have been granted any project role.
  def list(optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs.ProjectList = js.native
}

