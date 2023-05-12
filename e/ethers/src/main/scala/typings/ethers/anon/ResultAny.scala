package typings.ethers.anon

import typings.ethers.ethersStrings.receiveEip1193Result
import typings.ethers.typesProvidersProviderBrowserMod.DebugEventBrowserProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultAny
  extends StObject
     with DebugEventBrowserProvider {
  
  var action: receiveEip1193Result
  
  var result: Any
}
object ResultAny {
  
  inline def apply(result: Any): ResultAny = {
    val __obj = js.Dynamic.literal(action = "receiveEip1193Result", result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultAny]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResultAny] (val x: Self) extends AnyVal {
    
    inline def setAction(value: receiveEip1193Result): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
