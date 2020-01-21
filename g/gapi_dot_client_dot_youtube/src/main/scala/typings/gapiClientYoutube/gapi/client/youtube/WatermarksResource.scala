package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutube.AnonAltChannelIdFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatermarksResource extends js.Object {
  /** Uploads a watermark image to YouTube and sets it for a channel. */
  def set(request: AnonAltChannelIdFieldsKey): Request_[Unit]
  /** Deletes a channel's watermark image. */
  def unset(request: AnonAltChannelIdFieldsKey): Request_[Unit]
}

object WatermarksResource {
  @scala.inline
  def apply(
    set: AnonAltChannelIdFieldsKey => Request_[Unit],
    unset: AnonAltChannelIdFieldsKey => Request_[Unit]
  ): WatermarksResource = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction1(set), unset = js.Any.fromFunction1(unset))
  
    __obj.asInstanceOf[WatermarksResource]
  }
}

