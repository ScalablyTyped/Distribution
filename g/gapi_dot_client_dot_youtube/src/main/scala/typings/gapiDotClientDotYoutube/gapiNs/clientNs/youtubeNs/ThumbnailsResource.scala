package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotYoutube.Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwnerPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThumbnailsResource extends js.Object {
  /** Uploads a custom video thumbnail to YouTube and sets it for a video. */
  def set(request: Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwnerPrettyPrint): Request[ThumbnailSetResponse]
}

object ThumbnailsResource {
  @scala.inline
  def apply(set: Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwnerPrettyPrint => Request[ThumbnailSetResponse]): ThumbnailsResource = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[ThumbnailsResource]
  }
}

