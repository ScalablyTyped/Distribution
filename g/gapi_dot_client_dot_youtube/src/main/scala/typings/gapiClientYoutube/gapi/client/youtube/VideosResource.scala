package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutube.AnonAltAutoLevels
import typings.gapiClientYoutube.AnonAltChart
import typings.gapiClientYoutube.AnonAltFieldsIdKeyOauthtoken
import typings.gapiClientYoutube.AnonAltFieldsIdKeyOauthtokenPrettyPrintQuotaUser
import typings.gapiClientYoutube.AnonAltFieldsKeyOauthtokenOnBehalfOfContentOwner
import typings.gapiClientYoutube.AnonAltFieldsKeyOauthtokenOnBehalfOfContentOwnerPrettyPrintQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideosResource extends js.Object {
  /** Deletes a YouTube video. */
  def delete(request: AnonAltFieldsIdKeyOauthtoken): Request_[Unit]
  /** Retrieves the ratings that the authorized user gave to a list of specified videos. */
  def getRating(request: AnonAltFieldsIdKeyOauthtoken): Request_[VideoGetRatingResponse]
  /** Uploads a video to YouTube and optionally sets the video's metadata. */
  def insert(request: AnonAltAutoLevels): Request_[Video]
  /** Returns a list of videos that match the API request parameters. */
  def list(request: AnonAltChart): Request_[VideoListResponse]
  /** Add a like or dislike rating to a video or remove a rating from a video. */
  def rate(request: AnonAltFieldsIdKeyOauthtokenPrettyPrintQuotaUser): Request_[Unit]
  /** Report abuse for a video. */
  def reportAbuse(request: AnonAltFieldsKeyOauthtokenOnBehalfOfContentOwnerPrettyPrintQuotaUser): Request_[Unit]
  /** Updates a video's metadata. */
  def update(request: AnonAltFieldsKeyOauthtokenOnBehalfOfContentOwner): Request_[Video]
}

object VideosResource {
  @scala.inline
  def apply(
    delete: AnonAltFieldsIdKeyOauthtoken => Request_[Unit],
    getRating: AnonAltFieldsIdKeyOauthtoken => Request_[VideoGetRatingResponse],
    insert: AnonAltAutoLevels => Request_[Video],
    list: AnonAltChart => Request_[VideoListResponse],
    rate: AnonAltFieldsIdKeyOauthtokenPrettyPrintQuotaUser => Request_[Unit],
    reportAbuse: AnonAltFieldsKeyOauthtokenOnBehalfOfContentOwnerPrettyPrintQuotaUser => Request_[Unit],
    update: AnonAltFieldsKeyOauthtokenOnBehalfOfContentOwner => Request_[Video]
  ): VideosResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), getRating = js.Any.fromFunction1(getRating), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), rate = js.Any.fromFunction1(rate), reportAbuse = js.Any.fromFunction1(reportAbuse), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[VideosResource]
  }
}

