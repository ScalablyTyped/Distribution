package typings.ethers.mod.ethers.providers

import typings.ethersprojectProviders.fallbackProviderMod.FallbackProviderConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.providers.FallbackProvider")
@js.native
class FallbackProvider protected ()
  extends typings.ethers.ethersMod.providers.FallbackProvider {
  def this(providers: js.Array[typings.ethersprojectAbstractProvider.mod.Provider | FallbackProviderConfig]) = this()
  def this(
    providers: js.Array[typings.ethersprojectAbstractProvider.mod.Provider | FallbackProviderConfig],
    quorum: Double
  ) = this()
}
