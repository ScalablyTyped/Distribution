package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTracksListResponse extends StObject {
  
  /**
    * The kind of this response ("androidpublisher#tracksListResponse").
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * All tracks.
    */
  var tracks: js.UndefOr[js.Array[SchemaTrack]] = js.undefined
}
object SchemaTracksListResponse {
  
  inline def apply(): SchemaTracksListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTracksListResponse]
  }
  
  extension [Self <: SchemaTracksListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setTracks(value: js.Array[SchemaTrack]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    
    inline def setTracksVarargs(value: SchemaTrack*): Self = StObject.set(x, "tracks", js.Array(value*))
  }
}
