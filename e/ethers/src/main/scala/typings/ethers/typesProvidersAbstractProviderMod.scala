package typings.ethers

import typings.ethers.anon.To
import typings.ethers.ethersStrings.any
import typings.ethers.ethersStrings.block
import typings.ethers.ethersStrings.close
import typings.ethers.ethersStrings.debug
import typings.ethers.ethersStrings.network
import typings.ethers.ethersStrings.pending
import typings.ethers.typesAddressMod.AddressLike
import typings.ethers.typesProvidersEnsResolverMod.EnsResolver
import typings.ethers.typesProvidersFormattingMod.BlockParams
import typings.ethers.typesProvidersFormattingMod.LogParams
import typings.ethers.typesProvidersFormattingMod.TransactionReceiptParams
import typings.ethers.typesProvidersFormattingMod.TransactionResponseParams
import typings.ethers.typesProvidersNetworkMod.Network
import typings.ethers.typesProvidersNetworkMod.Networkish
import typings.ethers.typesProvidersProviderMod.Block
import typings.ethers.typesProvidersProviderMod.BlockTag
import typings.ethers.typesProvidersProviderMod.EventFilter
import typings.ethers.typesProvidersProviderMod.Filter
import typings.ethers.typesProvidersProviderMod.FilterByBlockHash
import typings.ethers.typesProvidersProviderMod.Log
import typings.ethers.typesProvidersProviderMod.OrphanFilter
import typings.ethers.typesProvidersProviderMod.PreparedTransactionRequest
import typings.ethers.typesProvidersProviderMod.Provider
import typings.ethers.typesProvidersProviderMod.TransactionReceipt
import typings.ethers.typesProvidersProviderMod.TransactionRequest
import typings.ethers.typesProvidersProviderMod.TransactionResponse
import typings.ethers.typesUtilsMod.FetchRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvidersAbstractProviderMod {
  
  @JSImport("ethers/types/providers/abstract-provider", "AbstractProvider")
  @js.native
  open class AbstractProvider ()
    extends StObject
       with Provider {
    def this(_network: any) = this()
    def this(_network: Networkish) = this()
    
    def _clearTimeout(timerId: Double): Unit = js.native
    
    def _detectNetwork(): js.Promise[Network] = js.native
    
    def _forEachSubscriber(func: js.Function1[/* s */ Subscriber, Unit]): Unit = js.native
    
    def _getAddress(address: AddressLike): String | js.Promise[String] = js.native
    
    def _getBlockTag(): String | js.Promise[String] = js.native
    def _getBlockTag(blockTag: BlockTag): String | js.Promise[String] = js.native
    
    def _getFilter(filter: Filter): PerformActionFilter | js.Promise[PerformActionFilter] = js.native
    def _getFilter(filter: FilterByBlockHash): PerformActionFilter | js.Promise[PerformActionFilter] = js.native
    
    def _getProvider(chainId: Double): AbstractProvider = js.native
    
    def _getSubscriber(sub: Subscription): Subscriber = js.native
    
    def _getTransactionRequest(_request: TransactionRequest): PerformActionTransaction | js.Promise[PerformActionTransaction] = js.native
    
    def _perform[T](req: PerformActionRequest): js.Promise[T] = js.native
    
    def _recoverSubscriber(oldSub: Subscriber, newSub: Subscriber): Unit = js.native
    
    def _setTimeout(_func: js.Function0[Unit]): Double = js.native
    def _setTimeout(_func: js.Function0[Unit], timeout: Double): Double = js.native
    
    def _wrapBlock(value: BlockParams, network: Network): Block = js.native
    
    def _wrapLog(value: LogParams, network: Network): Log = js.native
    
    def _wrapTransactionReceipt(value: TransactionReceiptParams, network: Network): TransactionReceipt = js.native
    
    def _wrapTransactionResponse(tx: TransactionResponseParams, network: Network): TransactionResponse = js.native
    
    def attachPlugin(plugin: AbstractProviderPlugin): this.type = js.native
    
    @JSName("call")
    def call_MAbstractProvider(_tx: TransactionRequest): js.Promise[String] = js.native
    
    def ccipReadFetch(tx: PerformActionTransaction, calldata: String, urls: js.Array[String]): js.Promise[Null | String] = js.native
    
    def disableCcipRead: Boolean = js.native
    def disableCcipRead_=(value: Boolean): Unit = js.native
    
    @JSName("estimateGas")
    def estimateGas_MAbstractProvider(_tx: TransactionRequest): js.Promise[js.BigInt] = js.native
    
    def getAvatar(name: String): js.Promise[Null | String] = js.native
    
    def getPlugin[T /* <: AbstractProviderPlugin */](name: String): Null | T = js.native
    
    def getResolver(name: String): js.Promise[Null | EnsResolver] = js.native
    
    def pause(): Unit = js.native
    def pause(dropWhilePaused: Boolean): Unit = js.native
    
    def paused: Boolean = js.native
    def paused_=(pause: Boolean): Unit = js.native
    
    def plugins: js.Array[AbstractProviderPlugin] = js.native
    
    /* private */ var `private`: Any = js.native
    
    /* CompleteClass */
    var provider: Null | Provider = js.native
    @JSName("provider")
    def provider_MAbstractProvider: this.type = js.native
    
    /**
      *  Resolve to the address for the ENS %%name%%.
      *
      *  Resolves to ``null`` if the name is unconfigued. Use
      *  [[resolveAddress]] (passing this object as %%resolver%%) to
      *  throw for names that are unconfigured.
      */
    /* CompleteClass */
    override def resolveName(name: String): js.Promise[Null | String] = js.native
    @JSName("resolveName")
    def resolveName_MAbstractProvider(name: String): js.Promise[Null | String] = js.native
    
    def resume(): Unit = js.native
    
    def waitForTransaction(hash: String, _confirms: Null, timeout: Double): js.Promise[Null | TransactionReceipt] = js.native
  }
  
  @JSImport("ethers/types/providers/abstract-provider", "UnmanagedSubscriber")
  @js.native
  open class UnmanagedSubscriber protected ()
    extends StObject
       with Subscriber {
    def this(name: String) = this()
    
    var name: String = js.native
  }
  
  trait AbstractProviderPlugin extends StObject {
    
    def connect(provider: AbstractProvider): AbstractProviderPlugin
    
    val name: String
  }
  object AbstractProviderPlugin {
    
    inline def apply(connect: AbstractProvider => AbstractProviderPlugin, name: String): AbstractProviderPlugin = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbstractProviderPlugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbstractProviderPlugin] (val x: Self) extends AnyVal {
      
      inline def setConnect(value: AbstractProvider => AbstractProviderPlugin): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ethers.anon.Action
    - typings.ethers.anon.Request
    - typings.ethers.anon.Result
    - typings.ethers.anon.Transaction
    - typings.ethers.anon.ActionResult
    - typings.ethers.anon.ActionError
  */
  trait DebugEventAbstractProvider extends StObject
  object DebugEventAbstractProvider {
    
    inline def Action(index: Double, request: FetchRequest, urls: js.Array[String]): typings.ethers.anon.Action = {
      val __obj = js.Dynamic.literal(action = "sendCcipReadFetchRequest", index = index.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ethers.anon.Action]
    }
    
    inline def ActionError(error: js.Error, transaction: To): typings.ethers.anon.ActionError = {
      val __obj = js.Dynamic.literal(action = "receiveCcipReadCallError", error = error.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ethers.anon.ActionError]
    }
    
    inline def ActionResult(result: String, transaction: To): typings.ethers.anon.ActionResult = {
      val __obj = js.Dynamic.literal(action = "receiveCcipReadCallResult", result = result.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ethers.anon.ActionResult]
    }
    
    inline def Request(request: FetchRequest, result: Any): typings.ethers.anon.Request = {
      val __obj = js.Dynamic.literal(action = "receiveCcipReadFetchResult", request = request.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ethers.anon.Request]
    }
    
    inline def Result(request: FetchRequest, result: Any): typings.ethers.anon.Result = {
      val __obj = js.Dynamic.literal(action = "receiveCcipReadFetchError", request = request.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ethers.anon.Result]
    }
    
    inline def Transaction(transaction: To): typings.ethers.anon.Transaction = {
      val __obj = js.Dynamic.literal(action = "sendCcipReadCall", transaction = transaction.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ethers.anon.Transaction]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ethers.anon.Address
    - typings.ethers.anon.BlockHash
  */
  trait PerformActionFilter extends StObject
  object PerformActionFilter {
    
    inline def Address(): typings.ethers.anon.Address = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ethers.anon.Address]
    }
    
    inline def BlockHash(): typings.ethers.anon.BlockHash = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ethers.anon.BlockHash]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ethers.anon.Method
    - typings.ethers.anon.BlockTag
    - typings.ethers.anon.`0`
    - typings.ethers.anon.MethodTransaction
    - typings.ethers.anon.AddressBlockTag
    - typings.ethers.anon.IncludeTransactions
    - typings.ethers.anon.BlockHashIncludeTransactions
    - typings.ethers.anon.`1`
    - typings.ethers.anon.BlockTagMethod
    - typings.ethers.anon.`2`
    - typings.ethers.anon.FilterMethod
    - typings.ethers.anon.Position
    - typings.ethers.anon.HashMethod
    - typings.ethers.anon.AddressBlockTagMethod
    - typings.ethers.anon.HashString
    - typings.ethers.anon.HashStringMethod
  */
  trait PerformActionRequest extends StObject
  object PerformActionRequest {
    
    inline def `0`(): typings.ethers.anon.`0` = {
      val __obj = js.Dynamic.literal(method = "chainId")
      __obj.asInstanceOf[typings.ethers.anon.`0`]
    }
    
    inline def `1`(): typings.ethers.anon.`1` = {
      val __obj = js.Dynamic.literal(method = "getBlockNumber")
      __obj.asInstanceOf[typings.ethers.anon.`1`]
    }
    
    inline def `2`(): typings.ethers.anon.`2` = {
      val __obj = js.Dynamic.literal(method = "getGasPrice")
      __obj.asInstanceOf[typings.ethers.anon.`2`]
    }
    
    inline def AddressBlockTag(address: String, blockTag: BlockTag): typings.ethers.anon.AddressBlockTag = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], blockTag = blockTag.asInstanceOf[js.Any], method = "getBalance")
      __obj.asInstanceOf[typings.ethers.anon.AddressBlockTag]
    }
    
    inline def AddressBlockTagMethod(address: String, blockTag: BlockTag): typings.ethers.anon.AddressBlockTagMethod = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], blockTag = blockTag.asInstanceOf[js.Any], method = "getTransactionCount")
      __obj.asInstanceOf[typings.ethers.anon.AddressBlockTagMethod]
    }
    
    inline def BlockHashIncludeTransactions(blockHash: String, includeTransactions: Boolean): typings.ethers.anon.BlockHashIncludeTransactions = {
      val __obj = js.Dynamic.literal(blockHash = blockHash.asInstanceOf[js.Any], includeTransactions = includeTransactions.asInstanceOf[js.Any], method = "getBlock")
      __obj.asInstanceOf[typings.ethers.anon.BlockHashIncludeTransactions]
    }
    
    inline def BlockTag(blockTag: typings.ethers.typesProvidersProviderMod.BlockTag, transaction: PerformActionTransaction): typings.ethers.anon.BlockTag = {
      val __obj = js.Dynamic.literal(blockTag = blockTag.asInstanceOf[js.Any], method = "call", transaction = transaction.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ethers.anon.BlockTag]
    }
    
    inline def BlockTagMethod(address: String, blockTag: BlockTag): typings.ethers.anon.BlockTagMethod = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], blockTag = blockTag.asInstanceOf[js.Any], method = "getCode")
      __obj.asInstanceOf[typings.ethers.anon.BlockTagMethod]
    }
    
    inline def FilterMethod(filter: PerformActionFilter): typings.ethers.anon.FilterMethod = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], method = "getLogs")
      __obj.asInstanceOf[typings.ethers.anon.FilterMethod]
    }
    
    inline def HashMethod(hash: String): typings.ethers.anon.HashMethod = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], method = "getTransaction")
      __obj.asInstanceOf[typings.ethers.anon.HashMethod]
    }
    
    inline def HashString(hash: String): typings.ethers.anon.HashString = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], method = "getTransactionReceipt")
      __obj.asInstanceOf[typings.ethers.anon.HashString]
    }
    
    inline def HashStringMethod(hash: String): typings.ethers.anon.HashStringMethod = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], method = "getTransactionResult")
      __obj.asInstanceOf[typings.ethers.anon.HashStringMethod]
    }
    
    inline def IncludeTransactions(blockTag: BlockTag, includeTransactions: Boolean): typings.ethers.anon.IncludeTransactions = {
      val __obj = js.Dynamic.literal(blockTag = blockTag.asInstanceOf[js.Any], includeTransactions = includeTransactions.asInstanceOf[js.Any], method = "getBlock")
      __obj.asInstanceOf[typings.ethers.anon.IncludeTransactions]
    }
    
    inline def Method(signedTransaction: String): typings.ethers.anon.Method = {
      val __obj = js.Dynamic.literal(method = "broadcastTransaction", signedTransaction = signedTransaction.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ethers.anon.Method]
    }
    
    inline def MethodTransaction(transaction: PerformActionTransaction): typings.ethers.anon.MethodTransaction = {
      val __obj = js.Dynamic.literal(method = "estimateGas", transaction = transaction.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ethers.anon.MethodTransaction]
    }
    
    inline def Position(address: String, blockTag: BlockTag, position: js.BigInt): typings.ethers.anon.Position = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], blockTag = blockTag.asInstanceOf[js.Any], method = "getStorage", position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ethers.anon.Position]
    }
  }
  
  trait PerformActionTransaction
    extends StObject
       with PreparedTransactionRequest {
    
    @JSName("from")
    var from_PerformActionTransaction: js.UndefOr[String] = js.undefined
    
    @JSName("to")
    var to_PerformActionTransaction: js.UndefOr[String] = js.undefined
  }
  object PerformActionTransaction {
    
    inline def apply(): PerformActionTransaction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PerformActionTransaction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PerformActionTransaction] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  @js.native
  trait Subscriber extends StObject {
    
    def pause(): Unit = js.native
    def pause(dropWhilePaused: Boolean): Unit = js.native
    
    var pollingInterval: js.UndefOr[Double] = js.native
    
    def resume(): Unit = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ethers.anon.Tag
    - typings.ethers.anon.Hash
    - typings.ethers.anon.Filter
    - typings.ethers.anon.Type
  */
  trait Subscription extends StObject
  object Subscription {
    
    inline def Filter(filter: EventFilter, tag: String): typings.ethers.anon.Filter = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("event")
      __obj.asInstanceOf[typings.ethers.anon.Filter]
    }
    
    inline def Hash(hash: String, tag: String): typings.ethers.anon.Hash = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("transaction")
      __obj.asInstanceOf[typings.ethers.anon.Hash]
    }
    
    inline def Tag(tag: String, `type`: block | close | debug | network | pending): typings.ethers.anon.Tag = {
      val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ethers.anon.Tag]
    }
    
    inline def Type(filter: OrphanFilter, tag: String): typings.ethers.anon.Type = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("orphan")
      __obj.asInstanceOf[typings.ethers.anon.Type]
    }
  }
}
