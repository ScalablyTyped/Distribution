package typings.gapiDotClientDotYoutube.gapi.client.youtube

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotYoutube.Anon_AltFieldsHlId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoCategoriesResource extends js.Object {
  /** Returns a list of categories that can be associated with YouTube videos. */
  def list(request: Anon_AltFieldsHlId): Request[VideoCategoryListResponse]
}

object VideoCategoriesResource {
  @scala.inline
  def apply(list: Anon_AltFieldsHlId => Request[VideoCategoryListResponse]): VideoCategoriesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[VideoCategoriesResource]
  }
}

