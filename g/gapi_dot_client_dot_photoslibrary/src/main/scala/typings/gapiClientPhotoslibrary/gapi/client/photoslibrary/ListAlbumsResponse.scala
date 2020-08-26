package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAlbumsResponse extends js.Object {
  /**
    * Output only. List of albums shown in the Albums tab of the user's Google
    * Photos app.
    */
  var albums: js.UndefOr[js.Array[Album]] = js.native
  /**
    * Output only. Token to use to get the next set of albums. Populated if
    * there are more albums to retrieve for this request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListAlbumsResponse {
  @scala.inline
  def apply(): ListAlbumsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAlbumsResponse]
  }
  @scala.inline
  implicit class ListAlbumsResponseOps[Self <: ListAlbumsResponse] (val x: Self) extends AnyVal {
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
    def setAlbumsVarargs(value: Album*): Self = this.set("albums", js.Array(value :_*))
    @scala.inline
    def setAlbums(value: js.Array[Album]): Self = this.set("albums", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlbums: Self = this.set("albums", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

