package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTrack extends StObject {
  
  /**
    * A list of all active releases in this track during a read request. On an
    * update request, it represents desired changes.
    */
  var releases: js.UndefOr[js.Array[SchemaTrackRelease]] = js.undefined
  
  /**
    * Identifier for this track.
    */
  var track: js.UndefOr[String] = js.undefined
}
object SchemaTrack {
  
  inline def apply(): SchemaTrack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrack]
  }
  
  extension [Self <: SchemaTrack](x: Self) {
    
    inline def setReleases(value: js.Array[SchemaTrackRelease]): Self = StObject.set(x, "releases", value.asInstanceOf[js.Any])
    
    inline def setReleasesUndefined: Self = StObject.set(x, "releases", js.undefined)
    
    inline def setReleasesVarargs(value: SchemaTrackRelease*): Self = StObject.set(x, "releases", js.Array(value :_*))
    
    inline def setTrack(value: String): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
  }
}
