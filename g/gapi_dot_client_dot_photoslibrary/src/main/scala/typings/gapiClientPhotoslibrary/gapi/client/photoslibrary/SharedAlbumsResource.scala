package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPhotoslibrary.anon.ExcludeNonAppCreatedData
import typings.gapiClientPhotoslibrary.anon.Key
import typings.gapiClientPhotoslibrary.anon.ShareToken
import typings.gapiClientPhotoslibrary.anon.UploadType
import typings.gapiClientPhotoslibrary.anon.Uploadprotocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedAlbumsResource extends js.Object {
  /** Returns the album based on the specified `shareToken`. */
  def get(request: ShareToken): Request[Album] = js.native
  def join(request: Key, body: JoinSharedAlbumRequest): Request[JoinSharedAlbumResponse] = js.native
  /** Joins a shared album on behalf of the Google Photos user. */
  def join(request: UploadType): Request[JoinSharedAlbumResponse] = js.native
  def leave(request: Key, body: LeaveSharedAlbumRequest): Request[js.Object] = js.native
  /**
    * Leaves a previously-joined shared album on behalf of the Google Photos
    * user. The user must not own this album.
    */
  def leave(request: Uploadprotocol): Request[js.Object] = js.native
  /**
    * Lists all shared albums available in the Sharing tab of the
    * user's Google Photos app.
    */
  def list(request: ExcludeNonAppCreatedData): Request[ListSharedAlbumsResponse] = js.native
}

