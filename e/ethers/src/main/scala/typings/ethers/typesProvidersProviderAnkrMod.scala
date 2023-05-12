package typings.ethers

import typings.ethers.typesProvidersCommunityMod.CommunityResourcable
import typings.ethers.typesProvidersNetworkMod.Network
import typings.ethers.typesProvidersNetworkMod.Networkish
import typings.ethers.typesProvidersProviderJsonrpcMod.JsonRpcProvider
import typings.ethers.typesUtilsMod.FetchRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvidersProviderAnkrMod {
  
  @JSImport("ethers/types/providers/provider-ankr", "AnkrProvider")
  @js.native
  /**
    *  Create a new **AnkrProvider**.
    *
    *  By default connecting to ``mainnet`` with a highly throttled
    *  API key.
    */
  open class AnkrProvider ()
    extends JsonRpcProvider
       with CommunityResourcable {
    def this(_network: Networkish) = this()
    def this(_network: Unit, apiKey: String) = this()
    def this(_network: Networkish, apiKey: String) = this()
    
    /**
      *  The API key for the Ankr connection.
      */
    val apiKey: String = js.native
    
    /**
      *  Returns true of the instance is connected using the community
      *  credentials.
      */
    /* CompleteClass */
    override def isCommunityResource(): Boolean = js.native
  }
  /* static members */
  object AnkrProvider {
    
    @JSImport("ethers/types/providers/provider-ankr", "AnkrProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Returns a prepared request for connecting to %%network%% with
      *  %%apiKey%%.
      */
    inline def getRequest(network: Network): FetchRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(network.asInstanceOf[js.Any]).asInstanceOf[FetchRequest]
    inline def getRequest(network: Network, apiKey: String): FetchRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[FetchRequest]
  }
}
