package typings.ethers.ethersMod.providers

import typings.ethersprojectNetworks.typesMod.Network
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/lib/ethers", "providers.NodesmithProvider")
@js.native
class NodesmithProvider ()
  extends typings.ethersprojectProviders.mod.NodesmithProvider
/* static members */
@JSImport("ethers/lib/ethers", "providers.NodesmithProvider")
@js.native
object NodesmithProvider extends js.Object {
  
  def getApiKey(apiKey: js.Any): js.Any = js.native
  
  def getUrl(network: Network): String = js.native
  def getUrl(network: Network, apiKey: js.Any): String = js.native
}
