package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutube.anon.Part
import typings.gapiClientYoutube.anon.PlaylistId
import typings.gapiClientYoutube.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaylistItemsResource extends js.Object {
  /** Deletes a playlist item. */
  def delete(request: PrettyPrint): Request[Unit] = js.native
  /** Adds a resource to a playlist. */
  def insert(request: Part): Request[PlaylistItem] = js.native
  /**
    * Returns a collection of playlist items that match the API request parameters. You can retrieve all of the playlist items in a specified playlist or
    * retrieve one or more playlist items by their unique IDs.
    */
  def list(request: PlaylistId): Request[PlaylistItemListResponse] = js.native
  /** Modifies a playlist item. For example, you could update the item's position in the playlist. */
  def update(request: Part): Request[PlaylistItem] = js.native
}

object PlaylistItemsResource {
  @scala.inline
  def apply(
    delete: PrettyPrint => Request[Unit],
    insert: Part => Request[PlaylistItem],
    list: PlaylistId => Request[PlaylistItemListResponse],
    update: Part => Request[PlaylistItem]
  ): PlaylistItemsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PlaylistItemsResource]
  }
  @scala.inline
  implicit class PlaylistItemsResourceOps[Self <: PlaylistItemsResource] (val x: Self) extends AnyVal {
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
    def setInsert(value: Part => Request[PlaylistItem]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: PlaylistId => Request[PlaylistItemListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Part => Request[PlaylistItem]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

