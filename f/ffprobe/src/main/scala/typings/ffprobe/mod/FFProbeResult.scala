package typings.ffprobe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FFProbeResult extends StObject {
  
  var streams: js.Array[FFProbeStream]
}
object FFProbeResult {
  
  inline def apply(streams: js.Array[FFProbeStream]): FFProbeResult = {
    val __obj = js.Dynamic.literal(streams = streams.asInstanceOf[js.Any])
    __obj.asInstanceOf[FFProbeResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FFProbeResult] (val x: Self) extends AnyVal {
    
    inline def setStreams(value: js.Array[FFProbeStream]): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
    
    inline def setStreamsVarargs(value: FFProbeStream*): Self = StObject.set(x, "streams", js.Array(value*))
  }
}
