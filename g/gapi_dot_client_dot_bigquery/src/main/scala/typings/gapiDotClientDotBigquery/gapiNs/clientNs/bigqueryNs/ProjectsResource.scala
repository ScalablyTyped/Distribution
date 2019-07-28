package typings.gapiDotClientDotBigquery.gapiNs.clientNs.bigqueryNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotBigquery.Anon_AltFields
import typings.gapiDotClientDotBigquery.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  /** Returns the email address of the service account for your project used for interactions with Google Cloud KMS. */
  def getServiceAccount(request: Anon_AltFields): Request[GetServiceAccountResponse]
  /** Lists all projects to which you have been granted any project role. */
  def list(request: Anon_AltFieldsKey): Request[ProjectList]
}

object ProjectsResource {
  @scala.inline
  def apply(
    getServiceAccount: Anon_AltFields => Request[GetServiceAccountResponse],
    list: Anon_AltFieldsKey => Request[ProjectList]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(getServiceAccount = js.Any.fromFunction1(getServiceAccount), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

