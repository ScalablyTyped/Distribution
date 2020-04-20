package typings.gapiYoutube.gapi.client.youtube

import typings.gapi.gapi.client.HttpRequest
import typings.gapiYoutube.AnonAutoLevels
import typings.gapiYoutube.AnonChart
import typings.gapiYoutube.AnonIdOnBehalfOfContentOwner
import typings.gapiYoutube.AnonRating
import typings.gapiYoutube.AnonRequestBody
import typings.gapiYoutube.GoogleApiYouTubePaginationInfo
import typings.gapiYoutube.GoogleApiYouTubeVideoGetRatingResponse
import typings.gapiYoutube.GoogleApiYouTubeVideoResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait videos extends js.Object {
  /**
    * Deletes a YouTube video.
    */
  def delete(`object`: AnonIdOnBehalfOfContentOwner): HttpRequest[GoogleApiYouTubeVideoResource]
  /**
    * Get user ratings for videos.
    */
  def getRating(`object`: AnonIdOnBehalfOfContentOwner): HttpRequest[GoogleApiYouTubeVideoGetRatingResponse]
  /**
    * Uploads a video to YouTube and optionally sets the video's metadata.
    */
  def insert(`object`: AnonAutoLevels): HttpRequest[GoogleApiYouTubeVideoResource]
  /**
    * Returns a list of videos that match the API request parameters.
    */
  def list(`object`: AnonChart): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeVideoResource]]
  /**
    * Like, dislike, or remove rating from a video.
    */
  def rate(`object`: AnonRating): HttpRequest[_]
  /**
    * Updates a video's metadata.
    */
  def update(`object`: AnonRequestBody): HttpRequest[GoogleApiYouTubeVideoResource]
}

object videos {
  @scala.inline
  def apply(
    delete: AnonIdOnBehalfOfContentOwner => HttpRequest[GoogleApiYouTubeVideoResource],
    getRating: AnonIdOnBehalfOfContentOwner => HttpRequest[GoogleApiYouTubeVideoGetRatingResponse],
    insert: AnonAutoLevels => HttpRequest[GoogleApiYouTubeVideoResource],
    list: AnonChart => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeVideoResource]],
    rate: AnonRating => HttpRequest[_],
    update: AnonRequestBody => HttpRequest[GoogleApiYouTubeVideoResource]
  ): videos = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), getRating = js.Any.fromFunction1(getRating), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), rate = js.Any.fromFunction1(rate), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[videos]
  }
}

