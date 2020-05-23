package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutube.anon.Fields
import typings.gapiClientYoutube.anon.Id
import typings.gapiClientYoutube.anon.Key
import typings.gapiClientYoutube.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionsResource extends js.Object {
  /** Deletes a specified caption track. */
  def delete(request: Fields): Request[Unit]
  /**
    * Downloads a caption track. The caption track is returned in its original format unless the request specifies a value for the tfmt parameter and in its
    * original language unless the request specifies a value for the tlang parameter.
    */
  def download(request: Id): Request[Unit]
  /** Uploads a caption track. */
  def insert(request: Key): Request[Caption]
  /**
    * Returns a list of caption tracks that are associated with a specified video. Note that the API response does not contain the actual captions and that
    * the captions.download method provides the ability to retrieve a caption track.
    */
  def list(request: Oauthtoken): Request[CaptionListResponse]
  /** Updates a caption track. When updating a caption track, you can change the track's draft status, upload a new caption file for the track, or both. */
  def update(request: Key): Request[Caption]
}

object CaptionsResource {
  @scala.inline
  def apply(
    delete: Fields => Request[Unit],
    download: Id => Request[Unit],
    insert: Key => Request[Caption],
    list: Oauthtoken => Request[CaptionListResponse],
    update: Key => Request[Caption]
  ): CaptionsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), download = js.Any.fromFunction1(download), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CaptionsResource]
  }
}

