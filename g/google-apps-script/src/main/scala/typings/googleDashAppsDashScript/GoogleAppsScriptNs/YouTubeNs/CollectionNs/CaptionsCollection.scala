package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs.Caption
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs.CaptionListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionsCollection extends js.Object {
  // Downloads a caption track. The caption track is returned in its original format unless the request specifies a value for the tfmt parameter and in its original language unless the request specifies a value for the tlang parameter.
  def download(id: String): Unit = js.native
  // Downloads a caption track. The caption track is returned in its original format unless the request specifies a value for the tfmt parameter and in its original language unless the request specifies a value for the tlang parameter.
  def download(id: String, optionalArgs: js.Object): Unit = js.native
  // Uploads a caption track.
  def insert(resource: Caption, part: String): Caption = js.native
  // Uploads a caption track.
  def insert(resource: Caption, part: String, mediaData: js.Any): Caption = js.native
  // Uploads a caption track.
  def insert(resource: Caption, part: String, mediaData: js.Any, optionalArgs: js.Object): Caption = js.native
  // Returns a list of caption tracks that are associated with a specified video. Note that the API response does not contain the actual captions and that the captions.download method provides the ability to retrieve a caption track.
  def list(part: String, videoId: String): CaptionListResponse = js.native
  // Returns a list of caption tracks that are associated with a specified video. Note that the API response does not contain the actual captions and that the captions.download method provides the ability to retrieve a caption track.
  def list(part: String, videoId: String, optionalArgs: js.Object): CaptionListResponse = js.native
  // Deletes a specified caption track.
  def remove(id: String): Unit = js.native
  // Deletes a specified caption track.
  def remove(id: String, optionalArgs: js.Object): Unit = js.native
  // Updates a caption track. When updating a caption track, you can change the track's draft status, upload a new caption file for the track, or both.
  def update(resource: Caption, part: String): Caption = js.native
  // Updates a caption track. When updating a caption track, you can change the track's draft status, upload a new caption file for the track, or both.
  def update(resource: Caption, part: String, mediaData: js.Any): Caption = js.native
  // Updates a caption track. When updating a caption track, you can change the track's draft status, upload a new caption file for the track, or both.
  def update(resource: Caption, part: String, mediaData: js.Any, optionalArgs: js.Object): Caption = js.native
}

