package typings.ethers.typesUtilsErrorsMod

import typings.ethers.ethersStrings.TIMEOUT
import typings.ethers.typesUtilsFetchMod.FetchRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeoutError
  extends StObject
     with EthersError[TIMEOUT] {
  
  /**
    *  The attempted operation.
    */
  var operation: String
  
  /**
    *  The reason.
    */
  var reason: String
  
  /**
    *  The resource request, if available.
    */
  var request: js.UndefOr[FetchRequest] = js.undefined
}
object TimeoutError {
  
  inline def apply(code: ErrorCode, message: String, name: String, operation: String, reason: String): TimeoutError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeoutError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeoutError] (val x: Self) extends AnyVal {
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: FetchRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
  }
}
