package typings.devtoolsProtocol.mod.Protocol.Profiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreciseCoverageDeltaUpdateEvent extends StObject {
  
  /**
    * Identifier for distinguishing coverage events.
    */
  var occassion: String = js.native
  
  /**
    * Coverage data for the current isolate.
    */
  var result: js.Array[ScriptCoverage] = js.native
  
  /**
    * Monotonically increasing time (in seconds) when the coverage update was taken in the backend.
    */
  var timestamp: Double = js.native
}
object PreciseCoverageDeltaUpdateEvent {
  
  @scala.inline
  def apply(occassion: String, result: js.Array[ScriptCoverage], timestamp: Double): PreciseCoverageDeltaUpdateEvent = {
    val __obj = js.Dynamic.literal(occassion = occassion.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreciseCoverageDeltaUpdateEvent]
  }
  
  @scala.inline
  implicit class PreciseCoverageDeltaUpdateEventMutableBuilder[Self <: PreciseCoverageDeltaUpdateEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOccassion(value: String): Self = StObject.set(x, "occassion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: js.Array[ScriptCoverage]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultVarargs(value: ScriptCoverage*): Self = StObject.set(x, "result", js.Array(value :_*))
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
