package typings.ethers

import typings.ethers.typesProvidersCommunityMod.CommunityResourcable
import typings.ethers.typesProvidersNetworkMod.Network
import typings.ethers.typesProvidersNetworkMod.Networkish
import typings.ethers.typesProvidersProviderJsonrpcMod.JsonRpcProvider
import typings.ethers.typesUtilsMod.FetchRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvidersProviderQuicknodeMod {
  
  @JSImport("ethers/types/providers/provider-quicknode", "QuickNodeProvider")
  @js.native
  /**
    *  Creates a new **QuickNodeProvider**.
    */
  open class QuickNodeProvider ()
    extends JsonRpcProvider
       with CommunityResourcable {
    def this(_network: Networkish) = this()
    def this(_network: Unit, token: String) = this()
    def this(_network: Networkish, token: String) = this()
    
    /**
      *  Returns true of the instance is connected using the community
      *  credentials.
      */
    /* CompleteClass */
    override def isCommunityResource(): Boolean = js.native
    
    /**
      *  The API token.
      */
    val token: String = js.native
  }
  /* static members */
  object QuickNodeProvider {
    
    @JSImport("ethers/types/providers/provider-quicknode", "QuickNodeProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Returns a new request prepared for %%network%% and the
      *  %%token%%.
      */
    inline def getRequest(network: Network): FetchRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(network.asInstanceOf[js.Any]).asInstanceOf[FetchRequest]
    inline def getRequest(network: Network, token: String): FetchRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequest")(network.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[FetchRequest]
  }
}
