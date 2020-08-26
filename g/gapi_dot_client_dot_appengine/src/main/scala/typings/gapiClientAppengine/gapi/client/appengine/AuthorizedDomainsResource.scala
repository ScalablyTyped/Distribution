package typings.gapiClientAppengine.gapi.client.appengine

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAppengine.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizedDomainsResource extends js.Object {
  /** Lists all domains the user is authorized to administer. */
  def list(request: Callback): Request[ListAuthorizedDomainsResponse] = js.native
}

object AuthorizedDomainsResource {
  @scala.inline
  def apply(list: Callback => Request[ListAuthorizedDomainsResponse]): AuthorizedDomainsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AuthorizedDomainsResource]
  }
  @scala.inline
  implicit class AuthorizedDomainsResourceOps[Self <: AuthorizedDomainsResource] (val x: Self) extends AnyVal {
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
    def setList(value: Callback => Request[ListAuthorizedDomainsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

