package typings.googleAppsScript.GoogleAppsScript.YouTube.Collection

import typings.googleAppsScript.GoogleAppsScript.YouTube.Schema.PlaylistItem
import typings.googleAppsScript.GoogleAppsScript.YouTube.Schema.PlaylistItemListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaylistItemsCollection extends js.Object {
  
  // Adds a resource to a playlist.
  def insert(resource: PlaylistItem, part: String): PlaylistItem = js.native
  // Adds a resource to a playlist.
  def insert(resource: PlaylistItem, part: String, optionalArgs: js.Object): PlaylistItem = js.native
  
  // Returns a collection of playlist items that match the API request parameters. You can retrieve all of the playlist items in a specified playlist or retrieve one or more playlist items by their unique IDs.
  def list(part: String): PlaylistItemListResponse = js.native
  // Returns a collection of playlist items that match the API request parameters. You can retrieve all of the playlist items in a specified playlist or retrieve one or more playlist items by their unique IDs.
  def list(part: String, optionalArgs: js.Object): PlaylistItemListResponse = js.native
  
  // Deletes a playlist item.
  def remove(id: String): Unit = js.native
  // Deletes a playlist item.
  def remove(id: String, optionalArgs: js.Object): Unit = js.native
  
  // Modifies a playlist item. For example, you could update the item's position in the playlist.
  def update(resource: PlaylistItem, part: String): PlaylistItem = js.native
  // Modifies a playlist item. For example, you could update the item's position in the playlist.
  def update(resource: PlaylistItem, part: String, optionalArgs: js.Object): PlaylistItem = js.native
}
