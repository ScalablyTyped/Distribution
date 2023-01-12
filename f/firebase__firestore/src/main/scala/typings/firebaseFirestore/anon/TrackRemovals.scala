package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackRemovals extends StObject {
  
  var trackRemovals: Boolean
}
object TrackRemovals {
  
  inline def apply(trackRemovals: Boolean): TrackRemovals = {
    val __obj = js.Dynamic.literal(trackRemovals = trackRemovals.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackRemovals]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrackRemovals] (val x: Self) extends AnyVal {
    
    inline def setTrackRemovals(value: Boolean): Self = StObject.set(x, "trackRemovals", value.asInstanceOf[js.Any])
  }
}
