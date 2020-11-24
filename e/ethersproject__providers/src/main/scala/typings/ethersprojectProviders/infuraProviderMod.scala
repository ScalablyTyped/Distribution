package typings.ethersprojectProviders

import typings.ethersprojectNetworks.typesMod.Network
import typings.ethersprojectNetworks.typesMod.Networkish
import typings.ethersprojectProviders.formatterMod.CommunityResourcable
import typings.ethersprojectProviders.urlJsonRpcProviderMod.UrlJsonRpcProvider
import typings.ethersprojectProviders.websocketProviderMod.WebSocketProvider
import typings.ethersprojectWeb.mod.ConnectionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/providers/lib/infura-provider", JSImport.Namespace)
@js.native
object infuraProviderMod extends js.Object {
  
  @js.native
  class InfuraProvider () extends UrlJsonRpcProvider {
    
    val projectId: String = js.native
    
    val projectSecret: String = js.native
  }
  /* static members */
  @js.native
  object InfuraProvider extends js.Object {
    
    def getApiKey(apiKey: js.Any): js.Any = js.native
    
    def getUrl(network: Network, apiKey: js.Any): ConnectionInfo = js.native
    
    def getWebSocketProvider(): InfuraWebSocketProvider = js.native
    def getWebSocketProvider(network: js.UndefOr[Networkish], apiKey: js.Any): InfuraWebSocketProvider = js.native
    def getWebSocketProvider(network: Networkish): InfuraWebSocketProvider = js.native
  }
  
  @js.native
  class InfuraWebSocketProvider ()
    extends WebSocketProvider
       with CommunityResourcable {
    def this(network: Networkish) = this()
    def this(network: js.UndefOr[Networkish], apiKey: js.Any) = this()
    
    val apiKey: String = js.native
    
    /* InferMemberOverrides */
    override def lookupAddress(address: String): js.Promise[String] = js.native
    
    val projectId: String = js.native
    
    val projectSecret: String = js.native
    
    /* InferMemberOverrides */
    override def resolveName(name: String): js.Promise[String] = js.native
  }
}
