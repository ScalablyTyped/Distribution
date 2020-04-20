package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutube.AnonAltChannelId
import typings.gapiClientYoutube.AnonOnBehalfOfContentOwnerChannel
import typings.gapiClientYoutube.AnonPart
import typings.gapiClientYoutube.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistsResource extends js.Object {
  /** Deletes a playlist. */
  def delete(request: AnonPrettyPrint): Request_[Unit]
  /** Creates a playlist. */
  def insert(request: AnonOnBehalfOfContentOwnerChannel): Request_[Playlist]
  /**
    * Returns a collection of playlists that match the API request parameters. For example, you can retrieve all playlists that the authenticated user owns,
    * or you can retrieve one or more playlists by their unique IDs.
    */
  def list(request: AnonAltChannelId): Request_[PlaylistListResponse]
  /** Modifies a playlist. For example, you could change a playlist's title, description, or privacy status. */
  def update(request: AnonPart): Request_[Playlist]
}

object PlaylistsResource {
  @scala.inline
  def apply(
    delete: AnonPrettyPrint => Request_[Unit],
    insert: AnonOnBehalfOfContentOwnerChannel => Request_[Playlist],
    list: AnonAltChannelId => Request_[PlaylistListResponse],
    update: AnonPart => Request_[Playlist]
  ): PlaylistsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PlaylistsResource]
  }
}

