package typings.ethers.anon

import typings.ethers.ethersStrings.receiveEip1193Error
import typings.ethers.typesProvidersProviderBrowserMod.DebugEventBrowserProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorError
  extends StObject
     with DebugEventBrowserProvider {
  
  var action: receiveEip1193Error
  
  var error: js.Error
}
object ErrorError {
  
  inline def apply(error: js.Error): ErrorError = {
    val __obj = js.Dynamic.literal(action = "receiveEip1193Error", error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorError] (val x: Self) extends AnyVal {
    
    inline def setAction(value: receiveEip1193Error): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
