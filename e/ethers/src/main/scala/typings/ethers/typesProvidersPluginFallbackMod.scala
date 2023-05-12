package typings.ethers

import typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider
import typings.ethers.typesProvidersAbstractProviderMod.AbstractProviderPlugin
import typings.ethers.typesProvidersAbstractProviderMod.PerformActionRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvidersPluginFallbackMod {
  
  @JSImport("ethers/types/providers/plugin-fallback", "CheckQualifiedPlugin")
  @js.native
  open class CheckQualifiedPlugin ()
    extends StObject
       with AbstractProviderPlugin {
    
    /* CompleteClass */
    override def connect(provider: AbstractProvider): AbstractProviderPlugin = js.native
    
    def isQualified(action: PerformActionRequest, result: Any): Boolean = js.native
    
    /* CompleteClass */
    override val name: String = js.native
  }
  
  @JSImport("ethers/types/providers/plugin-fallback", "PluginIdFallbackProvider")
  @js.native
  val PluginIdFallbackProvider: /* "org.ethers.plugins.provider.QualifiedPlugin" */ String = js.native
  
  @JSImport("ethers/types/providers/plugin-fallback", "PossiblyPrunedTransactionPlugin")
  @js.native
  open class PossiblyPrunedTransactionPlugin () extends CheckQualifiedPlugin
}
