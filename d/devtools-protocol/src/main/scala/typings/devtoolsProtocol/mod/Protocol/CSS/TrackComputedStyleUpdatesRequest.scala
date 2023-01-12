package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackComputedStyleUpdatesRequest extends StObject {
  
  var propertiesToTrack: js.Array[CSSComputedStyleProperty]
}
object TrackComputedStyleUpdatesRequest {
  
  inline def apply(propertiesToTrack: js.Array[CSSComputedStyleProperty]): TrackComputedStyleUpdatesRequest = {
    val __obj = js.Dynamic.literal(propertiesToTrack = propertiesToTrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackComputedStyleUpdatesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrackComputedStyleUpdatesRequest] (val x: Self) extends AnyVal {
    
    inline def setPropertiesToTrack(value: js.Array[CSSComputedStyleProperty]): Self = StObject.set(x, "propertiesToTrack", value.asInstanceOf[js.Any])
    
    inline def setPropertiesToTrackVarargs(value: CSSComputedStyleProperty*): Self = StObject.set(x, "propertiesToTrack", js.Array(value*))
  }
}
