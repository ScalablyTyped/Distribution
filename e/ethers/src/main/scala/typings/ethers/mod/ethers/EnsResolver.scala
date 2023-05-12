package typings.ethers.mod.ethers

import typings.ethers.typesProvidersProviderMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.EnsResolver")
@js.native
open class EnsResolver protected ()
  extends typings.ethers.typesEthersMod.EnsResolver {
  def this(
    provider: typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider,
    address: String,
    name: String
  ) = this()
}
/* static members */
object EnsResolver {
  
  @JSImport("ethers", "ethers.EnsResolver")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *  Resolve to the ENS resolver for %%name%% using %%provider%% or
    *  ``null`` if unconfigured.
    */
  inline def fromName(provider: typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider, name: String): js.Promise[Null | typings.ethers.typesProvidersEnsResolverMod.EnsResolver] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromName")(provider.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Null | typings.ethers.typesProvidersEnsResolverMod.EnsResolver]]
  
  inline def getEnsAddress(provider: Provider): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnsAddress")(provider.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
