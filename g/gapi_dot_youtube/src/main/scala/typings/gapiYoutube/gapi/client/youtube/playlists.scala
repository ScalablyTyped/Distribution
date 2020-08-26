package typings.gapiYoutube.gapi.client.youtube

import typings.gapi.gapi.client.HttpRequest
import typings.gapiYoutube.GoogleApiYouTubePaginationInfo
import typings.gapiYoutube.GoogleApiYouTubePlaylistResource
import typings.gapiYoutube.anon.Id
import typings.gapiYoutube.anon.Mine
import typings.gapiYoutube.anon.Part
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait playlists extends js.Object {
  /**
    * Deletes a playlist.
    */
  def delete(`object`: Id): HttpRequest[GoogleApiYouTubePlaylistResource] = js.native
  /**
    * Creates a playlist.
    */
  def insert(`object`: Part): HttpRequest[GoogleApiYouTubePlaylistResource] = js.native
  /**
    * Returns a collection of playlists that match the API request parameters. For example, you can retrieve all playlists that the authenticated user owns, or you can retrieve one or more playlists by their unique IDs.
    */
  def list(`object`: Mine): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistResource]] = js.native
  /**
    * Modifies a playlist. For example, you could change a playlist's title, description, or privacy status.
    */
  def update(`object`: Part): HttpRequest[GoogleApiYouTubePlaylistResource] = js.native
}

object playlists {
  @scala.inline
  def apply(
    delete: Id => HttpRequest[GoogleApiYouTubePlaylistResource],
    insert: Part => HttpRequest[GoogleApiYouTubePlaylistResource],
    list: Mine => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistResource]],
    update: Part => HttpRequest[GoogleApiYouTubePlaylistResource]
  ): playlists = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[playlists]
  }
  @scala.inline
  implicit class playlistsOps[Self <: playlists] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelete(value: Id => HttpRequest[GoogleApiYouTubePlaylistResource]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Part => HttpRequest[GoogleApiYouTubePlaylistResource]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Mine => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistResource]]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Part => HttpRequest[GoogleApiYouTubePlaylistResource]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

