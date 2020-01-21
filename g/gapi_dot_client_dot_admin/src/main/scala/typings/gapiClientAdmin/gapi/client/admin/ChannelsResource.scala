package typings.gapiClientAdmin.gapi.client.admin

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdmin.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelsResource extends js.Object {
  /** Stop watching resources through this channel */
  def stop(request: AnonAlt): Request_[Unit]
}

object ChannelsResource {
  @scala.inline
  def apply(stop: AnonAlt => Request_[Unit]): ChannelsResource = {
    val __obj = js.Dynamic.literal(stop = js.Any.fromFunction1(stop))
  
    __obj.asInstanceOf[ChannelsResource]
  }
}

