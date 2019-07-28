package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotYoutube.Anon_AltFieldsIdKeyMaxResultsMine
import typings.gapiDotClientDotYoutube.Anon_AltFieldsIdKeyOauthtokenOnBehalfOfContentOwnerOnBehalfOfContentOwnerChannel
import typings.gapiDotClientDotYoutube.Anon_AltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveStreamsResource extends js.Object {
  /** Deletes a video stream. */
  def delete(request: Anon_AltFieldsIdKeyOauthtokenOnBehalfOfContentOwnerOnBehalfOfContentOwnerChannel): Request[Unit]
  /** Creates a video stream. The stream enables you to send your video to YouTube, which can then broadcast the video to your audience. */
  def insert(request: Anon_AltFieldsKeyOauthtoken): Request[LiveStream]
  /** Returns a list of video streams that match the API request parameters. */
  def list(request: Anon_AltFieldsIdKeyMaxResultsMine): Request[LiveStreamListResponse]
  /** Updates a video stream. If the properties that you want to change cannot be updated, then you need to create a new stream with the proper settings. */
  def update(request: Anon_AltFieldsKeyOauthtoken): Request[LiveStream]
}

object LiveStreamsResource {
  @scala.inline
  def apply(
    delete: Anon_AltFieldsIdKeyOauthtokenOnBehalfOfContentOwnerOnBehalfOfContentOwnerChannel => Request[Unit],
    insert: Anon_AltFieldsKeyOauthtoken => Request[LiveStream],
    list: Anon_AltFieldsIdKeyMaxResultsMine => Request[LiveStreamListResponse],
    update: Anon_AltFieldsKeyOauthtoken => Request[LiveStream]
  ): LiveStreamsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[LiveStreamsResource]
  }
}

