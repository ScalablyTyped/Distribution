package typings.ethersprojectProviders.baseProviderMod

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
import typings.ethersprojectProviders.ethersprojectProvidersStrings.pending
import typings.ethersprojectProviders.formatterMod.Formatter
import typings.ethersprojectTransactions.mod.Transaction
import typings.node.NodeJS.Timer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSImport("@ethersproject/providers/lib/base-provider", "BaseProvider")
@js.native
object BaseProvider extends js.Object {
  
  def getFormatter(): Formatter = js.native
  
  def getNetwork(network: Networkish): Network = js.native
}
