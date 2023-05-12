package typings.ethers.anon

import typings.ethers.ethersStrings.receiveCcipReadFetchError
import typings.ethers.typesProvidersAbstractProviderMod.DebugEventAbstractProvider
import typings.ethers.typesUtilsMod.FetchRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Result
  extends StObject
     with DebugEventAbstractProvider {
  
  var action: receiveCcipReadFetchError
  
  var request: FetchRequest
  
  var result: Any
}
object Result {
  
  inline def apply(request: FetchRequest, result: Any): Result = {
    val __obj = js.Dynamic.literal(action = "receiveCcipReadFetchError", request = request.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
    
    inline def setAction(value: receiveCcipReadFetchError): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: FetchRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
