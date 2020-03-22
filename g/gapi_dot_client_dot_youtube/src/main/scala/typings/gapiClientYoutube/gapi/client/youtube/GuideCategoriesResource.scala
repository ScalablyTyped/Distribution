package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutube.AnonRegionCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GuideCategoriesResource extends js.Object {
  /** Returns a list of categories that can be associated with YouTube channels. */
  def list(request: AnonRegionCode): Request_[GuideCategoryListResponse]
}

object GuideCategoriesResource {
  @scala.inline
  def apply(list: AnonRegionCode => Request_[GuideCategoryListResponse]): GuideCategoriesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[GuideCategoriesResource]
  }
}

