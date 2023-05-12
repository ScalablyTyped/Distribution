package typings.ethers.typesUtilsErrorsMod

import typings.ethers.ethersStrings.INSUFFICIENT_FUNDS
import typings.ethers.typesProvidersProviderMod.TransactionRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsufficientFundsError
  extends StObject
     with EthersError[INSUFFICIENT_FUNDS] {
  
  /**
    *  The transaction.
    */
  var transaction: TransactionRequest
}
object InsufficientFundsError {
  
  inline def apply(code: ErrorCode, message: String, name: String, transaction: TransactionRequest): InsufficientFundsError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsufficientFundsError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsufficientFundsError] (val x: Self) extends AnyVal {
    
    inline def setTransaction(value: TransactionRequest): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
  }
}
