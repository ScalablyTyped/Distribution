package typings.ethers

import typings.ethers.typesProvidersCommunityMod.CommunityResourcable
import typings.ethers.typesProvidersNetworkMod.Network
import typings.ethers.typesProvidersNetworkMod.Networkish
import typings.ethers.typesProvidersProviderJsonrpcMod.JsonRpcProvider
import typings.ethers.typesUtilsMod.FetchRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvidersProviderPocketMod {
  
  @JSImport("ethers/types/providers/provider-pocket", "PocketProvider")
  @js.native
  /**
    *  Create a new **PocketProvider**.
    *
    *  By default connecting to ``mainnet`` with a highly throttled
    *  API key.
    */
  open class PocketProvider ()
    extends JsonRpcProvider
       with CommunityResourcable {
    def this(_network: Networkish) = this()
    def this(_network: Unit, applicationId: String) = this()
    def this(_network: Networkish, applicationId: String) = this()
    def this(_network: Unit, applicationId: String, applicationSecret: String) = this()
    def this(_network: Unit, applicationId: Null, applicationSecret: String) = this()
    def this(_network: Unit, applicationId: Unit, applicationSecret: String) = this()
    def this(_network: Networkish, applicationId: String, applicationSecret: String) = this()
    def this(_network: Networkish, applicationId: Null, applicationSecret: String) = this()
    def this(_network: Networkish, applicationId: Unit, applicationSecret: String) = this()
    
    /**
      *  The Application ID for the Pocket connection.
      */
    val applicationId: String = js.native
    
    /**
      *  The Application Secret for making authenticated requests
      *  to the Pocket connection.
      */
    val applicationSecret: Null | String = js.native
    
    /**
      *  Returns true of the instance is connected using the community
      *  credentials.
      */
    /* CompleteClass */
    override def isCommunityResource(): Boolean = js.native
  }
  /* static members */
  object PocketProvider {
    
    @JSImport("ethers/types/providers/provider-pocket", "PocketProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Returns a prepared request for connecting to %%network%% with
      *  %%applicationId%%.
      */
    inline def getRequest(network: Network): FetchRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(network.asInstanceOf[js.Any]).asInstanceOf[FetchRequest]
    inline def getRequest(network: Network, applicationId: String): FetchRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(network.asInstanceOf[js.Any], applicationId.asInstanceOf[js.Any])).asInstanceOf[FetchRequest]
    inline def getRequest(network: Network, applicationId: String, applicationSecret: String): FetchRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(network.asInstanceOf[js.Any], applicationId.asInstanceOf[js.Any], applicationSecret.asInstanceOf[js.Any])).asInstanceOf[FetchRequest]
    inline def getRequest(network: Network, applicationId: Null, applicationSecret: String): FetchRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(network.asInstanceOf[js.Any], applicationId.asInstanceOf[js.Any], applicationSecret.asInstanceOf[js.Any])).asInstanceOf[FetchRequest]
    inline def getRequest(network: Network, applicationId: Unit, applicationSecret: String): FetchRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(network.asInstanceOf[js.Any], applicationId.asInstanceOf[js.Any], applicationSecret.asInstanceOf[js.Any])).asInstanceOf[FetchRequest]
  }
}
