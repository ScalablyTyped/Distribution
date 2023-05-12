package typings.ethers.typesUtilsErrorsMod

import typings.ethers.ethersStrings.NONCE_EXPIRED
import typings.ethers.typesProvidersProviderMod.TransactionRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonceExpiredError
  extends StObject
     with EthersError[NONCE_EXPIRED] {
  
  /**
    *  The transaction.
    */
  var transaction: TransactionRequest
}
object NonceExpiredError {
  
  inline def apply(code: ErrorCode, message: String, name: String, transaction: TransactionRequest): NonceExpiredError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonceExpiredError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NonceExpiredError] (val x: Self) extends AnyVal {
    
    inline def setTransaction(value: TransactionRequest): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
  }
}
