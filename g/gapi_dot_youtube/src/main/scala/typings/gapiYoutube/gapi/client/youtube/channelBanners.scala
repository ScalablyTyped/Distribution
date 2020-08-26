package typings.gapiYoutube.gapi.client.youtube

import typings.gapi.gapi.client.HttpRequest
import typings.gapiYoutube.GoogleApiYouTubeChannelBannerResource
import typings.gapiYoutube.anon.OnBehalfOfContentOwner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait channelBanners extends js.Object {
  /**
    * Uploads a channel banner to YouTube.
    */
  def insert(`object`: OnBehalfOfContentOwner): HttpRequest[GoogleApiYouTubeChannelBannerResource] = js.native
}

object channelBanners {
  @scala.inline
  def apply(insert: OnBehalfOfContentOwner => HttpRequest[GoogleApiYouTubeChannelBannerResource]): channelBanners = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert))
    __obj.asInstanceOf[channelBanners]
  }
  @scala.inline
  implicit class channelBannersOps[Self <: channelBanners] (val x: Self) extends AnyVal {
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
    def setInsert(value: OnBehalfOfContentOwner => HttpRequest[GoogleApiYouTubeChannelBannerResource]): Self = this.set("insert", js.Any.fromFunction1(value))
  }
  
}

