package typings
package gapiDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait videos extends js.Object {
  /**
    * Deletes a YouTube video.
    */
  def delete(`object`: gapiDotYoutubeLib.Anon_OnBehalfOfContentOwner): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubeVideoResource]
  /**
    * Get user ratings for videos.
    */
  def getRating(`object`: gapiDotYoutubeLib.Anon_OnBehalfOfContentOwner): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubeVideoGetRatingResponse]
  /**
    * Uploads a video to YouTube and optionally sets the video's metadata.
    */
  def insert(`object`: gapiDotYoutubeLib.Anon_Stabilize): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubeVideoResource]
  /**
    * Returns a list of videos that match the API request parameters.
    */
  def list(`object`: gapiDotYoutubeLib.Anon_MyRating): gapiLib.gapiNs.clientNs.HttpRequest[
    gapiDotYoutubeLib.GoogleApiYouTubePaginationInfo[gapiDotYoutubeLib.GoogleApiYouTubeVideoResource]
  ]
  /**
    * Like, dislike, or remove rating from a video.
    */
  def rate(`object`: gapiDotYoutubeLib.Anon_Rating): gapiLib.gapiNs.clientNs.HttpRequest[_]
  /**
    * Updates a video's metadata.
    */
  def update(`object`: gapiDotYoutubeLib.Anon_RequestBodyOnBehalfOfContentOwner): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubeVideoResource]
}

