package typings
package gapiDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait videos extends js.Object {
  /**
    * Deletes a YouTube video.
    */
  def delete(`object`: gapiDotYoutubeLib.Anon_IdOnBehalfOfContentOwner): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubeVideoResource]
  /**
    * Get user ratings for videos.
    */
  def getRating(`object`: gapiDotYoutubeLib.Anon_IdOnBehalfOfContentOwner): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubeVideoGetRatingResponse]
  /**
    * Uploads a video to YouTube and optionally sets the video's metadata.
    */
  def insert(`object`: gapiDotYoutubeLib.Anon_AutoLevels): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubeVideoResource]
  /**
    * Returns a list of videos that match the API request parameters.
    */
  def list(`object`: gapiDotYoutubeLib.Anon_Chart): gapiLib.gapiNs.clientNs.HttpRequest[
    gapiDotYoutubeLib.GoogleApiYouTubePaginationInfo[gapiDotYoutubeLib.GoogleApiYouTubeVideoResource]
  ]
  /**
    * Like, dislike, or remove rating from a video.
    */
  def rate(`object`: gapiDotYoutubeLib.Anon_IdOnBehalfOfContentOwnerRating): gapiLib.gapiNs.clientNs.HttpRequest[_]
  /**
    * Updates a video's metadata.
    */
  def update(`object`: gapiDotYoutubeLib.Anon_OnBehalfOfContentOwnerPart): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubeVideoResource]
}

object videos {
  @scala.inline
  def apply(
    delete: gapiDotYoutubeLib.Anon_IdOnBehalfOfContentOwner => gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubeVideoResource],
    getRating: gapiDotYoutubeLib.Anon_IdOnBehalfOfContentOwner => gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubeVideoGetRatingResponse],
    insert: gapiDotYoutubeLib.Anon_AutoLevels => gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubeVideoResource],
    list: gapiDotYoutubeLib.Anon_Chart => gapiLib.gapiNs.clientNs.HttpRequest[
      gapiDotYoutubeLib.GoogleApiYouTubePaginationInfo[gapiDotYoutubeLib.GoogleApiYouTubeVideoResource]
    ],
    rate: gapiDotYoutubeLib.Anon_IdOnBehalfOfContentOwnerRating => gapiLib.gapiNs.clientNs.HttpRequest[_],
    update: gapiDotYoutubeLib.Anon_OnBehalfOfContentOwnerPart => gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubeVideoResource]
  ): videos = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), getRating = js.Any.fromFunction1(getRating), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), rate = js.Any.fromFunction1(rate), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[videos]
  }
}

