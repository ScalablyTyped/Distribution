package typings.googleDashAppsDashScript.GoogleAppsScriptNs.BigqueryNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BigqueryNs.SchemaNs.GetServiceAccountResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BigqueryNs.SchemaNs.ProjectList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectsCollection extends js.Object {
  // Returns the email address of the service account for your project used for interactions with Google Cloud KMS.
  def getServiceAccount(projectId: String): GetServiceAccountResponse = js.native
  // Lists all projects to which you have been granted any project role.
  def list(): ProjectList = js.native
  // Lists all projects to which you have been granted any project role.
  def list(optionalArgs: js.Object): ProjectList = js.native
}

