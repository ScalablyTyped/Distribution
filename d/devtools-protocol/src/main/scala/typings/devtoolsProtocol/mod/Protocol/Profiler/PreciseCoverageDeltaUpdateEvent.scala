package typings.devtoolsProtocol.mod.Protocol.Profiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreciseCoverageDeltaUpdateEvent extends StObject {
  
  /**
    * Identifier for distinguishing coverage events.
    */
  var occasion: String
  
  /**
    * Coverage data for the current isolate.
    */
  var result: js.Array[ScriptCoverage]
  
  /**
    * Monotonically increasing time (in seconds) when the coverage update was taken in the backend.
    */
  var timestamp: Double
}
object PreciseCoverageDeltaUpdateEvent {
  
  inline def apply(occasion: String, result: js.Array[ScriptCoverage], timestamp: Double): PreciseCoverageDeltaUpdateEvent = {
    val __obj = js.Dynamic.literal(occasion = occasion.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreciseCoverageDeltaUpdateEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreciseCoverageDeltaUpdateEvent] (val x: Self) extends AnyVal {
    
    inline def setOccasion(value: String): Self = StObject.set(x, "occasion", value.asInstanceOf[js.Any])
    
    inline def setResult(value: js.Array[ScriptCoverage]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultVarargs(value: ScriptCoverage*): Self = StObject.set(x, "result", js.Array(value*))
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
