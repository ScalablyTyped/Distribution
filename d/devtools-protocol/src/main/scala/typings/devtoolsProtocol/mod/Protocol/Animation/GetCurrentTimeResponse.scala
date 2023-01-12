package typings.devtoolsProtocol.mod.Protocol.Animation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCurrentTimeResponse extends StObject {
  
  /**
    * Current time of the page.
    */
  var currentTime: Double
}
object GetCurrentTimeResponse {
  
  inline def apply(currentTime: Double): GetCurrentTimeResponse = {
    val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCurrentTimeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCurrentTimeResponse] (val x: Self) extends AnyVal {
    
    inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
  }
}
