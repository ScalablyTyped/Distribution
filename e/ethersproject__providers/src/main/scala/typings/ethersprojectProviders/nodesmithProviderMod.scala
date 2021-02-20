package typings.ethersprojectProviders

import typings.ethersprojectNetworks.typesMod.Network
import typings.ethersprojectNetworks.typesMod.Networkish
import typings.ethersprojectProviders.urlJsonRpcProviderMod.UrlJsonRpcProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodesmithProviderMod {
  
  @JSImport("@ethersproject/providers/lib/nodesmith-provider", "NodesmithProvider")
  @js.native
  class NodesmithProvider () extends UrlJsonRpcProvider {
    def this(network: Networkish) = this()
    def this(network: js.UndefOr[Networkish], apiKey: js.Any) = this()
  }
  /* static members */
  object NodesmithProvider {
    
    @JSImport("@ethersproject/providers/lib/nodesmith-provider", "NodesmithProvider.getApiKey")
    @js.native
    def getApiKey(apiKey: js.Any): js.Any = js.native
    
    @JSImport("@ethersproject/providers/lib/nodesmith-provider", "NodesmithProvider.getUrl")
    @js.native
    def getUrl(network: Network): String = js.native
    @JSImport("@ethersproject/providers/lib/nodesmith-provider", "NodesmithProvider.getUrl")
    @js.native
    def getUrl(network: Network, apiKey: js.Any): String = js.native
  }
}
