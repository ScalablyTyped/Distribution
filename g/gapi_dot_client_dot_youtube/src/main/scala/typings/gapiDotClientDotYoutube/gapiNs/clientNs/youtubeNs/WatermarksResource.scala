package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotYoutube.Anon_AltChannelIdFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatermarksResource extends js.Object {
  /** Uploads a watermark image to YouTube and sets it for a channel. */
  def set(request: Anon_AltChannelIdFieldsKey): Request[Unit]
  /** Deletes a channel's watermark image. */
  def unset(request: Anon_AltChannelIdFieldsKey): Request[Unit]
}

object WatermarksResource {
  @scala.inline
  def apply(
    set: Anon_AltChannelIdFieldsKey => Request[Unit],
    unset: Anon_AltChannelIdFieldsKey => Request[Unit]
  ): WatermarksResource = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction1(set), unset = js.Any.fromFunction1(unset))
  
    __obj.asInstanceOf[WatermarksResource]
  }
}

