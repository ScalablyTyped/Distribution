package typings.ethers.anon

import typings.ethers.ethersStrings.receiveRequest
import typings.ethers.typesProvidersProviderEtherscanMod.DebugEventEtherscanProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionId
  extends StObject
     with DebugEventEtherscanProvider {
  
  var action: receiveRequest
  
  var id: Double
  
  var result: Any
}
object ActionId {
  
  inline def apply(id: Double, result: Any): ActionId = {
    val __obj = js.Dynamic.literal(action = "receiveRequest", id = id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionId] (val x: Self) extends AnyVal {
    
    inline def setAction(value: receiveRequest): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
