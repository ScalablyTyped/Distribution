package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutube.AnonPart
import typings.gapiClientYoutube.AnonPlaylistId
import typings.gapiClientYoutube.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistItemsResource extends js.Object {
  /** Deletes a playlist item. */
  def delete(request: AnonPrettyPrint): Request_[Unit]
  /** Adds a resource to a playlist. */
  def insert(request: AnonPart): Request_[PlaylistItem]
  /**
    * Returns a collection of playlist items that match the API request parameters. You can retrieve all of the playlist items in a specified playlist or
    * retrieve one or more playlist items by their unique IDs.
    */
  def list(request: AnonPlaylistId): Request_[PlaylistItemListResponse]
  /** Modifies a playlist item. For example, you could update the item's position in the playlist. */
  def update(request: AnonPart): Request_[PlaylistItem]
}

object PlaylistItemsResource {
  @scala.inline
  def apply(
    delete: AnonPrettyPrint => Request_[Unit],
    insert: AnonPart => Request_[PlaylistItem],
    list: AnonPlaylistId => Request_[PlaylistItemListResponse],
    update: AnonPart => Request_[PlaylistItem]
  ): PlaylistItemsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[PlaylistItemsResource]
  }
}

