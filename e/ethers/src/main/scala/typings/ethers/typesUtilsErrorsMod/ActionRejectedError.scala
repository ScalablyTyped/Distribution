package typings.ethers.typesUtilsErrorsMod

import typings.ethers.ethersStrings.ACTION_REJECTED
import typings.ethers.ethersStrings.expired
import typings.ethers.ethersStrings.pending
import typings.ethers.ethersStrings.rejected
import typings.ethers.ethersStrings.requestAccess
import typings.ethers.ethersStrings.sendTransaction
import typings.ethers.ethersStrings.signMessage
import typings.ethers.ethersStrings.signTransaction
import typings.ethers.ethersStrings.signTypedData
import typings.ethers.ethersStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionRejectedError
  extends StObject
     with EthersError[ACTION_REJECTED] {
  
  /**
    *  The requested action.
    */
  var action: requestAccess | sendTransaction | signMessage | signTransaction | signTypedData | unknown
  
  /**
    *  The reason the action was rejected.
    *
    *  If there is already a pending request, some clients may indicate
    *  there is already a ``"pending"`` action. This prevents an app
    *  from spamming the user.
    */
  var reason: expired | rejected | pending
}
object ActionRejectedError {
  
  inline def apply(
    action: requestAccess | sendTransaction | signMessage | signTransaction | signTypedData | unknown,
    code: ErrorCode,
    message: String,
    name: String,
    reason: expired | rejected | pending
  ): ActionRejectedError = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionRejectedError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionRejectedError] (val x: Self) extends AnyVal {
    
    inline def setAction(value: requestAccess | sendTransaction | signMessage | signTransaction | signTypedData | unknown): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setReason(value: expired | rejected | pending): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
