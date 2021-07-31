package typings.ethersprojectProviders

import typings.ethersprojectNetworks.typesMod.Networkish
import typings.ethersprojectProviders.anon.Method
import typings.ethersprojectProviders.jsonRpcProviderMod.JsonRpcProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object web3ProviderMod {
  
  @JSImport("@ethersproject/providers/lib/web3-provider", "Web3Provider")
  @js.native
  class Web3Provider protected () extends JsonRpcProvider {
    def this(provider: ExternalProvider) = this()
    def this(provider: JsonRpcFetchFunc) = this()
    def this(provider: ExternalProvider, network: Networkish) = this()
    def this(provider: JsonRpcFetchFunc, network: Networkish) = this()
    
    def jsonRpcFetchFunc(method: String): js.Promise[js.Any] = js.native
    def jsonRpcFetchFunc(method: String, params: js.Array[js.Any]): js.Promise[js.Any] = js.native
    
    val provider: ExternalProvider = js.native
  }
  
  trait ExternalProvider extends StObject {
    
    var host: js.UndefOr[String] = js.undefined
    
    var isMetaMask: js.UndefOr[Boolean] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var request: js.UndefOr[js.Function1[/* request */ Method, js.Promise[js.Any]]] = js.undefined
    
    var send: js.UndefOr[
        js.Function2[
          /* request */ Method, 
          /* callback */ js.Function2[/* error */ js.Any, /* response */ js.Any, Unit], 
          Unit
        ]
      ] = js.undefined
    
    var sendAsync: js.UndefOr[
        js.Function2[
          /* request */ Method, 
          /* callback */ js.Function2[/* error */ js.Any, /* response */ js.Any, Unit], 
          Unit
        ]
      ] = js.undefined
  }
  object ExternalProvider {
    
    @scala.inline
    def apply(): ExternalProvider = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExternalProvider]
    }
    
    @scala.inline
    implicit class ExternalProviderMutableBuilder[Self <: ExternalProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setIsMetaMask(value: Boolean): Self = StObject.set(x, "isMetaMask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMetaMaskUndefined: Self = StObject.set(x, "isMetaMask", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setRequest(value: /* request */ Method => js.Promise[js.Any]): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      @scala.inline
      def setSend(
        value: (/* request */ Method, /* callback */ js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]) => Unit
      ): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSendAsync(
        value: (/* request */ Method, /* callback */ js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]) => Unit
      ): Self = StObject.set(x, "sendAsync", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSendAsyncUndefined: Self = StObject.set(x, "sendAsync", js.undefined)
      
      @scala.inline
      def setSendUndefined: Self = StObject.set(x, "send", js.undefined)
    }
  }
  
  type JsonRpcFetchFunc = js.Function2[/* method */ String, /* params */ js.UndefOr[js.Array[js.Any]], js.Promise[js.Any]]
}
