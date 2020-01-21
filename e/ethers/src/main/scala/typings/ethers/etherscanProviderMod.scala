package typings.ethers

import typings.ethers.providerMod.Provider
import typings.ethers.typesMod.BlockTag
import typings.ethers.typesMod.Networkish
import typings.ethers.typesMod.TransactionResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/providers/etherscan-provider", JSImport.Namespace)
@js.native
object etherscanProviderMod extends js.Object {
  @js.native
  class EtherscanProvider () extends Provider {
    def this(network: Networkish) = this()
    def this(network: Networkish, apiKey: String) = this()
    val apiKey: String = js.native
    val baseUrl: String = js.native
    def getHistory(addressOrName: String): js.Promise[js.Array[TransactionResponse]] = js.native
    def getHistory(addressOrName: String, startBlock: BlockTag): js.Promise[js.Array[TransactionResponse]] = js.native
    def getHistory(addressOrName: String, startBlock: BlockTag, endBlock: BlockTag): js.Promise[js.Array[TransactionResponse]] = js.native
    def getHistory(addressOrName: js.Promise[String]): js.Promise[js.Array[TransactionResponse]] = js.native
    def getHistory(addressOrName: js.Promise[String], startBlock: BlockTag): js.Promise[js.Array[TransactionResponse]] = js.native
    def getHistory(addressOrName: js.Promise[String], startBlock: BlockTag, endBlock: BlockTag): js.Promise[js.Array[TransactionResponse]] = js.native
  }
  
}

