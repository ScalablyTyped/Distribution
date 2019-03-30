package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveStreamsCollection extends js.Object {
  // Creates a video stream. The stream enables you to send your video to YouTube, which can then broadcast the video to your audience.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs.LiveStream,
    part: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs.LiveStream = js.native
  // Creates a video stream. The stream enables you to send your video to YouTube, which can then broadcast the video to your audience.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs.LiveStream,
    part: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs.LiveStream = js.native
  // Returns a list of video streams that match the API request parameters.
  def list(part: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs.LiveStreamListResponse = js.native
  // Returns a list of video streams that match the API request parameters.
  def list(part: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs.LiveStreamListResponse = js.native
  // Deletes a video stream.
  def remove(id: java.lang.String): scala.Unit = js.native
  // Deletes a video stream.
  def remove(id: java.lang.String, optionalArgs: js.Object): scala.Unit = js.native
  // Updates a video stream. If the properties that you want to change cannot be updated, then you need to create a new stream with the proper settings.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs.LiveStream,
    part: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs.LiveStream = js.native
  // Updates a video stream. If the properties that you want to change cannot be updated, then you need to create a new stream with the proper settings.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs.LiveStream,
    part: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs.LiveStream = js.native
}

