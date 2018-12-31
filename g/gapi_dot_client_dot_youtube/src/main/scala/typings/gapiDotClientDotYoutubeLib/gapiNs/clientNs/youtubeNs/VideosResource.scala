package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideosResource extends js.Object {
  /** Deletes a YouTube video. */
  def delete(request: gapiDotClientDotYoutubeLib.Anon_PrettyPrintQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves the ratings that the authorized user gave to a list of specified videos. */
  def getRating(request: gapiDotClientDotYoutubeLib.Anon_PrettyPrintQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[VideoGetRatingResponse]
  /** Uploads a video to YouTube and optionally sets the video's metadata. */
  def insert(request: gapiDotClientDotYoutubeLib.Anon_Stabilize): gapiDotClientLib.gapiNs.clientNs.Request[Video]
  /** Returns a list of videos that match the API request parameters. */
  def list(request: gapiDotClientDotYoutubeLib.Anon_RegionCode): gapiDotClientLib.gapiNs.clientNs.Request[VideoListResponse]
  /** Add a like or dislike rating to a video or remove a rating from a video. */
  def rate(request: gapiDotClientDotYoutubeLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Report abuse for a video. */
  def reportAbuse(request: gapiDotClientDotYoutubeLib.Anon_PrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Updates a video's metadata. */
  def update(request: gapiDotClientDotYoutubeLib.Anon_PrettyPrintQuotaUserKeyUserIp): gapiDotClientLib.gapiNs.clientNs.Request[Video]
}

