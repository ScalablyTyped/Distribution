package typings.ethers.anon

import typings.ethers.ethersStrings.sendCcipReadCall
import typings.ethers.typesProvidersAbstractProviderMod.DebugEventAbstractProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transaction
  extends StObject
     with DebugEventAbstractProvider {
  
  var action: sendCcipReadCall
  
  var transaction: To
}
object Transaction {
  
  inline def apply(transaction: To): Transaction = {
    val __obj = js.Dynamic.literal(action = "sendCcipReadCall", transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Transaction] (val x: Self) extends AnyVal {
    
    inline def setAction(value: sendCcipReadCall): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setTransaction(value: To): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
  }
}
