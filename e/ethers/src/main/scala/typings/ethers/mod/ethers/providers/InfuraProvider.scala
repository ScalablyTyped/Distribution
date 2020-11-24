package typings.ethers.mod.ethers.providers

import typings.ethersprojectNetworks.typesMod.Network
import typings.ethersprojectNetworks.typesMod.Networkish
import typings.ethersprojectWeb.mod.ConnectionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.providers.InfuraProvider")
@js.native
class InfuraProvider ()
  extends typings.ethers.ethersMod.providers.InfuraProvider
/* static members */
@JSImport("ethers", "ethers.providers.InfuraProvider")
@js.native
object InfuraProvider extends js.Object {
  
  def getApiKey(apiKey: js.Any): js.Any = js.native
  
  def getUrl(network: Network, apiKey: js.Any): ConnectionInfo = js.native
  
  def getWebSocketProvider(): typings.ethersprojectProviders.infuraProviderMod.InfuraWebSocketProvider = js.native
  def getWebSocketProvider(network: js.UndefOr[Networkish], apiKey: js.Any): typings.ethersprojectProviders.infuraProviderMod.InfuraWebSocketProvider = js.native
  def getWebSocketProvider(network: Networkish): typings.ethersprojectProviders.infuraProviderMod.InfuraWebSocketProvider = js.native
}
