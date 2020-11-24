package typings.ethersprojectProviders.mod

import typings.ethersprojectNetworks.typesMod.Network
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/providers", "NodesmithProvider")
@js.native
class NodesmithProvider ()
  extends typings.ethersprojectProviders.nodesmithProviderMod.NodesmithProvider
/* static members */
@JSImport("@ethersproject/providers", "NodesmithProvider")
@js.native
object NodesmithProvider extends js.Object {
  
  def getApiKey(apiKey: js.Any): js.Any = js.native
  
  def getUrl(network: Network): String = js.native
  def getUrl(network: Network, apiKey: js.Any): String = js.native
}
