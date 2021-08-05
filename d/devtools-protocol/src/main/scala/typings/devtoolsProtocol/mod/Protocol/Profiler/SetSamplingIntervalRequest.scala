package typings.devtoolsProtocol.mod.Protocol.Profiler

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetSamplingIntervalRequest extends StObject {
  
  /**
    * New sampling interval in microseconds.
    */
  var interval: integer
}
object SetSamplingIntervalRequest {
  
  inline def apply(interval: integer): SetSamplingIntervalRequest = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSamplingIntervalRequest]
  }
  
  extension [Self <: SetSamplingIntervalRequest](x: Self) {
    
    inline def setInterval(value: integer): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
  }
}
