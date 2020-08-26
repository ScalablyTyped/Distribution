package typings.gapiYoutube

import typings.gapiYoutube.anon.KindPlaylistId
import typings.gapiYoutube.anon.Thumbnails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleApiYouTubeSearchResource extends js.Object {
  /**
    * Etag of this resource.
    */
  var etag: String = js.native
  /**
    * The id object contains information that can be used to uniquely identify the resource that matches the search request.
    */
  var id: KindPlaylistId = js.native
  /**
    * The kind, fixed to "youtube#searchResult".
    */
  var kind: String = js.native
  /**
    * The snippet object contains basic details about a search result, such as its title or description.
    */
  var snippet: Thumbnails = js.native
}

object GoogleApiYouTubeSearchResource {
  @scala.inline
  def apply(etag: String, id: KindPlaylistId, kind: String, snippet: Thumbnails): GoogleApiYouTubeSearchResource = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubeSearchResource]
  }
  @scala.inline
  implicit class GoogleApiYouTubeSearchResourceOps[Self <: GoogleApiYouTubeSearchResource] (val x: Self) extends AnyVal {
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: KindPlaylistId): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnippet(value: Thumbnails): Self = this.set("snippet", value.asInstanceOf[js.Any])
  }
  
}

