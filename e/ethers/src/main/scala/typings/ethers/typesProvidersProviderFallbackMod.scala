package typings.ethers

import typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider
import typings.ethers.typesProvidersAbstractProviderMod.PerformActionRequest
import typings.ethers.typesProvidersNetworkMod.Networkish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvidersProviderFallbackMod {
  
  @JSImport("ethers/types/providers/provider-fallback", "FallbackProvider")
  @js.native
  open class FallbackProvider protected () extends AbstractProvider {
    def this(providers: js.Array[AbstractProvider | FallbackProviderConfig]) = this()
    def this(providers: js.Array[AbstractProvider | FallbackProviderConfig], network: Networkish) = this()
    
    def _translatePerform(provider: AbstractProvider, req: PerformActionRequest): js.Promise[Any] = js.native
    
    val eventQuorum: Double = js.native
    
    val eventWorkers: Double = js.native
    
    def providerConfigs: js.Array[FallbackProviderState] = js.native
    
    val quorum: Double = js.native
  }
  
  trait FallbackProviderConfig extends StObject {
    
    var priority: js.UndefOr[Double] = js.undefined
    
    var provider: AbstractProvider
    
    var stallTimeout: js.UndefOr[Double] = js.undefined
    
    var weight: js.UndefOr[Double] = js.undefined
  }
  object FallbackProviderConfig {
    
    inline def apply(provider: AbstractProvider): FallbackProviderConfig = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[FallbackProviderConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FallbackProviderConfig] (val x: Self) extends AnyVal {
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setProvider(value: AbstractProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setStallTimeout(value: Double): Self = StObject.set(x, "stallTimeout", value.asInstanceOf[js.Any])
      
      inline def setStallTimeoutUndefined: Self = StObject.set(x, "stallTimeout", js.undefined)
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
  
  trait FallbackProviderOptions extends StObject {
    
    var eventQuorum: Double
    
    var eventWorkers: Double
    
    var quorum: Double
  }
  object FallbackProviderOptions {
    
    inline def apply(eventQuorum: Double, eventWorkers: Double, quorum: Double): FallbackProviderOptions = {
      val __obj = js.Dynamic.literal(eventQuorum = eventQuorum.asInstanceOf[js.Any], eventWorkers = eventWorkers.asInstanceOf[js.Any], quorum = quorum.asInstanceOf[js.Any])
      __obj.asInstanceOf[FallbackProviderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FallbackProviderOptions] (val x: Self) extends AnyVal {
      
      inline def setEventQuorum(value: Double): Self = StObject.set(x, "eventQuorum", value.asInstanceOf[js.Any])
      
      inline def setEventWorkers(value: Double): Self = StObject.set(x, "eventWorkers", value.asInstanceOf[js.Any])
      
      inline def setQuorum(value: Double): Self = StObject.set(x, "quorum", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Required<ethers.ethers/types/providers/provider-fallback.FallbackProviderConfig> */
  trait FallbackProviderState extends StObject {
    
    var blockNumber: Double
    
    var errorResponses: Double
    
    var lateResponses: Double
    
    var outOfSync: Double
    
    var priority: Double
    
    var provider: AbstractProvider
    
    var requests: Double
    
    var rollingDuration: Double
    
    var score: Double
    
    var stallTimeout: Double
    
    var unsupportedEvents: Double
    
    var weight: Double
  }
  object FallbackProviderState {
    
    inline def apply(
      blockNumber: Double,
      errorResponses: Double,
      lateResponses: Double,
      outOfSync: Double,
      priority: Double,
      provider: AbstractProvider,
      requests: Double,
      rollingDuration: Double,
      score: Double,
      stallTimeout: Double,
      unsupportedEvents: Double,
      weight: Double
    ): FallbackProviderState = {
      val __obj = js.Dynamic.literal(blockNumber = blockNumber.asInstanceOf[js.Any], errorResponses = errorResponses.asInstanceOf[js.Any], lateResponses = lateResponses.asInstanceOf[js.Any], outOfSync = outOfSync.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any], rollingDuration = rollingDuration.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], stallTimeout = stallTimeout.asInstanceOf[js.Any], unsupportedEvents = unsupportedEvents.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[FallbackProviderState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FallbackProviderState] (val x: Self) extends AnyVal {
      
      inline def setBlockNumber(value: Double): Self = StObject.set(x, "blockNumber", value.asInstanceOf[js.Any])
      
      inline def setErrorResponses(value: Double): Self = StObject.set(x, "errorResponses", value.asInstanceOf[js.Any])
      
      inline def setLateResponses(value: Double): Self = StObject.set(x, "lateResponses", value.asInstanceOf[js.Any])
      
      inline def setOutOfSync(value: Double): Self = StObject.set(x, "outOfSync", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setProvider(value: AbstractProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setRequests(value: Double): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
      
      inline def setRollingDuration(value: Double): Self = StObject.set(x, "rollingDuration", value.asInstanceOf[js.Any])
      
      inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
      
      inline def setStallTimeout(value: Double): Self = StObject.set(x, "stallTimeout", value.asInstanceOf[js.Any])
      
      inline def setUnsupportedEvents(value: Double): Self = StObject.set(x, "unsupportedEvents", value.asInstanceOf[js.Any])
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    }
  }
}
