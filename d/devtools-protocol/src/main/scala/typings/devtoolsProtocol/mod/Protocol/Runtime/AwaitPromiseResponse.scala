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
  
  @scala.inline
  def apply(result: RemoteObject): AwaitPromiseResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwaitPromiseResponse]
  }
  
  @scala.inline
  implicit class AwaitPromiseResponseMutableBuilder[Self <: AwaitPromiseResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExceptionDetails(value: ExceptionDetails): Self = StObject.set(x, "exceptionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionDetailsUndefined: Self = StObject.set(x, "exceptionDetails", js.undefined)
    
    @scala.inline
    def setResult(value: RemoteObject): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
