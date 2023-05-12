package typings.ethers.typesUtilsErrorsMod

import typings.ethers.anon.ArgsMethod
import typings.ethers.anon.Name
import typings.ethers.ethersStrings.CALL_EXCEPTION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallExceptionError
  extends StObject
     with EthersError[CALL_EXCEPTION] {
  
  /**
    *  The action being performed when the revert was encountered.
    */
  var action: CallExceptionAction
  
  /**
    *  The revert data returned.
    */
  var data: Null | String
  
  /**
    *  The contract invocation details, if available.
    */
  var invocation: Null | ArgsMethod
  
  /**
    *  A human-readable representation of data, if possible.
    */
  var reason: Null | String
  
  /**
    *  The built-in or custom revert error, if available
    */
  var revert: Null | Name
  
  /**
    *  The transaction that triggered the exception.
    */
  var transaction: CallExceptionTransaction
}
object CallExceptionError {
  
  inline def apply(
    action: CallExceptionAction,
    code: ErrorCode,
    message: String,
    name: String,
    transaction: CallExceptionTransaction
  ): CallExceptionError = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any], data = null, invocation = null, reason = null, revert = null)
    __obj.asInstanceOf[CallExceptionError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CallExceptionError] (val x: Self) extends AnyVal {
    
    inline def setAction(value: CallExceptionAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setInvocation(value: ArgsMethod): Self = StObject.set(x, "invocation", value.asInstanceOf[js.Any])
    
    inline def setInvocationNull: Self = StObject.set(x, "invocation", null)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setRevert(value: Name): Self = StObject.set(x, "revert", value.asInstanceOf[js.Any])
    
    inline def setRevertNull: Self = StObject.set(x, "revert", null)
    
    inline def setTransaction(value: CallExceptionTransaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
  }
}
