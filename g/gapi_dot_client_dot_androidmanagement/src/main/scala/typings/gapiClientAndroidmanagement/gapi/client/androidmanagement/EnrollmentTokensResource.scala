package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidmanagement.anon.Alt
import typings.gapiClientAndroidmanagement.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnrollmentTokensResource extends js.Object {
  /** Creates an enrollment token for a given enterprise. */
  def create(request: Key): Request[EnrollmentToken]
  /** Deletes an enrollment token, which prevents future use of the token. */
  def delete(request: Alt): Request[js.Object]
}

object EnrollmentTokensResource {
  @scala.inline
  def apply(create: Key => Request[EnrollmentToken], delete: Alt => Request[js.Object]): EnrollmentTokensResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete))
    __obj.asInstanceOf[EnrollmentTokensResource]
  }
}

