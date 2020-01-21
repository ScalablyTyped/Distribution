package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutube.AnonAltFieldsIdKeyMaxResultsMine
import typings.gapiClientYoutube.AnonAltFieldsIdKeyOauthtokenOnBehalfOfContentOwnerOnBehalfOfContentOwnerChannel
import typings.gapiClientYoutube.AnonAltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveStreamsResource extends js.Object {
  /** Deletes a video stream. */
  def delete(request: AnonAltFieldsIdKeyOauthtokenOnBehalfOfContentOwnerOnBehalfOfContentOwnerChannel): Request_[Unit]
  /** Creates a video stream. The stream enables you to send your video to YouTube, which can then broadcast the video to your audience. */
  def insert(request: AnonAltFieldsKeyOauthtoken): Request_[LiveStream]
  /** Returns a list of video streams that match the API request parameters. */
  def list(request: AnonAltFieldsIdKeyMaxResultsMine): Request_[LiveStreamListResponse]
  /** Updates a video stream. If the properties that you want to change cannot be updated, then you need to create a new stream with the proper settings. */
  def update(request: AnonAltFieldsKeyOauthtoken): Request_[LiveStream]
}

object LiveStreamsResource {
  @scala.inline
  def apply(
    delete: AnonAltFieldsIdKeyOauthtokenOnBehalfOfContentOwnerOnBehalfOfContentOwnerChannel => Request_[Unit],
    insert: AnonAltFieldsKeyOauthtoken => Request_[LiveStream],
    list: AnonAltFieldsIdKeyMaxResultsMine => Request_[LiveStreamListResponse],
    update: AnonAltFieldsKeyOauthtoken => Request_[LiveStream]
  ): LiveStreamsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[LiveStreamsResource]
  }
}

