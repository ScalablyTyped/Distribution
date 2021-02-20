package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTracksListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidpublisher#tracksListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  var tracks: js.UndefOr[js.Array[SchemaTrack]] = js.native
}
object SchemaTracksListResponse {
  
  @scala.inline
  def apply(): SchemaTracksListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTracksListResponse]
  }
  
  @scala.inline
  implicit class SchemaTracksListResponseMutableBuilder[Self <: SchemaTracksListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setTracks(value: js.Array[SchemaTrack]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    
    @scala.inline
    def setTracksVarargs(value: SchemaTrack*): Self = StObject.set(x, "tracks", js.Array(value :_*))
  }
}
