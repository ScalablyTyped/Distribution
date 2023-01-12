package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CorsErrorStatus extends StObject {
  
  var corsError: CorsError
  
  var failedParameter: String
}
object CorsErrorStatus {
  
  inline def apply(corsError: CorsError, failedParameter: String): CorsErrorStatus = {
    val __obj = js.Dynamic.literal(corsError = corsError.asInstanceOf[js.Any], failedParameter = failedParameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorsErrorStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CorsErrorStatus] (val x: Self) extends AnyVal {
    
    inline def setCorsError(value: CorsError): Self = StObject.set(x, "corsError", value.asInstanceOf[js.Any])
    
    inline def setFailedParameter(value: String): Self = StObject.set(x, "failedParameter", value.asInstanceOf[js.Any])
  }
}
