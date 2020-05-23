package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutube.anon.VideoId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThumbnailsResource extends js.Object {
  /** Uploads a custom video thumbnail to YouTube and sets it for a video. */
  def set(request: VideoId): Request[ThumbnailSetResponse]
}

object ThumbnailsResource {
  @scala.inline
  def apply(set: VideoId => Request[ThumbnailSetResponse]): ThumbnailsResource = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[ThumbnailsResource]
  }
}

