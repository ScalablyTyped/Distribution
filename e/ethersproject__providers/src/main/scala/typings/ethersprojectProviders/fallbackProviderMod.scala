package typings.ethersprojectProviders

import org.scalablytyped.runtime.StringDictionary
import typings.ethersprojectAbstractProvider.mod.Provider
import typings.ethersprojectProviders.baseProviderMod.BaseProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fallbackProviderMod {
  
  @JSImport("@ethersproject/providers/lib/fallback-provider", "FallbackProvider")
  @js.native
  class FallbackProvider protected () extends BaseProvider {
    def this(providers: js.Array[Provider | FallbackProviderConfig]) = this()
    def this(providers: js.Array[Provider | FallbackProviderConfig], quorum: Double) = this()
    
    var _highestBlockNumber: Double = js.native
    
    def perform(method: String, params: StringDictionary[js.Any]): js.Promise[_] = js.native
    
    val providerConfigs: js.Array[FallbackProviderConfig] = js.native
    
    val quorum: Double = js.native
  }
  
  @js.native
  trait FallbackProviderConfig extends StObject {
    
    var priority: js.UndefOr[Double] = js.native
    
    var provider: Provider = js.native
    
    var stallTimeout: js.UndefOr[Double] = js.native
    
    var weight: js.UndefOr[Double] = js.native
  }
  object FallbackProviderConfig {
    
    @scala.inline
    def apply(provider: Provider): FallbackProviderConfig = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[FallbackProviderConfig]
    }
    
    @scala.inline
    implicit class FallbackProviderConfigMutableBuilder[Self <: FallbackProviderConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      @scala.inline
      def setProvider(value: Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStallTimeout(value: Double): Self = StObject.set(x, "stallTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStallTimeoutUndefined: Self = StObject.set(x, "stallTimeout", js.undefined)
      
      @scala.inline
      def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
}
