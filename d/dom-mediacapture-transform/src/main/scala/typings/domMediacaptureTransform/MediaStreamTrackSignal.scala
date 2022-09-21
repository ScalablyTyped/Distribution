package typings.domMediacaptureTransform

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaStreamTrackSignal extends StObject {
  
  var signalType: MediaStreamTrackSignalType
}
object MediaStreamTrackSignal {
  
  inline def apply(signalType: MediaStreamTrackSignalType): MediaStreamTrackSignal = {
    val __obj = js.Dynamic.literal(signalType = signalType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamTrackSignal]
  }
  
  extension [Self <: MediaStreamTrackSignal](x: Self) {
    
    inline def setSignalType(value: MediaStreamTrackSignalType): Self = StObject.set(x, "signalType", value.asInstanceOf[js.Any])
  }
}
