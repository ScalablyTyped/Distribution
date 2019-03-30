package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideosCollection extends js.Object {
  // Retrieves the ratings that the authorized user gave to a list of specified videos.
  def getRating(id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs.VideoGetRatingResponse = js.native
  // Retrieves the ratings that the authorized user gave to a list of specified videos.
  def getRating(id: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs.VideoGetRatingResponse = js.native
  // Uploads a video to YouTube and optionally sets the video's metadata.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs.Video,
    part: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs.Video = js.native
  // Uploads a video to YouTube and optionally sets the video's metadata.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs.Video,
    part: java.lang.String,
    mediaData: js.Any
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs.Video = js.native
  // Uploads a video to YouTube and optionally sets the video's metadata.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs.Video,
    part: java.lang.String,
    mediaData: js.Any,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs.Video = js.native
  // Returns a list of videos that match the API request parameters.
  def list(part: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs.VideoListResponse = js.native
  // Returns a list of videos that match the API request parameters.
  def list(part: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs.VideoListResponse = js.native
  // Add a like or dislike rating to a video or remove a rating from a video.
  def rate(id: java.lang.String, rating: java.lang.String): scala.Unit = js.native
  // Deletes a YouTube video.
  def remove(id: java.lang.String): scala.Unit = js.native
  // Deletes a YouTube video.
  def remove(id: java.lang.String, optionalArgs: js.Object): scala.Unit = js.native
  // Report abuse for a video.
  def reportAbuse(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs.VideoAbuseReport
  ): scala.Unit = js.native
  // Report abuse for a video.
  def reportAbuse(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs.VideoAbuseReport,
    optionalArgs: js.Object
  ): scala.Unit = js.native
  // Updates a video's metadata.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs.Video,
    part: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs.Video = js.native
  // Updates a video's metadata.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs.Video,
    part: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs.Video = js.native
}

