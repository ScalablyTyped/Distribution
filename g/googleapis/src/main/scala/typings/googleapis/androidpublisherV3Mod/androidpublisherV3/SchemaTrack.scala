package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTrack extends StObject {
  
  /**
    * In a read request, represents all active releases in the track. In an update request, represents desired changes.
    */
  var releases: js.UndefOr[js.Array[SchemaTrackRelease]] = js.undefined
  
  /**
    * Identifier of the track.
    */
  var track: js.UndefOr[String | Null] = js.undefined
}
object SchemaTrack {
  
  inline def apply(): SchemaTrack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrack]
  }
  
  extension [Self <: SchemaTrack](x: Self) {
    
    inline def setReleases(value: js.Array[SchemaTrackRelease]): Self = StObject.set(x, "releases", value.asInstanceOf[js.Any])
    
    inline def setReleasesUndefined: Self = StObject.set(x, "releases", js.undefined)
    
    inline def setReleasesVarargs(value: SchemaTrackRelease*): Self = StObject.set(x, "releases", js.Array(value*))
    
    inline def setTrack(value: String): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackNull: Self = StObject.set(x, "track", null)
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
  }
}
