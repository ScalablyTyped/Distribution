package typings.ethersprojectProviders

import typings.ethersprojectNetworks.typesMod.Network
import typings.ethersprojectProviders.urlJsonRpcProviderMod.UrlJsonRpcProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/providers/lib/nodesmith-provider", JSImport.Namespace)
@js.native
object nodesmithProviderMod extends js.Object {
  
  @js.native
  class NodesmithProvider () extends UrlJsonRpcProvider
  /* static members */
  @js.native
  object NodesmithProvider extends js.Object {
    
    def getApiKey(apiKey: js.Any): js.Any = js.native
    
    def getUrl(network: Network): String = js.native
    def getUrl(network: Network, apiKey: js.Any): String = js.native
  }
}
