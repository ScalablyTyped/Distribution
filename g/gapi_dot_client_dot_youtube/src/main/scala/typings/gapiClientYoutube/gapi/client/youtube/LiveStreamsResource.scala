package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutube.anon.AltFields
import typings.gapiClientYoutube.anon.Mine
import typings.gapiClientYoutube.anon.OnBehalfOfContentOwnerChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveStreamsResource extends js.Object {
  /** Deletes a video stream. */
  def delete(request: AltFields): Request[Unit]
  /** Creates a video stream. The stream enables you to send your video to YouTube, which can then broadcast the video to your audience. */
  def insert(request: OnBehalfOfContentOwnerChannel): Request[LiveStream]
  /** Returns a list of video streams that match the API request parameters. */
  def list(request: Mine): Request[LiveStreamListResponse]
  /** Updates a video stream. If the properties that you want to change cannot be updated, then you need to create a new stream with the proper settings. */
  def update(request: OnBehalfOfContentOwnerChannel): Request[LiveStream]
}

object LiveStreamsResource {
  @scala.inline
  def apply(
    delete: AltFields => Request[Unit],
    insert: OnBehalfOfContentOwnerChannel => Request[LiveStream],
    list: Mine => Request[LiveStreamListResponse],
    update: OnBehalfOfContentOwnerChannel => Request[LiveStream]
  ): LiveStreamsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[LiveStreamsResource]
  }
}

