package typings.gapiClientCustomsearch.gapi.client.customsearch

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCustomsearch.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CseResource extends js.Object {
  /** Returns metadata about the search performed, metadata about the custom search engine used for the search, and the search results. */
  def list(request: Alt): Request[Search] = js.native
}

object CseResource {
  @scala.inline
  def apply(list: Alt => Request[Search]): CseResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[CseResource]
  }
  @scala.inline
  implicit class CseResourceOps[Self <: CseResource] (val x: Self) extends AnyVal {
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
    def setList(value: Alt => Request[Search]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

