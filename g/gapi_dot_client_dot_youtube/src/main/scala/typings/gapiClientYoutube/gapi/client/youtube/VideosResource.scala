package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutube.anon.AutoLevels
import typings.gapiClientYoutube.anon.Chart
import typings.gapiClientYoutube.anon.KeyOauthtoken
import typings.gapiClientYoutube.anon.Part
import typings.gapiClientYoutube.anon.PrettyPrint
import typings.gapiClientYoutube.anon.Rating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideosResource extends js.Object {
  /** Deletes a YouTube video. */
  def delete(request: PrettyPrint): Request[Unit]
  /** Retrieves the ratings that the authorized user gave to a list of specified videos. */
  def getRating(request: PrettyPrint): Request[VideoGetRatingResponse]
  /** Uploads a video to YouTube and optionally sets the video's metadata. */
  def insert(request: AutoLevels): Request[Video]
  /** Returns a list of videos that match the API request parameters. */
  def list(request: Chart): Request[VideoListResponse]
  /** Add a like or dislike rating to a video or remove a rating from a video. */
  def rate(request: Rating): Request[Unit]
  /** Report abuse for a video. */
  def reportAbuse(request: KeyOauthtoken): Request[Unit]
  /** Updates a video's metadata. */
  def update(request: Part): Request[Video]
}

object VideosResource {
  @scala.inline
  def apply(
    delete: PrettyPrint => Request[Unit],
    getRating: PrettyPrint => Request[VideoGetRatingResponse],
    insert: AutoLevels => Request[Video],
    list: Chart => Request[VideoListResponse],
    rate: Rating => Request[Unit],
    reportAbuse: KeyOauthtoken => Request[Unit],
    update: Part => Request[Video]
  ): VideosResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), getRating = js.Any.fromFunction1(getRating), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), rate = js.Any.fromFunction1(rate), reportAbuse = js.Any.fromFunction1(reportAbuse), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[VideosResource]
  }
}

