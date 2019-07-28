package typings.gapiDotClientDotAndroidmanagement.gapiNs.clientNs.androidmanagementNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAndroidmanagement.Anon_AccesstokenAlt
import typings.gapiDotClientDotAndroidmanagement.Anon_AccesstokenAltBearertokenCallbackFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnrollmentTokensResource extends js.Object {
  /** Creates an enrollment token for a given enterprise. */
  def create(request: Anon_AccesstokenAltBearertokenCallbackFieldsKey): Request[EnrollmentToken]
  /** Deletes an enrollment token, which prevents future use of the token. */
  def delete(request: Anon_AccesstokenAlt): Request[js.Object]
}

object EnrollmentTokensResource {
  @scala.inline
  def apply(
    create: Anon_AccesstokenAltBearertokenCallbackFieldsKey => Request[EnrollmentToken],
    delete: Anon_AccesstokenAlt => Request[js.Object]
  ): EnrollmentTokensResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete))
  
    __obj.asInstanceOf[EnrollmentTokensResource]
  }
}

