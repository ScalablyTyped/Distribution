package typings.ethersprojectProviders.mod

import typings.ethersprojectProviders.fallbackProviderMod.FallbackProviderConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/providers", "FallbackProvider")
@js.native
class FallbackProvider protected ()
  extends typings.ethersprojectProviders.fallbackProviderMod.FallbackProvider {
  def this(providers: js.Array[typings.ethersprojectAbstractProvider.mod.Provider | FallbackProviderConfig]) = this()
  def this(
    providers: js.Array[typings.ethersprojectAbstractProvider.mod.Provider | FallbackProviderConfig],
    quorum: Double
  ) = this()
}
