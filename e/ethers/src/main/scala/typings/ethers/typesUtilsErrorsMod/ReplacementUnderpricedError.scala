package typings.ethers.typesUtilsErrorsMod

import typings.ethers.ethersStrings.REPLACEMENT_UNDERPRICED
import typings.ethers.typesProvidersProviderMod.TransactionRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplacementUnderpricedError
  extends StObject
     with EthersError[REPLACEMENT_UNDERPRICED] {
  
  /**
    *  The transaction.
    */
  var transaction: TransactionRequest
}
object ReplacementUnderpricedError {
  
  inline def apply(code: ErrorCode, message: String, name: String, transaction: TransactionRequest): ReplacementUnderpricedError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplacementUnderpricedError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplacementUnderpricedError] (val x: Self) extends AnyVal {
    
    inline def setTransaction(value: TransactionRequest): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
  }
}
