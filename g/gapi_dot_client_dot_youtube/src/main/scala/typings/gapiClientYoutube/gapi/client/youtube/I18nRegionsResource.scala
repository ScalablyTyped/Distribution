package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutube.AnonUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nRegionsResource extends js.Object {
  /** Returns a list of content regions that the YouTube website supports. */
  def list(request: AnonUserIp): Request_[I18nRegionListResponse]
}

object I18nRegionsResource {
  @scala.inline
  def apply(list: AnonUserIp => Request_[I18nRegionListResponse]): I18nRegionsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[I18nRegionsResource]
  }
}

