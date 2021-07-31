package typings.devtoolsProtocol.mod.Protocol.HeapProfiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSamplingRequest extends StObject {
  
  /**
    * Average sample interval in bytes. Poisson distribution is used for the intervals. The
    * default value is 32768 bytes.
    */
  var samplingInterval: js.UndefOr[Double] = js.undefined
}
object StartSamplingRequest {
  
  @scala.inline
  def apply(): StartSamplingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSamplingRequest]
  }
  
  @scala.inline
  implicit class StartSamplingRequestMutableBuilder[Self <: StartSamplingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSamplingInterval(value: Double): Self = StObject.set(x, "samplingInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplingIntervalUndefined: Self = StObject.set(x, "samplingInterval", js.undefined)
  }
}
