package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutube.anon.ChannelIdFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatermarksResource extends js.Object {
  /** Uploads a watermark image to YouTube and sets it for a channel. */
  def set(request: ChannelIdFields): Request[Unit]
  /** Deletes a channel's watermark image. */
  def unset(request: ChannelIdFields): Request[Unit]
}

object WatermarksResource {
  @scala.inline
  def apply(set: ChannelIdFields => Request[Unit], unset: ChannelIdFields => Request[Unit]): WatermarksResource = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction1(set), unset = js.Any.fromFunction1(unset))
    __obj.asInstanceOf[WatermarksResource]
  }
}

