package typings.gapiDotClientDotYoutube.gapi.client.youtube

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotYoutube.Anon_AltFieldsHlKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nRegionsResource extends js.Object {
  /** Returns a list of content regions that the YouTube website supports. */
  def list(request: Anon_AltFieldsHlKey): Request[I18nRegionListResponse]
}

object I18nRegionsResource {
  @scala.inline
  def apply(list: Anon_AltFieldsHlKey => Request[I18nRegionListResponse]): I18nRegionsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[I18nRegionsResource]
  }
}

