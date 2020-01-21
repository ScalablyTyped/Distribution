package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutube.AnonAltFields
import typings.gapiClientYoutube.AnonAltFieldsId
import typings.gapiClientYoutube.AnonAltFieldsIdKey
import typings.gapiClientYoutube.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionsResource extends js.Object {
  /** Deletes a specified caption track. */
  def delete(request: AnonAltFields): Request_[Unit]
  /**
    * Downloads a caption track. The caption track is returned in its original format unless the request specifies a value for the tfmt parameter and in its
    * original language unless the request specifies a value for the tlang parameter.
    */
  def download(request: AnonAltFieldsId): Request_[Unit]
  /** Uploads a caption track. */
  def insert(request: AnonAltFieldsKey): Request_[Caption]
  /**
    * Returns a list of caption tracks that are associated with a specified video. Note that the API response does not contain the actual captions and that
    * the captions.download method provides the ability to retrieve a caption track.
    */
  def list(request: AnonAltFieldsIdKey): Request_[CaptionListResponse]
  /** Updates a caption track. When updating a caption track, you can change the track's draft status, upload a new caption file for the track, or both. */
  def update(request: AnonAltFieldsKey): Request_[Caption]
}

object CaptionsResource {
  @scala.inline
  def apply(
    delete: AnonAltFields => Request_[Unit],
    download: AnonAltFieldsId => Request_[Unit],
    insert: AnonAltFieldsKey => Request_[Caption],
    list: AnonAltFieldsIdKey => Request_[CaptionListResponse],
    update: AnonAltFieldsKey => Request_[Caption]
  ): CaptionsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), download = js.Any.fromFunction1(download), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CaptionsResource]
  }
}

