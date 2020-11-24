package typings.ethers.mod.providers

import typings.ethersprojectNetworks.typesMod.Network
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "providers.CloudflareProvider")
@js.native
class CloudflareProvider ()
  extends typings.ethersprojectProviders.mod.CloudflareProvider
/* static members */
@JSImport("ethers", "providers.CloudflareProvider")
@js.native
object CloudflareProvider extends js.Object {
  
  def getApiKey(apiKey: js.Any): js.Any = js.native
  
  def getUrl(network: Network): String = js.native
  def getUrl(network: Network, apiKey: js.Any): String = js.native
}
