package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowsersResource extends js.Object {
  /** Retrieves a list of browsers. */
  def list(request: Key): Request[BrowsersListResponse] = js.native
}

object BrowsersResource {
  @scala.inline
  def apply(list: Key => Request[BrowsersListResponse]): BrowsersResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[BrowsersResource]
  }
  @scala.inline
  implicit class BrowsersResourceOps[Self <: BrowsersResource] (val x: Self) extends AnyVal {
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
    def setList(value: Key => Request[BrowsersListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

