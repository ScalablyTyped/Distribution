package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs.Playlist
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs.PlaylistListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaylistsCollection extends js.Object {
  // Creates a playlist.
  def insert(resource: Playlist, part: String): Playlist = js.native
  // Creates a playlist.
  def insert(resource: Playlist, part: String, optionalArgs: js.Object): Playlist = js.native
  // Returns a collection of playlists that match the API request parameters. For example, you can retrieve all playlists that the authenticated user owns, or you can retrieve one or more playlists by their unique IDs.
  def list(part: String): PlaylistListResponse = js.native
  // Returns a collection of playlists that match the API request parameters. For example, you can retrieve all playlists that the authenticated user owns, or you can retrieve one or more playlists by their unique IDs.
  def list(part: String, optionalArgs: js.Object): PlaylistListResponse = js.native
  // Deletes a playlist.
  def remove(id: String): Unit = js.native
  // Deletes a playlist.
  def remove(id: String, optionalArgs: js.Object): Unit = js.native
  // Modifies a playlist. For example, you could change a playlist's title, description, or privacy status.
  def update(resource: Playlist, part: String): Playlist = js.native
  // Modifies a playlist. For example, you could change a playlist's title, description, or privacy status.
  def update(resource: Playlist, part: String, optionalArgs: js.Object): Playlist = js.native
}

