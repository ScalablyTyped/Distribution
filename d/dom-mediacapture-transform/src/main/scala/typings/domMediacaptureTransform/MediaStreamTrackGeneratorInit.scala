package typings.domMediacaptureTransform

import typings.std.MediaStreamTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaStreamTrackGeneratorInit extends StObject {
  
  var kind: MediaStreamTrackGeneratorKind
  
  /**
    * (Optional) track to which the MediaStreamTrackGenerator will automatically forward control
    * signals. If signalTarget is provided and signalTarget.kind and kind do not match, the
    * MediaStreamTrackGenerator’s constructor will raise an exception.
    */
  var signalTarget: js.UndefOr[MediaStreamTrack] = js.undefined
}
object MediaStreamTrackGeneratorInit {
  
  inline def apply(kind: MediaStreamTrackGeneratorKind): MediaStreamTrackGeneratorInit = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamTrackGeneratorInit]
  }
  
  extension [Self <: MediaStreamTrackGeneratorInit](x: Self) {
    
    inline def setKind(value: MediaStreamTrackGeneratorKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setSignalTarget(value: MediaStreamTrack): Self = StObject.set(x, "signalTarget", value.asInstanceOf[js.Any])
    
    inline def setSignalTargetUndefined: Self = StObject.set(x, "signalTarget", js.undefined)
  }
}
