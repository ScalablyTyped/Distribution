package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotYoutube.Anon_AltFieldsHlId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GuideCategoriesResource extends js.Object {
  /** Returns a list of categories that can be associated with YouTube channels. */
  def list(request: Anon_AltFieldsHlId): Request[GuideCategoryListResponse]
}

object GuideCategoriesResource {
  @scala.inline
  def apply(list: Anon_AltFieldsHlId => Request[GuideCategoryListResponse]): GuideCategoriesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[GuideCategoriesResource]
  }
}

