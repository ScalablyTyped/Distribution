package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutube.anon.ChannelType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchResource extends js.Object {
  /**
    * Returns a collection of search results that match the query parameters specified in the API request. By default, a search result set identifies
    * matching video, channel, and playlist resources, but you can also configure queries to only retrieve a specific type of resource.
    */
  def list(request: ChannelType): Request[SearchListResponse] = js.native
}

object SearchResource {
  @scala.inline
  def apply(list: ChannelType => Request[SearchListResponse]): SearchResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[SearchResource]
  }
  @scala.inline
  implicit class SearchResourceOps[Self <: SearchResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setList(value: ChannelType => Request[SearchListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

