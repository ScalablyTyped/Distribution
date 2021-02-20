package typings.ethersprojectProviders

import typings.ethersprojectNetworks.typesMod.Network
import typings.ethersprojectNetworks.typesMod.Networkish
import typings.ethersprojectProviders.formatterMod.CommunityResourcable
import typings.ethersprojectProviders.urlJsonRpcProviderMod.UrlJsonRpcProvider
import typings.ethersprojectProviders.websocketProviderMod.WebSocketProvider
import typings.ethersprojectWeb.mod.ConnectionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alchemyProviderMod {
  
  @JSImport("@ethersproject/providers/lib/alchemy-provider", "AlchemyProvider")
  @js.native
  class AlchemyProvider () extends UrlJsonRpcProvider {
    def this(network: Networkish) = this()
    def this(network: js.UndefOr[Networkish], apiKey: js.Any) = this()
  }
  /* static members */
  object AlchemyProvider {
    
    @JSImport("@ethersproject/providers/lib/alchemy-provider", "AlchemyProvider.getApiKey")
    @js.native
    def getApiKey(apiKey: js.Any): js.Any = js.native
    
    @JSImport("@ethersproject/providers/lib/alchemy-provider", "AlchemyProvider.getUrl")
    @js.native
    def getUrl(network: Network, apiKey: String): ConnectionInfo = js.native
    
    @JSImport("@ethersproject/providers/lib/alchemy-provider", "AlchemyProvider.getWebSocketProvider")
    @js.native
    def getWebSocketProvider(): AlchemyWebSocketProvider = js.native
    @JSImport("@ethersproject/providers/lib/alchemy-provider", "AlchemyProvider.getWebSocketProvider")
    @js.native
    def getWebSocketProvider(network: js.UndefOr[Networkish], apiKey: js.Any): AlchemyWebSocketProvider = js.native
    @JSImport("@ethersproject/providers/lib/alchemy-provider", "AlchemyProvider.getWebSocketProvider")
    @js.native
    def getWebSocketProvider(network: Networkish): AlchemyWebSocketProvider = js.native
  }
  
  @JSImport("@ethersproject/providers/lib/alchemy-provider", "AlchemyWebSocketProvider")
  @js.native
  class AlchemyWebSocketProvider ()
    extends WebSocketProvider
       with CommunityResourcable {
    def this(network: Networkish) = this()
    def this(network: js.UndefOr[Networkish], apiKey: js.Any) = this()
    
    val apiKey: String = js.native
    
    /* InferMemberOverrides */
    override def lookupAddress(address: String): js.Promise[String] = js.native
    
    /* InferMemberOverrides */
    override def resolveName(name: String): js.Promise[String] = js.native
  }
}
