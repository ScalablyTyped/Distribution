package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nRegionsResource extends js.Object {
  /** Returns a list of content regions that the YouTube website supports. */
  def list(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsHlKey): gapiDotClientLib.gapiNs.clientNs.Request[I18nRegionListResponse]
}

object I18nRegionsResource {
  @scala.inline
  def apply(
    list: gapiDotClientDotYoutubeLib.Anon_AltFieldsHlKey => gapiDotClientLib.gapiNs.clientNs.Request[I18nRegionListResponse]
  ): I18nRegionsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[I18nRegionsResource]
  }
}

