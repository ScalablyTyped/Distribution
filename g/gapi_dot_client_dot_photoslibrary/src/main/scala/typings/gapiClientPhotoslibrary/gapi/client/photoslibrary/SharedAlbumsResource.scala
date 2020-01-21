package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPhotoslibrary.AnonAccesstokenAltCallback
import typings.gapiClientPhotoslibrary.AnonAccesstokenAltCallbackExcludeNonAppCreatedData
import typings.gapiClientPhotoslibrary.AnonAccesstokenAltCallbackFieldsKeyOauthtokenPrettyPrintQuotaUser
import typings.gapiClientPhotoslibrary.AnonAccesstokenAltCallbackFieldsKeyOauthtokenPrettyPrintQuotaUserResource
import typings.gapiClientPhotoslibrary.AnonAccesstokenAltCallbackFieldsKeyOauthtokenPrettyPrintQuotaUserResourceUploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedAlbumsResource extends js.Object {
  /** Returns the album based on the specified `shareToken`. */
  def get(request: AnonAccesstokenAltCallbackFieldsKeyOauthtokenPrettyPrintQuotaUser): Request_[Album] = js.native
  /** Joins a shared album on behalf of the Google Photos user. */
  def join(request: AnonAccesstokenAltCallbackFieldsKeyOauthtokenPrettyPrintQuotaUserResource): Request_[JoinSharedAlbumResponse] = js.native
  def join(request: AnonAccesstokenAltCallback, body: JoinSharedAlbumRequest): Request_[JoinSharedAlbumResponse] = js.native
  /**
    * Leaves a previously-joined shared album on behalf of the Google Photos
    * user. The user must not own this album.
    */
  def leave(request: AnonAccesstokenAltCallbackFieldsKeyOauthtokenPrettyPrintQuotaUserResourceUploadType): Request_[js.Object] = js.native
  def leave(request: AnonAccesstokenAltCallback, body: LeaveSharedAlbumRequest): Request_[js.Object] = js.native
  /**
    * Lists all shared albums available in the Sharing tab of the
    * user's Google Photos app.
    */
  def list(request: AnonAccesstokenAltCallbackExcludeNonAppCreatedData): Request_[ListSharedAlbumsResponse] = js.native
}

