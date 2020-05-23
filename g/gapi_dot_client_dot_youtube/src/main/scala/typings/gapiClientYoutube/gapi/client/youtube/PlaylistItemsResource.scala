package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutube.anon.Part
import typings.gapiClientYoutube.anon.PlaylistId
import typings.gapiClientYoutube.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistItemsResource extends js.Object {
  /** Deletes a playlist item. */
  def delete(request: PrettyPrint): Request[Unit]
  /** Adds a resource to a playlist. */
  def insert(request: Part): Request[PlaylistItem]
  /**
    * Returns a collection of playlist items that match the API request parameters. You can retrieve all of the playlist items in a specified playlist or
    * retrieve one or more playlist items by their unique IDs.
    */
  def list(request: PlaylistId): Request[PlaylistItemListResponse]
  /** Modifies a playlist item. For example, you could update the item's position in the playlist. */
  def update(request: Part): Request[PlaylistItem]
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
}

