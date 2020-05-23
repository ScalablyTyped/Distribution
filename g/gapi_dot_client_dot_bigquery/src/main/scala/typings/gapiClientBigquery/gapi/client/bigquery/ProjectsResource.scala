package typings.gapiClientBigquery.gapi.client.bigquery

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBigquery.anon.Fields
import typings.gapiClientBigquery.anon.MaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  /** Returns the email address of the service account for your project used for interactions with Google Cloud KMS. */
  def getServiceAccount(request: Fields): Request[GetServiceAccountResponse]
  /** Lists all projects to which you have been granted any project role. */
  def list(request: MaxResults): Request[ProjectList]
}

object ProjectsResource {
  @scala.inline
  def apply(
    getServiceAccount: Fields => Request[GetServiceAccountResponse],
    list: MaxResults => Request[ProjectList]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(getServiceAccount = js.Any.fromFunction1(getServiceAccount), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ProjectsResource]
  }
}

