package typings.ethers.anon

import typings.ethers.ethersStrings.receiveError
import typings.ethers.typesProvidersProviderEtherscanMod.DebugEventEtherscanProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorId
  extends StObject
     with DebugEventEtherscanProvider {
  
  var action: receiveError
  
  var error: Any
  
  var id: Double
}
object ErrorId {
  
  inline def apply(error: Any, id: Double): ErrorId = {
    val __obj = js.Dynamic.literal(action = "receiveError", error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorId] (val x: Self) extends AnyVal {
    
    inline def setAction(value: receiveError): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
