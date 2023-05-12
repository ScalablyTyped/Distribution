package typings.ethers

import typings.ethers.typesProvidersAbstractProviderMod.Subscriber
import typings.ethers.typesProvidersNetworkMod.Networkish
import typings.ethers.typesProvidersProviderJsonrpcMod.JsonRpcApiProvider
import typings.ethers.typesProvidersProviderMod.EventFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvidersProviderSocketMod {
  
  @JSImport("ethers/types/providers/provider-socket", "SocketBlockSubscriber")
  @js.native
  open class SocketBlockSubscriber protected () extends SocketSubscriber {
    def this(provider: SocketProvider) = this()
  }
  
  @JSImport("ethers/types/providers/provider-socket", "SocketEventSubscriber")
  @js.native
  open class SocketEventSubscriber protected () extends SocketSubscriber {
    def this(provider: SocketProvider, filter: EventFilter) = this()
    
    def logFilter: EventFilter = js.native
  }
  
  @JSImport("ethers/types/providers/provider-socket", "SocketPendingSubscriber")
  @js.native
  open class SocketPendingSubscriber protected () extends SocketSubscriber {
    def this(provider: SocketProvider) = this()
  }
  
  @JSImport("ethers/types/providers/provider-socket", "SocketProvider")
  @js.native
  open class SocketProvider () extends JsonRpcApiProvider {
    def this(network: Networkish) = this()
    
    def _processMessage(message: String): js.Promise[Unit] = js.native
    
    def _register(filterId: String, subscriber: SocketSubscriber): Unit = js.native
    def _register(filterId: Double, subscriber: SocketSubscriber): Unit = js.native
    
    def _write(message: String): js.Promise[Unit] = js.native
  }
  
  @JSImport("ethers/types/providers/provider-socket", "SocketSubscriber")
  @js.native
  open class SocketSubscriber protected ()
    extends StObject
       with Subscriber {
    def this(provider: SocketProvider, filter: js.Array[Any]) = this()
    
    def _emit(provider: SocketProvider, message: Any): js.Promise[Unit] = js.native
    
    def _handleMessage(message: Any): Unit = js.native
    
    def filter: js.Array[Any] = js.native
    
    /* private */ var `private`: Any = js.native
  }
}
