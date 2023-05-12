package typings.ethers

import typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider
import typings.ethers.typesProvidersAbstractProviderMod.Subscriber
import typings.ethers.typesProvidersProviderMod.EventFilter
import typings.ethers.typesProvidersProviderMod.OrphanFilter
import typings.ethers.typesProvidersProviderMod.ProviderEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvidersSubscriberPollingMod {
  
  @JSImport("ethers/types/providers/subscriber-polling", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ethers/types/providers/subscriber-polling", "OnBlockSubscriber")
  @js.native
  open class OnBlockSubscriber protected ()
    extends StObject
       with Subscriber {
    def this(provider: AbstractProvider) = this()
    
    def _poll(blockNumber: Double, provider: AbstractProvider): js.Promise[Unit] = js.native
    
    /* private */ var `private`: Any = js.native
  }
  
  @JSImport("ethers/types/providers/subscriber-polling", "PollingBlockSubscriber")
  @js.native
  open class PollingBlockSubscriber protected ()
    extends StObject
       with Subscriber {
    def this(provider: AbstractProvider) = this()
    
    @JSName("pollingInterval")
    def pollingInterval_MPollingBlockSubscriber: Double = js.native
    
    /* private */ var `private`: Any = js.native
  }
  
  @JSImport("ethers/types/providers/subscriber-polling", "PollingEventSubscriber")
  @js.native
  open class PollingEventSubscriber protected ()
    extends StObject
       with Subscriber {
    def this(provider: AbstractProvider, filter: EventFilter) = this()
    
    /* private */ var `private`: Any = js.native
  }
  
  @JSImport("ethers/types/providers/subscriber-polling", "PollingOrphanSubscriber")
  @js.native
  open class PollingOrphanSubscriber protected () extends OnBlockSubscriber {
    def this(provider: AbstractProvider, filter: OrphanFilter) = this()
  }
  
  @JSImport("ethers/types/providers/subscriber-polling", "PollingTransactionSubscriber")
  @js.native
  open class PollingTransactionSubscriber protected () extends OnBlockSubscriber {
    def this(provider: AbstractProvider, hash: String) = this()
  }
  
  inline def getPollingSubscriber(provider: AbstractProvider, event: ProviderEvent): Subscriber = (^.asInstanceOf[js.Dynamic].applyDynamic("getPollingSubscriber")(provider.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Subscriber]
}
