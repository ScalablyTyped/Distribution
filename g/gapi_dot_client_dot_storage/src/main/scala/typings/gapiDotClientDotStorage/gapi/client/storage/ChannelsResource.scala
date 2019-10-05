package typings.gapiDotClientDotStorage.gapi.client.storage

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotStorage.Anon_AltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelsResource extends js.Object {
  /** Stop watching resources through this channel */
  def stop(request: Anon_AltFieldsKeyOauthtoken): Request[Unit]
}

object ChannelsResource {
  @scala.inline
  def apply(stop: Anon_AltFieldsKeyOauthtoken => Request[Unit]): ChannelsResource = {
    val __obj = js.Dynamic.literal(stop = js.Any.fromFunction1(stop))
  
    __obj.asInstanceOf[ChannelsResource]
  }
}

