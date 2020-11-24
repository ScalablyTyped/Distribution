package typings.ethers.mod.providers

import typings.ethersprojectNetworks.typesMod.Network
import typings.ethersprojectNetworks.typesMod.Networkish
import typings.ethersprojectWeb.mod.ConnectionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "providers.AlchemyProvider")
@js.native
class AlchemyProvider ()
  extends typings.ethersprojectProviders.mod.AlchemyProvider
/* static members */
@JSImport("ethers", "providers.AlchemyProvider")
@js.native
object AlchemyProvider extends js.Object {
  
  def getApiKey(apiKey: js.Any): js.Any = js.native
  
  def getUrl(network: Network, apiKey: String): ConnectionInfo = js.native
  
  def getWebSocketProvider(): typings.ethersprojectProviders.alchemyProviderMod.AlchemyWebSocketProvider = js.native
  def getWebSocketProvider(network: js.UndefOr[Networkish], apiKey: js.Any): typings.ethersprojectProviders.alchemyProviderMod.AlchemyWebSocketProvider = js.native
  def getWebSocketProvider(network: Networkish): typings.ethersprojectProviders.alchemyProviderMod.AlchemyWebSocketProvider = js.native
}
