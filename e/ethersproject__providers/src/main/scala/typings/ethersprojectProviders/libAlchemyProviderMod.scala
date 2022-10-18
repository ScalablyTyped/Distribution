package typings.ethersprojectProviders

import typings.ethersprojectNetworks.libTypesMod.Network
import typings.ethersprojectNetworks.libTypesMod.Networkish
import typings.ethersprojectProviders.libFormatterMod.CommunityResourcable
import typings.ethersprojectProviders.libUrlJsonRpcProviderMod.UrlJsonRpcProvider
import typings.ethersprojectProviders.libWebsocketProviderMod.WebSocketProvider
import typings.ethersprojectWeb.ethersprojectWebStrings.block
import typings.ethersprojectWeb.mod.ConnectionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAlchemyProviderMod {
  
  @JSImport("@ethersproject/providers/lib/alchemy-provider", "AlchemyProvider")
  @js.native
  open class AlchemyProvider () extends UrlJsonRpcProvider {
    def this(network: Networkish) = this()
    def this(network: Unit, apiKey: Any) = this()
    def this(network: Networkish, apiKey: Any) = this()
  }
  /* static members */
  object AlchemyProvider {
    
    @JSImport("@ethersproject/providers/lib/alchemy-provider", "AlchemyProvider")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getApiKey(apiKey: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getApiKey")(apiKey.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def getUrl(network: Network, apiKey: String): ConnectionInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[ConnectionInfo]
    
    inline def getWebSocketProvider(): AlchemyWebSocketProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")().asInstanceOf[AlchemyWebSocketProvider]
    inline def getWebSocketProvider(network: Unit, apiKey: Any): AlchemyWebSocketProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[AlchemyWebSocketProvider]
    inline def getWebSocketProvider(network: Networkish): AlchemyWebSocketProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")(network.asInstanceOf[js.Any]).asInstanceOf[AlchemyWebSocketProvider]
    inline def getWebSocketProvider(network: Networkish, apiKey: Any): AlchemyWebSocketProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[AlchemyWebSocketProvider]
  }
  
  @JSImport("@ethersproject/providers/lib/alchemy-provider", "AlchemyWebSocketProvider")
  @js.native
  open class AlchemyWebSocketProvider ()
    extends WebSocketProvider
       with CommunityResourcable {
    def this(network: Networkish) = this()
    def this(network: Unit, apiKey: Any) = this()
    def this(network: Networkish, apiKey: Any) = this()
    
    val apiKey: String = js.native
    
    /* CompleteClass */
    override def isCommunityResource(): Boolean = js.native
    
    /* InferMemberOverrides */
    override def lookupAddress(address: String): js.Promise[Null | String] = js.native
    
    /* InferMemberOverrides */
    @JSName("once")
    override def once_block(eventName: block, handler: js.Function0[Unit]): Unit = js.native
    
    /* InferMemberOverrides */
    override def resolveName(name: String): js.Promise[Null | String] = js.native
  }
}
