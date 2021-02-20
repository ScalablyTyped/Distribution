package typings.ethersprojectProviders

import typings.ethersprojectNetworks.typesMod.Network
import typings.ethersprojectNetworks.typesMod.Networkish
import typings.ethersprojectProviders.urlJsonRpcProviderMod.UrlJsonRpcProvider
import typings.ethersprojectWeb.mod.ConnectionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pocketProviderMod {
  
  @JSImport("@ethersproject/providers/lib/pocket-provider", "PocketProvider")
  @js.native
  class PocketProvider () extends UrlJsonRpcProvider {
    def this(network: Networkish) = this()
    def this(network: js.UndefOr[Networkish], apiKey: js.Any) = this()
    
    val applicationId: String = js.native
    
    val applicationSecretKey: String = js.native
  }
  /* static members */
  object PocketProvider {
    
    @JSImport("@ethersproject/providers/lib/pocket-provider", "PocketProvider.getApiKey")
    @js.native
    def getApiKey(apiKey: js.Any): js.Any = js.native
    
    @JSImport("@ethersproject/providers/lib/pocket-provider", "PocketProvider.getUrl")
    @js.native
    def getUrl(network: Network, apiKey: js.Any): ConnectionInfo = js.native
  }
}
