package typings.gapiYoutube.gapi.client.youtube

import typings.gapi.gapi.client.HttpRequest
import typings.gapiYoutube.GoogleApiYouTubePaginationInfo
import typings.gapiYoutube.GoogleApiYouTubeVideoGetRatingResponse
import typings.gapiYoutube.GoogleApiYouTubeVideoResource
import typings.gapiYoutube.anon.AutoLevels
import typings.gapiYoutube.anon.Chart
import typings.gapiYoutube.anon.IdOnBehalfOfContentOwner
import typings.gapiYoutube.anon.OnBehalfOfContentOwnerRating
import typings.gapiYoutube.anon.RequestBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait videos extends js.Object {
  /**
    * Deletes a YouTube video.
    */
  def delete(`object`: IdOnBehalfOfContentOwner): HttpRequest[GoogleApiYouTubeVideoResource]
  /**
    * Get user ratings for videos.
    */
  def getRating(`object`: IdOnBehalfOfContentOwner): HttpRequest[GoogleApiYouTubeVideoGetRatingResponse]
  /**
    * Uploads a video to YouTube and optionally sets the video's metadata.
    */
  def insert(`object`: AutoLevels): HttpRequest[GoogleApiYouTubeVideoResource]
  /**
    * Returns a list of videos that match the API request parameters.
    */
  def list(`object`: Chart): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeVideoResource]]
  /**
    * Like, dislike, or remove rating from a video.
    */
  def rate(`object`: OnBehalfOfContentOwnerRating): HttpRequest[_]
  /**
    * Updates a video's metadata.
    */
  def update(`object`: RequestBody): HttpRequest[GoogleApiYouTubeVideoResource]
}

object videos {
  @scala.inline
  def apply(
    delete: IdOnBehalfOfContentOwner => HttpRequest[GoogleApiYouTubeVideoResource],
    getRating: IdOnBehalfOfContentOwner => HttpRequest[GoogleApiYouTubeVideoGetRatingResponse],
    insert: AutoLevels => HttpRequest[GoogleApiYouTubeVideoResource],
    list: Chart => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeVideoResource]],
    rate: OnBehalfOfContentOwnerRating => HttpRequest[_],
    update: RequestBody => HttpRequest[GoogleApiYouTubeVideoResource]
  ): videos = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), getRating = js.Any.fromFunction1(getRating), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), rate = js.Any.fromFunction1(rate), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[videos]
  }
}

