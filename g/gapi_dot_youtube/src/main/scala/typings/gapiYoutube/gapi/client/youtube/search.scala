package typings.gapiYoutube.gapi.client.youtube

import typings.gapi.gapi.client.HttpRequest
import typings.gapiYoutube.GoogleApiYouTubePaginationInfo
import typings.gapiYoutube.GoogleApiYouTubeSearchResource
import typings.gapiYoutube.anon.ChannelType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait search extends js.Object {
  /**
    * Returns a collection of search results that match the query parameters specified in the API request. By default, a search result set identifies matching video, channel, and playlist resources, but you can also configure queries to only retrieve a specific type of resource.
    */
  def list(`object`: ChannelType): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeSearchResource]] = js.native
}

object search {
  @scala.inline
  def apply(list: ChannelType => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeSearchResource]]): search = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[search]
  }
  @scala.inline
  implicit class searchOps[Self <: search] (val x: Self) extends AnyVal {
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
    def setList(value: ChannelType => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeSearchResource]]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

