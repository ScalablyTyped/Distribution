package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  /** Returns the email address of the service account for your project used for interactions with Google Cloud KMS. */
  def getServiceAccount(request: gapiDotClientDotBigqueryLib.Anon_PrettyPrintProjectIdQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[GetServiceAccountResponse]
  /** Lists all projects to which you have been granted any project role. */
  def list(request: gapiDotClientDotBigqueryLib.Anon_MaxResultsPrettyPrintPageToken): gapiDotClientLib.gapiNs.clientNs.Request[ProjectList]
}

