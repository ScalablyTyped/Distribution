package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwaitPromiseResponse extends StObject {
  
  /**
    * Exception details if stack strace is available.
    */
  var exceptionDetails: js.UndefOr[ExceptionDetails] = js.undefined
  
  /**
    * Promise result. Will contain rejected value if promise was rejected.
    */
  var result: RemoteObject
}
object AwaitPromiseResponse {
  
  inline def apply(result: RemoteObject): AwaitPromiseResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwaitPromiseResponse]
  }
  
  extension [Self <: AwaitPromiseResponse](x: Self) {
    
    inline def setExceptionDetails(value: ExceptionDetails): Self = StObject.set(x, "exceptionDetails", value.asInstanceOf[js.Any])
    
    inline def setExceptionDetailsUndefined: Self = StObject.set(x, "exceptionDetails", js.undefined)
    
    inline def setResult(value: RemoteObject): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
