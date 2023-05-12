package typings.ethers

import typings.ethers.anon.BlockNumber
import typings.ethers.anon.Index
import typings.ethers.typesAddressMod.AddressLike
import typings.ethers.typesAddressMod.NameResolver
import typings.ethers.typesCryptoMod.Signature
import typings.ethers.typesProvidersContractsMod.ContractRunner
import typings.ethers.typesProvidersFormattingMod.BlockParams
import typings.ethers.typesProvidersFormattingMod.LogParams
import typings.ethers.typesProvidersFormattingMod.TransactionReceiptParams
import typings.ethers.typesProvidersFormattingMod.TransactionResponseParams
import typings.ethers.typesProvidersNetworkMod.Network
import typings.ethers.typesTransactionMod.AccessList
import typings.ethers.typesTransactionMod.AccessListEntry
import typings.ethers.typesTransactionMod.AccessListish
import typings.ethers.typesTransactionTransactionMod.TransactionLike
import typings.ethers.typesUtilsEventsMod.EventEmitterable
import typings.ethers.typesUtilsMathsMod.BigNumberish
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvidersProviderMod {
  
  @JSImport("ethers/types/providers/provider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ethers/types/providers/provider", "Block")
  @js.native
  open class Block protected ()
    extends StObject
       with BlockParams
       with Iterable[String] {
    /**
      *  Create a new **Block** object.
      *
      *  This should generally not be necessary as the unless implementing a
      *  low-level library.
      */
    def this(block: BlockParams, provider: Provider) = this()
    
    /* CompleteClass */
    var baseFeePerGas: Null | js.BigInt = js.native
    
    /**
      *  The [[link-js-date]] this block was included at.
      */
    def date: Null | js.Date = js.native
    
    /* CompleteClass */
    var difficulty: js.BigInt = js.native
    
    /* CompleteClass */
    var extraData: String = js.native
    
    /* CompleteClass */
    var gasLimit: js.BigInt = js.native
    
    /* CompleteClass */
    var gasUsed: js.BigInt = js.native
    
    def getPrefetchedTransaction(indexOrHash: String): TransactionResponse = js.native
    def getPrefetchedTransaction(indexOrHash: Double): TransactionResponse = js.native
    
    def getTransaction(indexOrHash: String): js.Promise[TransactionResponse] = js.native
    /**
      *  Get the transaction at %%indexe%% within this block.
      */
    def getTransaction(indexOrHash: Double): js.Promise[TransactionResponse] = js.native
    
    /**
      *  The block hash.
      */
    @JSName("hash")
    val hash_Block: Null | String = js.native
    
    /**
      *
      */
    def isLondon(): /* is ethers.anon.BlockbaseFeePerGasbigint */ Boolean = js.native
    
    /**
      *  Has this block been mined.
      *
      *  If true, the block has been typed-gaurded that all mined
      *  properties are non-null.
      */
    def isMined(): /* is ethers.ethers/types/providers/provider.MinedBlock */ Boolean = js.native
    
    /**
      *  The number of transactions in this block.
      */
    def length: Double = js.native
    
    /* CompleteClass */
    var miner: String = js.native
    
    /* CompleteClass */
    var nonce: String = js.native
    
    /* CompleteClass */
    var number: Double = js.native
    
    def orphanedEvent(): OrphanFilter = js.native
    
    /* CompleteClass */
    var parentHash: String = js.native
    
    /**
      *  Returns the complete transactions for blocks which
      *  prefetched them, by passing ``true`` to %%prefetchTxs%%
      *  into [[provider_getBlock]].
      */
    def prefetchedTransactions: js.Array[TransactionResponse] = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      *  The provider connected to the block used to fetch additional details
      *  if necessary.
      */
    val provider: Provider = js.native
    
    /* CompleteClass */
    var timestamp: Double = js.native
    
    /**
      *  Returns a JSON-friendly value.
      */
    def toJSON(): Any = js.native
    
    /* CompleteClass */
    var transactions: js.Array[String | TransactionResponseParams] = js.native
    /**
      *  Returns the list of transaction hashes.
      */
    @JSName("transactions")
    def transactions_MBlock: js.Array[String] = js.native
  }
  
  @JSImport("ethers/types/providers/provider", "FeeData")
  @js.native
  /**
    *  Creates a new FeeData for %%gasPrice%%, %%maxFeePerGas%% and
    *  %%maxPriorityFeePerGas%%.
    */
  open class FeeData () extends StObject {
    def this(gasPrice: js.BigInt) = this()
    def this(gasPrice: js.BigInt, maxFeePerGas: js.BigInt) = this()
    def this(gasPrice: Null, maxFeePerGas: js.BigInt) = this()
    def this(gasPrice: Unit, maxFeePerGas: js.BigInt) = this()
    def this(gasPrice: js.BigInt, maxFeePerGas: js.BigInt, maxPriorityFeePerGas: js.BigInt) = this()
    def this(gasPrice: js.BigInt, maxFeePerGas: Null, maxPriorityFeePerGas: js.BigInt) = this()
    def this(gasPrice: js.BigInt, maxFeePerGas: Unit, maxPriorityFeePerGas: js.BigInt) = this()
    def this(gasPrice: Null, maxFeePerGas: js.BigInt, maxPriorityFeePerGas: js.BigInt) = this()
    def this(gasPrice: Null, maxFeePerGas: Null, maxPriorityFeePerGas: js.BigInt) = this()
    def this(gasPrice: Null, maxFeePerGas: Unit, maxPriorityFeePerGas: js.BigInt) = this()
    def this(gasPrice: Unit, maxFeePerGas: js.BigInt, maxPriorityFeePerGas: js.BigInt) = this()
    def this(gasPrice: Unit, maxFeePerGas: Null, maxPriorityFeePerGas: js.BigInt) = this()
    def this(gasPrice: Unit, maxFeePerGas: Unit, maxPriorityFeePerGas: js.BigInt) = this()
    
    /**
      *  The gas price for legacy networks.
      */
    val gasPrice: Null | js.BigInt = js.native
    
    /**
      *  The maximum fee to pay per gas.
      *
      *  The base fee per gas is defined by the network and based on
      *  congestion, increasing the cost during times of heavy load
      *  and lowering when less busy.
      *
      *  The actual fee per gas will be the base fee for the block
      *  and the priority fee, up to the max fee per gas.
      *
      *  This will be ``null`` on legacy networks (i.e. [pre-EIP-1559](link-eip-1559))
      */
    val maxFeePerGas: Null | js.BigInt = js.native
    
    /**
      *  The additional amout to pay per gas to encourage a validator
      *  to include the transaction.
      *
      *  The purpose of this is to compensate the validator for the
      *  adjusted risk for including a given transaction.
      *
      *  This will be ``null`` on legacy networks (i.e. [pre-EIP-1559](link-eip-1559))
      */
    val maxPriorityFeePerGas: Null | js.BigInt = js.native
    
    /**
      *  Returns a JSON-friendly value.
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("ethers/types/providers/provider", "Log")
  @js.native
  open class Log protected ()
    extends StObject
       with LogParams {
    def this(log: LogParams, provider: Provider) = this()
    
    /* CompleteClass */
    var address: String = js.native
    
    /* CompleteClass */
    var blockHash: String = js.native
    
    /* CompleteClass */
    var blockNumber: Double = js.native
    
    /* CompleteClass */
    var data: String = js.native
    
    def getBlock(): js.Promise[Block] = js.native
    
    def getTransaction(): js.Promise[TransactionResponse] = js.native
    
    def getTransactionReceipt(): js.Promise[TransactionReceipt] = js.native
    
    /* CompleteClass */
    var index: Double = js.native
    
    val provider: Provider = js.native
    
    /* CompleteClass */
    var removed: Boolean = js.native
    
    def removedEvent(): OrphanFilter = js.native
    
    def toJSON(): Any = js.native
    
    /* CompleteClass */
    var topics: js.Array[String] = js.native
    
    /* CompleteClass */
    var transactionHash: String = js.native
    
    /* CompleteClass */
    var transactionIndex: Double = js.native
  }
  
  @JSImport("ethers/types/providers/provider", "TransactionReceipt")
  @js.native
  open class TransactionReceipt protected ()
    extends StObject
       with TransactionReceiptParams
       with Iterable[Log] {
    def this(tx: TransactionReceiptParams, provider: Provider) = this()
    
    /* CompleteClass */
    var blockHash: String = js.native
    
    /* CompleteClass */
    var blockNumber: Double = js.native
    
    def confirmations(): js.Promise[Double] = js.native
    
    /* CompleteClass */
    var contractAddress: Null | String = js.native
    
    /* CompleteClass */
    var cumulativeGasUsed: js.BigInt = js.native
    
    def fee: js.BigInt = js.native
    
    /* CompleteClass */
    var from: String = js.native
    
    @JSName("gasPrice")
    val gasPrice_TransactionReceipt: js.BigInt = js.native
    
    /* CompleteClass */
    var gasUsed: js.BigInt = js.native
    
    def getBlock(): js.Promise[Block] = js.native
    
    def getResult(): js.Promise[String] = js.native
    
    def getTransaction(): js.Promise[TransactionResponse] = js.native
    
    /* CompleteClass */
    var hash: String = js.native
    
    /* CompleteClass */
    var index: Double = js.native
    
    def length: Double = js.native
    
    /* CompleteClass */
    var logs: js.Array[LogParams] = js.native
    
    /* CompleteClass */
    var logsBloom: String = js.native
    
    @JSName("logs")
    def logs_MTransactionReceipt: js.Array[Log] = js.native
    
    /* private */ var `private`: Any = js.native
    
    val provider: Provider = js.native
    
    def removedEvent(): OrphanFilter = js.native
    
    def reorderedEvent(): OrphanFilter = js.native
    def reorderedEvent(other: TransactionResponse): OrphanFilter = js.native
    
    /* CompleteClass */
    var root: Null | String = js.native
    
    /* CompleteClass */
    var status: Null | Double = js.native
    
    /* CompleteClass */
    var to: Null | String = js.native
    
    def toJSON(): Any = js.native
    
    /* CompleteClass */
    var `type`: Double = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ethers.typesProvidersFormattingMod.TransactionResponseParams because var conflicts: accessList, chainId, data, from, gasLimit, gasPrice, hash, maxFeePerGas, maxPriorityFeePerGas, nonce, signature, to, `type`, value. Inlined blockNumber, blockHash, index */ @JSImport("ethers/types/providers/provider", "TransactionResponse")
  @js.native
  open class TransactionResponse protected ()
    extends StObject
       with TransactionLike[String] {
    /**
      *  Create a new TransactionResponse with %%tx%% parameters
      *  connected to %%provider%%.
      */
    def this(tx: TransactionResponseParams, provider: Provider) = this()
    
    /**
      *  The [[link-eip-2930]] access list for transaction types that
      *  support it, otherwise ``null``.
      */
    @JSName("accessList")
    val accessList_TransactionResponse: Null | AccessList = js.native
    
    /**
      *  The blockHash of the block that this transaction was included in.
      *
      *  This is ``null`` for pending transactions.
      */
    val blockHash: Null | String = js.native
    
    /**
      *  The block number of the block that this transaction was included in.
      *
      *  This is ``null`` for pending transactions.
      */
    val blockNumber: Double | Null = js.native
    
    /**
      *  The chain ID.
      */
    @JSName("chainId")
    val chainId_TransactionResponse: js.BigInt = js.native
    
    /**
      *  The data.
      */
    @JSName("data")
    val data_TransactionResponse: String = js.native
    
    /**
      *  The sender of this transaction. It is implicitly computed
      *  from the transaction pre-image hash (as the digest) and the
      *  [[signature]] using ecrecover.
      */
    @JSName("from")
    val from_TransactionResponse: String = js.native
    
    /**
      *  The maximum units of gas this transaction can consume. If execution
      *  exceeds this, the entries transaction is reverted and the sender
      *  is charged for the full amount, despite not state changes being made.
      */
    @JSName("gasLimit")
    val gasLimit_TransactionResponse: js.BigInt = js.native
    
    /**
      *  The gas price can have various values, depending on the network.
      *
      *  In modern networks, for transactions that are included this is
      *  the //effective gas price// (the fee per gas that was actually
      *  charged), while for transactions that have not been included yet
      *  is the [[maxFeePerGas]].
      *
      *  For legacy transactions, or transactions on legacy networks, this
      *  is the fee that will be charged per unit of gas the transaction
      *  consumes.
      */
    @JSName("gasPrice")
    val gasPrice_TransactionResponse: js.BigInt = js.native
    
    /**
      *  Resolves to the Block that this transaction was included in.
      *
      *  This will return null if the transaction has not been included yet.
      */
    def getBlock(): js.Promise[Null | Block] = js.native
    
    /**
      *  Resolves to this transaction being re-requested from the
      *  provider. This can be used if you have an unmined transaction
      *  and wish to get an up-to-date populated instance.
      */
    def getTransaction(): js.Promise[Null | TransactionResponse] = js.native
    
    /**
      *  The transaction hash.
      */
    @JSName("hash")
    val hash_TransactionResponse: String = js.native
    
    /**
      *  The index within the block that this transaction resides at.
      */
    val index: Double = js.native
    
    /**
      *  Returns true if the transaction is a Berlin (i.e. ``type == 1``)
      *  transaction. See [[link-eip-2070]].
      *
      *  This provides a Type Guard that this transaction will have
      *  the ``null``-ness for hardfork-specific properties set correctly.
      */
    def isBerlin(): /* is ethers.anon.TransactionResponseaccessGasLimit */ Boolean = js.native
    
    /**
      *  Returns true if the transaction is a legacy (i.e. ``type == 0``)
      *  transaction.
      *
      *  This provides a Type Guard that this transaction will have
      *  the ``null``-ness for hardfork-specific properties set correctly.
      */
    def isLegacy(): /* is ethers.anon.TransactionResponseaccessChainId */ Boolean = js.native
    
    /**
      *  Returns true if the transaction is a London (i.e. ``type == 2``)
      *  transaction. See [[link-eip-1559]].
      *
      *  This provides a Type Guard that this transaction will have
      *  the ``null``-ness for hardfork-specific properties set correctly.
      */
    def isLondon(): /* is ethers.anon.TransactionResponseaccessGetTransaction */ Boolean = js.native
    
    /**
      *  Returns ``true`` if this transaction has been included.
      *
      *  This is effective only as of the time the TransactionResponse
      *  was instantiated. To get up-to-date information, use
      *  [[getTransaction]].
      *
      *  This provides a Type Guard that this transaction will have
      *  non-null property values for properties that are null for
      *  unmined transactions.
      */
    def isMined(): /* is ethers.ethers/types/providers/provider.MinedTransactionResponse */ Boolean = js.native
    
    /**
      *  The maximum fee (per unit of gas) to allow this transaction
      *  to charge the sender.
      */
    @JSName("maxFeePerGas")
    val maxFeePerGas_TransactionResponse: Null | js.BigInt = js.native
    
    /**
      *  The maximum priority fee (per unit of gas) to allow a
      *  validator to charge the sender. This is inclusive of the
      *  [[maxFeeFeePerGas]].
      */
    @JSName("maxPriorityFeePerGas")
    val maxPriorityFeePerGas_TransactionResponse: Null | js.BigInt = js.native
    
    /**
      *  The nonce, which is used to prevent replay attacks and offer
      *  a method to ensure transactions from a given sender are explicitly
      *  ordered.
      *
      *  When sending a transaction, this must be equal to the number of
      *  transactions ever sent by [[from]].
      */
    @JSName("nonce")
    val nonce_TransactionResponse: Double = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      *  The provider this is connected to, which will influence how its
      *  methods will resolve its async inspection methods.
      */
    val provider: Provider = js.native
    
    /**
      *  Returns a filter which can be used to listen for orphan events
      *  that evict this transaction.
      */
    def removedEvent(): OrphanFilter = js.native
    
    /**
      *  Returns a filter which can be used to listen for orphan events
      *  that re-order this event against %%other%%.
      */
    def reorderedEvent(): OrphanFilter = js.native
    def reorderedEvent(other: TransactionResponse): OrphanFilter = js.native
    
    /**
      *  Returns a new TransactionResponse instance which has the ability to
      *  detect (and throw an error) if the transaction is replaced, which
      *  will begin scanning at %%startBlock%%.
      *
      *  This should generally not be used by developers and is intended
      *  primarily for internal use. Setting an incorrect %%startBlock%% can
      *  have devastating performance consequences if used incorrectly.
      */
    def replaceableTransaction(startBlock: Double): TransactionResponse = js.native
    
    /**
      *  The signature.
      */
    @JSName("signature")
    val signature_TransactionResponse: Signature = js.native
    
    /**
      *  Returns a JSON representation of this transaction.
      */
    def toJSON(): Any = js.native
    
    /**
      *  The receiver of this transaction.
      *
      *  If ``null``, then the transaction is an initcode transaction.
      *  This means the result of executing the [[data]] will be deployed
      *  as a new contract on chain (assuming it does not revert) and the
      *  address may be computed using [[getCreateAddress]].
      */
    @JSName("to")
    val to_TransactionResponse: Null | String = js.native
    
    /**
      *  The [[link-eip-2718]] transaction envelope type. This is
      *  ``0`` for legacy transactions types.
      */
    @JSName("type")
    val type_TransactionResponse: Double = js.native
    
    /**
      *  The value, in wei. Use [[formatEther]] to format this value
      *  as ether.
      */
    @JSName("value")
    val value_TransactionResponse: js.BigInt = js.native
    
    def wait(_confirms: Double): js.Promise[Null | TransactionReceipt] = js.native
    def wait(_confirms: Double, _timeout: Double): js.Promise[Null | TransactionReceipt] = js.native
    def wait(_confirms: Unit, _timeout: Double): js.Promise[Null | TransactionReceipt] = js.native
  }
  
  inline def copyRequest(req: TransactionRequest): PreparedTransactionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("copyRequest")(req.asInstanceOf[js.Any]).asInstanceOf[PreparedTransactionRequest]
  
  type BlockTag = BigNumberish | String
  
  trait EventFilter
    extends StObject
       with _ProviderEvent {
    
    var address: js.UndefOr[AddressLike | js.Array[AddressLike]] = js.undefined
    
    var topics: js.UndefOr[TopicFilter] = js.undefined
  }
  object EventFilter {
    
    inline def apply(): EventFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventFilter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventFilter] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: AddressLike | js.Array[AddressLike]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setAddressVarargs(value: AddressLike*): Self = StObject.set(x, "address", js.Array(value*))
      
      inline def setTopics(value: TopicFilter): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
      
      inline def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
      
      inline def setTopicsVarargs(value: (Null | String | js.Array[String])*): Self = StObject.set(x, "topics", js.Array(value*))
    }
  }
  
  trait Filter
    extends StObject
       with EventFilter {
    
    var fromBlock: js.UndefOr[BlockTag] = js.undefined
    
    var toBlock: js.UndefOr[BlockTag] = js.undefined
  }
  object Filter {
    
    inline def apply(): Filter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Filter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
      
      inline def setFromBlock(value: BlockTag): Self = StObject.set(x, "fromBlock", value.asInstanceOf[js.Any])
      
      inline def setFromBlockUndefined: Self = StObject.set(x, "fromBlock", js.undefined)
      
      inline def setToBlock(value: BlockTag): Self = StObject.set(x, "toBlock", value.asInstanceOf[js.Any])
      
      inline def setToBlockUndefined: Self = StObject.set(x, "toBlock", js.undefined)
    }
  }
  
  trait FilterByBlockHash
    extends StObject
       with EventFilter {
    
    var blockHash: js.UndefOr[String] = js.undefined
  }
  object FilterByBlockHash {
    
    inline def apply(): FilterByBlockHash = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterByBlockHash]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilterByBlockHash] (val x: Self) extends AnyVal {
      
      inline def setBlockHash(value: String): Self = StObject.set(x, "blockHash", value.asInstanceOf[js.Any])
      
      inline def setBlockHashUndefined: Self = StObject.set(x, "blockHash", js.undefined)
    }
  }
  
  @js.native
  trait MinedBlock extends Block {
    
    @JSName("date")
    val date_FMinedBlock: js.Date = js.native
    
    @JSName("hash")
    val hash_MinedBlock: String = js.native
  }
  
  @js.native
  trait MinedTransactionResponse extends TransactionResponse {
    
    @JSName("blockHash")
    var blockHash_MinedTransactionResponse: String = js.native
    
    @JSName("blockNumber")
    var blockNumber_MinedTransactionResponse: Double = js.native
    
    var date: js.Date = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ethers.anon.Number
    - typings.ethers.anon.Orphan
    - typings.ethers.anon.Other
    - typings.ethers.anon.Log
  */
  trait OrphanFilter
    extends StObject
       with _ProviderEvent
  object OrphanFilter {
    
    inline def Log(log: Index): typings.ethers.anon.Log = {
      val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any], orphan = "drop-log")
      __obj.asInstanceOf[typings.ethers.anon.Log]
    }
    
    inline def Number(hash: String, number: Double): typings.ethers.anon.Number = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], orphan = "drop-block")
      __obj.asInstanceOf[typings.ethers.anon.Number]
    }
    
    inline def Orphan(tx: BlockNumber): typings.ethers.anon.Orphan = {
      val __obj = js.Dynamic.literal(orphan = "drop-transaction", tx = tx.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ethers.anon.Orphan]
    }
    
    inline def Other(tx: BlockNumber): typings.ethers.anon.Other = {
      val __obj = js.Dynamic.literal(orphan = "reorder-transaction", tx = tx.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ethers.anon.Other]
    }
  }
  
  trait PreparedTransactionRequest extends StObject {
    
    var accessList: js.UndefOr[AccessList] = js.undefined
    
    var blockTag: js.UndefOr[BlockTag] = js.undefined
    
    var chainId: js.UndefOr[js.BigInt] = js.undefined
    
    var customData: js.UndefOr[Any] = js.undefined
    
    var data: js.UndefOr[String] = js.undefined
    
    var enableCcipRead: js.UndefOr[Boolean] = js.undefined
    
    var from: js.UndefOr[AddressLike] = js.undefined
    
    var gasLimit: js.UndefOr[js.BigInt] = js.undefined
    
    var gasPrice: js.UndefOr[js.BigInt] = js.undefined
    
    var maxFeePerGas: js.UndefOr[js.BigInt] = js.undefined
    
    var maxPriorityFeePerGas: js.UndefOr[js.BigInt] = js.undefined
    
    var nonce: js.UndefOr[Double] = js.undefined
    
    var to: js.UndefOr[AddressLike] = js.undefined
    
    var `type`: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[js.BigInt] = js.undefined
  }
  object PreparedTransactionRequest {
    
    inline def apply(): PreparedTransactionRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreparedTransactionRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PreparedTransactionRequest] (val x: Self) extends AnyVal {
      
      inline def setAccessList(value: AccessList): Self = StObject.set(x, "accessList", value.asInstanceOf[js.Any])
      
      inline def setAccessListUndefined: Self = StObject.set(x, "accessList", js.undefined)
      
      inline def setAccessListVarargs(value: AccessListEntry*): Self = StObject.set(x, "accessList", js.Array(value*))
      
      inline def setBlockTag(value: BlockTag): Self = StObject.set(x, "blockTag", value.asInstanceOf[js.Any])
      
      inline def setBlockTagUndefined: Self = StObject.set(x, "blockTag", js.undefined)
      
      inline def setChainId(value: js.BigInt): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      inline def setChainIdUndefined: Self = StObject.set(x, "chainId", js.undefined)
      
      inline def setCustomData(value: Any): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
      
      inline def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setEnableCcipRead(value: Boolean): Self = StObject.set(x, "enableCcipRead", value.asInstanceOf[js.Any])
      
      inline def setEnableCcipReadUndefined: Self = StObject.set(x, "enableCcipRead", js.undefined)
      
      inline def setFrom(value: AddressLike): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setGasLimit(value: js.BigInt): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
      
      inline def setGasLimitUndefined: Self = StObject.set(x, "gasLimit", js.undefined)
      
      inline def setGasPrice(value: js.BigInt): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      inline def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
      
      inline def setMaxFeePerGas(value: js.BigInt): Self = StObject.set(x, "maxFeePerGas", value.asInstanceOf[js.Any])
      
      inline def setMaxFeePerGasUndefined: Self = StObject.set(x, "maxFeePerGas", js.undefined)
      
      inline def setMaxPriorityFeePerGas(value: js.BigInt): Self = StObject.set(x, "maxPriorityFeePerGas", value.asInstanceOf[js.Any])
      
      inline def setMaxPriorityFeePerGasUndefined: Self = StObject.set(x, "maxPriorityFeePerGas", js.undefined)
      
      inline def setNonce(value: Double): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setTo(value: AddressLike): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: js.BigInt): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Provider
    extends StObject
       with ContractRunner
       with EventEmitterable[ProviderEvent]
       with NameResolver {
    
    /**
      *  Broadcasts the %%signedTx%% to the network, adding it to the
      *  memory pool of any node for which the transaction meets the
      *  rebroadcast requirements.
      */
    def broadcastTransaction(signedTx: String): js.Promise[TransactionResponse] = js.native
    
    /**
      *  Simulate the execution of %%tx%%. If the call reverts, it will
      *  throw a [[CallExceptionError]] which includes the revert data.
      */
    @JSName("call")
    def call_MProvider(tx: TransactionRequest): js.Promise[String] = js.native
    
    /**
      *  Shutdown any resources this provider is using. No additional
      *  calls should be made to this provider after calling this.
      */
    def destroy(): Unit = js.native
    
    /**
      *  Estimates the amount of gas required to executre %%tx%%.
      */
    @JSName("estimateGas")
    def estimateGas_MProvider(tx: TransactionRequest): js.Promise[js.BigInt] = js.native
    
    /**
      *  Get the account balance (in wei) of %%address%%. If %%blockTag%%
      *  is specified and the node supports archive access for that
      *  %%blockTag%%, the balance is as of that [[BlockTag]].
      *
      *  @note On nodes without archive access enabled, the %%blockTag%% may be
      *        **silently ignored** by the node, which may cause issues if relied on.
      */
    def getBalance(address: AddressLike): js.Promise[js.BigInt] = js.native
    def getBalance(address: AddressLike, blockTag: BlockTag): js.Promise[js.BigInt] = js.native
    
    def getBlock(blockHashOrBlockTag: String): js.Promise[Null | Block] = js.native
    def getBlock(blockHashOrBlockTag: String, prefetchTxs: Boolean): js.Promise[Null | Block] = js.native
    /**
      *  Resolves to the block for %%blockHashOrBlockTag%%.
      *
      *  If %%prefetchTxs%%, and the backend supports including transactions
      *  with block requests, all transactions will be included and the
      *  [[Block]] object will not need to make remote calls for getting
      *  transactions.
      */
    def getBlock(blockHashOrBlockTag: BlockTag): js.Promise[Null | Block] = js.native
    def getBlock(blockHashOrBlockTag: BlockTag, prefetchTxs: Boolean): js.Promise[Null | Block] = js.native
    
    /**
      *  Get the current block number.
      */
    def getBlockNumber(): js.Promise[Double] = js.native
    
    /**
      *  Get the bytecode for %%address%%.
      *
      *  @note On nodes without archive access enabled, the %%blockTag%% may be
      *        **silently ignored** by the node, which may cause issues if relied on.
      */
    def getCode(address: AddressLike): js.Promise[String] = js.native
    def getCode(address: AddressLike, blockTag: BlockTag): js.Promise[String] = js.native
    
    /**
      *  Get the best guess at the recommended [[FeeData]].
      */
    def getFeeData(): js.Promise[FeeData] = js.native
    
    /**
      *  Resolves to the list of Logs that match %%filter%%
      */
    def getLogs(filter: Filter): js.Promise[js.Array[Log]] = js.native
    def getLogs(filter: FilterByBlockHash): js.Promise[js.Array[Log]] = js.native
    
    /**
      *  Get the connected [[Network]].
      */
    def getNetwork(): js.Promise[Network] = js.native
    
    /**
      *  Get the storage slot value for %%address%% at slot %%position%%.
      *
      *  @note On nodes without archive access enabled, the %%blockTag%% may be
      *        **silently ignored** by the node, which may cause issues if relied on.
      */
    def getStorage(address: AddressLike, position: BigNumberish): js.Promise[String] = js.native
    def getStorage(address: AddressLike, position: BigNumberish, blockTag: BlockTag): js.Promise[String] = js.native
    
    /**
      *  Resolves to the transaction for %%hash%%.
      *
      *  If the transaction is unknown or on pruning nodes which
      *  discard old transactions this resolves to ``null``.
      */
    def getTransaction(hash: String): js.Promise[Null | TransactionResponse] = js.native
    
    /**
      *  Get the number of transactions ever sent for %%address%%, which
      *  is used as the ``nonce`` when sending a transaction. If
      *  %%blockTag%% is specified and the node supports archive access
      *  for that %%blockTag%%, the transaction count is as of that
      *  [[BlockTag]].
      *
      *  @note On nodes without archive access enabled, the %%blockTag%% may be
      *        **silently ignored** by the node, which may cause issues if relied on.
      */
    def getTransactionCount(address: AddressLike): js.Promise[Double] = js.native
    def getTransactionCount(address: AddressLike, blockTag: BlockTag): js.Promise[Double] = js.native
    
    /**
      *  Resolves to the transaction receipt for %%hash%%, if mined.
      *
      *  If the transaction has not been mined, is unknown or on
      *  pruning nodes which discard old transactions this resolves to
      *  ``null``.
      */
    def getTransactionReceipt(hash: String): js.Promise[Null | TransactionReceipt] = js.native
    
    /**
      *  Resolves to the result returned by the executions of %%hash%%.
      *
      *  This is only supported on nodes with archive access and with
      *  the necessary debug APIs enabled.
      */
    def getTransactionResult(hash: String): js.Promise[Null | String] = js.native
    
    /**
      *  Resolves to the ENS name associated for the %%address%% or
      *  ``null`` if the //primary name// is not configured.
      *
      *  Users must perform additional steps to configure a //primary name//,
      *  which is not currently common.
      */
    def lookupAddress(address: String): js.Promise[Null | String] = js.native
    
    /**
      *  The provider iteself.
      *
      *  This is part of the necessary API for executing a contract, as
      *  it provides a common property on any [[ContractRunner]] that
      *  can be used to access the read-only portion of the runner.
      */
    @JSName("provider")
    var provider_Provider: this.type = js.native
    
    /**
      *  Resolves to the address configured for the %%ensName%% or
      *  ``null`` if unconfigured.
      */
    @JSName("resolveName")
    def resolveName_MProvider(ensName: String): js.Promise[Null | String] = js.native
    
    /**
      *  Resolves to the block at %%blockTag%% once it has been mined.
      *
      *  This can be useful for waiting some number of blocks by using
      *  the ``currentBlockNumber + N``.
      */
    def waitForBlock(): js.Promise[Block] = js.native
    def waitForBlock(blockTag: BlockTag): js.Promise[Block] = js.native
    
    /**
      *  Waits until the transaction %%hash%% is mined and has %%confirms%%
      *  confirmations.
      */
    def waitForTransaction(hash: String): js.Promise[Null | TransactionReceipt] = js.native
    def waitForTransaction(hash: String, confirms: Double): js.Promise[Null | TransactionReceipt] = js.native
    def waitForTransaction(hash: String, confirms: Double, timeout: Double): js.Promise[Null | TransactionReceipt] = js.native
    def waitForTransaction(hash: String, confirms: Unit, timeout: Double): js.Promise[Null | TransactionReceipt] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - js.Array[java.lang.String | js.Array[java.lang.String]]
    - typings.ethers.typesProvidersProviderMod.EventFilter
    - typings.ethers.typesProvidersProviderMod.OrphanFilter
  */
  type ProviderEvent = _ProviderEvent | (js.Array[String | js.Array[String]]) | String
  
  type TopicFilter = js.Array[Null | String | js.Array[String]]
  
  trait TransactionRequest extends StObject {
    
    var accessList: js.UndefOr[Null | AccessListish] = js.undefined
    
    var blockTag: js.UndefOr[BlockTag] = js.undefined
    
    var chainId: js.UndefOr[Null | BigNumberish] = js.undefined
    
    var customData: js.UndefOr[Any] = js.undefined
    
    var data: js.UndefOr[Null | String] = js.undefined
    
    var enableCcipRead: js.UndefOr[Boolean] = js.undefined
    
    var from: js.UndefOr[Null | AddressLike] = js.undefined
    
    var gasLimit: js.UndefOr[Null | BigNumberish] = js.undefined
    
    var gasPrice: js.UndefOr[Null | BigNumberish] = js.undefined
    
    var maxFeePerGas: js.UndefOr[Null | BigNumberish] = js.undefined
    
    var maxPriorityFeePerGas: js.UndefOr[Null | BigNumberish] = js.undefined
    
    var nonce: js.UndefOr[Null | Double] = js.undefined
    
    var to: js.UndefOr[Null | AddressLike] = js.undefined
    
    var `type`: js.UndefOr[Null | Double] = js.undefined
    
    var value: js.UndefOr[Null | BigNumberish] = js.undefined
  }
  object TransactionRequest {
    
    inline def apply(): TransactionRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransactionRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransactionRequest] (val x: Self) extends AnyVal {
      
      inline def setAccessList(value: AccessListish): Self = StObject.set(x, "accessList", value.asInstanceOf[js.Any])
      
      inline def setAccessListNull: Self = StObject.set(x, "accessList", null)
      
      inline def setAccessListUndefined: Self = StObject.set(x, "accessList", js.undefined)
      
      inline def setAccessListVarargs(value: (AccessListEntry | (js.Tuple2[String, js.Array[String]]))*): Self = StObject.set(x, "accessList", js.Array(value*))
      
      inline def setBlockTag(value: BlockTag): Self = StObject.set(x, "blockTag", value.asInstanceOf[js.Any])
      
      inline def setBlockTagUndefined: Self = StObject.set(x, "blockTag", js.undefined)
      
      inline def setChainId(value: BigNumberish): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      inline def setChainIdNull: Self = StObject.set(x, "chainId", null)
      
      inline def setChainIdUndefined: Self = StObject.set(x, "chainId", js.undefined)
      
      inline def setCustomData(value: Any): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
      
      inline def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setEnableCcipRead(value: Boolean): Self = StObject.set(x, "enableCcipRead", value.asInstanceOf[js.Any])
      
      inline def setEnableCcipReadUndefined: Self = StObject.set(x, "enableCcipRead", js.undefined)
      
      inline def setFrom(value: AddressLike): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromNull: Self = StObject.set(x, "from", null)
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setGasLimit(value: BigNumberish): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
      
      inline def setGasLimitNull: Self = StObject.set(x, "gasLimit", null)
      
      inline def setGasLimitUndefined: Self = StObject.set(x, "gasLimit", js.undefined)
      
      inline def setGasPrice(value: BigNumberish): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      inline def setGasPriceNull: Self = StObject.set(x, "gasPrice", null)
      
      inline def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
      
      inline def setMaxFeePerGas(value: BigNumberish): Self = StObject.set(x, "maxFeePerGas", value.asInstanceOf[js.Any])
      
      inline def setMaxFeePerGasNull: Self = StObject.set(x, "maxFeePerGas", null)
      
      inline def setMaxFeePerGasUndefined: Self = StObject.set(x, "maxFeePerGas", js.undefined)
      
      inline def setMaxPriorityFeePerGas(value: BigNumberish): Self = StObject.set(x, "maxPriorityFeePerGas", value.asInstanceOf[js.Any])
      
      inline def setMaxPriorityFeePerGasNull: Self = StObject.set(x, "maxPriorityFeePerGas", null)
      
      inline def setMaxPriorityFeePerGasUndefined: Self = StObject.set(x, "maxPriorityFeePerGas", js.undefined)
      
      inline def setNonce(value: Double): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceNull: Self = StObject.set(x, "nonce", null)
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setTo(value: AddressLike): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToNull: Self = StObject.set(x, "to", null)
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: BigNumberish): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait _ProviderEvent extends StObject
  object _ProviderEvent {
    
    inline def EventFilter(): typings.ethers.typesProvidersProviderMod.EventFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ethers.typesProvidersProviderMod.EventFilter]
    }
    
    inline def Log(log: Index): typings.ethers.anon.Log = {
      val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any], orphan = "drop-log")
      __obj.asInstanceOf[typings.ethers.anon.Log]
    }
    
    inline def Number(hash: String, number: Double): typings.ethers.anon.Number = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], orphan = "drop-block")
      __obj.asInstanceOf[typings.ethers.anon.Number]
    }
    
    inline def Orphan(tx: BlockNumber): typings.ethers.anon.Orphan = {
      val __obj = js.Dynamic.literal(orphan = "drop-transaction", tx = tx.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ethers.anon.Orphan]
    }
    
    inline def Other(tx: BlockNumber): typings.ethers.anon.Other = {
      val __obj = js.Dynamic.literal(orphan = "reorder-transaction", tx = tx.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ethers.anon.Other]
    }
  }
}
