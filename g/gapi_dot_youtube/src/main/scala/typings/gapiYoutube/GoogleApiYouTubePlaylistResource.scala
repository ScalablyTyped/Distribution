package typings.gapiYoutube

import typings.gapiYoutube.anon.EmbedHtml
import typings.gapiYoutube.anon.ItemCount
import typings.gapiYoutube.anon.PrivacyStatus
import typings.gapiYoutube.anon.PublishedAt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleApiYouTubePlaylistResource extends StObject {
  
  /**
    * The contentDetails object contains information about the playlist content, including the number of videos in the playlist.
    */
  var contentDetails: ItemCount
  
  /**
    * The ETag for the playlist resource.
    */
  var etag: String
  
  /**
    * The ID that YouTube uses to uniquely identify the playlist.
    */
  var id: String
  
  /**
    * The type of the API resource. For video resources, the value will be youtube#playlist.
    */
  var kind: String
  
  /**
    * The player object contains information that you would use to play the playlist in an embedded player.
    */
  var player: EmbedHtml
  
  /**
    * The snippet object contains basic details about the playlist, such as its title and description.
    */
  var snippet: PublishedAt
  
  /**
    * The status object contains status information for the playlist.
    */
  var status: PrivacyStatus
}
object GoogleApiYouTubePlaylistResource {
  
  inline def apply(
    contentDetails: ItemCount,
    etag: String,
    id: String,
    kind: String,
    player: EmbedHtml,
    snippet: PublishedAt,
    status: PrivacyStatus
  ): GoogleApiYouTubePlaylistResource = {
    val __obj = js.Dynamic.literal(contentDetails = contentDetails.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], player = player.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubePlaylistResource]
  }
  
  extension [Self <: GoogleApiYouTubePlaylistResource](x: Self) {
    
    inline def setContentDetails(value: ItemCount): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setPlayer(value: EmbedHtml): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
    
    inline def setSnippet(value: PublishedAt): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: PrivacyStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
