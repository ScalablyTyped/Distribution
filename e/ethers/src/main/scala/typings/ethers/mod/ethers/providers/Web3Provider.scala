package typings.ethers.mod.ethers.providers

import typings.ethersprojectNetworks.typesMod.Networkish
import typings.ethersprojectProviders.web3ProviderMod.ExternalProvider
import typings.ethersprojectProviders.web3ProviderMod.JsonRpcFetchFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.providers.Web3Provider")
@js.native
class Web3Provider protected ()
  extends typings.ethers.ethersMod.providers.Web3Provider {
  def this(provider: ExternalProvider) = this()
  def this(provider: JsonRpcFetchFunc) = this()
  def this(provider: ExternalProvider, network: Networkish) = this()
  def this(provider: JsonRpcFetchFunc, network: Networkish) = this()
}
