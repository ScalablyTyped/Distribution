package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackComputedStyleUpdatesRequest extends StObject {
  
  var propertiesToTrack: js.Array[CSSComputedStyleProperty] = js.native
}
object TrackComputedStyleUpdatesRequest {
  
  @scala.inline
  def apply(propertiesToTrack: js.Array[CSSComputedStyleProperty]): TrackComputedStyleUpdatesRequest = {
    val __obj = js.Dynamic.literal(propertiesToTrack = propertiesToTrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackComputedStyleUpdatesRequest]
  }
  
  @scala.inline
  implicit class TrackComputedStyleUpdatesRequestMutableBuilder[Self <: TrackComputedStyleUpdatesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPropertiesToTrack(value: js.Array[CSSComputedStyleProperty]): Self = StObject.set(x, "propertiesToTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesToTrackVarargs(value: CSSComputedStyleProperty*): Self = StObject.set(x, "propertiesToTrack", js.Array(value :_*))
  }
}
