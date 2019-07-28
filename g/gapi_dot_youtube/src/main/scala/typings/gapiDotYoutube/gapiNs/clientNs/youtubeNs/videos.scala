package typings.gapiDotYoutube.gapiNs.clientNs.youtubeNs

import typings.gapi.gapiNs.clientNs.HttpRequest
import typings.gapiDotYoutube.Anon_AutoLevels
import typings.gapiDotYoutube.Anon_Chart
import typings.gapiDotYoutube.Anon_IdOnBehalfOfContentOwner
import typings.gapiDotYoutube.Anon_IdOnBehalfOfContentOwnerRating
import typings.gapiDotYoutube.Anon_OnBehalfOfContentOwnerPart
import typings.gapiDotYoutube.GoogleApiYouTubePaginationInfo
import typings.gapiDotYoutube.GoogleApiYouTubeVideoGetRatingResponse
import typings.gapiDotYoutube.GoogleApiYouTubeVideoResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait videos extends js.Object {
  /**
    * Deletes a YouTube video.
    */
  def delete(`object`: Anon_IdOnBehalfOfContentOwner): HttpRequest[GoogleApiYouTubeVideoResource]
  /**
    * Get user ratings for videos.
    */
  def getRating(`object`: Anon_IdOnBehalfOfContentOwner): HttpRequest[GoogleApiYouTubeVideoGetRatingResponse]
  /**
    * Uploads a video to YouTube and optionally sets the video's metadata.
    */
  def insert(`object`: Anon_AutoLevels): HttpRequest[GoogleApiYouTubeVideoResource]
  /**
    * Returns a list of videos that match the API request parameters.
    */
  def list(`object`: Anon_Chart): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeVideoResource]]
  /**
    * Like, dislike, or remove rating from a video.
    */
  def rate(`object`: Anon_IdOnBehalfOfContentOwnerRating): HttpRequest[_]
  /**
    * Updates a video's metadata.
    */
  def update(`object`: Anon_OnBehalfOfContentOwnerPart): HttpRequest[GoogleApiYouTubeVideoResource]
}

object videos {
  @scala.inline
  def apply(
    delete: Anon_IdOnBehalfOfContentOwner => HttpRequest[GoogleApiYouTubeVideoResource],
    getRating: Anon_IdOnBehalfOfContentOwner => HttpRequest[GoogleApiYouTubeVideoGetRatingResponse],
    insert: Anon_AutoLevels => HttpRequest[GoogleApiYouTubeVideoResource],
    list: Anon_Chart => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeVideoResource]],
    rate: Anon_IdOnBehalfOfContentOwnerRating => HttpRequest[_],
    update: Anon_OnBehalfOfContentOwnerPart => HttpRequest[GoogleApiYouTubeVideoResource]
  ): videos = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), getRating = js.Any.fromFunction1(getRating), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), rate = js.Any.fromFunction1(rate), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[videos]
  }
}

