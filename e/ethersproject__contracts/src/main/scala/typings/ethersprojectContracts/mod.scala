package typings.ethersprojectContracts

import org.scalablytyped.runtime.StringDictionary
import typings.ethersprojectAbi.abstractCoderMod.Result
import typings.ethersprojectAbi.fragmentsMod.JsonFragment
import typings.ethersprojectAbi.mod.Fragment
import typings.ethersprojectAbi.mod.Interface
import typings.ethersprojectAbstractProvider.mod.Block
import typings.ethersprojectAbstractProvider.mod.BlockTag
import typings.ethersprojectAbstractProvider.mod.Listener
import typings.ethersprojectAbstractProvider.mod.Log
import typings.ethersprojectAbstractProvider.mod.Provider
import typings.ethersprojectAbstractProvider.mod.TransactionReceipt
import typings.ethersprojectAbstractProvider.mod.TransactionRequest
import typings.ethersprojectAbstractProvider.mod.TransactionResponse
import typings.ethersprojectAbstractSigner.mod.Signer
import typings.ethersprojectBignumber.bignumberMod.BigNumberish
import typings.ethersprojectBignumber.mod.BigNumber
import typings.ethersprojectBytes.mod.BytesLike
import typings.ethersprojectContracts.anon.From
import typings.ethersprojectContracts.anon.Nonce
import typings.ethersprojectContracts.anon.Object
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/contracts", "Contract")
  @js.native
  class Contract protected ()
    extends StObject
       with /* key */ StringDictionary[ContractFunction[js.Any] | js.Any] {
    def this(addressOrName: String, contractInterface: ContractInterface) = this()
    def this(addressOrName: String, contractInterface: ContractInterface, signerOrProvider: Provider) = this()
    def this(addressOrName: String, contractInterface: ContractInterface, signerOrProvider: Signer) = this()
    
    var _addEventListener: js.Any = js.native
    
    def _checkRunningEvents(runningEvent: RunningEvent): Unit = js.native
    
    def _deployed(): js.Promise[Contract] = js.native
    def _deployed(blockTag: BlockTag): js.Promise[Contract] = js.native
    
    var _deployedPromise: js.Promise[Contract] = js.native
    
    var _getRunningEvent: js.Any = js.native
    
    var _normalizeRunningEvent: js.Any = js.native
    
    var _runningEvents: StringDictionary[RunningEvent] = js.native
    
    def _wrapEvent(runningEvent: RunningEvent, log: Log, listener: Listener): Event = js.native
    
    var _wrappedEmits: StringDictionary[js.Function1[/* repeated */ js.Any, Unit]] = js.native
    
    val address: String = js.native
    
    def attach(addressOrName: String): Contract = js.native
    
    val callStatic: StringDictionary[ContractFunction[js.Any]] = js.native
    
    def connect(signerOrProvider: String): Contract = js.native
    def connect(signerOrProvider: Provider): Contract = js.native
    def connect(signerOrProvider: Signer): Contract = js.native
    
    val deployTransaction: TransactionResponse = js.native
    
    def deployed(): js.Promise[Contract] = js.native
    
    def emit(eventName: String, args: js.Any*): Boolean = js.native
    def emit(eventName: EventFilter, args: js.Any*): Boolean = js.native
    
    val estimateGas: StringDictionary[ContractFunction[BigNumber]] = js.native
    
    def fallback(): js.Promise[TransactionResponse] = js.native
    def fallback(overrides: TransactionRequest): js.Promise[TransactionResponse] = js.native
    
    val filters: StringDictionary[js.Function1[/* repeated */ js.Any, EventFilter]] = js.native
    
    val functions: StringDictionary[ContractFunction[js.Any]] = js.native
    
    val interface: Interface = js.native
    
    def listenerCount(): Double = js.native
    def listenerCount(eventName: String): Double = js.native
    def listenerCount(eventName: EventFilter): Double = js.native
    
    def listeners(): js.Array[Listener] = js.native
    def listeners(eventName: String): js.Array[Listener] = js.native
    def listeners(eventName: EventFilter): js.Array[Listener] = js.native
    
    def off(eventName: String, listener: Listener): this.type = js.native
    def off(eventName: EventFilter, listener: Listener): this.type = js.native
    
    def on(event: String, listener: Listener): this.type = js.native
    def on(event: EventFilter, listener: Listener): this.type = js.native
    
    def once(event: String, listener: Listener): this.type = js.native
    def once(event: EventFilter, listener: Listener): this.type = js.native
    
    val populateTransaction: StringDictionary[ContractFunction[PopulatedTransaction]] = js.native
    
    val provider: Provider = js.native
    
    def queryFilter(event: EventFilter): js.Promise[js.Array[Event]] = js.native
    def queryFilter(event: EventFilter, fromBlockOrBlockhash: String): js.Promise[js.Array[Event]] = js.native
    def queryFilter(event: EventFilter, fromBlockOrBlockhash: String, toBlock: BlockTag): js.Promise[js.Array[Event]] = js.native
    def queryFilter(event: EventFilter, fromBlockOrBlockhash: Unit, toBlock: BlockTag): js.Promise[js.Array[Event]] = js.native
    def queryFilter(event: EventFilter, fromBlockOrBlockhash: BlockTag): js.Promise[js.Array[Event]] = js.native
    def queryFilter(event: EventFilter, fromBlockOrBlockhash: BlockTag, toBlock: BlockTag): js.Promise[js.Array[Event]] = js.native
    
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(eventName: String): this.type = js.native
    def removeAllListeners(eventName: EventFilter): this.type = js.native
    
    def removeListener(eventName: String, listener: Listener): this.type = js.native
    def removeListener(eventName: EventFilter, listener: Listener): this.type = js.native
    
    val resolvedAddress: js.Promise[String] = js.native
    
    val signer: Signer = js.native
  }
  /* static members */
  object Contract {
    
    @JSImport("@ethersproject/contracts", "Contract")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getContractAddress(transaction: From): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getContractAddress")(transaction.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def getInterface(contractInterface: ContractInterface): Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("getInterface")(contractInterface.asInstanceOf[js.Any]).asInstanceOf[Interface]
    
    @scala.inline
    def isIndexed(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi.Indexed */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIndexed")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/abi.@ethersproject/abi.Indexed */ Boolean]
  }
  
  @JSImport("@ethersproject/contracts", "ContractFactory")
  @js.native
  class ContractFactory protected () extends StObject {
    def this(contractInterface: ContractInterface, bytecode: BytesLike) = this()
    def this(contractInterface: ContractInterface, bytecode: Object) = this()
    def this(contractInterface: ContractInterface, bytecode: BytesLike, signer: Signer) = this()
    def this(contractInterface: ContractInterface, bytecode: Object, signer: Signer) = this()
    
    def attach(address: String): Contract = js.native
    
    val bytecode: String = js.native
    
    def connect(signer: Signer): ContractFactory = js.native
    
    def deploy(args: js.Any*): js.Promise[Contract] = js.native
    
    def getDeployTransaction(args: js.Any*): TransactionRequest = js.native
    
    val interface: Interface = js.native
    
    val signer: Signer = js.native
  }
  /* static members */
  object ContractFactory {
    
    @JSImport("@ethersproject/contracts", "ContractFactory")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def fromSolidity(compilerOutput: js.Any): ContractFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSolidity")(compilerOutput.asInstanceOf[js.Any]).asInstanceOf[ContractFactory]
    @scala.inline
    def fromSolidity(compilerOutput: js.Any, signer: Signer): ContractFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSolidity")(compilerOutput.asInstanceOf[js.Any], signer.asInstanceOf[js.Any])).asInstanceOf[ContractFactory]
    
    @scala.inline
    def getContract(address: String, contractInterface: ContractInterface): Contract = (^.asInstanceOf[js.Dynamic].applyDynamic("getContract")(address.asInstanceOf[js.Any], contractInterface.asInstanceOf[js.Any])).asInstanceOf[Contract]
    @scala.inline
    def getContract(address: String, contractInterface: ContractInterface, signer: Signer): Contract = (^.asInstanceOf[js.Dynamic].applyDynamic("getContract")(address.asInstanceOf[js.Any], contractInterface.asInstanceOf[js.Any], signer.asInstanceOf[js.Any])).asInstanceOf[Contract]
    
    @scala.inline
    def getContractAddress(tx: Nonce): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getContractAddress")(tx.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def getInterface(contractInterface: ContractInterface): Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("getInterface")(contractInterface.asInstanceOf[js.Any]).asInstanceOf[Interface]
  }
  
  trait CallOverrides
    extends StObject
       with PayableOverrides {
    
    var blockTag: js.UndefOr[BlockTag | js.Promise[BlockTag]] = js.undefined
    
    var from: js.UndefOr[String | js.Promise[String]] = js.undefined
  }
  object CallOverrides {
    
    @scala.inline
    def apply(): CallOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallOverrides]
    }
    
    @scala.inline
    implicit class CallOverridesMutableBuilder[Self <: CallOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockTag(value: BlockTag | js.Promise[BlockTag]): Self = StObject.set(x, "blockTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockTagUndefined: Self = StObject.set(x, "blockTag", js.undefined)
      
      @scala.inline
      def setFrom(value: String | js.Promise[String]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    }
  }
  
  @js.native
  trait ContractFunction[T] extends StObject {
    
    def apply(args: js.Any*): js.Promise[T] = js.native
  }
  
  type ContractInterface = String | (js.Array[Fragment | JsonFragment | String]) | Interface
  
  trait ContractReceipt
    extends StObject
       with TransactionReceipt {
    
    var events: js.UndefOr[js.Array[Event]] = js.undefined
  }
  object ContractReceipt {
    
    @scala.inline
    def apply(
      blockHash: String,
      blockNumber: Double,
      byzantium: Boolean,
      confirmations: Double,
      contractAddress: String,
      cumulativeGasUsed: BigNumber,
      from: String,
      gasUsed: BigNumber,
      logs: js.Array[Log],
      logsBloom: String,
      to: String,
      transactionHash: String,
      transactionIndex: Double
    ): ContractReceipt = {
      val __obj = js.Dynamic.literal(blockHash = blockHash.asInstanceOf[js.Any], blockNumber = blockNumber.asInstanceOf[js.Any], byzantium = byzantium.asInstanceOf[js.Any], confirmations = confirmations.asInstanceOf[js.Any], contractAddress = contractAddress.asInstanceOf[js.Any], cumulativeGasUsed = cumulativeGasUsed.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], logs = logs.asInstanceOf[js.Any], logsBloom = logsBloom.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any], transactionIndex = transactionIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContractReceipt]
    }
    
    @scala.inline
    implicit class ContractReceiptMutableBuilder[Self <: ContractReceipt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvents(value: js.Array[Event]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ContractTransaction
    extends StObject
       with TransactionResponse
  
  trait Event
    extends StObject
       with Log {
    
    var args: js.UndefOr[Result] = js.undefined
    
    var decode: js.UndefOr[
        js.Function2[/* data */ String, /* topics */ js.UndefOr[js.Array[String]], js.Any]
      ] = js.undefined
    
    var decodeError: js.UndefOr[Error] = js.undefined
    
    var event: js.UndefOr[String] = js.undefined
    
    var eventSignature: js.UndefOr[String] = js.undefined
    
    def getBlock(): js.Promise[Block]
    
    def getTransaction(): js.Promise[TransactionResponse]
    
    def getTransactionReceipt(): js.Promise[TransactionReceipt]
    
    def removeListener(): Unit
  }
  object Event {
    
    @scala.inline
    def apply(
      address: String,
      blockHash: String,
      blockNumber: Double,
      data: String,
      getBlock: () => js.Promise[Block],
      getTransaction: () => js.Promise[TransactionResponse],
      getTransactionReceipt: () => js.Promise[TransactionReceipt],
      logIndex: Double,
      removeListener: () => Unit,
      removed: Boolean,
      topics: js.Array[String],
      transactionHash: String,
      transactionIndex: Double
    ): Event = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], blockHash = blockHash.asInstanceOf[js.Any], blockNumber = blockNumber.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], getBlock = js.Any.fromFunction0(getBlock), getTransaction = js.Any.fromFunction0(getTransaction), getTransactionReceipt = js.Any.fromFunction0(getTransactionReceipt), logIndex = logIndex.asInstanceOf[js.Any], removeListener = js.Any.fromFunction0(removeListener), removed = removed.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any], transactionIndex = transactionIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: Result): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setDecode(value: (/* data */ String, /* topics */ js.UndefOr[js.Array[String]]) => js.Any): Self = StObject.set(x, "decode", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDecodeError(value: Error): Self = StObject.set(x, "decodeError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodeErrorUndefined: Self = StObject.set(x, "decodeError", js.undefined)
      
      @scala.inline
      def setDecodeUndefined: Self = StObject.set(x, "decode", js.undefined)
      
      @scala.inline
      def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventSignature(value: String): Self = StObject.set(x, "eventSignature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventSignatureUndefined: Self = StObject.set(x, "eventSignature", js.undefined)
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setGetBlock(value: () => js.Promise[Block]): Self = StObject.set(x, "getBlock", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTransaction(value: () => js.Promise[TransactionResponse]): Self = StObject.set(x, "getTransaction", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTransactionReceipt(value: () => js.Promise[TransactionReceipt]): Self = StObject.set(x, "getTransactionReceipt", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveListener(value: () => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction0(value))
    }
  }
  
  trait EventFilter extends StObject {
    
    var address: js.UndefOr[String] = js.undefined
    
    var topics: js.UndefOr[js.Array[String | js.Array[String]]] = js.undefined
  }
  object EventFilter {
    
    @scala.inline
    def apply(): EventFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventFilter]
    }
    
    @scala.inline
    implicit class EventFilterMutableBuilder[Self <: EventFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      @scala.inline
      def setTopics(value: js.Array[String | js.Array[String]]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
      
      @scala.inline
      def setTopicsVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "topics", js.Array(value :_*))
    }
  }
  
  trait Overrides extends StObject {
    
    var gasLimit: js.UndefOr[BigNumberish | js.Promise[BigNumberish]] = js.undefined
    
    var gasPrice: js.UndefOr[BigNumberish | js.Promise[BigNumberish]] = js.undefined
    
    var nonce: js.UndefOr[BigNumberish | js.Promise[BigNumberish]] = js.undefined
  }
  object Overrides {
    
    @scala.inline
    def apply(): Overrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Overrides]
    }
    
    @scala.inline
    implicit class OverridesMutableBuilder[Self <: Overrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGasLimit(value: BigNumberish | js.Promise[BigNumberish]): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasLimitUndefined: Self = StObject.set(x, "gasLimit", js.undefined)
      
      @scala.inline
      def setGasPrice(value: BigNumberish | js.Promise[BigNumberish]): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
      
      @scala.inline
      def setNonce(value: BigNumberish | js.Promise[BigNumberish]): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    }
  }
  
  trait PayableOverrides
    extends StObject
       with Overrides {
    
    var value: js.UndefOr[BigNumberish | js.Promise[BigNumberish]] = js.undefined
  }
  object PayableOverrides {
    
    @scala.inline
    def apply(): PayableOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PayableOverrides]
    }
    
    @scala.inline
    implicit class PayableOverridesMutableBuilder[Self <: PayableOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: BigNumberish | js.Promise[BigNumberish]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait PopulatedTransaction extends StObject {
    
    var chainId: js.UndefOr[Double] = js.undefined
    
    var data: js.UndefOr[String] = js.undefined
    
    var from: js.UndefOr[String] = js.undefined
    
    var gasLimit: js.UndefOr[BigNumber] = js.undefined
    
    var gasPrice: js.UndefOr[BigNumber] = js.undefined
    
    var nonce: js.UndefOr[Double] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[BigNumber] = js.undefined
  }
  object PopulatedTransaction {
    
    @scala.inline
    def apply(): PopulatedTransaction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopulatedTransaction]
    }
    
    @scala.inline
    implicit class PopulatedTransactionMutableBuilder[Self <: PopulatedTransaction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChainId(value: Double): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChainIdUndefined: Self = StObject.set(x, "chainId", js.undefined)
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setGasLimit(value: BigNumber): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasLimitUndefined: Self = StObject.set(x, "gasLimit", js.undefined)
      
      @scala.inline
      def setGasPrice(value: BigNumber): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
      
      @scala.inline
      def setNonce(value: Double): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      @scala.inline
      def setValue(value: BigNumber): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait RunningEvent extends StObject {
    
    var _listeners: js.Any
    
    def addListener(listener: Listener, once: Boolean): Unit
    
    val filter: EventFilter
    
    def getEmit(event: Event): js.Array[js.Any]
    
    def listenerCount(): Double
    
    def listeners(): js.Array[Listener]
    
    def prepareEvent(event: Event): Unit
    
    def removeAllListeners(): Unit
    
    def removeListener(listener: Listener): Unit
    
    def run(args: js.Array[js.Any]): Double
    
    val tag: String
  }
  object RunningEvent {
    
    @scala.inline
    def apply(
      _listeners: js.Any,
      addListener: (Listener, Boolean) => Unit,
      filter: EventFilter,
      getEmit: Event => js.Array[js.Any],
      listenerCount: () => Double,
      listeners: () => js.Array[Listener],
      prepareEvent: Event => Unit,
      removeAllListeners: () => Unit,
      removeListener: Listener => Unit,
      run: js.Array[js.Any] => Double,
      tag: String
    ): RunningEvent = {
      val __obj = js.Dynamic.literal(_listeners = _listeners.asInstanceOf[js.Any], addListener = js.Any.fromFunction2(addListener), filter = filter.asInstanceOf[js.Any], getEmit = js.Any.fromFunction1(getEmit), listenerCount = js.Any.fromFunction0(listenerCount), listeners = js.Any.fromFunction0(listeners), prepareEvent = js.Any.fromFunction1(prepareEvent), removeAllListeners = js.Any.fromFunction0(removeAllListeners), removeListener = js.Any.fromFunction1(removeListener), run = js.Any.fromFunction1(run), tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunningEvent]
    }
    
    @scala.inline
    implicit class RunningEventMutableBuilder[Self <: RunningEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddListener(value: (Listener, Boolean) => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilter(value: EventFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetEmit(value: Event => js.Array[js.Any]): Self = StObject.set(x, "getEmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setListenerCount(value: () => Double): Self = StObject.set(x, "listenerCount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setListeners(value: () => js.Array[Listener]): Self = StObject.set(x, "listeners", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrepareEvent(value: Event => Unit): Self = StObject.set(x, "prepareEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveAllListeners(value: () => Unit): Self = StObject.set(x, "removeAllListeners", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveListener(value: Listener => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRun(value: js.Array[js.Any] => Double): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_listeners(value: js.Any): Self = StObject.set(x, "_listeners", value.asInstanceOf[js.Any])
    }
  }
}
