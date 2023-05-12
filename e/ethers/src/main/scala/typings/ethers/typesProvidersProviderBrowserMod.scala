package typings.ethers

import typings.ethers.anon.MethodParams
import typings.ethers.anon.Params
import typings.ethers.typesProvidersNetworkMod.Networkish
import typings.ethers.typesProvidersProviderJsonrpcMod.JsonRpcApiPollingProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvidersProviderBrowserMod {
  
  @JSImport("ethers/types/providers/provider-browser", "BrowserProvider")
  @js.native
  open class BrowserProvider protected () extends JsonRpcApiPollingProvider {
    def this(ethereum: Eip1193Provider) = this()
    def this(ethereum: Eip1193Provider, network: Networkish) = this()
    
    def hasSigner(address: String): js.Promise[Boolean] = js.native
    def hasSigner(address: Double): js.Promise[Boolean] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ethers.anon.Payload
    - typings.ethers.anon.ResultAny
    - typings.ethers.anon.ErrorError
  */
  trait DebugEventBrowserProvider extends StObject
  object DebugEventBrowserProvider {
    
    inline def ErrorError(error: js.Error): typings.ethers.anon.ErrorError = {
      val __obj = js.Dynamic.literal(action = "receiveEip1193Error", error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ethers.anon.ErrorError]
    }
    
    inline def Payload(payload: MethodParams): typings.ethers.anon.Payload = {
      val __obj = js.Dynamic.literal(action = "sendEip1193Payload", payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ethers.anon.Payload]
    }
    
    inline def ResultAny(result: Any): typings.ethers.anon.ResultAny = {
      val __obj = js.Dynamic.literal(action = "receiveEip1193Result", result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ethers.anon.ResultAny]
    }
  }
  
  trait Eip1193Provider extends StObject {
    
    def request(request: Params): js.Promise[Any]
  }
  object Eip1193Provider {
    
    inline def apply(request: Params => js.Promise[Any]): Eip1193Provider = {
      val __obj = js.Dynamic.literal(request = js.Any.fromFunction1(request))
      __obj.asInstanceOf[Eip1193Provider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Eip1193Provider] (val x: Self) extends AnyVal {
      
      inline def setRequest(value: Params => js.Promise[Any]): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
    }
  }
}
