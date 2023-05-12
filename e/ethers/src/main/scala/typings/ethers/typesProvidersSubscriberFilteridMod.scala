package typings.ethers

import typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider
import typings.ethers.typesProvidersAbstractProviderMod.Subscriber
import typings.ethers.typesProvidersProviderJsonrpcMod.JsonRpcApiProvider
import typings.ethers.typesProvidersProviderMod.EventFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvidersSubscriberFilteridMod {
  
  @JSImport("ethers/types/providers/subscriber-filterid", "FilterIdEventSubscriber")
  @js.native
  open class FilterIdEventSubscriber protected () extends FilterIdSubscriber {
    def this(provider: JsonRpcApiProvider, filter: EventFilter) = this()
    
    def _emitResults(provider: JsonRpcApiProvider, results: js.Array[Any]): js.Promise[Unit] = js.native
  }
  
  @JSImport("ethers/types/providers/subscriber-filterid", "FilterIdPendingSubscriber")
  @js.native
  open class FilterIdPendingSubscriber protected () extends FilterIdSubscriber {
    def this(provider: JsonRpcApiProvider) = this()
    
    def _emitResults(provider: JsonRpcApiProvider, results: js.Array[Any]): js.Promise[Unit] = js.native
  }
  
  @JSImport("ethers/types/providers/subscriber-filterid", "FilterIdSubscriber")
  @js.native
  open class FilterIdSubscriber protected ()
    extends StObject
       with Subscriber {
    def this(provider: JsonRpcApiProvider) = this()
    
    def _emitResults(provider: AbstractProvider, result: js.Array[Any]): js.Promise[Unit] = js.native
    
    def _recover(provider: AbstractProvider): Subscriber = js.native
    
    def _subscribe(provider: JsonRpcApiProvider): js.Promise[String] = js.native
    
    /* private */ var `private`: Any = js.native
  }
}
