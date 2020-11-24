package typings.ethersprojectProviders

import typings.ethersprojectNetworks.typesMod.Network
import typings.ethersprojectProviders.urlJsonRpcProviderMod.UrlJsonRpcProvider
import typings.ethersprojectWeb.mod.ConnectionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/providers/lib/pocket-provider", JSImport.Namespace)
@js.native
object pocketProviderMod extends js.Object {
  
  @js.native
  class PocketProvider () extends UrlJsonRpcProvider {
    
    val applicationId: String = js.native
    
    val applicationSecretKey: String = js.native
  }
  /* static members */
  @js.native
  object PocketProvider extends js.Object {
    
    def getApiKey(apiKey: js.Any): js.Any = js.native
    
    def getUrl(network: Network, apiKey: js.Any): ConnectionInfo = js.native
  }
}
