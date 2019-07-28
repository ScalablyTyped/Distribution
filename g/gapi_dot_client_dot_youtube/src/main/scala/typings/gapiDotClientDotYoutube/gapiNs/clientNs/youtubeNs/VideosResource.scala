package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotYoutube.Anon_AltAutoLevels
import typings.gapiDotClientDotYoutube.Anon_AltChart
import typings.gapiDotClientDotYoutube.Anon_AltFieldsIdKeyOauthtoken
import typings.gapiDotClientDotYoutube.Anon_AltFieldsIdKeyOauthtokenPrettyPrintQuotaUser
import typings.gapiDotClientDotYoutube.Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwner
import typings.gapiDotClientDotYoutube.Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwnerPrettyPrintQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideosResource extends js.Object {
  /** Deletes a YouTube video. */
  def delete(request: Anon_AltFieldsIdKeyOauthtoken): Request[Unit]
  /** Retrieves the ratings that the authorized user gave to a list of specified videos. */
  def getRating(request: Anon_AltFieldsIdKeyOauthtoken): Request[VideoGetRatingResponse]
  /** Uploads a video to YouTube and optionally sets the video's metadata. */
  def insert(request: Anon_AltAutoLevels): Request[Video]
  /** Returns a list of videos that match the API request parameters. */
  def list(request: Anon_AltChart): Request[VideoListResponse]
  /** Add a like or dislike rating to a video or remove a rating from a video. */
  def rate(request: Anon_AltFieldsIdKeyOauthtokenPrettyPrintQuotaUser): Request[Unit]
  /** Report abuse for a video. */
  def reportAbuse(request: Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwnerPrettyPrintQuotaUser): Request[Unit]
  /** Updates a video's metadata. */
  def update(request: Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwner): Request[Video]
}

object VideosResource {
  @scala.inline
  def apply(
    delete: Anon_AltFieldsIdKeyOauthtoken => Request[Unit],
    getRating: Anon_AltFieldsIdKeyOauthtoken => Request[VideoGetRatingResponse],
    insert: Anon_AltAutoLevels => Request[Video],
    list: Anon_AltChart => Request[VideoListResponse],
    rate: Anon_AltFieldsIdKeyOauthtokenPrettyPrintQuotaUser => Request[Unit],
    reportAbuse: Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwnerPrettyPrintQuotaUser => Request[Unit],
    update: Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwner => Request[Video]
  ): VideosResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), getRating = js.Any.fromFunction1(getRating), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), rate = js.Any.fromFunction1(rate), reportAbuse = js.Any.fromFunction1(reportAbuse), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[VideosResource]
  }
}

