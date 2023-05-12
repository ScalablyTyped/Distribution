package typings.ethers.anon

import typings.ethers.ethersStrings.receiveCcipReadCallResult
import typings.ethers.typesProvidersAbstractProviderMod.DebugEventAbstractProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionResult
  extends StObject
     with DebugEventAbstractProvider {
  
  var action: receiveCcipReadCallResult
  
  var result: String
  
  var transaction: To
}
object ActionResult {
  
  inline def apply(result: String, transaction: To): ActionResult = {
    val __obj = js.Dynamic.literal(action = "receiveCcipReadCallResult", result = result.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionResult] (val x: Self) extends AnyVal {
    
    inline def setAction(value: receiveCcipReadCallResult): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setTransaction(value: To): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
  }
}
