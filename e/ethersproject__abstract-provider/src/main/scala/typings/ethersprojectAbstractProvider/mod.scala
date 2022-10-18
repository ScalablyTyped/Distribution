package typings.ethersprojectAbstractProvider

import typings.ethersprojectAbstractProvider.anon.DeferrableTransactionRequ
import typings.ethersprojectBignumber.libBignumberMod.BigNumberish
import typings.ethersprojectBignumber.mod.BigNumber
import typings.ethersprojectBytes.mod.BytesLike
import typings.ethersprojectNetworks.libTypesMod.Network
import typings.ethersprojectProperties.mod.Description
import typings.ethersprojectTransactions.anon.Address
import typings.ethersprojectTransactions.mod.AccessListish
import typings.ethersprojectTransactions.mod.Transaction
import typings.ethersprojectWeb.ethersprojectWebStrings.block
import typings.ethersprojectWeb.mod.OnceBlockable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/abstract-provider", "BlockForkEvent")
  @js.native
  open class BlockForkEvent protected () extends ForkEvent {
    def this(blockHash: String) = this()
    def this(blockHash: String, expiry: Double) = this()
    
    val _isBlockForkEvent: js.UndefOr[Boolean] = js.native
    
    val blockHash: String = js.native
  }
  
  /* note: abstract class */ @JSImport("@ethersproject/abstract-provider", "ForkEvent")
  @js.native
  open class ForkEvent protected ()
    extends Description[Any]
       with _EventType {
    def this(info: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof any ]: any[K]} */ js.Any) = this()
    
    val _isForkEvent: js.UndefOr[Boolean] = js.native
    
    val expiry: Double = js.native
  }
  /* static members */
  object ForkEvent {
    
    @JSImport("@ethersproject/abstract-provider", "ForkEvent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isForkEvent(value: Any): /* is @ethersproject/abstract-provider.@ethersproject/abstract-provider.ForkEvent */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isForkEvent")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/abstract-provider.@ethersproject/abstract-provider.ForkEvent */ Boolean]
  }
  
  /* note: abstract class */ @JSImport("@ethersproject/abstract-provider", "Provider")
  @js.native
  open class Provider ()
    extends StObject
       with OnceBlockable {
    
    val _isProvider: Boolean = js.native
    
    def addListener(eventName: EventType, listener: Listener): Provider = js.native
    
    def call(transaction: DeferrableTransactionRequ): js.Promise[String] = js.native
    def call(transaction: DeferrableTransactionRequ, blockTag: js.Promise[BlockTag]): js.Promise[String] = js.native
    def call(transaction: DeferrableTransactionRequ, blockTag: BlockTag): js.Promise[String] = js.native
    
    def emit(eventName: EventType, args: Any*): Boolean = js.native
    
    def estimateGas(transaction: DeferrableTransactionRequ): js.Promise[BigNumber] = js.native
    
    def getBalance(addressOrName: String): js.Promise[BigNumber] = js.native
    def getBalance(addressOrName: String, blockTag: js.Promise[BlockTag]): js.Promise[BigNumber] = js.native
    def getBalance(addressOrName: String, blockTag: BlockTag): js.Promise[BigNumber] = js.native
    def getBalance(addressOrName: js.Promise[String]): js.Promise[BigNumber] = js.native
    def getBalance(addressOrName: js.Promise[String], blockTag: js.Promise[BlockTag]): js.Promise[BigNumber] = js.native
    def getBalance(addressOrName: js.Promise[String], blockTag: BlockTag): js.Promise[BigNumber] = js.native
    
    def getBlock(blockHashOrBlockTag: String): js.Promise[Block] = js.native
    def getBlock(blockHashOrBlockTag: js.Promise[BlockTag | String]): js.Promise[Block] = js.native
    def getBlock(blockHashOrBlockTag: BlockTag): js.Promise[Block] = js.native
    
    def getBlockNumber(): js.Promise[Double] = js.native
    
    def getBlockWithTransactions(blockHashOrBlockTag: String): js.Promise[BlockWithTransactions] = js.native
    def getBlockWithTransactions(blockHashOrBlockTag: js.Promise[BlockTag | String]): js.Promise[BlockWithTransactions] = js.native
    def getBlockWithTransactions(blockHashOrBlockTag: BlockTag): js.Promise[BlockWithTransactions] = js.native
    
    def getCode(addressOrName: String): js.Promise[String] = js.native
    def getCode(addressOrName: String, blockTag: js.Promise[BlockTag]): js.Promise[String] = js.native
    def getCode(addressOrName: String, blockTag: BlockTag): js.Promise[String] = js.native
    def getCode(addressOrName: js.Promise[String]): js.Promise[String] = js.native
    def getCode(addressOrName: js.Promise[String], blockTag: js.Promise[BlockTag]): js.Promise[String] = js.native
    def getCode(addressOrName: js.Promise[String], blockTag: BlockTag): js.Promise[String] = js.native
    
    def getFeeData(): js.Promise[FeeData] = js.native
    
    def getGasPrice(): js.Promise[BigNumber] = js.native
    
    def getLogs(filter: Filter): js.Promise[js.Array[Log]] = js.native
    
    def getNetwork(): js.Promise[Network] = js.native
    
    def getStorageAt(addressOrName: String, position: js.Promise[BigNumberish]): js.Promise[String] = js.native
    def getStorageAt(addressOrName: String, position: js.Promise[BigNumberish], blockTag: js.Promise[BlockTag]): js.Promise[String] = js.native
    def getStorageAt(addressOrName: String, position: js.Promise[BigNumberish], blockTag: BlockTag): js.Promise[String] = js.native
    def getStorageAt(addressOrName: String, position: BigNumberish): js.Promise[String] = js.native
    def getStorageAt(addressOrName: String, position: BigNumberish, blockTag: js.Promise[BlockTag]): js.Promise[String] = js.native
    def getStorageAt(addressOrName: String, position: BigNumberish, blockTag: BlockTag): js.Promise[String] = js.native
    def getStorageAt(addressOrName: js.Promise[String], position: js.Promise[BigNumberish]): js.Promise[String] = js.native
    def getStorageAt(
      addressOrName: js.Promise[String],
      position: js.Promise[BigNumberish],
      blockTag: js.Promise[BlockTag]
    ): js.Promise[String] = js.native
    def getStorageAt(addressOrName: js.Promise[String], position: js.Promise[BigNumberish], blockTag: BlockTag): js.Promise[String] = js.native
    def getStorageAt(addressOrName: js.Promise[String], position: BigNumberish): js.Promise[String] = js.native
    def getStorageAt(addressOrName: js.Promise[String], position: BigNumberish, blockTag: js.Promise[BlockTag]): js.Promise[String] = js.native
    def getStorageAt(addressOrName: js.Promise[String], position: BigNumberish, blockTag: BlockTag): js.Promise[String] = js.native
    
    def getTransaction(transactionHash: String): js.Promise[TransactionResponse] = js.native
    
    def getTransactionCount(addressOrName: String): js.Promise[Double] = js.native
    def getTransactionCount(addressOrName: String, blockTag: js.Promise[BlockTag]): js.Promise[Double] = js.native
    def getTransactionCount(addressOrName: String, blockTag: BlockTag): js.Promise[Double] = js.native
    def getTransactionCount(addressOrName: js.Promise[String]): js.Promise[Double] = js.native
    def getTransactionCount(addressOrName: js.Promise[String], blockTag: js.Promise[BlockTag]): js.Promise[Double] = js.native
    def getTransactionCount(addressOrName: js.Promise[String], blockTag: BlockTag): js.Promise[Double] = js.native
    
    def getTransactionReceipt(transactionHash: String): js.Promise[TransactionReceipt] = js.native
    
    def listenerCount(): Double = js.native
    def listenerCount(eventName: EventType): Double = js.native
    
    def listeners(): js.Array[Listener] = js.native
    def listeners(eventName: EventType): js.Array[Listener] = js.native
    
    def lookupAddress(address: String): js.Promise[Null | String] = js.native
    def lookupAddress(address: js.Promise[String]): js.Promise[Null | String] = js.native
    
    def off(eventName: EventType): Provider = js.native
    def off(eventName: EventType, listener: Listener): Provider = js.native
    
    def on(eventName: EventType, listener: Listener): Provider = js.native
    
    def once(eventName: EventType, listener: Listener): Provider = js.native
    /* CompleteClass */
    @JSName("once")
    override def once_block(eventName: block, handler: js.Function0[Unit]): Unit = js.native
    
    def removeAllListeners(): Provider = js.native
    def removeAllListeners(eventName: EventType): Provider = js.native
    
    def removeListener(eventName: EventType, listener: Listener): Provider = js.native
    
    def resolveName(name: String): js.Promise[Null | String] = js.native
    def resolveName(name: js.Promise[String]): js.Promise[Null | String] = js.native
    
    def sendTransaction(signedTransaction: String): js.Promise[TransactionResponse] = js.native
    def sendTransaction(signedTransaction: js.Promise[String]): js.Promise[TransactionResponse] = js.native
    
    def waitForTransaction(transactionHash: String): js.Promise[TransactionReceipt] = js.native
    def waitForTransaction(transactionHash: String, confirmations: Double): js.Promise[TransactionReceipt] = js.native
    def waitForTransaction(transactionHash: String, confirmations: Double, timeout: Double): js.Promise[TransactionReceipt] = js.native
    def waitForTransaction(transactionHash: String, confirmations: Unit, timeout: Double): js.Promise[TransactionReceipt] = js.native
  }
  /* static members */
  object Provider {
    
    @JSImport("@ethersproject/abstract-provider", "Provider")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isProvider(value: Any): /* is @ethersproject/abstract-provider.@ethersproject/abstract-provider.Provider */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isProvider")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/abstract-provider.@ethersproject/abstract-provider.Provider */ Boolean]
  }
  
  @JSImport("@ethersproject/abstract-provider", "TransactionForkEvent")
  @js.native
  open class TransactionForkEvent protected () extends ForkEvent {
    def this(hash: String) = this()
    def this(hash: String, expiry: Double) = this()
    
    val _isTransactionOrderForkEvent: js.UndefOr[Boolean] = js.native
    
    val hash: String = js.native
  }
  
  @JSImport("@ethersproject/abstract-provider", "TransactionOrderForkEvent")
  @js.native
  open class TransactionOrderForkEvent protected () extends ForkEvent {
    def this(beforeHash: String, afterHash: String) = this()
    def this(beforeHash: String, afterHash: String, expiry: Double) = this()
    
    val afterHash: String = js.native
    
    val beforeHash: String = js.native
  }
  
  trait Block
    extends StObject
       with _Block {
    
    var transactions: js.Array[String]
  }
  object Block {
    
    inline def apply(
      _difficulty: BigNumber,
      difficulty: Double,
      extraData: String,
      gasLimit: BigNumber,
      gasUsed: BigNumber,
      hash: String,
      miner: String,
      nonce: String,
      number: Double,
      parentHash: String,
      timestamp: Double,
      transactions: js.Array[String]
    ): Block = {
      val __obj = js.Dynamic.literal(_difficulty = _difficulty.asInstanceOf[js.Any], difficulty = difficulty.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], miner = miner.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], parentHash = parentHash.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Block]
    }
    
    extension [Self <: Block](x: Self) {
      
      inline def setTransactions(value: js.Array[String]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
      
      inline def setTransactionsVarargs(value: String*): Self = StObject.set(x, "transactions", js.Array(value*))
    }
  }
  
  type BlockTag = String | Double
  
  trait BlockWithTransactions
    extends StObject
       with _Block {
    
    var transactions: js.Array[TransactionResponse]
  }
  object BlockWithTransactions {
    
    inline def apply(
      _difficulty: BigNumber,
      difficulty: Double,
      extraData: String,
      gasLimit: BigNumber,
      gasUsed: BigNumber,
      hash: String,
      miner: String,
      nonce: String,
      number: Double,
      parentHash: String,
      timestamp: Double,
      transactions: js.Array[TransactionResponse]
    ): BlockWithTransactions = {
      val __obj = js.Dynamic.literal(_difficulty = _difficulty.asInstanceOf[js.Any], difficulty = difficulty.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], miner = miner.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], parentHash = parentHash.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockWithTransactions]
    }
    
    extension [Self <: BlockWithTransactions](x: Self) {
      
      inline def setTransactions(value: js.Array[TransactionResponse]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
      
      inline def setTransactionsVarargs(value: TransactionResponse*): Self = StObject.set(x, "transactions", js.Array(value*))
    }
  }
  
  trait EventFilter
    extends StObject
       with _EventType {
    
    var address: js.UndefOr[String] = js.undefined
    
    var topics: js.UndefOr[js.Array[String | js.Array[String] | Null]] = js.undefined
  }
  object EventFilter {
    
    inline def apply(): EventFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventFilter]
    }
    
    extension [Self <: EventFilter](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setTopics(value: js.Array[String | js.Array[String] | Null]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
      
      inline def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
      
      inline def setTopicsVarargs(value: (String | js.Array[String] | Null)*): Self = StObject.set(x, "topics", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - js.Array[java.lang.String | js.Array[java.lang.String]]
    - typings.ethersprojectAbstractProvider.mod.EventFilter
    - typings.ethersprojectAbstractProvider.mod.ForkEvent
  */
  type EventType = _EventType | (js.Array[String | js.Array[String]]) | String
  
  trait FeeData extends StObject {
    
    var gasPrice: Null | BigNumber
    
    var lastBaseFeePerGas: Null | BigNumber
    
    var maxFeePerGas: Null | BigNumber
    
    var maxPriorityFeePerGas: Null | BigNumber
  }
  object FeeData {
    
    inline def apply(): FeeData = {
      val __obj = js.Dynamic.literal(gasPrice = null, lastBaseFeePerGas = null, maxFeePerGas = null, maxPriorityFeePerGas = null)
      __obj.asInstanceOf[FeeData]
    }
    
    extension [Self <: FeeData](x: Self) {
      
      inline def setGasPrice(value: BigNumber): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      inline def setGasPriceNull: Self = StObject.set(x, "gasPrice", null)
      
      inline def setLastBaseFeePerGas(value: BigNumber): Self = StObject.set(x, "lastBaseFeePerGas", value.asInstanceOf[js.Any])
      
      inline def setLastBaseFeePerGasNull: Self = StObject.set(x, "lastBaseFeePerGas", null)
      
      inline def setMaxFeePerGas(value: BigNumber): Self = StObject.set(x, "maxFeePerGas", value.asInstanceOf[js.Any])
      
      inline def setMaxFeePerGasNull: Self = StObject.set(x, "maxFeePerGas", null)
      
      inline def setMaxPriorityFeePerGas(value: BigNumber): Self = StObject.set(x, "maxPriorityFeePerGas", value.asInstanceOf[js.Any])
      
      inline def setMaxPriorityFeePerGasNull: Self = StObject.set(x, "maxPriorityFeePerGas", null)
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
    
    extension [Self <: Filter](x: Self) {
      
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
    
    extension [Self <: FilterByBlockHash](x: Self) {
      
      inline def setBlockHash(value: String): Self = StObject.set(x, "blockHash", value.asInstanceOf[js.Any])
      
      inline def setBlockHashUndefined: Self = StObject.set(x, "blockHash", js.undefined)
    }
  }
  
  @js.native
  trait Listener extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
  
  trait Log extends StObject {
    
    var address: String
    
    var blockHash: String
    
    var blockNumber: Double
    
    var data: String
    
    var logIndex: Double
    
    var removed: Boolean
    
    var topics: js.Array[String]
    
    var transactionHash: String
    
    var transactionIndex: Double
  }
  object Log {
    
    inline def apply(
      address: String,
      blockHash: String,
      blockNumber: Double,
      data: String,
      logIndex: Double,
      removed: Boolean,
      topics: js.Array[String],
      transactionHash: String,
      transactionIndex: Double
    ): Log = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], blockHash = blockHash.asInstanceOf[js.Any], blockNumber = blockNumber.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], logIndex = logIndex.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any], transactionIndex = transactionIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Log]
    }
    
    extension [Self <: Log](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setBlockHash(value: String): Self = StObject.set(x, "blockHash", value.asInstanceOf[js.Any])
      
      inline def setBlockNumber(value: Double): Self = StObject.set(x, "blockNumber", value.asInstanceOf[js.Any])
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setLogIndex(value: Double): Self = StObject.set(x, "logIndex", value.asInstanceOf[js.Any])
      
      inline def setRemoved(value: Boolean): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
      
      inline def setTopics(value: js.Array[String]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
      
      inline def setTopicsVarargs(value: String*): Self = StObject.set(x, "topics", js.Array(value*))
      
      inline def setTransactionHash(value: String): Self = StObject.set(x, "transactionHash", value.asInstanceOf[js.Any])
      
      inline def setTransactionIndex(value: Double): Self = StObject.set(x, "transactionIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransactionReceipt extends StObject {
    
    var blockHash: String
    
    var blockNumber: Double
    
    var byzantium: Boolean
    
    var confirmations: Double
    
    var contractAddress: String
    
    var cumulativeGasUsed: BigNumber
    
    var effectiveGasPrice: BigNumber
    
    var from: String
    
    var gasUsed: BigNumber
    
    var logs: js.Array[Log]
    
    var logsBloom: String
    
    var root: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[Double] = js.undefined
    
    var to: String
    
    var transactionHash: String
    
    var transactionIndex: Double
    
    var `type`: Double
  }
  object TransactionReceipt {
    
    inline def apply(
      blockHash: String,
      blockNumber: Double,
      byzantium: Boolean,
      confirmations: Double,
      contractAddress: String,
      cumulativeGasUsed: BigNumber,
      effectiveGasPrice: BigNumber,
      from: String,
      gasUsed: BigNumber,
      logs: js.Array[Log],
      logsBloom: String,
      to: String,
      transactionHash: String,
      transactionIndex: Double,
      `type`: Double
    ): TransactionReceipt = {
      val __obj = js.Dynamic.literal(blockHash = blockHash.asInstanceOf[js.Any], blockNumber = blockNumber.asInstanceOf[js.Any], byzantium = byzantium.asInstanceOf[js.Any], confirmations = confirmations.asInstanceOf[js.Any], contractAddress = contractAddress.asInstanceOf[js.Any], cumulativeGasUsed = cumulativeGasUsed.asInstanceOf[js.Any], effectiveGasPrice = effectiveGasPrice.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], logs = logs.asInstanceOf[js.Any], logsBloom = logsBloom.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any], transactionIndex = transactionIndex.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactionReceipt]
    }
    
    extension [Self <: TransactionReceipt](x: Self) {
      
      inline def setBlockHash(value: String): Self = StObject.set(x, "blockHash", value.asInstanceOf[js.Any])
      
      inline def setBlockNumber(value: Double): Self = StObject.set(x, "blockNumber", value.asInstanceOf[js.Any])
      
      inline def setByzantium(value: Boolean): Self = StObject.set(x, "byzantium", value.asInstanceOf[js.Any])
      
      inline def setConfirmations(value: Double): Self = StObject.set(x, "confirmations", value.asInstanceOf[js.Any])
      
      inline def setContractAddress(value: String): Self = StObject.set(x, "contractAddress", value.asInstanceOf[js.Any])
      
      inline def setCumulativeGasUsed(value: BigNumber): Self = StObject.set(x, "cumulativeGasUsed", value.asInstanceOf[js.Any])
      
      inline def setEffectiveGasPrice(value: BigNumber): Self = StObject.set(x, "effectiveGasPrice", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setGasUsed(value: BigNumber): Self = StObject.set(x, "gasUsed", value.asInstanceOf[js.Any])
      
      inline def setLogs(value: js.Array[Log]): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
      
      inline def setLogsBloom(value: String): Self = StObject.set(x, "logsBloom", value.asInstanceOf[js.Any])
      
      inline def setLogsVarargs(value: Log*): Self = StObject.set(x, "logs", js.Array(value*))
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setTransactionHash(value: String): Self = StObject.set(x, "transactionHash", value.asInstanceOf[js.Any])
      
      inline def setTransactionIndex(value: Double): Self = StObject.set(x, "transactionIndex", value.asInstanceOf[js.Any])
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransactionRequest extends StObject {
    
    var accessList: js.UndefOr[AccessListish] = js.undefined
    
    var ccipReadEnabled: js.UndefOr[Boolean] = js.undefined
    
    var chainId: js.UndefOr[Double] = js.undefined
    
    var customData: js.UndefOr[Record[String, Any]] = js.undefined
    
    var data: js.UndefOr[BytesLike] = js.undefined
    
    var from: js.UndefOr[String] = js.undefined
    
    var gasLimit: js.UndefOr[BigNumberish] = js.undefined
    
    var gasPrice: js.UndefOr[BigNumberish] = js.undefined
    
    var maxFeePerGas: js.UndefOr[BigNumberish] = js.undefined
    
    var maxPriorityFeePerGas: js.UndefOr[BigNumberish] = js.undefined
    
    var nonce: js.UndefOr[BigNumberish] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[BigNumberish] = js.undefined
  }
  object TransactionRequest {
    
    inline def apply(): TransactionRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransactionRequest]
    }
    
    extension [Self <: TransactionRequest](x: Self) {
      
      inline def setAccessList(value: AccessListish): Self = StObject.set(x, "accessList", value.asInstanceOf[js.Any])
      
      inline def setAccessListUndefined: Self = StObject.set(x, "accessList", js.undefined)
      
      inline def setAccessListVarargs(value: (Address | (js.Tuple2[String, js.Array[String]]))*): Self = StObject.set(x, "accessList", js.Array(value*))
      
      inline def setCcipReadEnabled(value: Boolean): Self = StObject.set(x, "ccipReadEnabled", value.asInstanceOf[js.Any])
      
      inline def setCcipReadEnabledUndefined: Self = StObject.set(x, "ccipReadEnabled", js.undefined)
      
      inline def setChainId(value: Double): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      inline def setChainIdUndefined: Self = StObject.set(x, "chainId", js.undefined)
      
      inline def setCustomData(value: Record[String, Any]): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
      
      inline def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
      
      inline def setData(value: BytesLike): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setGasLimit(value: BigNumberish): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
      
      inline def setGasLimitUndefined: Self = StObject.set(x, "gasLimit", js.undefined)
      
      inline def setGasPrice(value: BigNumberish): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      inline def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
      
      inline def setMaxFeePerGas(value: BigNumberish): Self = StObject.set(x, "maxFeePerGas", value.asInstanceOf[js.Any])
      
      inline def setMaxFeePerGasUndefined: Self = StObject.set(x, "maxFeePerGas", js.undefined)
      
      inline def setMaxPriorityFeePerGas(value: BigNumberish): Self = StObject.set(x, "maxPriorityFeePerGas", value.asInstanceOf[js.Any])
      
      inline def setMaxPriorityFeePerGasUndefined: Self = StObject.set(x, "maxPriorityFeePerGas", js.undefined)
      
      inline def setNonce(value: BigNumberish): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: BigNumberish): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait TransactionResponse
    extends StObject
       with Transaction {
    
    var blockHash: js.UndefOr[String] = js.native
    
    var blockNumber: js.UndefOr[Double] = js.native
    
    var confirmations: Double = js.native
    
    @JSName("from")
    var from_TransactionResponse: String = js.native
    
    @JSName("hash")
    var hash_TransactionResponse: String = js.native
    
    var raw: js.UndefOr[String] = js.native
    
    var timestamp: js.UndefOr[Double] = js.native
    
    def wait(confirmations: Double): js.Promise[TransactionReceipt] = js.native
  }
  
  trait _Block extends StObject {
    
    var _difficulty: BigNumber
    
    var baseFeePerGas: js.UndefOr[Null | BigNumber] = js.undefined
    
    var difficulty: Double
    
    var extraData: String
    
    var gasLimit: BigNumber
    
    var gasUsed: BigNumber
    
    var hash: String
    
    var miner: String
    
    var nonce: String
    
    var number: Double
    
    var parentHash: String
    
    var timestamp: Double
  }
  object _Block {
    
    inline def apply(
      _difficulty: BigNumber,
      difficulty: Double,
      extraData: String,
      gasLimit: BigNumber,
      gasUsed: BigNumber,
      hash: String,
      miner: String,
      nonce: String,
      number: Double,
      parentHash: String,
      timestamp: Double
    ): _Block = {
      val __obj = js.Dynamic.literal(_difficulty = _difficulty.asInstanceOf[js.Any], difficulty = difficulty.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], miner = miner.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], parentHash = parentHash.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[_Block]
    }
    
    extension [Self <: _Block](x: Self) {
      
      inline def setBaseFeePerGas(value: BigNumber): Self = StObject.set(x, "baseFeePerGas", value.asInstanceOf[js.Any])
      
      inline def setBaseFeePerGasNull: Self = StObject.set(x, "baseFeePerGas", null)
      
      inline def setBaseFeePerGasUndefined: Self = StObject.set(x, "baseFeePerGas", js.undefined)
      
      inline def setDifficulty(value: Double): Self = StObject.set(x, "difficulty", value.asInstanceOf[js.Any])
      
      inline def setExtraData(value: String): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
      
      inline def setGasLimit(value: BigNumber): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
      
      inline def setGasUsed(value: BigNumber): Self = StObject.set(x, "gasUsed", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setMiner(value: String): Self = StObject.set(x, "miner", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setParentHash(value: String): Self = StObject.set(x, "parentHash", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def set_difficulty(value: BigNumber): Self = StObject.set(x, "_difficulty", value.asInstanceOf[js.Any])
    }
  }
  
  trait _EventType extends StObject
}
