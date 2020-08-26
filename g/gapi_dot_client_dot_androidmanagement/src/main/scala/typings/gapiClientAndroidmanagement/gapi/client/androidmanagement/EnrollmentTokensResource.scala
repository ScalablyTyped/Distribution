package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidmanagement.anon.Alt
import typings.gapiClientAndroidmanagement.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnrollmentTokensResource extends js.Object {
  /** Creates an enrollment token for a given enterprise. */
  def create(request: Key): Request[EnrollmentToken] = js.native
  /** Deletes an enrollment token, which prevents future use of the token. */
  def delete(request: Alt): Request[js.Object] = js.native
}

object EnrollmentTokensResource {
  @scala.inline
  def apply(create: Key => Request[EnrollmentToken], delete: Alt => Request[js.Object]): EnrollmentTokensResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete))
    __obj.asInstanceOf[EnrollmentTokensResource]
  }
  @scala.inline
  implicit class EnrollmentTokensResourceOps[Self <: EnrollmentTokensResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(value: Key => Request[EnrollmentToken]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Alt => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
  }
  
}

