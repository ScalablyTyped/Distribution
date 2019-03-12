package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideosResource extends js.Object {
  /** Deletes a YouTube video. */
  def delete(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsIdKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves the ratings that the authorized user gave to a list of specified videos. */
  def getRating(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsIdKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[VideoGetRatingResponse]
  /** Uploads a video to YouTube and optionally sets the video's metadata. */
  def insert(request: gapiDotClientDotYoutubeLib.Anon_AltAutoLevels): gapiDotClientLib.gapiNs.clientNs.Request[Video]
  /** Returns a list of videos that match the API request parameters. */
  def list(request: gapiDotClientDotYoutubeLib.Anon_AltChart): gapiDotClientLib.gapiNs.clientNs.Request[VideoListResponse]
  /** Add a like or dislike rating to a video or remove a rating from a video. */
  def rate(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsIdKeyOauthtokenPrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Report abuse for a video. */
  def reportAbuse(
    request: gapiDotClientDotYoutubeLib.Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwnerPrettyPrintQuotaUser
  ): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Updates a video's metadata. */
  def update(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwner): gapiDotClientLib.gapiNs.clientNs.Request[Video]
}

object VideosResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotYoutubeLib.Anon_AltFieldsIdKeyOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    getRating: gapiDotClientDotYoutubeLib.Anon_AltFieldsIdKeyOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[VideoGetRatingResponse],
    insert: gapiDotClientDotYoutubeLib.Anon_AltAutoLevels => gapiDotClientLib.gapiNs.clientNs.Request[Video],
    list: gapiDotClientDotYoutubeLib.Anon_AltChart => gapiDotClientLib.gapiNs.clientNs.Request[VideoListResponse],
    rate: gapiDotClientDotYoutubeLib.Anon_AltFieldsIdKeyOauthtokenPrettyPrintQuotaUser => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    reportAbuse: gapiDotClientDotYoutubeLib.Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwnerPrettyPrintQuotaUser => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    update: gapiDotClientDotYoutubeLib.Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwner => gapiDotClientLib.gapiNs.clientNs.Request[Video]
  ): VideosResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), getRating = js.Any.fromFunction1(getRating), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), rate = js.Any.fromFunction1(rate), reportAbuse = js.Any.fromFunction1(reportAbuse), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[VideosResource]
  }
}

