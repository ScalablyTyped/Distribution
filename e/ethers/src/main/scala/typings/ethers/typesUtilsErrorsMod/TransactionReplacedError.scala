package typings.ethers.typesUtilsErrorsMod

import typings.ethers.ethersStrings.TRANSACTION_REPLACED
import typings.ethers.ethersStrings.cancelled_
import typings.ethers.ethersStrings.replaced
import typings.ethers.ethersStrings.repriced
import typings.ethers.typesProvidersMod.TransactionReceipt
import typings.ethers.typesProvidersMod.TransactionResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionReplacedError
  extends StObject
     with EthersError[TRANSACTION_REPLACED] {
  
  /**
    *  If the transaction was cancelled, such that the original
    *  effects of the transaction cannot be assured.
    */
  var cancelled: Boolean
  
  /**
    *  The hash of the replaced transaction.
    */
  var hash: String
  
  /**
    *  The reason the transaction was replaced.
    */
  var reason: repriced | cancelled_ | replaced
  
  /**
    *  The receipt of the transaction that replace the transaction.
    */
  var receipt: TransactionReceipt
  
  /**
    *  The transaction that replaced the transaction.
    */
  var replacement: TransactionResponse
}
object TransactionReplacedError {
  
  inline def apply(
    cancelled: Boolean,
    code: ErrorCode,
    hash: String,
    message: String,
    name: String,
    reason: repriced | cancelled_ | replaced,
    receipt: TransactionReceipt,
    replacement: TransactionResponse
  ): TransactionReplacedError = {
    val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], receipt = receipt.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionReplacedError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransactionReplacedError] (val x: Self) extends AnyVal {
    
    inline def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setReason(value: repriced | cancelled_ | replaced): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReceipt(value: TransactionReceipt): Self = StObject.set(x, "receipt", value.asInstanceOf[js.Any])
    
    inline def setReplacement(value: TransactionResponse): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
  }
}
