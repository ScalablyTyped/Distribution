package typings
package gapiDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait playlists extends js.Object {
  /**
    * Deletes a playlist.
    */
  def delete(`object`: gapiDotYoutubeLib.Anon_Id): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubePlaylistResource]
  /**
    * Creates a playlist.
    */
  def insert(`object`: gapiDotYoutubeLib.Anon_Part): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubePlaylistResource]
  /**
    * Returns a collection of playlists that match the API request parameters. For example, you can retrieve all playlists that the authenticated user owns, or you can retrieve one or more playlists by their unique IDs.
    */
  def list(`object`: gapiDotYoutubeLib.Anon_ChannelIdId): gapiLib.gapiNs.clientNs.HttpRequest[
    gapiDotYoutubeLib.GoogleApiYouTubePaginationInfo[gapiDotYoutubeLib.GoogleApiYouTubePlaylistResource]
  ]
  /**
    * Modifies a playlist. For example, you could change a playlist's title, description, or privacy status.
    */
  def update(`object`: gapiDotYoutubeLib.Anon_Part): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubePlaylistResource]
}

object playlists {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotYoutubeLib.Anon_Id, 
      gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubePlaylistResource]
    ],
    insert: js.Function1[
      gapiDotYoutubeLib.Anon_Part, 
      gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubePlaylistResource]
    ],
    list: js.Function1[
      gapiDotYoutubeLib.Anon_ChannelIdId, 
      gapiLib.gapiNs.clientNs.HttpRequest[
        gapiDotYoutubeLib.GoogleApiYouTubePaginationInfo[gapiDotYoutubeLib.GoogleApiYouTubePlaylistResource]
      ]
    ],
    update: js.Function1[
      gapiDotYoutubeLib.Anon_Part, 
      gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubePlaylistResource]
    ]
  ): playlists = {
    val __obj = js.Dynamic.literal(delete = delete, insert = insert, list = list, update = update)
  
    __obj.asInstanceOf[playlists]
  }
}

