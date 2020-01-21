package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutube.AnonAltChannelIdFieldsHlId
import typings.gapiClientYoutube.AnonAltFieldsIdKeyOauthtoken
import typings.gapiClientYoutube.AnonAltFieldsKeyOauthtoken
import typings.gapiClientYoutube.AnonAltFieldsKeyOauthtokenOnBehalfOfContentOwner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistsResource extends js.Object {
  /** Deletes a playlist. */
  def delete(request: AnonAltFieldsIdKeyOauthtoken): Request_[Unit]
  /** Creates a playlist. */
  def insert(request: AnonAltFieldsKeyOauthtoken): Request_[Playlist]
  /**
    * Returns a collection of playlists that match the API request parameters. For example, you can retrieve all playlists that the authenticated user owns,
    * or you can retrieve one or more playlists by their unique IDs.
    */
  def list(request: AnonAltChannelIdFieldsHlId): Request_[PlaylistListResponse]
  /** Modifies a playlist. For example, you could change a playlist's title, description, or privacy status. */
  def update(request: AnonAltFieldsKeyOauthtokenOnBehalfOfContentOwner): Request_[Playlist]
}

object PlaylistsResource {
  @scala.inline
  def apply(
    delete: AnonAltFieldsIdKeyOauthtoken => Request_[Unit],
    insert: AnonAltFieldsKeyOauthtoken => Request_[Playlist],
    list: AnonAltChannelIdFieldsHlId => Request_[PlaylistListResponse],
    update: AnonAltFieldsKeyOauthtokenOnBehalfOfContentOwner => Request_[Playlist]
  ): PlaylistsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[PlaylistsResource]
  }
}

