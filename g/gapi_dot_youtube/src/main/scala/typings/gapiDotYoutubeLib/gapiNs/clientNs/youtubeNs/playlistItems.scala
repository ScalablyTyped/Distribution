package typings
package gapiDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait playlistItems extends js.Object {
  /**
    * Deletes a playlist item.
    */
  def delete(`object`: gapiDotYoutubeLib.Anon_Id): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubePlaylistItemResource]
  /**
    * Adds a resource to a playlist.
    */
  def insert(`object`: gapiDotYoutubeLib.Anon_Part): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubePlaylistItemResource]
  /**
    * Returns a collection of playlist items that match the API request parameters. You can retrieve all of the playlist items in a specified playlist or retrieve one or more playlist items by their unique IDs.
    */
  def list(`object`: gapiDotYoutubeLib.Anon_IdMaxResults): gapiLib.gapiNs.clientNs.HttpRequest[
    gapiDotYoutubeLib.GoogleApiYouTubePaginationInfo[gapiDotYoutubeLib.GoogleApiYouTubePlaylistItemResource]
  ]
  /**
    * Modifies a playlist item. For example, you could update the item's position in the playlist.
    */
  def update(`object`: gapiDotYoutubeLib.Anon_Part): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubePlaylistItemResource]
}

object playlistItems {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotYoutubeLib.Anon_Id, 
      gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubePlaylistItemResource]
    ],
    insert: js.Function1[
      gapiDotYoutubeLib.Anon_Part, 
      gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubePlaylistItemResource]
    ],
    list: js.Function1[
      gapiDotYoutubeLib.Anon_IdMaxResults, 
      gapiLib.gapiNs.clientNs.HttpRequest[
        gapiDotYoutubeLib.GoogleApiYouTubePaginationInfo[gapiDotYoutubeLib.GoogleApiYouTubePlaylistItemResource]
      ]
    ],
    update: js.Function1[
      gapiDotYoutubeLib.Anon_Part, 
      gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubePlaylistItemResource]
    ]
  ): playlistItems = {
    val __obj = js.Dynamic.literal(delete = delete, insert = insert, list = list, update = update)
  
    __obj.asInstanceOf[playlistItems]
  }
}

