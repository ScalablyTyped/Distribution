package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.VideoAdvertisingOption
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.VideoAdvertisingOptionGetEnabledAdsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoAdvertisingOptionsCollection extends js.Object {
  // Retrieves advertising settings for the specified video.
  def get(videoId: String): VideoAdvertisingOption = js.native
  // Retrieves advertising settings for the specified video.
  def get(videoId: String, optionalArgs: js.Object): VideoAdvertisingOption = js.native
  // Retrieves details about the types of allowed ads for a specified partner- or user-uploaded video.
  def getEnabledAds(videoId: String): VideoAdvertisingOptionGetEnabledAdsResponse = js.native
  // Retrieves details about the types of allowed ads for a specified partner- or user-uploaded video.
  def getEnabledAds(videoId: String, optionalArgs: js.Object): VideoAdvertisingOptionGetEnabledAdsResponse = js.native
  // Updates the advertising settings for the specified video. This method supports patch semantics.
  def patch(resource: VideoAdvertisingOption, videoId: String): VideoAdvertisingOption = js.native
  // Updates the advertising settings for the specified video. This method supports patch semantics.
  def patch(resource: VideoAdvertisingOption, videoId: String, optionalArgs: js.Object): VideoAdvertisingOption = js.native
  // Updates the advertising settings for the specified video.
  def update(resource: VideoAdvertisingOption, videoId: String): VideoAdvertisingOption = js.native
  // Updates the advertising settings for the specified video.
  def update(resource: VideoAdvertisingOption, videoId: String, optionalArgs: js.Object): VideoAdvertisingOption = js.native
}

