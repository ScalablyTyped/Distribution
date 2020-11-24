package typings.ethers.mod.ethers.providers

import typings.ethersprojectNetworks.typesMod.Network
import typings.ethersprojectWeb.mod.ConnectionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.providers.PocketProvider")
@js.native
class PocketProvider ()
  extends typings.ethers.ethersMod.providers.PocketProvider
/* static members */
@JSImport("ethers", "ethers.providers.PocketProvider")
@js.native
object PocketProvider extends js.Object {
  
  def getApiKey(apiKey: js.Any): js.Any = js.native
  
  def getUrl(network: Network, apiKey: js.Any): ConnectionInfo = js.native
}
