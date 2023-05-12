package typings.ethers

import typings.ethers.typesContractMod.Contract
import typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider
import typings.ethers.typesProvidersAbstractProviderMod.PerformActionRequest
import typings.ethers.typesProvidersNetworkMod.Network
import typings.ethers.typesProvidersNetworkMod.Networkish
import typings.ethers.typesProvidersPluginsNetworkMod.NetworkPlugin
import typings.ethers.typesProvidersProviderMod.TransactionRequest
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvidersProviderEtherscanMod {
  
  @JSImport("ethers/types/providers/provider-etherscan", "EtherscanPlugin")
  @js.native
  open class EtherscanPlugin protected () extends NetworkPlugin {
    /**
      *  Creates a new **EtherscanProvider** which will use
      *  %%baseUrl%%.
      */
    def this(baseUrl: String) = this()
    
    /**
      *  The Etherscan API base URL.
      */
    val baseUrl: String = js.native
  }
  
  @JSImport("ethers/types/providers/provider-etherscan", "EtherscanProvider")
  @js.native
  /**
    *  Creates a new **EtherscanBaseProvider**.
    */
  open class EtherscanProvider () extends AbstractProvider {
    def this(_network: Networkish) = this()
    def this(_network: Unit, _apiKey: String) = this()
    def this(_network: Networkish, _apiKey: String) = this()
    
    /**
      *  Throws the normalized Etherscan error.
      */
    def _checkError(req: PerformActionRequest, error: js.Error, transaction: Any): scala.Nothing = js.native
    
    /**
      *  Returns %%transaction%% normalized for the Etherscan API.
      */
    def _getTransactionPostData(transaction: TransactionRequest): Record[String, String] = js.native
    
    /**
      *  The API key or null if using the community provided bandwidth.
      */
    val apiKey: Null | String = js.native
    
    def detectNetwork(): js.Promise[Network] = js.native
    
    /**
      *  Resolves to the result of calling %%module%% with %%params%%.
      *
      *  If %%post%%, the request is made as a POST request.
      */
    def fetch(module: String, params: Record[String, Any]): js.Promise[Any] = js.native
    def fetch(module: String, params: Record[String, Any], post: Boolean): js.Promise[Any] = js.native
    
    /**
      *  Returns the base URL.
      *
      *  If an [[EtherscanPlugin]] is configured on the
      *  [[EtherscanBaseProvider_network]], returns the plugin's
      *  baseUrl.
      */
    def getBaseUrl(): String = js.native
    
    /**
      *  Resolves to a [Contract]] for %%address%%, using the
      *  Etherscan API to retreive the Contract ABI.
      */
    def getContract(_address: String): js.Promise[Null | Contract] = js.native
    
    /**
      *  Resolves to the current price of ether.
      *
      *  This returns ``0`` on any network other than ``mainnet``.
      */
    def getEtherPrice(): js.Promise[Double] = js.native
    
    /**
      *  Returns the parameters for using POST requests.
      */
    def getPostData(module: String, params: Record[String, Any]): Record[String, Any] = js.native
    
    /**
      *  Returns the URL for using POST requests.
      */
    def getPostUrl(): String = js.native
    
    /**
      *  Returns the URL for the %%module%% and %%params%%.
      */
    def getUrl(module: String, params: Record[String, String]): String = js.native
    
    def isCommunityResource(): Boolean = js.native
    
    /**
      *  The connected network.
      */
    val network: Network = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ethers.anon.Id
    - typings.ethers.anon.ActionId
    - typings.ethers.anon.ErrorId
  */
  trait DebugEventEtherscanProvider extends StObject
  object DebugEventEtherscanProvider {
    
    inline def ActionId(id: Double, result: Any): typings.ethers.anon.ActionId = {
      val __obj = js.Dynamic.literal(action = "receiveRequest", id = id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ethers.anon.ActionId]
    }
    
    inline def ErrorId(error: Any, id: Double): typings.ethers.anon.ErrorId = {
      val __obj = js.Dynamic.literal(action = "receiveError", error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ethers.anon.ErrorId]
    }
    
    inline def Id(id: Double, payload: Record[String, Any], url: String): typings.ethers.anon.Id = {
      val __obj = js.Dynamic.literal(action = "sendRequest", id = id.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ethers.anon.Id]
    }
  }
}
