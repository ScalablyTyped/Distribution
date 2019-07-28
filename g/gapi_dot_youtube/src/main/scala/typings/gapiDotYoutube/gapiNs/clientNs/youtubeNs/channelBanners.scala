package typings.gapiDotYoutube.gapiNs.clientNs.youtubeNs

import typings.gapi.gapiNs.clientNs.HttpRequest
import typings.gapiDotYoutube.Anon_OnBehalfOfContentOwner
import typings.gapiDotYoutube.GoogleApiYouTubeChannelBannerResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait channelBanners extends js.Object {
  /**
    * Uploads a channel banner to YouTube.
    */
  def insert(`object`: Anon_OnBehalfOfContentOwner): HttpRequest[GoogleApiYouTubeChannelBannerResource]
}

object channelBanners {
  @scala.inline
  def apply(insert: Anon_OnBehalfOfContentOwner => HttpRequest[GoogleApiYouTubeChannelBannerResource]): channelBanners = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert))
  
    __obj.asInstanceOf[channelBanners]
  }
}

