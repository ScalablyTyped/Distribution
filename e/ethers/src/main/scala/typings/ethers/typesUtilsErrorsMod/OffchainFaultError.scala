package typings.ethers.typesUtilsErrorsMod

import typings.ethers.ethersStrings.OFFCHAIN_FAULT
import typings.ethers.typesProvidersProviderMod.TransactionRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffchainFaultError
  extends StObject
     with EthersError[OFFCHAIN_FAULT] {
  
  /**
    *  The reason the CCIP-read failed.
    */
  var reason: String
  
  /**
    *  The transaction.
    */
  var transaction: js.UndefOr[TransactionRequest] = js.undefined
}
object OffchainFaultError {
  
  inline def apply(code: ErrorCode, message: String, name: String, reason: String): OffchainFaultError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffchainFaultError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OffchainFaultError] (val x: Self) extends AnyVal {
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setTransaction(value: TransactionRequest): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
