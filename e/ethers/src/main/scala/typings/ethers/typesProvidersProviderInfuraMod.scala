package typings.ethers

import typings.ethers.typesProvidersCommunityMod.CommunityResourcable
import typings.ethers.typesProvidersNetworkMod.Network
import typings.ethers.typesProvidersNetworkMod.Networkish
import typings.ethers.typesProvidersProviderJsonrpcMod.JsonRpcProvider
import typings.ethers.typesProvidersProviderWebsocketMod.WebSocketProvider
import typings.ethers.typesUtilsMod.FetchRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvidersProviderInfuraMod {
  
  @JSImport("ethers/types/providers/provider-infura", "InfuraProvider")
  @js.native
  /**
    *  Creates a new **InfuraProvider**.
    */
  open class InfuraProvider ()
    extends JsonRpcProvider
       with CommunityResourcable {
    def this(_network: Networkish) = this()
    def this(_network: Unit, projectId: String) = this()
    def this(_network: Networkish, projectId: String) = this()
    def this(_network: Unit, projectId: String, projectSecret: String) = this()
    def this(_network: Unit, projectId: Null, projectSecret: String) = this()
    def this(_network: Unit, projectId: Unit, projectSecret: String) = this()
    def this(_network: Networkish, projectId: String, projectSecret: String) = this()
    def this(_network: Networkish, projectId: Null, projectSecret: String) = this()
    def this(_network: Networkish, projectId: Unit, projectSecret: String) = this()
    
    /**
      *  Returns true of the instance is connected using the community
      *  credentials.
      */
    /* CompleteClass */
    override def isCommunityResource(): Boolean = js.native
    
    /**
      *  The Project ID for the INFURA connection.
      */
    val projectId: String = js.native
    
    /**
      *  The Project Secret.
      *
      *  If null, no authenticated requests are made. This should not
      *  be used outside of private contexts.
      */
    val projectSecret: Null | String = js.native
  }
  /* static members */
  object InfuraProvider {
    
    @JSImport("ethers/types/providers/provider-infura", "InfuraProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Returns a prepared request for connecting to %%network%%
      *  with %%projectId%% and %%projectSecret%%.
      */
    inline def getRequest(network: Network): FetchRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(network.asInstanceOf[js.Any]).asInstanceOf[FetchRequest]
    inline def getRequest(network: Network, projectId: String): FetchRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(network.asInstanceOf[js.Any], projectId.asInstanceOf[js.Any])).asInstanceOf[FetchRequest]
    inline def getRequest(network: Network, projectId: String, projectSecret: String): FetchRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(network.asInstanceOf[js.Any], projectId.asInstanceOf[js.Any], projectSecret.asInstanceOf[js.Any])).asInstanceOf[FetchRequest]
    inline def getRequest(network: Network, projectId: Null, projectSecret: String): FetchRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(network.asInstanceOf[js.Any], projectId.asInstanceOf[js.Any], projectSecret.asInstanceOf[js.Any])).asInstanceOf[FetchRequest]
    inline def getRequest(network: Network, projectId: Unit, projectSecret: String): FetchRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(network.asInstanceOf[js.Any], projectId.asInstanceOf[js.Any], projectSecret.asInstanceOf[js.Any])).asInstanceOf[FetchRequest]
    
    /**
      *  Creates a new **InfuraWebSocketProvider**.
      */
    inline def getWebSocketProvider(): InfuraWebSocketProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")().asInstanceOf[InfuraWebSocketProvider]
    inline def getWebSocketProvider(network: Unit, projectId: String): InfuraWebSocketProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")(network.asInstanceOf[js.Any], projectId.asInstanceOf[js.Any])).asInstanceOf[InfuraWebSocketProvider]
    inline def getWebSocketProvider(network: Networkish): InfuraWebSocketProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")(network.asInstanceOf[js.Any]).asInstanceOf[InfuraWebSocketProvider]
    inline def getWebSocketProvider(network: Networkish, projectId: String): InfuraWebSocketProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")(network.asInstanceOf[js.Any], projectId.asInstanceOf[js.Any])).asInstanceOf[InfuraWebSocketProvider]
  }
  
  @JSImport("ethers/types/providers/provider-infura", "InfuraWebSocketProvider")
  @js.native
  /**
    *  Creates a new **InfuraWebSocketProvider**.
    */
  open class InfuraWebSocketProvider ()
    extends WebSocketProvider
       with CommunityResourcable {
    def this(network: Networkish) = this()
    def this(network: Unit, projectId: String) = this()
    def this(network: Networkish, projectId: String) = this()
    
    /**
      *  Returns true of the instance is connected using the community
      *  credentials.
      */
    /* CompleteClass */
    override def isCommunityResource(): Boolean = js.native
    
    /**
      *  The Project ID for the INFURA connection.
      */
    val projectId: String = js.native
    
    /**
      *  The Project Secret.
      *
      *  If null, no authenticated requests are made. This should not
      *  be used outside of private contexts.
      */
    val projectSecret: Null | String = js.native
  }
}
