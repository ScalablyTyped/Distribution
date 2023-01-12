package typings.ethersprojectProviders

import typings.ethersprojectNetworks.libTypesMod.Networkish
import typings.ethersprojectProviders.anon.Method
import typings.ethersprojectProviders.libJsonRpcProviderMod.JsonRpcProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWeb3ProviderMod {
  
  @JSImport("@ethersproject/providers/lib/web3-provider", "Web3Provider")
  @js.native
  open class Web3Provider protected () extends JsonRpcProvider {
    def this(provider: ExternalProvider) = this()
    def this(provider: JsonRpcFetchFunc) = this()
    def this(provider: ExternalProvider, network: Networkish) = this()
    def this(provider: JsonRpcFetchFunc, network: Networkish) = this()
    
    def jsonRpcFetchFunc(method: String): js.Promise[Any] = js.native
    def jsonRpcFetchFunc(method: String, params: js.Array[Any]): js.Promise[Any] = js.native
    
    val provider: ExternalProvider = js.native
  }
  
  trait ExternalProvider extends StObject {
    
    var host: js.UndefOr[String] = js.undefined
    
    var isMetaMask: js.UndefOr[Boolean] = js.undefined
    
    var isStatus: js.UndefOr[Boolean] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var request: js.UndefOr[js.Function1[/* request */ Method, js.Promise[Any]]] = js.undefined
    
    var send: js.UndefOr[
        js.Function2[
          /* request */ Method, 
          /* callback */ js.Function2[/* error */ Any, /* response */ Any, Unit], 
          Unit
        ]
      ] = js.undefined
    
    var sendAsync: js.UndefOr[
        js.Function2[
          /* request */ Method, 
          /* callback */ js.Function2[/* error */ Any, /* response */ Any, Unit], 
          Unit
        ]
      ] = js.undefined
  }
  object ExternalProvider {
    
    inline def apply(): ExternalProvider = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExternalProvider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExternalProvider] (val x: Self) extends AnyVal {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setIsMetaMask(value: Boolean): Self = StObject.set(x, "isMetaMask", value.asInstanceOf[js.Any])
      
      inline def setIsMetaMaskUndefined: Self = StObject.set(x, "isMetaMask", js.undefined)
      
      inline def setIsStatus(value: Boolean): Self = StObject.set(x, "isStatus", value.asInstanceOf[js.Any])
      
      inline def setIsStatusUndefined: Self = StObject.set(x, "isStatus", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setRequest(value: /* request */ Method => js.Promise[Any]): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setSend(
        value: (/* request */ Method, /* callback */ js.Function2[/* error */ Any, /* response */ Any, Unit]) => Unit
      ): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
      
      inline def setSendAsync(
        value: (/* request */ Method, /* callback */ js.Function2[/* error */ Any, /* response */ Any, Unit]) => Unit
      ): Self = StObject.set(x, "sendAsync", js.Any.fromFunction2(value))
      
      inline def setSendAsyncUndefined: Self = StObject.set(x, "sendAsync", js.undefined)
      
      inline def setSendUndefined: Self = StObject.set(x, "send", js.undefined)
    }
  }
  
  type JsonRpcFetchFunc = js.Function2[/* method */ String, /* params */ js.UndefOr[js.Array[Any]], js.Promise[Any]]
}
