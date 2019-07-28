package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotYoutube.Anon_AltFieldsIdKeyMaxResultsOauthtoken
import typings.gapiDotClientDotYoutube.Anon_AltFieldsIdKeyOauthtoken
import typings.gapiDotClientDotYoutube.Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistItemsResource extends js.Object {
  /** Deletes a playlist item. */
  def delete(request: Anon_AltFieldsIdKeyOauthtoken): Request[Unit]
  /** Adds a resource to a playlist. */
  def insert(request: Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwner): Request[PlaylistItem]
  /**
    * Returns a collection of playlist items that match the API request parameters. You can retrieve all of the playlist items in a specified playlist or
    * retrieve one or more playlist items by their unique IDs.
    */
  def list(request: Anon_AltFieldsIdKeyMaxResultsOauthtoken): Request[PlaylistItemListResponse]
  /** Modifies a playlist item. For example, you could update the item's position in the playlist. */
  def update(request: Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwner): Request[PlaylistItem]
}

object PlaylistItemsResource {
  @scala.inline
  def apply(
    delete: Anon_AltFieldsIdKeyOauthtoken => Request[Unit],
    insert: Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwner => Request[PlaylistItem],
    list: Anon_AltFieldsIdKeyMaxResultsOauthtoken => Request[PlaylistItemListResponse],
    update: Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwner => Request[PlaylistItem]
  ): PlaylistItemsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[PlaylistItemsResource]
  }
}

