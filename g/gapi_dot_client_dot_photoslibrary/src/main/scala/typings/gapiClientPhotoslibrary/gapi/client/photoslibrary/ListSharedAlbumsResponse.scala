package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSharedAlbumsResponse extends js.Object {
  /**
    * Output only. Token to use to get the next set of shared albums. Populated
    * if there are more shared albums to retrieve for this request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** Output only. List of shared albums. */
  var sharedAlbums: js.UndefOr[js.Array[Album]] = js.native
}

object ListSharedAlbumsResponse {
  @scala.inline
  def apply(): ListSharedAlbumsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSharedAlbumsResponse]
  }
  @scala.inline
  implicit class ListSharedAlbumsResponseOps[Self <: ListSharedAlbumsResponse] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setSharedAlbumsVarargs(value: Album*): Self = this.set("sharedAlbums", js.Array(value :_*))
    @scala.inline
    def setSharedAlbums(value: js.Array[Album]): Self = this.set("sharedAlbums", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharedAlbums: Self = this.set("sharedAlbums", js.undefined)
  }
  
}

