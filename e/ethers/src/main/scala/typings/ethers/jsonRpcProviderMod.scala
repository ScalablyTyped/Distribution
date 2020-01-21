package typings.ethers

import typings.ethers.providerMod.Provider
import typings.ethers.typesMod.BigNumber
import typings.ethers.typesMod.BlockTag
import typings.ethers.typesMod.ConnectionInfo
import typings.ethers.typesMod.Networkish
import typings.ethers.typesMod.Signer
import typings.ethers.typesMod.TransactionRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/providers/json-rpc-provider", JSImport.Namespace)
@js.native
object jsonRpcProviderMod extends js.Object {
  @js.native
  class JsonRpcProvider () extends Provider {
    def this(url: String) = this()
    def this(url: ConnectionInfo) = this()
    def this(url: String, network: Networkish) = this()
    def this(url: ConnectionInfo, network: Networkish) = this()
    var _pendingFilter: js.Any = js.native
    val connection: ConnectionInfo = js.native
    def getSigner(): JsonRpcSigner = js.native
    def getSigner(address: String): JsonRpcSigner = js.native
    def listAccounts(): js.Promise[js.Array[String]] = js.native
    def send(method: String, params: js.Any): js.Promise[_] = js.native
  }
  
  @js.native
  class JsonRpcSigner protected () extends Signer {
    def this(provider: JsonRpcProvider) = this()
    def this(provider: JsonRpcProvider, address: String) = this()
    var _address: js.Any = js.native
    val address: String = js.native
    @JSName("provider")
    val provider_JsonRpcSigner: JsonRpcProvider = js.native
    def getBalance(): js.Promise[BigNumber] = js.native
    def getBalance(blockTag: BlockTag): js.Promise[BigNumber] = js.native
    def getTransactionCount(): js.Promise[Double] = js.native
    def getTransactionCount(blockTag: BlockTag): js.Promise[Double] = js.native
    def unlock(password: String): js.Promise[Boolean] = js.native
  }
  
  /* static members */
  @js.native
  object JsonRpcProvider extends js.Object {
    def hexlifyTransaction(transaction: TransactionRequest): js.Any = js.native
  }
  
}

