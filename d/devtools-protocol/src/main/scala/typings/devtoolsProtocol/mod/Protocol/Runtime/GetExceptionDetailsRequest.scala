package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExceptionDetailsRequest extends StObject {
  
  /**
    * The error object for which to resolve the exception details.
    */
  var errorObjectId: RemoteObjectId
}
object GetExceptionDetailsRequest {
  
  inline def apply(errorObjectId: RemoteObjectId): GetExceptionDetailsRequest = {
    val __obj = js.Dynamic.literal(errorObjectId = errorObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExceptionDetailsRequest]
  }
  
  extension [Self <: GetExceptionDetailsRequest](x: Self) {
    
    inline def setErrorObjectId(value: RemoteObjectId): Self = StObject.set(x, "errorObjectId", value.asInstanceOf[js.Any])
  }
}
