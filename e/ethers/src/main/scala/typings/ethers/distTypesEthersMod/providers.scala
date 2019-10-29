package typings.ethers.distTypesEthersMod

import typings.ethers.distTypesUtilsTypesMod.AsyncProvider
import typings.ethers.distTypesUtilsTypesMod.ConnectionInfo
import typings.ethers.distTypesUtilsTypesMod.Network
import typings.ethers.distTypesUtilsTypesMod.Networkish
import typings.ethers.distTypesUtilsTypesMod.TransactionRequest
import typings.ethers.distTypesUtilsTypesMod.TransactionResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/ethers", "providers")
@js.native
object providers extends js.Object {
  @js.native
  class EtherscanProvider ()
    extends typings.ethers.distTypesProvidersMod.EtherscanProvider {
    def this(network: Networkish) = this()
    def this(network: Networkish, apiKey: String) = this()
  }
  
  @js.native
  class FallbackProvider protected ()
    extends typings.ethers.distTypesProvidersMod.FallbackProvider {
    def this(providers: js.Array[typings.ethers.distTypesProvidersProviderMod.Provider]) = this()
  }
  
  @js.native
  class InfuraProvider ()
    extends typings.ethers.distTypesProvidersMod.InfuraProvider {
    def this(network: Networkish) = this()
    def this(network: Networkish, apiAccessToken: String) = this()
  }
  
  @js.native
  class IpcProvider protected ()
    extends typings.ethers.distTypesProvidersMod.IpcProvider {
    def this(path: String) = this()
    def this(path: String, network: Networkish) = this()
  }
  
  @js.native
  class JsonRpcProvider ()
    extends typings.ethers.distTypesProvidersMod.JsonRpcProvider {
    def this(url: String) = this()
    def this(url: ConnectionInfo) = this()
    def this(url: String, network: Networkish) = this()
    def this(url: ConnectionInfo, network: Networkish) = this()
  }
  
  @js.native
  class JsonRpcSigner protected ()
    extends typings.ethers.distTypesProvidersMod.JsonRpcSigner {
    def this(provider: typings.ethers.distTypesProvidersJsonDashRpcDashProviderMod.JsonRpcProvider) = this()
    def this(
      provider: typings.ethers.distTypesProvidersJsonDashRpcDashProviderMod.JsonRpcProvider,
      address: String
    ) = this()
  }
  
  @js.native
  class Provider protected ()
    extends typings.ethers.distTypesProvidersMod.Provider {
    def this(network: js.Promise[Network]) = this()
    def this(network: Networkish) = this()
  }
  
  @js.native
  class Web3Provider protected ()
    extends typings.ethers.distTypesProvidersMod.Web3Provider {
    def this(web3Provider: AsyncProvider) = this()
    def this(web3Provider: AsyncProvider, network: Networkish) = this()
  }
  
  def getDefaultProvider(): typings.ethers.distTypesProvidersProviderMod.Provider = js.native
  def getDefaultProvider(network: String): typings.ethers.distTypesProvidersProviderMod.Provider = js.native
  def getDefaultProvider(network: Network): typings.ethers.distTypesProvidersProviderMod.Provider = js.native
  /* static members */
  @js.native
  object JsonRpcProvider extends js.Object {
    def hexlifyTransaction(transaction: TransactionRequest): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Provider extends js.Object {
    def checkTransactionResponse(transaction: js.Any): TransactionResponse = js.native
  }
  
}

