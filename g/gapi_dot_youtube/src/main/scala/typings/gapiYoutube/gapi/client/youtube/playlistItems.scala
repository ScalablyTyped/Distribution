package typings.gapiYoutube.gapi.client.youtube

import typings.gapi.gapi.client.HttpRequest
import typings.gapiYoutube.GoogleApiYouTubePaginationInfo
import typings.gapiYoutube.GoogleApiYouTubePlaylistItemResource
import typings.gapiYoutube.anon.Id
import typings.gapiYoutube.anon.MaxResults
import typings.gapiYoutube.anon.Part
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait playlistItems extends js.Object {
  
  /**
    * Deletes a playlist item.
    */
  def delete(`object`: Id): HttpRequest[GoogleApiYouTubePlaylistItemResource] = js.native
  
  /**
    * Adds a resource to a playlist.
    */
  def insert(`object`: Part): HttpRequest[GoogleApiYouTubePlaylistItemResource] = js.native
  
  /**
    * Returns a collection of playlist items that match the API request parameters. You can retrieve all of the playlist items in a specified playlist or retrieve one or more playlist items by their unique IDs.
    */
  def list(`object`: MaxResults): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistItemResource]] = js.native
  
  /**
    * Modifies a playlist item. For example, you could update the item's position in the playlist.
    */
  def update(`object`: Part): HttpRequest[GoogleApiYouTubePlaylistItemResource] = js.native
}
object playlistItems {
  
  @scala.inline
  def apply(
    delete: Id => HttpRequest[GoogleApiYouTubePlaylistItemResource],
    insert: Part => HttpRequest[GoogleApiYouTubePlaylistItemResource],
    list: MaxResults => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistItemResource]],
    update: Part => HttpRequest[GoogleApiYouTubePlaylistItemResource]
  ): playlistItems = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[playlistItems]
  }
  
  @scala.inline
  implicit class playlistItemsOps[Self <: playlistItems] (val x: Self) extends AnyVal {
    
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
    def setDelete(value: Id => HttpRequest[GoogleApiYouTubePlaylistItemResource]): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsert(value: Part => HttpRequest[GoogleApiYouTubePlaylistItemResource]): Self = this.set("insert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(
      value: MaxResults => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistItemResource]]
    ): Self = this.set("list", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: Part => HttpRequest[GoogleApiYouTubePlaylistItemResource]): Self = this.set("update", js.Any.fromFunction1(value))
  }
}
