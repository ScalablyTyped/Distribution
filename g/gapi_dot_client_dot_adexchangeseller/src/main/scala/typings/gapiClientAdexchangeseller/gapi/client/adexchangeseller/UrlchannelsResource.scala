package typings.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangeseller.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlchannelsResource extends js.Object {
  /** List all URL channels in the specified ad client for this Ad Exchange account. */
  def list(request: Fields): Request[UrlChannels] = js.native
}

object UrlchannelsResource {
  @scala.inline
  def apply(list: Fields => Request[UrlChannels]): UrlchannelsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[UrlchannelsResource]
  }
  @scala.inline
  implicit class UrlchannelsResourceOps[Self <: UrlchannelsResource] (val x: Self) extends AnyVal {
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
    def setList(value: Fields => Request[UrlChannels]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

