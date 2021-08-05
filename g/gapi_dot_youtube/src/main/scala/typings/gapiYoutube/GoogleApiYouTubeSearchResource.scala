package typings.gapiYoutube

import typings.gapiYoutube.anon.KindPlaylistId
import typings.gapiYoutube.anon.Thumbnails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleApiYouTubeSearchResource extends StObject {
  
  /**
    * Etag of this resource.
    */
  var etag: String
  
  /**
    * The id object contains information that can be used to uniquely identify the resource that matches the search request.
    */
  var id: KindPlaylistId
  
  /**
    * The kind, fixed to "youtube#searchResult".
    */
  var kind: String
  
  /**
    * The snippet object contains basic details about a search result, such as its title or description.
    */
  var snippet: Thumbnails
}
object GoogleApiYouTubeSearchResource {
  
  inline def apply(etag: String, id: KindPlaylistId, kind: String, snippet: Thumbnails): GoogleApiYouTubeSearchResource = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubeSearchResource]
  }
  
  extension [Self <: GoogleApiYouTubeSearchResource](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setId(value: KindPlaylistId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setSnippet(value: Thumbnails): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
  }
}
