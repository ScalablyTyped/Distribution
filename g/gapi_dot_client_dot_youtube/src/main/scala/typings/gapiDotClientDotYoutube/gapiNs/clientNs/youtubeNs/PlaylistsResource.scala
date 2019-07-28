package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotYoutube.Anon_AltChannelIdFieldsHlId
import typings.gapiDotClientDotYoutube.Anon_AltFieldsIdKeyOauthtoken
import typings.gapiDotClientDotYoutube.Anon_AltFieldsKeyOauthtoken
import typings.gapiDotClientDotYoutube.Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistsResource extends js.Object {
  /** Deletes a playlist. */
  def delete(request: Anon_AltFieldsIdKeyOauthtoken): Request[Unit]
  /** Creates a playlist. */
  def insert(request: Anon_AltFieldsKeyOauthtoken): Request[Playlist]
  /**
    * Returns a collection of playlists that match the API request parameters. For example, you can retrieve all playlists that the authenticated user owns,
    * or you can retrieve one or more playlists by their unique IDs.
    */
  def list(request: Anon_AltChannelIdFieldsHlId): Request[PlaylistListResponse]
  /** Modifies a playlist. For example, you could change a playlist's title, description, or privacy status. */
  def update(request: Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwner): Request[Playlist]
}

object PlaylistsResource {
  @scala.inline
  def apply(
    delete: Anon_AltFieldsIdKeyOauthtoken => Request[Unit],
    insert: Anon_AltFieldsKeyOauthtoken => Request[Playlist],
    list: Anon_AltChannelIdFieldsHlId => Request[PlaylistListResponse],
    update: Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwner => Request[Playlist]
  ): PlaylistsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[PlaylistsResource]
  }
}

