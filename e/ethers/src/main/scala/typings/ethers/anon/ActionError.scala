package typings.ethers.anon

import typings.ethers.ethersStrings.receiveCcipReadCallError
import typings.ethers.typesProvidersAbstractProviderMod.DebugEventAbstractProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionError
  extends StObject
     with DebugEventAbstractProvider {
  
  var action: receiveCcipReadCallError
  
  var error: js.Error
  
  var transaction: To
}
object ActionError {
  
  inline def apply(error: js.Error, transaction: To): ActionError = {
    val __obj = js.Dynamic.literal(action = "receiveCcipReadCallError", error = error.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionError] (val x: Self) extends AnyVal {
    
    inline def setAction(value: receiveCcipReadCallError): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setTransaction(value: To): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
  }
}
