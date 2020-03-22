package typings.gapiClientStorage.gapi.client.storage

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientStorage.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelsResource extends js.Object {
  /** Stop watching resources through this channel */
  def stop(request: AnonPrettyPrint): Request_[Unit]
}

object ChannelsResource {
  @scala.inline
  def apply(stop: AnonPrettyPrint => Request_[Unit]): ChannelsResource = {
    val __obj = js.Dynamic.literal(stop = js.Any.fromFunction1(stop))
  
    __obj.asInstanceOf[ChannelsResource]
  }
}

