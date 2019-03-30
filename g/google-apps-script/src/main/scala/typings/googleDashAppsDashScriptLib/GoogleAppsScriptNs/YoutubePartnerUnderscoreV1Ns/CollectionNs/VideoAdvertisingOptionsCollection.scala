package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoAdvertisingOptionsCollection extends js.Object {
  // Retrieves advertising settings for the specified video.
  def get(videoId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.VideoAdvertisingOption = js.native
  // Retrieves advertising settings for the specified video.
  def get(videoId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.VideoAdvertisingOption = js.native
  // Retrieves details about the types of allowed ads for a specified partner- or user-uploaded video.
  def getEnabledAds(videoId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.VideoAdvertisingOptionGetEnabledAdsResponse = js.native
  // Retrieves details about the types of allowed ads for a specified partner- or user-uploaded video.
  def getEnabledAds(videoId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.VideoAdvertisingOptionGetEnabledAdsResponse = js.native
  // Updates the advertising settings for the specified video. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.VideoAdvertisingOption,
    videoId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.VideoAdvertisingOption = js.native
  // Updates the advertising settings for the specified video. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.VideoAdvertisingOption,
    videoId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.VideoAdvertisingOption = js.native
  // Updates the advertising settings for the specified video.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.VideoAdvertisingOption,
    videoId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.VideoAdvertisingOption = js.native
  // Updates the advertising settings for the specified video.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.VideoAdvertisingOption,
    videoId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.VideoAdvertisingOption = js.native
}

