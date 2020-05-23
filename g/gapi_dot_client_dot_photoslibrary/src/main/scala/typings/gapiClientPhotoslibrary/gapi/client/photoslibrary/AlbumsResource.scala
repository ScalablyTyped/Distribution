package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPhotoslibrary.anon.Accesstoken
import typings.gapiClientPhotoslibrary.anon.AlbumId
import typings.gapiClientPhotoslibrary.anon.Alt
import typings.gapiClientPhotoslibrary.anon.Callback
import typings.gapiClientPhotoslibrary.anon.ExcludeNonAppCreatedData
import typings.gapiClientPhotoslibrary.anon.Fields
import typings.gapiClientPhotoslibrary.anon.Key
import typings.gapiClientPhotoslibrary.anon.Oauthtoken
import typings.gapiClientPhotoslibrary.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlbumsResource extends js.Object {
  /** Adds an enrichment at a specified position in a defined album. */
  def addEnrichment(request: Accesstoken): Request[AddEnrichmentToAlbumResponse] = js.native
  def addEnrichment(request: AlbumId, body: AddEnrichmentToAlbumRequest): Request[AddEnrichmentToAlbumResponse] = js.native
  def batchAddMediaItems(request: AlbumId, body: BatchAddMediaItemsToAlbumRequest): Request[js.Object] = js.native
  /**
    * Adds one or more media items in a user's Google Photos library to
    * an album. The media items and albums must have been created by the
    * developer via the API.
    *
    * Media items are added to the end of the album. If multiple media items are
    * given, they are added in the order specified in this call.
    *
    * Each album can contain up to 20,000 media items.
    *
    * Only media items that are in the user's library can be added to an
    * album. For albums that are shared, the album must either be owned by the
    * user or the user must have joined the album as a collaborator.
    *
    * Partial success is not supported. The entire request will fail if an
    * invalid media item or album is specified.
    */
  def batchAddMediaItems(request: Alt): Request[js.Object] = js.native
  def batchRemoveMediaItems(request: AlbumId, body: BatchRemoveMediaItemsFromAlbumRequest): Request[js.Object] = js.native
  /**
    * Removes one or more media items from a specified album. The media items and
    * the album must have been created by the developer via the API.
    *
    * For albums that are shared, this action is only supported for media items
    * that were added to the album by this user, or for all media items if the
    * album was created by this user.
    *
    * Partial success is not supported. The entire request will fail and no
    * action will be performed on the album if an invalid media item or album is
    * specified.
    */
  def batchRemoveMediaItems(request: Callback): Request[js.Object] = js.native
  /** Creates an album in a user's Google Photos library. */
  def create(request: Fields): Request[Album] = js.native
  def create(request: Key, body: CreateAlbumRequest): Request[Album] = js.native
  /**
    * Returns the album based on the specified `albumId`.
    * The `albumId` must be the ID of an album owned by the user or a shared
    * album that the user has joined.
    */
  def get(request: AlbumId): Request[Album] = js.native
  /**
    * Lists all albums shown to a user in the Albums tab of the Google
    * Photos app.
    */
  def list(request: ExcludeNonAppCreatedData): Request[ListAlbumsResponse] = js.native
  def share(request: AlbumId, body: ShareAlbumRequest): Request[ShareAlbumResponse] = js.native
  /**
    * Marks an album as shared and accessible to other users. This action can
    * only be performed on albums which were created by the developer via the
    * API.
    */
  def share(request: Oauthtoken): Request[ShareAlbumResponse] = js.native
  def unshare(request: AlbumId, body: UnshareAlbumRequest): Request[js.Object] = js.native
  /**
    * Marks a previously shared album as private. This means that the album is
    * no longer shared and all the non-owners will lose access to the album. All
    * non-owner content will be removed from the album. If a non-owner has
    * previously added the album to their library, they will retain all photos in
    * their library. This action can only be performed on albums which were
    * created by the developer via the API.
    */
  def unshare(request: PrettyPrint): Request[js.Object] = js.native
}

