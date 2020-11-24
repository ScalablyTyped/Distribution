package typings.ethers.ethersMod.providers

import typings.ethersprojectNetworks.typesMod.Network
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/lib/ethers", "providers.getDefaultProvider")
@js.native
object getDefaultProvider extends js.Object {
  
  def apply(): typings.ethersprojectProviders.baseProviderMod.BaseProvider = js.native
  def apply(network: js.UndefOr[scala.Nothing], options: js.Any): typings.ethersprojectProviders.baseProviderMod.BaseProvider = js.native
  def apply(network: String): typings.ethersprojectProviders.baseProviderMod.BaseProvider = js.native
  def apply(network: String, options: js.Any): typings.ethersprojectProviders.baseProviderMod.BaseProvider = js.native
  def apply(network: Network): typings.ethersprojectProviders.baseProviderMod.BaseProvider = js.native
  def apply(network: Network, options: js.Any): typings.ethersprojectProviders.baseProviderMod.BaseProvider = js.native
}
