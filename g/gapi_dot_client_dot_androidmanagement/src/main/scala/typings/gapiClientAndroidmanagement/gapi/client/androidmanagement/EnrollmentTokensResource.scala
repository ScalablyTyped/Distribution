package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidmanagement.AnonAccesstokenAlt
import typings.gapiClientAndroidmanagement.AnonAccesstokenAltBearertokenCallbackFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnrollmentTokensResource extends js.Object {
  /** Creates an enrollment token for a given enterprise. */
  def create(request: AnonAccesstokenAltBearertokenCallbackFieldsKey): Request_[EnrollmentToken]
  /** Deletes an enrollment token, which prevents future use of the token. */
  def delete(request: AnonAccesstokenAlt): Request_[js.Object]
}

object EnrollmentTokensResource {
  @scala.inline
  def apply(
    create: AnonAccesstokenAltBearertokenCallbackFieldsKey => Request_[EnrollmentToken],
    delete: AnonAccesstokenAlt => Request_[js.Object]
  ): EnrollmentTokensResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete))
  
    __obj.asInstanceOf[EnrollmentTokensResource]
  }
}

