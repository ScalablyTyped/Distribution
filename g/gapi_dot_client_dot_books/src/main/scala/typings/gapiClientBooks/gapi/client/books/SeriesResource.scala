package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBooks.anon.Seriesid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesResource extends js.Object {
  var membership: MembershipResource = js.native
  /** Returns Series metadata for the given series ids. */
  def get(request: Seriesid): Request[Series] = js.native
}

object SeriesResource {
  @scala.inline
  def apply(get: Seriesid => Request[Series], membership: MembershipResource): SeriesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), membership = membership.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesResource]
  }
  @scala.inline
  implicit class SeriesResourceOps[Self <: SeriesResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Seriesid => Request[Series]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setMembership(value: MembershipResource): Self = this.set("membership", value.asInstanceOf[js.Any])
  }
  
}

