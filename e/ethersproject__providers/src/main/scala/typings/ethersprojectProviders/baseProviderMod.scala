package typings.ethersprojectProviders

import org.scalablytyped.runtime.StringDictionary
import typings.ethersprojectAbstractProvider.mod.Block
import typings.ethersprojectAbstractProvider.mod.BlockTag
import typings.ethersprojectAbstractProvider.mod.BlockWithTransactions
import typings.ethersprojectAbstractProvider.mod.EventType
import typings.ethersprojectAbstractProvider.mod.Filter
import typings.ethersprojectAbstractProvider.mod.FilterByBlockHash
import typings.ethersprojectAbstractProvider.mod.Listener
import typings.ethersprojectAbstractProvider.mod.Log
import typings.ethersprojectAbstractProvider.mod.Provider
import typings.ethersprojectAbstractProvider.mod.TransactionReceipt
import typings.ethersprojectAbstractProvider.mod.TransactionResponse
import typings.ethersprojectBignumber.mod.BigNumber
import typings.ethersprojectNetworks.typesMod.Network
import typings.ethersprojectNetworks.typesMod.Networkish
import typings.ethersprojectProviders.anon.BlockNumber
import typings.ethersprojectProviders.anon.DeferrableTransactionRequ
import typings.ethersprojectProviders.ethersprojectProvidersNumbers.`60`
import typings.ethersprojectProviders.ethersprojectProvidersStrings.pending
import typings.ethersprojectProviders.formatterMod.Formatter
import typings.ethersprojectTransactions.mod.Transaction
import typings.node.NodeJS.Timer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseProviderMod {
  
  @JSImport("@ethersproject/providers/lib/base-provider", "BaseProvider")
  @js.native
  class BaseProvider protected ()
    extends Provider
       with EnsProvider {
    def this(network: js.Promise[Network]) = this()
    /**
      *  ready
      *
      *  A Promise<Network> that resolves only once the provider is ready.
      *
      *  Sub-classes that call the super with a network without a chainId
      *  MUST set this. Standard named networks have a known chainId.
      *
      */
    def this(network: Networkish) = this()
    
    def _addEventListener(eventName: EventType, listener: Listener, once: Boolean): this.type = js.native
    
    var _bootstrapPoll: Timer = js.native
    
    var _emitted: StringDictionary[Double | pending] = js.native
    
    var _events: js.Array[Event] = js.native
    
    var _fastBlockNumber: Double = js.native
    
    var _fastBlockNumberPromise: js.Promise[Double] = js.native
    
    var _fastQueryDate: Double = js.native
    
    def _getAddress(addressOrName: String): js.Promise[String] = js.native
    def _getAddress(addressOrName: js.Promise[String]): js.Promise[String] = js.native
    
    def _getBlock(blockHashOrBlockTag: String): js.Promise[Block | BlockWithTransactions] = js.native
    def _getBlock(blockHashOrBlockTag: String, includeTransactions: Boolean): js.Promise[Block | BlockWithTransactions] = js.native
    def _getBlock(blockHashOrBlockTag: js.Promise[BlockTag | String]): js.Promise[Block | BlockWithTransactions] = js.native
    def _getBlock(blockHashOrBlockTag: js.Promise[BlockTag | String], includeTransactions: Boolean): js.Promise[Block | BlockWithTransactions] = js.native
    def _getBlock(blockHashOrBlockTag: BlockTag): js.Promise[Block | BlockWithTransactions] = js.native
    def _getBlock(blockHashOrBlockTag: BlockTag, includeTransactions: Boolean): js.Promise[Block | BlockWithTransactions] = js.native
    
    def _getBlockTag(blockTag: js.Promise[BlockTag]): js.Promise[BlockTag] = js.native
    def _getBlockTag(blockTag: BlockTag): js.Promise[BlockTag] = js.native
    
    def _getFastBlockNumber(): js.Promise[Double] = js.native
    
    def _getFilter(filter: js.Promise[Filter | FilterByBlockHash]): js.Promise[Filter | FilterByBlockHash] = js.native
    def _getFilter(filter: Filter): js.Promise[Filter | FilterByBlockHash] = js.native
    def _getFilter(filter: FilterByBlockHash): js.Promise[Filter | FilterByBlockHash] = js.native
    
    def _getInternalBlockNumber(maxAge: Double): js.Promise[Double] = js.native
    
    def _getResolver(name: String): js.Promise[String] = js.native
    
    def _getTransactionRequest(transaction: DeferrableTransactionRequ): js.Promise[Transaction] = js.native
    
    var _internalBlockNumber: js.Promise[BlockNumber] = js.native
    
    var _lastBlockNumber: Double = js.native
    
    var _maxInternalBlockNumber: Double = js.native
    
    var _network: Network = js.native
    
    var _networkPromise: js.Promise[Network] = js.native
    
    var _poller: Timer = js.native
    
    var _pollingInterval: Double = js.native
    
    def _ready(): js.Promise[Network] = js.native
    
    def _setFastBlockNumber(blockNumber: Double): Unit = js.native
    
    def _startEvent(event: Event): Unit = js.native
    
    def _stopEvent(event: Event): Unit = js.native
    
    def _wrapTransaction(tx: Transaction): TransactionResponse = js.native
    def _wrapTransaction(tx: Transaction, hash: String): TransactionResponse = js.native
    
    val anyNetwork: Boolean = js.native
    
    def blockNumber: Double = js.native
    
    def call(transaction: DeferrableTransactionRequ): js.Promise[String] = js.native
    def call(transaction: DeferrableTransactionRequ, blockTag: js.Promise[BlockTag]): js.Promise[String] = js.native
    def call(transaction: DeferrableTransactionRequ, blockTag: BlockTag): js.Promise[String] = js.native
    
    def detectNetwork(): js.Promise[Network] = js.native
    
    def estimateGas(transaction: DeferrableTransactionRequ): js.Promise[BigNumber] = js.native
    
    var formatter: Formatter = js.native
    
    def getEtherPrice(): js.Promise[Double] = js.native
    
    def getLogs(filter: js.Promise[Filter | FilterByBlockHash]): js.Promise[js.Array[Log]] = js.native
    def getLogs(filter: FilterByBlockHash): js.Promise[js.Array[Log]] = js.native
    
    def getTransaction(transactionHash: js.Promise[String]): js.Promise[TransactionResponse] = js.native
    
    def getTransactionReceipt(transactionHash: js.Promise[String]): js.Promise[TransactionReceipt] = js.native
    
    /* InferMemberOverrides */
    override def lookupAddress(address: String): js.Promise[String] = js.native
    
    def network: Network = js.native
    
    def perform(method: String, params: js.Any): js.Promise[_] = js.native
    
    def poll(): js.Promise[Unit] = js.native
    
    def polling: Boolean = js.native
    
    def pollingInterval: Double = js.native
    def pollingInterval_=(value: Double): Unit = js.native
    
    def polling_=(value: Boolean): Unit = js.native
    
    def ready: js.Promise[Network] = js.native
    
    def resetEventsBlock(blockNumber: Double): Unit = js.native
    
    /* InferMemberOverrides */
    override def resolveName(name: String): js.Promise[String] = js.native
  }
  /* static members */
  object BaseProvider {
    
    @JSImport("@ethersproject/providers/lib/base-provider", "BaseProvider.getFormatter")
    @js.native
    def getFormatter(): Formatter = js.native
    
    @JSImport("@ethersproject/providers/lib/base-provider", "BaseProvider.getNetwork")
    @js.native
    def getNetwork(network: Networkish): Network = js.native
  }
  
  @JSImport("@ethersproject/providers/lib/base-provider", "Event")
  @js.native
  class Event protected () extends StObject {
    def this(tag: String, listener: Listener, once: Boolean) = this()
    
    def event: EventType = js.native
    
    def filter: Filter = js.native
    
    def hash: String = js.native
    
    def listener(args: js.Any*): Unit = js.native
    
    val once: Boolean = js.native
    
    def pollable(): Boolean = js.native
    
    val tag: String = js.native
    
    def `type`: String = js.native
  }
  
  @JSImport("@ethersproject/providers/lib/base-provider", "Resolver")
  @js.native
  class Resolver protected () extends EnsResolver {
    def this(provider: BaseProvider, address: String, name: String) = this()
    
    def _fetchBytes(selector: String): js.Promise[String] = js.native
    def _fetchBytes(selector: String, parameters: String): js.Promise[String] = js.native
    
    def _getAddress(coinType: Double, hexBytes: String): String = js.native
    
    def getAddress(coinType: Double): js.Promise[String] = js.native
    
    val provider: BaseProvider = js.native
  }
  
  @js.native
  trait EnsProvider extends StObject {
    
    def getResolver(name: String): js.Promise[EnsResolver] = js.native
    
    def lookupAddress(address: String): js.Promise[String] = js.native
    
    def resolveName(name: String): js.Promise[String] = js.native
  }
  object EnsProvider {
    
    @scala.inline
    def apply(
      getResolver: String => js.Promise[EnsResolver],
      lookupAddress: String => js.Promise[String],
      resolveName: String => js.Promise[String]
    ): EnsProvider = {
      val __obj = js.Dynamic.literal(getResolver = js.Any.fromFunction1(getResolver), lookupAddress = js.Any.fromFunction1(lookupAddress), resolveName = js.Any.fromFunction1(resolveName))
      __obj.asInstanceOf[EnsProvider]
    }
    
    @scala.inline
    implicit class EnsProviderMutableBuilder[Self <: EnsProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetResolver(value: String => js.Promise[EnsResolver]): Self = StObject.set(x, "getResolver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLookupAddress(value: String => js.Promise[String]): Self = StObject.set(x, "lookupAddress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResolveName(value: String => js.Promise[String]): Self = StObject.set(x, "resolveName", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait EnsResolver extends StObject {
    
    val address: String = js.native
    
    def getAddress(): js.Promise[String] = js.native
    @JSName("getAddress")
    def getAddress_60(coinType: `60`): js.Promise[String] = js.native
    
    def getContentHash(): js.Promise[String] = js.native
    
    def getText(key: String): js.Promise[String] = js.native
    
    val name: String = js.native
  }
}
