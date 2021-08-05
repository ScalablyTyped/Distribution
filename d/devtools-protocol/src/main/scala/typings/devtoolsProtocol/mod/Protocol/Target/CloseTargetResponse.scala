package typings.devtoolsProtocol.mod.Protocol.Target

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseTargetResponse extends StObject {
  
  /**
    * Always set to true. If an error occurs, the response indicates protocol error.
    */
  var success: Boolean
}
object CloseTargetResponse {
  
  inline def apply(success: Boolean): CloseTargetResponse = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseTargetResponse]
  }
  
  extension [Self <: CloseTargetResponse](x: Self) {
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
