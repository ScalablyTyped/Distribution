package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutube.AnonAutoLevels
import typings.gapiClientYoutube.AnonChart
import typings.gapiClientYoutube.AnonKeyOauthtoken
import typings.gapiClientYoutube.AnonPart
import typings.gapiClientYoutube.AnonPrettyPrint
import typings.gapiClientYoutube.AnonRating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideosResource extends js.Object {
  /** Deletes a YouTube video. */
  def delete(request: AnonPrettyPrint): Request_[Unit]
  /** Retrieves the ratings that the authorized user gave to a list of specified videos. */
  def getRating(request: AnonPrettyPrint): Request_[VideoGetRatingResponse]
  /** Uploads a video to YouTube and optionally sets the video's metadata. */
  def insert(request: AnonAutoLevels): Request_[Video]
  /** Returns a list of videos that match the API request parameters. */
  def list(request: AnonChart): Request_[VideoListResponse]
  /** Add a like or dislike rating to a video or remove a rating from a video. */
  def rate(request: AnonRating): Request_[Unit]
  /** Report abuse for a video. */
  def reportAbuse(request: AnonKeyOauthtoken): Request_[Unit]
  /** Updates a video's metadata. */
  def update(request: AnonPart): Request_[Video]
}

object VideosResource {
  @scala.inline
  def apply(
    delete: AnonPrettyPrint => Request_[Unit],
    getRating: AnonPrettyPrint => Request_[VideoGetRatingResponse],
    insert: AnonAutoLevels => Request_[Video],
    list: AnonChart => Request_[VideoListResponse],
    rate: AnonRating => Request_[Unit],
    reportAbuse: AnonKeyOauthtoken => Request_[Unit],
    update: AnonPart => Request_[Video]
  ): VideosResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), getRating = js.Any.fromFunction1(getRating), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), rate = js.Any.fromFunction1(rate), reportAbuse = js.Any.fromFunction1(reportAbuse), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[VideosResource]
  }
}

