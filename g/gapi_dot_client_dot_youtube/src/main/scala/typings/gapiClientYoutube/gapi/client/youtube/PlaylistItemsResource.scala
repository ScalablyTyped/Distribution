package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutube.AnonAltFieldsIdKeyMaxResultsOauthtoken
import typings.gapiClientYoutube.AnonAltFieldsIdKeyOauthtoken
import typings.gapiClientYoutube.AnonAltFieldsKeyOauthtokenOnBehalfOfContentOwner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistItemsResource extends js.Object {
  /** Deletes a playlist item. */
  def delete(request: AnonAltFieldsIdKeyOauthtoken): Request_[Unit]
  /** Adds a resource to a playlist. */
  def insert(request: AnonAltFieldsKeyOauthtokenOnBehalfOfContentOwner): Request_[PlaylistItem]
  /**
    * Returns a collection of playlist items that match the API request parameters. You can retrieve all of the playlist items in a specified playlist or
    * retrieve one or more playlist items by their unique IDs.
    */
  def list(request: AnonAltFieldsIdKeyMaxResultsOauthtoken): Request_[PlaylistItemListResponse]
  /** Modifies a playlist item. For example, you could update the item's position in the playlist. */
  def update(request: AnonAltFieldsKeyOauthtokenOnBehalfOfContentOwner): Request_[PlaylistItem]
}

object PlaylistItemsResource {
  @scala.inline
  def apply(
    delete: AnonAltFieldsIdKeyOauthtoken => Request_[Unit],
    insert: AnonAltFieldsKeyOauthtokenOnBehalfOfContentOwner => Request_[PlaylistItem],
    list: AnonAltFieldsIdKeyMaxResultsOauthtoken => Request_[PlaylistItemListResponse],
    update: AnonAltFieldsKeyOauthtokenOnBehalfOfContentOwner => Request_[PlaylistItem]
  ): PlaylistItemsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[PlaylistItemsResource]
  }
}

