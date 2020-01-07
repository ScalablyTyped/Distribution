package typings.gapiDotClientDotPhotoslibrary.gapi.client.photoslibrary

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotPhotoslibrary.Anon_AccesstokenAltCallback
import typings.gapiDotClientDotPhotoslibrary.Anon_AccesstokenAltCallbackExcludeNonAppCreatedData
import typings.gapiDotClientDotPhotoslibrary.Anon_AccesstokenAltCallbackFieldsKeyOauthtokenPrettyPrintQuotaUser
import typings.gapiDotClientDotPhotoslibrary.Anon_AccesstokenAltCallbackFieldsKeyOauthtokenPrettyPrintQuotaUserResource
import typings.gapiDotClientDotPhotoslibrary.Anon_AccesstokenAltCallbackFieldsKeyOauthtokenPrettyPrintQuotaUserResourceUploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedAlbumsResource extends js.Object {
  /** Returns the album based on the specified `shareToken`. */
  def get(request: Anon_AccesstokenAltCallbackFieldsKeyOauthtokenPrettyPrintQuotaUser): Request[Album] = js.native
  /** Joins a shared album on behalf of the Google Photos user. */
  def join(request: Anon_AccesstokenAltCallbackFieldsKeyOauthtokenPrettyPrintQuotaUserResource): Request[JoinSharedAlbumResponse] = js.native
  def join(request: Anon_AccesstokenAltCallback, body: JoinSharedAlbumRequest): Request[JoinSharedAlbumResponse] = js.native
  /**
    * Leaves a previously-joined shared album on behalf of the Google Photos
    * user. The user must not own this album.
    */
  def leave(request: Anon_AccesstokenAltCallbackFieldsKeyOauthtokenPrettyPrintQuotaUserResourceUploadType): Request[js.Object] = js.native
  def leave(request: Anon_AccesstokenAltCallback, body: LeaveSharedAlbumRequest): Request[js.Object] = js.native
  /**
    * Lists all shared albums available in the Sharing tab of the
    * user's Google Photos app.
    */
  def list(request: Anon_AccesstokenAltCallbackExcludeNonAppCreatedData): Request[ListSharedAlbumsResponse] = js.native
}

