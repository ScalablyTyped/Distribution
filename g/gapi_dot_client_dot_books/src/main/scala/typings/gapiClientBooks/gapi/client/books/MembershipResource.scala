package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBooks.anon.Pagesize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MembershipResource extends js.Object {
  /** Returns Series membership data given the series id. */
  def get(request: Pagesize): Request[Seriesmembership] = js.native
}

object MembershipResource {
  @scala.inline
  def apply(get: Pagesize => Request[Seriesmembership]): MembershipResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[MembershipResource]
  }
  @scala.inline
  implicit class MembershipResourceOps[Self <: MembershipResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Pagesize => Request[Seriesmembership]): Self = this.set("get", js.Any.fromFunction1(value))
  }
  
}

