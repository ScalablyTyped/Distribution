package typings.gapiClientAdmin.gapi.client.admin

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdmin.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelsResource extends js.Object {
  /** Stop watching resources through this channel */
  def stop(request: Alt): Request[Unit] = js.native
}

object ChannelsResource {
  @scala.inline
  def apply(stop: Alt => Request[Unit]): ChannelsResource = {
    val __obj = js.Dynamic.literal(stop = js.Any.fromFunction1(stop))
    __obj.asInstanceOf[ChannelsResource]
  }
  @scala.inline
  implicit class ChannelsResourceOps[Self <: ChannelsResource] (val x: Self) extends AnyVal {
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
    def setStop(value: Alt => Request[Unit]): Self = this.set("stop", js.Any.fromFunction1(value))
  }
  
}

