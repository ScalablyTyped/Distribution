package typings.ethers.mod.ethers

import typings.ethers.typesMod.AsyncProvider
import typings.ethers.typesMod.ConnectionInfo
import typings.ethers.typesMod.Network
import typings.ethers.typesMod.Networkish
import typings.ethers.typesMod.TransactionRequest
import typings.ethers.typesMod.TransactionResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers", "ethers.providers")
@js.native
object providers extends js.Object {
  @js.native
  class EtherscanProvider ()
    extends typings.ethers.ethersMod.providers.EtherscanProvider {
    def this(network: Networkish) = this()
    def this(network: Networkish, apiKey: String) = this()
  }
  
  @js.native
  class FallbackProvider protected ()
    extends typings.ethers.ethersMod.providers.FallbackProvider {
    def this(providers: js.Array[typings.ethers.providerMod.Provider]) = this()
  }
  
  @js.native
  class InfuraProvider ()
    extends typings.ethers.ethersMod.providers.InfuraProvider {
    def this(network: Networkish) = this()
    def this(network: Networkish, apiAccessToken: String) = this()
  }
  
  @js.native
  class IpcProvider protected ()
    extends typings.ethers.ethersMod.providers.IpcProvider {
    def this(path: String) = this()
    def this(path: String, network: Networkish) = this()
  }
  
  @js.native
  class JsonRpcProvider ()
    extends typings.ethers.ethersMod.providers.JsonRpcProvider {
    def this(url: String) = this()
    def this(url: ConnectionInfo) = this()
    def this(url: String, network: Networkish) = this()
    def this(url: ConnectionInfo, network: Networkish) = this()
  }
  
  @js.native
  class JsonRpcSigner protected ()
    extends typings.ethers.ethersMod.providers.JsonRpcSigner {
    def this(provider: typings.ethers.jsonRpcProviderMod.JsonRpcProvider) = this()
    def this(provider: typings.ethers.jsonRpcProviderMod.JsonRpcProvider, address: String) = this()
  }
  
  @js.native
  class Provider protected ()
    extends typings.ethers.ethersMod.providers.Provider {
    def this(network: js.Promise[Network]) = this()
    def this(network: Networkish) = this()
  }
  
  @js.native
  class Web3Provider protected ()
    extends typings.ethers.ethersMod.providers.Web3Provider {
    def this(web3Provider: AsyncProvider) = this()
    def this(web3Provider: AsyncProvider, network: Networkish) = this()
  }
  
  def getDefaultProvider(): typings.ethers.providerMod.Provider = js.native
  def getDefaultProvider(network: String): typings.ethers.providerMod.Provider = js.native
  def getDefaultProvider(network: Network): typings.ethers.providerMod.Provider = js.native
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

