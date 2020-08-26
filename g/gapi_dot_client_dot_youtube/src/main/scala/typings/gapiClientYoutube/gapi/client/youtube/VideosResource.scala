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

@js.native
trait VideosResource extends js.Object {
  /** Deletes a YouTube video. */
  def delete(request: PrettyPrint): Request[Unit] = js.native
  /** Retrieves the ratings that the authorized user gave to a list of specified videos. */
  def getRating(request: PrettyPrint): Request[VideoGetRatingResponse] = js.native
  /** Uploads a video to YouTube and optionally sets the video's metadata. */
  def insert(request: AutoLevels): Request[Video] = js.native
  /** Returns a list of videos that match the API request parameters. */
  def list(request: Chart): Request[VideoListResponse] = js.native
  /** Add a like or dislike rating to a video or remove a rating from a video. */
  def rate(request: Rating): Request[Unit] = js.native
  /** Report abuse for a video. */
  def reportAbuse(request: KeyOauthtoken): Request[Unit] = js.native
  /** Updates a video's metadata. */
  def update(request: Part): Request[Video] = js.native
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
  @scala.inline
  implicit class VideosResourceOps[Self <: VideosResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelete(value: PrettyPrint => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGetRating(value: PrettyPrint => Request[VideoGetRatingResponse]): Self = this.set("getRating", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: AutoLevels => Request[Video]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Chart => Request[VideoListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setRate(value: Rating => Request[Unit]): Self = this.set("rate", js.Any.fromFunction1(value))
    @scala.inline
    def setReportAbuse(value: KeyOauthtoken => Request[Unit]): Self = this.set("reportAbuse", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Part => Request[Video]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

