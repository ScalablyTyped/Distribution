package typings.gapiYoutube

import typings.gapiYoutube.anon.ChannelTitle
import typings.gapiYoutube.anon.EndAt
import typings.gapiYoutube.anon.PrivacyStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleApiYouTubePlaylistItemResource extends StObject {
  
  /**
    * The contentDetails object is included in the resource if the included item is a YouTube video. The object contains additional information about the video.
    */
  var contentDetails: EndAt
  
  /**
    * The ETag for the playlist item resource.
    */
  var etag: String
  
  /**
    * The ID that YouTube uses to uniquely identify the playlist item.
    */
  var id: String
  
  /**
    * The type of the API resource. For playlist item resources, the value will be youtube#playlistItem.
    */
  var kind: String
  
  /**
    * The snippet object contains basic details about the playlist item, such as its title and position in the playlist.
    */
  var snippet: ChannelTitle
  
  /**
    * The status object contains information about the playlist items privacy status.
    */
  var status: PrivacyStatus
}
object GoogleApiYouTubePlaylistItemResource {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: GoogleApiYouTubePlaylistItemResource] (val x: Self) extends AnyVal {
    
    inline def setContentDetails(value: EndAt): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setSnippet(value: ChannelTitle): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: PrivacyStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
