package typings.googleAppsScript.GoogleAppsScript.YouTube.Collection

import typings.googleAppsScript.GoogleAppsScript.YouTube.Schema.Video
import typings.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoAbuseReport
import typings.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoGetRatingResponse
import typings.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideosCollection extends js.Object {
  
  // Retrieves the ratings that the authorized user gave to a list of specified videos.
  def getRating(id: String): VideoGetRatingResponse = js.native
  // Retrieves the ratings that the authorized user gave to a list of specified videos.
  def getRating(id: String, optionalArgs: js.Object): VideoGetRatingResponse = js.native
  
  // Uploads a video to YouTube and optionally sets the video's metadata.
  def insert(resource: Video, part: String): Video = js.native
  // Uploads a video to YouTube and optionally sets the video's metadata.
  def insert(resource: Video, part: String, mediaData: js.Any): Video = js.native
  // Uploads a video to YouTube and optionally sets the video's metadata.
  def insert(resource: Video, part: String, mediaData: js.Any, optionalArgs: js.Object): Video = js.native
  
  // Returns a list of videos that match the API request parameters.
  def list(part: String): VideoListResponse = js.native
  // Returns a list of videos that match the API request parameters.
  def list(part: String, optionalArgs: js.Object): VideoListResponse = js.native
  
  // Add a like or dislike rating to a video or remove a rating from a video.
  def rate(id: String, rating: String): Unit = js.native
  
  // Deletes a YouTube video.
  def remove(id: String): Unit = js.native
  // Deletes a YouTube video.
  def remove(id: String, optionalArgs: js.Object): Unit = js.native
  
  // Report abuse for a video.
  def reportAbuse(resource: VideoAbuseReport): Unit = js.native
  // Report abuse for a video.
  def reportAbuse(resource: VideoAbuseReport, optionalArgs: js.Object): Unit = js.native
  
  // Updates a video's metadata.
  def update(resource: Video, part: String): Video = js.native
  // Updates a video's metadata.
  def update(resource: Video, part: String, optionalArgs: js.Object): Video = js.native
}
