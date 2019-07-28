package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotYoutube.Anon_AltFields
import typings.gapiDotClientDotYoutube.Anon_AltFieldsId
import typings.gapiDotClientDotYoutube.Anon_AltFieldsIdKey
import typings.gapiDotClientDotYoutube.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionsResource extends js.Object {
  /** Deletes a specified caption track. */
  def delete(request: Anon_AltFields): Request[Unit]
  /**
    * Downloads a caption track. The caption track is returned in its original format unless the request specifies a value for the tfmt parameter and in its
    * original language unless the request specifies a value for the tlang parameter.
    */
  def download(request: Anon_AltFieldsId): Request[Unit]
  /** Uploads a caption track. */
  def insert(request: Anon_AltFieldsKey): Request[Caption]
  /**
    * Returns a list of caption tracks that are associated with a specified video. Note that the API response does not contain the actual captions and that
    * the captions.download method provides the ability to retrieve a caption track.
    */
  def list(request: Anon_AltFieldsIdKey): Request[CaptionListResponse]
  /** Updates a caption track. When updating a caption track, you can change the track's draft status, upload a new caption file for the track, or both. */
  def update(request: Anon_AltFieldsKey): Request[Caption]
}

object CaptionsResource {
  @scala.inline
  def apply(
    delete: Anon_AltFields => Request[Unit],
    download: Anon_AltFieldsId => Request[Unit],
    insert: Anon_AltFieldsKey => Request[Caption],
    list: Anon_AltFieldsIdKey => Request[CaptionListResponse],
    update: Anon_AltFieldsKey => Request[Caption]
  ): CaptionsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), download = js.Any.fromFunction1(download), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CaptionsResource]
  }
}

