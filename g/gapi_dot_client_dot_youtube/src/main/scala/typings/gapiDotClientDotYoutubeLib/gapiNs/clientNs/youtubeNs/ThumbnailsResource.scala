package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThumbnailsResource extends js.Object {
  /** Uploads a custom video thumbnail to YouTube and sets it for a video. */
  def set(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwnerPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ThumbnailSetResponse]
}

object ThumbnailsResource {
  @scala.inline
  def apply(
    set: gapiDotClientDotYoutubeLib.Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwnerPrettyPrint => gapiDotClientLib.gapiNs.clientNs.Request[ThumbnailSetResponse]
  ): ThumbnailsResource = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[ThumbnailsResource]
  }
}

