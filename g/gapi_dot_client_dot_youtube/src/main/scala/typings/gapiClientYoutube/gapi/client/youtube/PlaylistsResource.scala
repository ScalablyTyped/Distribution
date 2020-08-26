package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutube.anon.AltChannelId
import typings.gapiClientYoutube.anon.OnBehalfOfContentOwnerChannel
import typings.gapiClientYoutube.anon.Part
import typings.gapiClientYoutube.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaylistsResource extends js.Object {
  /** Deletes a playlist. */
  def delete(request: PrettyPrint): Request[Unit] = js.native
  /** Creates a playlist. */
  def insert(request: OnBehalfOfContentOwnerChannel): Request[Playlist] = js.native
  /**
    * Returns a collection of playlists that match the API request parameters. For example, you can retrieve all playlists that the authenticated user owns,
    * or you can retrieve one or more playlists by their unique IDs.
    */
  def list(request: AltChannelId): Request[PlaylistListResponse] = js.native
  /** Modifies a playlist. For example, you could change a playlist's title, description, or privacy status. */
  def update(request: Part): Request[Playlist] = js.native
}

object PlaylistsResource {
  @scala.inline
  def apply(
    delete: PrettyPrint => Request[Unit],
    insert: OnBehalfOfContentOwnerChannel => Request[Playlist],
    list: AltChannelId => Request[PlaylistListResponse],
    update: Part => Request[Playlist]
  ): PlaylistsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PlaylistsResource]
  }
  @scala.inline
  implicit class PlaylistsResourceOps[Self <: PlaylistsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelete(value: PrettyPrint => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: OnBehalfOfContentOwnerChannel => Request[Playlist]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: AltChannelId => Request[PlaylistListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Part => Request[Playlist]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

