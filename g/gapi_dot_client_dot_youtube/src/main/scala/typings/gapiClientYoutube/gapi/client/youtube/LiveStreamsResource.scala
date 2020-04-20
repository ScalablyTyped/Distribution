package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutube.AnonAltFields
import typings.gapiClientYoutube.AnonMine
import typings.gapiClientYoutube.AnonOnBehalfOfContentOwnerChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveStreamsResource extends js.Object {
  /** Deletes a video stream. */
  def delete(request: AnonAltFields): Request_[Unit]
  /** Creates a video stream. The stream enables you to send your video to YouTube, which can then broadcast the video to your audience. */
  def insert(request: AnonOnBehalfOfContentOwnerChannel): Request_[LiveStream]
  /** Returns a list of video streams that match the API request parameters. */
  def list(request: AnonMine): Request_[LiveStreamListResponse]
  /** Updates a video stream. If the properties that you want to change cannot be updated, then you need to create a new stream with the proper settings. */
  def update(request: AnonOnBehalfOfContentOwnerChannel): Request_[LiveStream]
}

object LiveStreamsResource {
  @scala.inline
  def apply(
    delete: AnonAltFields => Request_[Unit],
    insert: AnonOnBehalfOfContentOwnerChannel => Request_[LiveStream],
    list: AnonMine => Request_[LiveStreamListResponse],
    update: AnonOnBehalfOfContentOwnerChannel => Request_[LiveStream]
  ): LiveStreamsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[LiveStreamsResource]
  }
}

