package typings.gapiYoutube

import typings.gapiYoutube.anon.ChannelTitle
import typings.gapiYoutube.anon.EndAt
import typings.gapiYoutube.anon.PrivacyStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleApiYouTubePlaylistItemResource extends js.Object {
  
  /**
    * The contentDetails object is included in the resource if the included item is a YouTube video. The object contains additional information about the video.
    */
  var contentDetails: EndAt = js.native
  
  /**
    * The ETag for the playlist item resource.
    */
  var etag: String = js.native
  
  /**
    * The ID that YouTube uses to uniquely identify the playlist item.
    */
  var id: String = js.native
  
  /**
    * The type of the API resource. For playlist item resources, the value will be youtube#playlistItem.
    */
  var kind: String = js.native
  
  /**
    * The snippet object contains basic details about the playlist item, such as its title and position in the playlist.
    */
  var snippet: ChannelTitle = js.native
  
  /**
    * The status object contains information about the playlist items privacy status.
    */
  var status: PrivacyStatus = js.native
}
object GoogleApiYouTubePlaylistItemResource {
  
  @scala.inline
  def apply(
    contentDetails: EndAt,
    etag: String,
    id: String,
    kind: String,
    snippet: ChannelTitle,
    status: PrivacyStatus
  ): GoogleApiYouTubePlaylistItemResource = {
    val __obj = js.Dynamic.literal(contentDetails = contentDetails.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubePlaylistItemResource]
  }
  
  @scala.inline
  implicit class GoogleApiYouTubePlaylistItemResourceOps[Self <: GoogleApiYouTubePlaylistItemResource] (val x: Self) extends AnyVal {
    
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
    def setContentDetails(value: EndAt): Self = this.set("contentDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippet(value: ChannelTitle): Self = this.set("snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: PrivacyStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
