package typings.devtoolsProtocol.mod.Protocol.Profiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartPreciseCoverageResponse extends StObject {
  
  /**
    * Monotonically increasing time (in seconds) when the coverage update was taken in the backend.
    */
  var timestamp: Double
}
object StartPreciseCoverageResponse {
  
  inline def apply(timestamp: Double): StartPreciseCoverageResponse = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartPreciseCoverageResponse]
  }
  
  extension [Self <: StartPreciseCoverageResponse](x: Self) {
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
