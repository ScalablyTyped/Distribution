package typings.ethers.anon

import typings.ethers.ethersStrings.estimateGas
import typings.ethers.typesProvidersAbstractProviderMod.PerformActionRequest
import typings.ethers.typesProvidersAbstractProviderMod.PerformActionTransaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MethodTransaction
  extends StObject
     with PerformActionRequest {
  
  var method: estimateGas
  
  var transaction: PerformActionTransaction
}
object MethodTransaction {
  
  inline def apply(transaction: PerformActionTransaction): MethodTransaction = {
    val __obj = js.Dynamic.literal(method = "estimateGas", transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodTransaction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MethodTransaction] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: estimateGas): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setTransaction(value: PerformActionTransaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
  }
}
