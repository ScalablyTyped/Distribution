package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoAdvertisingOptionsCollection extends js.Object {
  // Retrieves advertising settings for the specified video.
  def get(videoId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.VideoAdvertisingOption = js.native
  // Retrieves advertising settings for the specified video.
  def get(videoId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.VideoAdvertisingOption = js.native
  // Retrieves details about the types of allowed ads for a specified partner- or user-uploaded video.
  def getEnabledAds(videoId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.VideoAdvertisingOptionGetEnabledAdsResponse = js.native
  // Retrieves details about the types of allowed ads for a specified partner- or user-uploaded video.
  def getEnabledAds(videoId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.VideoAdvertisingOptionGetEnabledAdsResponse = js.native
  // Updates the advertising settings for the specified video. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.VideoAdvertisingOption,
    videoId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.VideoAdvertisingOption = js.native
  // Updates the advertising settings for the specified video. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.VideoAdvertisingOption,
    videoId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.VideoAdvertisingOption = js.native
  // Updates the advertising settings for the specified video.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.VideoAdvertisingOption,
    videoId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.VideoAdvertisingOption = js.native
  // Updates the advertising settings for the specified video.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.VideoAdvertisingOption,
    videoId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs.VideoAdvertisingOption = js.native
}

