package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidmanagement.anon.CallbackUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignupUrlsResource extends js.Object {
  /** Creates an enterprise signup URL. */
  def create(request: CallbackUrl): Request[SignupUrl] = js.native
}

object SignupUrlsResource {
  @scala.inline
  def apply(create: CallbackUrl => Request[SignupUrl]): SignupUrlsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[SignupUrlsResource]
  }
  @scala.inline
  implicit class SignupUrlsResourceOps[Self <: SignupUrlsResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: CallbackUrl => Request[SignupUrl]): Self = this.set("create", js.Any.fromFunction1(value))
  }
  
}

