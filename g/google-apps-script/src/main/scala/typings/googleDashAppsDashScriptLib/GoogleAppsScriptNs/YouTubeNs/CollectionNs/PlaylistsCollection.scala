package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaylistsCollection extends js.Object {
  // Creates a playlist.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.Playlist,
    part: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.Playlist = js.native
  // Creates a playlist.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.Playlist,
    part: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.Playlist = js.native
  // Returns a collection of playlists that match the API request parameters. For example, you can retrieve all playlists that the authenticated user owns, or you can retrieve one or more playlists by their unique IDs.
  def list(part: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.PlaylistListResponse = js.native
  // Returns a collection of playlists that match the API request parameters. For example, you can retrieve all playlists that the authenticated user owns, or you can retrieve one or more playlists by their unique IDs.
  def list(part: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.PlaylistListResponse = js.native
  // Deletes a playlist.
  def remove(id: java.lang.String): scala.Unit = js.native
  // Deletes a playlist.
  def remove(id: java.lang.String, optionalArgs: js.Object): scala.Unit = js.native
  // Modifies a playlist. For example, you could change a playlist's title, description, or privacy status.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.Playlist,
    part: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.Playlist = js.native
  // Modifies a playlist. For example, you could change a playlist's title, description, or privacy status.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.Playlist,
    part: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs.Playlist = js.native
}

