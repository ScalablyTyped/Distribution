package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelBannersCollection extends js.Object {
  // Uploads a channel banner image to YouTube. This method represents the first two steps in a three-step process to update the banner image for a channel:
  // - Call the channelBanners.insert method to upload the binary image data to YouTube. The image must have a 16:9 aspect ratio and be at least 2120x1192 pixels.
  // - Extract the url property's value from the response that the API returns for step 1.
  // - Call the channels.update method to update the channel's branding settings. Set the brandingSettings.image.bannerExternalUrl property's value to the URL obtained in step 2.
  def insert(resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.ChannelBannerResource): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.ChannelBannerResource = js.native
  // Uploads a channel banner image to YouTube. This method represents the first two steps in a three-step process to update the banner image for a channel:
  // - Call the channelBanners.insert method to upload the binary image data to YouTube. The image must have a 16:9 aspect ratio and be at least 2120x1192 pixels.
  // - Extract the url property's value from the response that the API returns for step 1.
  // - Call the channels.update method to update the channel's branding settings. Set the brandingSettings.image.bannerExternalUrl property's value to the URL obtained in step 2.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.ChannelBannerResource,
    mediaData: js.Any
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.ChannelBannerResource = js.native
  // Uploads a channel banner image to YouTube. This method represents the first two steps in a three-step process to update the banner image for a channel:
  // - Call the channelBanners.insert method to upload the binary image data to YouTube. The image must have a 16:9 aspect ratio and be at least 2120x1192 pixels.
  // - Extract the url property's value from the response that the API returns for step 1.
  // - Call the channels.update method to update the channel's branding settings. Set the brandingSettings.image.bannerExternalUrl property's value to the URL obtained in step 2.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.ChannelBannerResource,
    mediaData: js.Any,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.ChannelBannerResource = js.native
}

