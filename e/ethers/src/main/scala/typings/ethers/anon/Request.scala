package typings.ethers.anon

import typings.ethers.ethersStrings.receiveCcipReadFetchResult
import typings.ethers.typesProvidersAbstractProviderMod.DebugEventAbstractProvider
import typings.ethers.typesUtilsMod.FetchRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Request
  extends StObject
     with DebugEventAbstractProvider {
  
  var action: receiveCcipReadFetchResult
  
  var request: FetchRequest
  
  var result: Any
}
object Request {
  
  inline def apply(request: FetchRequest, result: Any): Request = {
    val __obj = js.Dynamic.literal(action = "receiveCcipReadFetchResult", request = request.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
    
    inline def setAction(value: receiveCcipReadFetchResult): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: FetchRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
