package typings.devtoolsProtocol.mod.Protocol.Animation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCurrentTimeResponse extends StObject {
  
  /**
    * Current time of the page.
    */
  var currentTime: Double = js.native
}
object GetCurrentTimeResponse {
  
  @scala.inline
  def apply(currentTime: Double): GetCurrentTimeResponse = {
    val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCurrentTimeResponse]
  }
  
  @scala.inline
  implicit class GetCurrentTimeResponseMutableBuilder[Self <: GetCurrentTimeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
  }
}
