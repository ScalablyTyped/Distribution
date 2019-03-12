package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoCategoriesResource extends js.Object {
  /** Returns a list of categories that can be associated with YouTube videos. */
  def list(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsHlId): gapiDotClientLib.gapiNs.clientNs.Request[VideoCategoryListResponse]
}

object VideoCategoriesResource {
  @scala.inline
  def apply(
    list: gapiDotClientDotYoutubeLib.Anon_AltFieldsHlId => gapiDotClientLib.gapiNs.clientNs.Request[VideoCategoryListResponse]
  ): VideoCategoriesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[VideoCategoriesResource]
  }
}

