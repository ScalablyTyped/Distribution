package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiYouTubeChannelBannerResource extends js.Object {
  /**
    * The ETag of the response.
    */
  var etag: java.lang.String
  /**
    * The type of the API response. For this operation, the value will be youtube#channelBannerInsertResponse.
    */
  var kind: java.lang.String
  /**
    * The banner images URL. After calling the channelBanners.insert method, extract this value from the API response. Then call the channels.update method, and set the URL as the value of the brandingSettings.image.bannerExternalUrl property to set the banner image for a channel.
    */
  var url: java.lang.String
}

object GoogleApiYouTubeChannelBannerResource {
  @scala.inline
  def apply(etag: java.lang.String, kind: java.lang.String, url: java.lang.String): GoogleApiYouTubeChannelBannerResource = {
    val __obj = js.Dynamic.literal(etag = etag, kind = kind, url = url)
  
    __obj.asInstanceOf[GoogleApiYouTubeChannelBannerResource]
  }
}

