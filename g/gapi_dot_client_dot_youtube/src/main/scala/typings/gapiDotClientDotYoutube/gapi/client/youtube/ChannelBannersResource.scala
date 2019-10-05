package typings.gapiDotClientDotYoutube.gapi.client.youtube

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotYoutube.Anon_AltChannelIdFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelBannersResource extends js.Object {
  /**
    * Uploads a channel banner image to YouTube. This method represents the first two steps in a three-step process to update the banner image for a channel:
    *
    * - Call the channelBanners.insert method to upload the binary image data to YouTube. The image must have a 16:9 aspect ratio and be at least 2120x1192
    * pixels.
    * - Extract the url property's value from the response that the API returns for step 1.
    * - Call the channels.update method to update the channel's branding settings. Set the brandingSettings.image.bannerExternalUrl property's value to the
    * URL obtained in step 2.
    */
  def insert(request: Anon_AltChannelIdFields): Request[ChannelBannerResource]
}

object ChannelBannersResource {
  @scala.inline
  def apply(insert: Anon_AltChannelIdFields => Request[ChannelBannerResource]): ChannelBannersResource = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert))
  
    __obj.asInstanceOf[ChannelBannersResource]
  }
}

