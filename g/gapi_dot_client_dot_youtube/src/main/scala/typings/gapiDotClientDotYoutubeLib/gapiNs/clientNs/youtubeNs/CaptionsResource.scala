package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionsResource extends js.Object {
  /** Deletes a specified caption track. */
  def delete(request: gapiDotClientDotYoutubeLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /**
    * Downloads a caption track. The caption track is returned in its original format unless the request specifies a value for the tfmt parameter and in its
    * original language unless the request specifies a value for the tlang parameter.
    */
  def download(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Uploads a caption track. */
  def insert(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Caption]
  /**
    * Returns a list of caption tracks that are associated with a specified video. Note that the API response does not contain the actual captions and that
    * the captions.download method provides the ability to retrieve a caption track.
    */
  def list(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsIdKey): gapiDotClientLib.gapiNs.clientNs.Request[CaptionListResponse]
  /** Updates a caption track. When updating a caption track, you can change the track's draft status, upload a new caption file for the track, or both. */
  def update(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Caption]
}

object CaptionsResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotYoutubeLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    download: js.Function1[
      gapiDotClientDotYoutubeLib.Anon_AltFieldsId, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    insert: js.Function1[
      gapiDotClientDotYoutubeLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Caption]
    ],
    list: js.Function1[
      gapiDotClientDotYoutubeLib.Anon_AltFieldsIdKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[CaptionListResponse]
    ],
    update: js.Function1[
      gapiDotClientDotYoutubeLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Caption]
    ]
  ): CaptionsResource = {
    val __obj = js.Dynamic.literal(delete = delete, download = download, insert = insert, list = list, update = update)
  
    __obj.asInstanceOf[CaptionsResource]
  }
}

