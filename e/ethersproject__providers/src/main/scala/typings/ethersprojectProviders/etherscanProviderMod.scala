package typings.ethersprojectProviders

import typings.ethersprojectAbstractProvider.mod.BlockTag
import typings.ethersprojectAbstractProvider.mod.TransactionResponse
import typings.ethersprojectNetworks.typesMod.Networkish
import typings.ethersprojectProviders.baseProviderMod.BaseProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/providers/lib/etherscan-provider", JSImport.Namespace)
@js.native
object etherscanProviderMod extends js.Object {
  
  @js.native
  class EtherscanProvider () extends BaseProvider {
    def this(network: Networkish) = this()
    def this(network: js.UndefOr[Networkish], apiKey: String) = this()
    
    val apiKey: String = js.native
    
    val baseUrl: String = js.native
    
    def getHistory(addressOrName: String): js.Promise[js.Array[TransactionResponse]] = js.native
    def getHistory(addressOrName: String, startBlock: js.UndefOr[BlockTag], endBlock: BlockTag): js.Promise[js.Array[TransactionResponse]] = js.native
    def getHistory(addressOrName: String, startBlock: BlockTag): js.Promise[js.Array[TransactionResponse]] = js.native
    def getHistory(addressOrName: js.Promise[String]): js.Promise[js.Array[TransactionResponse]] = js.native
    def getHistory(addressOrName: js.Promise[String], startBlock: js.UndefOr[BlockTag], endBlock: BlockTag): js.Promise[js.Array[TransactionResponse]] = js.native
    def getHistory(addressOrName: js.Promise[String], startBlock: BlockTag): js.Promise[js.Array[TransactionResponse]] = js.native
    
    def isCommunityResource(): Boolean = js.native
  }
}
