package typings.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangeseller.anon.AdClientId
import typings.gapiClientAdexchangeseller.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomchannelsResource extends js.Object {
  /** Get the specified custom channel from the specified ad client. */
  def get(request: AdClientId): Request[CustomChannel] = js.native
  /** List all custom channels in the specified ad client for this Ad Exchange account. */
  def list(request: Fields): Request[CustomChannels] = js.native
}

object CustomchannelsResource {
  @scala.inline
  def apply(get: AdClientId => Request[CustomChannel], list: Fields => Request[CustomChannels]): CustomchannelsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[CustomchannelsResource]
  }
  @scala.inline
  implicit class CustomchannelsResourceOps[Self <: CustomchannelsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: AdClientId => Request[CustomChannel]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Fields => Request[CustomChannels]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

