package typings.ethersprojectProviders

import org.scalablytyped.runtime.StringDictionary
import typings.ethersprojectAbstractProvider.mod.Provider
import typings.ethersprojectProviders.libBaseProviderMod.BaseProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFallbackProviderMod {
  
  @JSImport("@ethersproject/providers/lib/fallback-provider", "FallbackProvider")
  @js.native
  open class FallbackProvider protected () extends BaseProvider {
    def this(providers: js.Array[Provider | FallbackProviderConfig]) = this()
    def this(providers: js.Array[Provider | FallbackProviderConfig], quorum: Double) = this()
    
    var _highestBlockNumber: Double = js.native
    
    def perform(method: String, params: StringDictionary[Any]): js.Promise[Any] = js.native
    
    val providerConfigs: js.Array[FallbackProviderConfig] = js.native
    
    val quorum: Double = js.native
  }
  
  trait FallbackProviderConfig extends StObject {
    
    var priority: js.UndefOr[Double] = js.undefined
    
    var provider: Provider
    
    var stallTimeout: js.UndefOr[Double] = js.undefined
    
    var weight: js.UndefOr[Double] = js.undefined
  }
  object FallbackProviderConfig {
    
    inline def apply(provider: Provider): FallbackProviderConfig = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[FallbackProviderConfig]
    }
    
    extension [Self <: FallbackProviderConfig](x: Self) {
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setProvider(value: Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setStallTimeout(value: Double): Self = StObject.set(x, "stallTimeout", value.asInstanceOf[js.Any])
      
      inline def setStallTimeoutUndefined: Self = StObject.set(x, "stallTimeout", js.undefined)
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
}
