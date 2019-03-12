package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GuideCategoriesResource extends js.Object {
  /** Returns a list of categories that can be associated with YouTube channels. */
  def list(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsHlId): gapiDotClientLib.gapiNs.clientNs.Request[GuideCategoryListResponse]
}

object GuideCategoriesResource {
  @scala.inline
  def apply(
    list: gapiDotClientDotYoutubeLib.Anon_AltFieldsHlId => gapiDotClientLib.gapiNs.clientNs.Request[GuideCategoryListResponse]
  ): GuideCategoriesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[GuideCategoriesResource]
  }
}

