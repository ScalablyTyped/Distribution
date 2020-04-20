package typings.gapiClientBigquery.gapi.client.bigquery

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBigquery.AnonFields
import typings.gapiClientBigquery.AnonMaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  /** Returns the email address of the service account for your project used for interactions with Google Cloud KMS. */
  def getServiceAccount(request: AnonFields): Request_[GetServiceAccountResponse]
  /** Lists all projects to which you have been granted any project role. */
  def list(request: AnonMaxResults): Request_[ProjectList]
}

object ProjectsResource {
  @scala.inline
  def apply(
    getServiceAccount: AnonFields => Request_[GetServiceAccountResponse],
    list: AnonMaxResults => Request_[ProjectList]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(getServiceAccount = js.Any.fromFunction1(getServiceAccount), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ProjectsResource]
  }
}

