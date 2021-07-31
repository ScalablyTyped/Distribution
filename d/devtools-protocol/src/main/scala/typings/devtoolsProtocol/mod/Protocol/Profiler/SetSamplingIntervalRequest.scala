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
  
  @scala.inline
  def apply(interval: integer): SetSamplingIntervalRequest = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSamplingIntervalRequest]
  }
  
  @scala.inline
  implicit class SetSamplingIntervalRequestMutableBuilder[Self <: SetSamplingIntervalRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterval(value: integer): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
  }
}
