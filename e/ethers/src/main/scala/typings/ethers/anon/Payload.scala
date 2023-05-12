package typings.ethers.anon

import typings.ethers.ethersStrings.sendEip1193Payload
import typings.ethers.typesProvidersProviderBrowserMod.DebugEventBrowserProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Payload
  extends StObject
     with DebugEventBrowserProvider {
  
  var action: sendEip1193Payload
  
  var payload: MethodParams
}
object Payload {
  
  inline def apply(payload: MethodParams): Payload = {
    val __obj = js.Dynamic.literal(action = "sendEip1193Payload", payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Payload] (val x: Self) extends AnyVal {
    
    inline def setAction(value: sendEip1193Payload): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: MethodParams): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}
