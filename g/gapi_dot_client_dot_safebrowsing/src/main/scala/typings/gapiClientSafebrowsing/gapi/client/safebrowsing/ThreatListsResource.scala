package typings.gapiClientSafebrowsing.gapi.client.safebrowsing

import typings.gapiClient.gapi.client.Request
import typings.gapiClientSafebrowsing.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreatListsResource extends js.Object {
  /** Lists the Safe Browsing threat lists available for download. */
  def list(request: Alt): Request[ListThreatListsResponse] = js.native
}

object ThreatListsResource {
  @scala.inline
  def apply(list: Alt => Request[ListThreatListsResponse]): ThreatListsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ThreatListsResource]
  }
  @scala.inline
  implicit class ThreatListsResourceOps[Self <: ThreatListsResource] (val x: Self) extends AnyVal {
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
    def setList(value: Alt => Request[ListThreatListsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

