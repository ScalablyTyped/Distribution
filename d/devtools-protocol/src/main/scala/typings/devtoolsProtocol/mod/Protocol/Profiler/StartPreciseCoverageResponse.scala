package typings.devtoolsProtocol.mod.Protocol.Profiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartPreciseCoverageResponse extends StObject {
  
  /**
    * Monotonically increasing time (in seconds) when the coverage update was taken in the backend.
    */
  var timestamp: Double = js.native
}
object StartPreciseCoverageResponse {
  
  @scala.inline
  def apply(timestamp: Double): StartPreciseCoverageResponse = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartPreciseCoverageResponse]
  }
  
  @scala.inline
  implicit class StartPreciseCoverageResponseMutableBuilder[Self <: StartPreciseCoverageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
