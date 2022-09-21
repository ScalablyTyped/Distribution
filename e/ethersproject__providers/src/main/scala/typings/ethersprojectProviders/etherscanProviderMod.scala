package typings.ethersprojectProviders

import typings.ethersprojectAbstractProvider.mod.BlockTag
import typings.ethersprojectAbstractProvider.mod.TransactionResponse
import typings.ethersprojectNetworks.typesMod.Networkish
import typings.ethersprojectProviders.baseProviderMod.BaseProvider
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object etherscanProviderMod {
  
  @JSImport("@ethersproject/providers/lib/etherscan-provider", "EtherscanProvider")
  @js.native
  open class EtherscanProvider () extends BaseProvider {
    def this(network: Networkish) = this()
    def this(network: Unit, apiKey: String) = this()
    def this(network: Networkish, apiKey: String) = this()
    
    val apiKey: String | Null = js.native
    
    val baseUrl: String = js.native
    
    def fetch(module: String, params: Record[String, Any]): js.Promise[Any] = js.native
    def fetch(module: String, params: Record[String, Any], post: Boolean): js.Promise[Any] = js.native
    
    def getBaseUrl(): String = js.native
    
    def getHistory(addressOrName: String): js.Promise[js.Array[TransactionResponse]] = js.native
    def getHistory(addressOrName: String, startBlock: Unit, endBlock: BlockTag): js.Promise[js.Array[TransactionResponse]] = js.native
    def getHistory(addressOrName: String, startBlock: BlockTag): js.Promise[js.Array[TransactionResponse]] = js.native
    def getHistory(addressOrName: String, startBlock: BlockTag, endBlock: BlockTag): js.Promise[js.Array[TransactionResponse]] = js.native
    def getHistory(addressOrName: js.Promise[String]): js.Promise[js.Array[TransactionResponse]] = js.native
    def getHistory(addressOrName: js.Promise[String], startBlock: Unit, endBlock: BlockTag): js.Promise[js.Array[TransactionResponse]] = js.native
    def getHistory(addressOrName: js.Promise[String], startBlock: BlockTag): js.Promise[js.Array[TransactionResponse]] = js.native
    def getHistory(addressOrName: js.Promise[String], startBlock: BlockTag, endBlock: BlockTag): js.Promise[js.Array[TransactionResponse]] = js.native
    
    def getPostData(module: String, params: Record[String, Any]): Record[String, Any] = js.native
    
    def getPostUrl(): String = js.native
    
    def getUrl(module: String, params: Record[String, String]): String = js.native
    
    def isCommunityResource(): Boolean = js.native
  }
}
