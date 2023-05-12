package typings.ethers.anon

import typings.ethers.ethersStrings.sendRpcPayload
import typings.ethers.typesProvidersProviderJsonrpcMod.DebugEventJsonRpcApiProvider
import typings.ethers.typesProvidersProviderJsonrpcMod.JsonRpcPayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionPayload
  extends StObject
     with DebugEventJsonRpcApiProvider {
  
  var action: sendRpcPayload
  
  var payload: JsonRpcPayload | js.Array[JsonRpcPayload]
}
object ActionPayload {
  
  inline def apply(payload: JsonRpcPayload | js.Array[JsonRpcPayload]): ActionPayload = {
    val __obj = js.Dynamic.literal(action = "sendRpcPayload", payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionPayload] (val x: Self) extends AnyVal {
    
    inline def setAction(value: sendRpcPayload): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: JsonRpcPayload | js.Array[JsonRpcPayload]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadVarargs(value: JsonRpcPayload*): Self = StObject.set(x, "payload", js.Array(value*))
  }
}
