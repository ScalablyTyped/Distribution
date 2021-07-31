package typings.ethersprojectProviders

import typings.ethersprojectNetworks.typesMod.Network
import typings.ethersprojectNetworks.typesMod.Networkish
import typings.ethersprojectProviders.formatterMod.CommunityResourcable
import typings.ethersprojectProviders.urlJsonRpcProviderMod.UrlJsonRpcProvider
import typings.ethersprojectProviders.websocketProviderMod.WebSocketProvider
import typings.ethersprojectWeb.ethersprojectWebStrings.block
import typings.ethersprojectWeb.mod.ConnectionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infuraProviderMod {
  
  @JSImport("@ethersproject/providers/lib/infura-provider", "InfuraProvider")
  @js.native
  class InfuraProvider () extends UrlJsonRpcProvider {
    def this(network: Networkish) = this()
    def this(network: Unit, apiKey: js.Any) = this()
    def this(network: Networkish, apiKey: js.Any) = this()
    
    val projectId: String = js.native
    
    val projectSecret: String = js.native
  }
  /* static members */
  object InfuraProvider {
    
    @JSImport("@ethersproject/providers/lib/infura-provider", "InfuraProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getApiKey(apiKey: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getApiKey")(apiKey.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def getUrl(network: Network, apiKey: js.Any): ConnectionInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[ConnectionInfo]
    
    @scala.inline
    def getWebSocketProvider(): InfuraWebSocketProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")().asInstanceOf[InfuraWebSocketProvider]
    @scala.inline
    def getWebSocketProvider(network: Unit, apiKey: js.Any): InfuraWebSocketProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[InfuraWebSocketProvider]
    @scala.inline
    def getWebSocketProvider(network: Networkish): InfuraWebSocketProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")(network.asInstanceOf[js.Any]).asInstanceOf[InfuraWebSocketProvider]
    @scala.inline
    def getWebSocketProvider(network: Networkish, apiKey: js.Any): InfuraWebSocketProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[InfuraWebSocketProvider]
  }
  
  @JSImport("@ethersproject/providers/lib/infura-provider", "InfuraWebSocketProvider")
  @js.native
  class InfuraWebSocketProvider ()
    extends WebSocketProvider
       with CommunityResourcable {
    def this(network: Networkish) = this()
    def this(network: Unit, apiKey: js.Any) = this()
    def this(network: Networkish, apiKey: js.Any) = this()
    
    val apiKey: String = js.native
    
    /* CompleteClass */
    override def isCommunityResource(): Boolean = js.native
    
    /* InferMemberOverrides */
    override def lookupAddress(address: String): js.Promise[String] = js.native
    
    /* InferMemberOverrides */
    @JSName("once")
    override def once_block(eventName: block, handler: js.Function0[Unit]): Unit = js.native
    
    val projectId: String = js.native
    
    val projectSecret: String = js.native
    
    /* InferMemberOverrides */
    override def resolveName(name: String): js.Promise[String] = js.native
  }
}
