package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PlaylistsResource extends js.Object {
  /** Deletes a playlist. */
  def delete(request: gapiDotClientDotYoutubeLib.Anon_PrettyPrintQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Creates a playlist. */
  def insert(request: gapiDotClientDotYoutubeLib.Anon_PrettyPrintOnBehalfOfContentOwnerChannel): gapiDotClientLib.gapiNs.clientNs.Request[Playlist]
  /**
               * Returns a collection of playlists that match the API request parameters. For example, you can retrieve all playlists that the authenticated user owns,
               * or you can retrieve one or more playlists by their unique IDs.
               */
  def list(request: gapiDotClientDotYoutubeLib.Anon_HlMineMaxResults): gapiDotClientLib.gapiNs.clientNs.Request[PlaylistListResponse]
  /** Modifies a playlist. For example, you could change a playlist's title, description, or privacy status. */
  def update(request: gapiDotClientDotYoutubeLib.Anon_PrettyPrintQuotaUserKeyUserIp): gapiDotClientLib.gapiNs.clientNs.Request[Playlist]
}

