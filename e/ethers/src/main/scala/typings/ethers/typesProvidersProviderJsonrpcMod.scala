package typings.ethers

import typings.ethers.anon.Args
import typings.ethers.anon.Code
import typings.ethers.anon.StorageKeys
import typings.ethers.ethersStrings.`2Dot0`
import typings.ethers.ethersStrings.batchMaxCount
import typings.ethers.ethersStrings.batchMaxSize
import typings.ethers.ethersStrings.batchStallTime
import typings.ethers.ethersStrings.polling
import typings.ethers.ethersStrings.staticNetwork
import typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider
import typings.ethers.typesProvidersAbstractProviderMod.PerformActionRequest
import typings.ethers.typesProvidersAbstractSignerMod.AbstractSigner
import typings.ethers.typesProvidersNetworkMod.Network
import typings.ethers.typesProvidersNetworkMod.Networkish
import typings.ethers.typesProvidersProviderMod.TransactionRequest
import typings.ethers.typesProvidersProviderMod.TransactionResponse
import typings.ethers.typesUtilsMod.FetchRequest
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvidersProviderJsonrpcMod {
  
  /* note: abstract class */ @JSImport("ethers/types/providers/provider-jsonrpc", "JsonRpcApiPollingProvider")
  @js.native
  open class JsonRpcApiPollingProvider () extends JsonRpcApiProvider {
    def this(network: Networkish) = this()
    def this(network: Unit, options: JsonRpcApiProviderOptions) = this()
    def this(network: Networkish, options: JsonRpcApiProviderOptions) = this()
    
    /**
      *  The polling interval (default: 4000 ms)
      */
    def pollingInterval: Double = js.native
    def pollingInterval_=(value: Double): Unit = js.native
  }
  
  /* note: abstract class */ @JSImport("ethers/types/providers/provider-jsonrpc", "JsonRpcApiProvider")
  @js.native
  open class JsonRpcApiProvider () extends AbstractProvider {
    def this(network: Networkish) = this()
    def this(network: Unit, options: JsonRpcApiProviderOptions) = this()
    def this(network: Networkish, options: JsonRpcApiProviderOptions) = this()
    
    @JSName("_getOption")
    def _getOption_batchMaxCount(key: batchMaxCount): js.UndefOr[Double] = js.native
    @JSName("_getOption")
    def _getOption_batchMaxSize(key: batchMaxSize): js.UndefOr[Double] = js.native
    @JSName("_getOption")
    def _getOption_batchStallTime(key: batchStallTime): js.UndefOr[Double] = js.native
    /**
      *  Returns the value associated with the option %%key%%.
      *
      *  Sub-classes can use this to inquire about configuration options.
      */
    @JSName("_getOption")
    def _getOption_polling(key: polling): js.UndefOr[Boolean] = js.native
    @JSName("_getOption")
    def _getOption_staticNetwork(key: staticNetwork): js.UndefOr[Null | Network] = js.native
    
    /**
      *  Gets the [[Network]] this provider has committed to. On each call, the network
      *  is detected, and if it has changed, the call will reject.
      */
    def _network: Network = js.native
    
    def _send(payload: js.Array[JsonRpcPayload]): js.Promise[js.Array[JsonRpcResult | JsonRpcError]] = js.native
    /**
      *  Sends a JSON-RPC %%payload%% (or a batch) to the underlying channel.
      *
      *  Sub-classes **MUST** override this.
      */
    def _send(payload: JsonRpcPayload): js.Promise[js.Array[JsonRpcResult | JsonRpcError]] = js.native
    
    /**
      *  Sub-classes **MUST** call this. Until [[_start]] has been called, no calls
      *  will be passed to [[_send]] from [[send]]. If it is overridden, then
      *  ``super._start()`` **MUST** be called.
      *
      *  Calling it multiple times is safe and has no effect.
      */
    def _start(): Unit = js.native
    
    /**
      *  Resolves once the [[_start]] has been called. This can be used in
      *  sub-classes to defer sending data until the connection has been
      *  established.
      */
    def _waitUntilReady(): js.Promise[Unit] = js.native
    
    /**
      *  Returns an ethers-style Error for the given JSON-RPC error
      *  %%payload%%, coalescing the various strings and error shapes
      *  that different nodes return, coercing them into a machine-readable
      *  standardized error.
      */
    def getRpcError(payload: JsonRpcPayload, _error: JsonRpcError): js.Error = js.native
    
    /**
      *  Returns the request method and arguments required to perform
      *  %%req%%.
      */
    def getRpcRequest(req: PerformActionRequest): Null | Args = js.native
    
    /**
      *  Returns %%tx%% as a normalized JSON-RPC transaction request,
      *  which has all values hexlified and any numeric values converted
      *  to Quantity values.
      */
    def getRpcTransaction(tx: TransactionRequest): JsonRpcTransactionRequest = js.native
    
    /**
      *  Resolves to the [[Signer]] account for  %%address%% managed by
      *  the client.
      *
      *  If the %%address%% is a number, it is used as an index in the
      *  the accounts from [[listAccounts]].
      *
      *  This can only be used on clients which manage accounts (such as
      *  Geth with imported account or MetaMask).
      *
      *  Throws if the account doesn't exist.
      */
    def getSigner(): js.Promise[JsonRpcSigner] = js.native
    def getSigner(address: String): js.Promise[JsonRpcSigner] = js.native
    def getSigner(address: Double): js.Promise[JsonRpcSigner] = js.native
    
    def listAccounts(): js.Promise[js.Array[JsonRpcSigner]] = js.native
    
    /**
      *  Returns true only if the [[_start]] has been called.
      */
    def ready: Boolean = js.native
    
    /**
      *  Requests the %%method%% with %%params%% via the JSON-RPC protocol
      *  over the underlying channel. This can be used to call methods
      *  on the backend that do not have a high-level API within the Provider
      *  API.
      *
      *  This method queues requests according to the batch constraints
      *  in the options, assigns the request a unique ID.
      *
      *  **Do NOT override** this method in sub-classes; instead
      *  override [[_send]] or force the options values in the
      *  call to the constructor to modify this method's behavior.
      */
    def send(method: String, params: js.Array[Any]): js.Promise[Any] = js.native
    def send(method: String, params: Record[String, Any]): js.Promise[Any] = js.native
  }
  
  @JSImport("ethers/types/providers/provider-jsonrpc", "JsonRpcProvider")
  @js.native
  open class JsonRpcProvider () extends JsonRpcApiPollingProvider {
    def this(url: String) = this()
    def this(url: FetchRequest) = this()
    def this(url: String, network: Networkish) = this()
    def this(url: Unit, network: Networkish) = this()
    def this(url: FetchRequest, network: Networkish) = this()
    def this(url: String, network: Unit, options: JsonRpcApiProviderOptions) = this()
    def this(url: String, network: Networkish, options: JsonRpcApiProviderOptions) = this()
    def this(url: Unit, network: Unit, options: JsonRpcApiProviderOptions) = this()
    def this(url: Unit, network: Networkish, options: JsonRpcApiProviderOptions) = this()
    def this(url: FetchRequest, network: Unit, options: JsonRpcApiProviderOptions) = this()
    def this(url: FetchRequest, network: Networkish, options: JsonRpcApiProviderOptions) = this()
    
    def _getConnection(): FetchRequest = js.native
  }
  
  @JSImport("ethers/types/providers/provider-jsonrpc", "JsonRpcSigner")
  @js.native
  open class JsonRpcSigner protected () extends AbstractSigner[JsonRpcApiProvider] {
    def this(provider: JsonRpcApiProvider, address: String) = this()
    
    def _legacySignMessage(_message: String): js.Promise[String] = js.native
    def _legacySignMessage(_message: js.typedarray.Uint8Array): js.Promise[String] = js.native
    
    var address: String = js.native
    
    @JSName("sendTransaction")
    def sendTransaction_MJsonRpcSigner(tx: TransactionRequest): js.Promise[TransactionResponse] = js.native
    
    def sendUncheckedTransaction(_tx: TransactionRequest): js.Promise[String] = js.native
    
    def unlock(password: String): js.Promise[Boolean] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ethers.anon.ActionPayload
    - typings.ethers.anon.ResultArray
    - typings.ethers.anon.ActionErrorError
  */
  trait DebugEventJsonRpcApiProvider extends StObject
  object DebugEventJsonRpcApiProvider {
    
    inline def ActionErrorError(error: js.Error): typings.ethers.anon.ActionErrorError = {
      val __obj = js.Dynamic.literal(action = "receiveRpcError", error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ethers.anon.ActionErrorError]
    }
    
    inline def ActionPayload(payload: JsonRpcPayload | js.Array[JsonRpcPayload]): typings.ethers.anon.ActionPayload = {
      val __obj = js.Dynamic.literal(action = "sendRpcPayload", payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ethers.anon.ActionPayload]
    }
    
    inline def ResultArray(result: js.Array[JsonRpcResult | JsonRpcError]): typings.ethers.anon.ResultArray = {
      val __obj = js.Dynamic.literal(action = "receiveRpcResult", result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ethers.anon.ResultArray]
    }
  }
  
  trait JsonRpcApiProviderOptions extends StObject {
    
    var batchMaxCount: js.UndefOr[Double] = js.undefined
    
    var batchMaxSize: js.UndefOr[Double] = js.undefined
    
    var batchStallTime: js.UndefOr[Double] = js.undefined
    
    var polling: js.UndefOr[Boolean] = js.undefined
    
    var staticNetwork: js.UndefOr[Null | Network] = js.undefined
  }
  object JsonRpcApiProviderOptions {
    
    inline def apply(): JsonRpcApiProviderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonRpcApiProviderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JsonRpcApiProviderOptions] (val x: Self) extends AnyVal {
      
      inline def setBatchMaxCount(value: Double): Self = StObject.set(x, "batchMaxCount", value.asInstanceOf[js.Any])
      
      inline def setBatchMaxCountUndefined: Self = StObject.set(x, "batchMaxCount", js.undefined)
      
      inline def setBatchMaxSize(value: Double): Self = StObject.set(x, "batchMaxSize", value.asInstanceOf[js.Any])
      
      inline def setBatchMaxSizeUndefined: Self = StObject.set(x, "batchMaxSize", js.undefined)
      
      inline def setBatchStallTime(value: Double): Self = StObject.set(x, "batchStallTime", value.asInstanceOf[js.Any])
      
      inline def setBatchStallTimeUndefined: Self = StObject.set(x, "batchStallTime", js.undefined)
      
      inline def setPolling(value: Boolean): Self = StObject.set(x, "polling", value.asInstanceOf[js.Any])
      
      inline def setPollingUndefined: Self = StObject.set(x, "polling", js.undefined)
      
      inline def setStaticNetwork(value: Network): Self = StObject.set(x, "staticNetwork", value.asInstanceOf[js.Any])
      
      inline def setStaticNetworkNull: Self = StObject.set(x, "staticNetwork", null)
      
      inline def setStaticNetworkUndefined: Self = StObject.set(x, "staticNetwork", js.undefined)
    }
  }
  
  trait JsonRpcError extends StObject {
    
    var error: Code
    
    var id: Double
  }
  object JsonRpcError {
    
    inline def apply(error: Code, id: Double): JsonRpcError = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonRpcError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JsonRpcError] (val x: Self) extends AnyVal {
      
      inline def setError(value: Code): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait JsonRpcPayload extends StObject {
    
    var id: Double
    
    var jsonrpc: `2Dot0`
    
    var method: String
    
    var params: js.Array[Any] | (Record[String, Any])
  }
  object JsonRpcPayload {
    
    inline def apply(id: Double, method: String, params: js.Array[Any] | (Record[String, Any])): JsonRpcPayload = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = "2.0", method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonRpcPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JsonRpcPayload] (val x: Self) extends AnyVal {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setJsonrpc(value: `2Dot0`): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setParams(value: js.Array[Any] | (Record[String, Any])): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsVarargs(value: Any*): Self = StObject.set(x, "params", js.Array(value*))
    }
  }
  
  trait JsonRpcResult extends StObject {
    
    var id: Double
    
    var result: Any
  }
  object JsonRpcResult {
    
    inline def apply(id: Double, result: Any): JsonRpcResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonRpcResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JsonRpcResult] (val x: Self) extends AnyVal {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait JsonRpcTransactionRequest extends StObject {
    
    var accessList: js.UndefOr[js.Array[StorageKeys]] = js.undefined
    
    var chainId: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[String] = js.undefined
    
    var from: js.UndefOr[String] = js.undefined
    
    var gas: js.UndefOr[String] = js.undefined
    
    var gasPrice: js.UndefOr[String] = js.undefined
    
    var maxFeePerGas: js.UndefOr[String] = js.undefined
    
    var maxPriorityFeePerGas: js.UndefOr[String] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object JsonRpcTransactionRequest {
    
    inline def apply(): JsonRpcTransactionRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonRpcTransactionRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JsonRpcTransactionRequest] (val x: Self) extends AnyVal {
      
      inline def setAccessList(value: js.Array[StorageKeys]): Self = StObject.set(x, "accessList", value.asInstanceOf[js.Any])
      
      inline def setAccessListUndefined: Self = StObject.set(x, "accessList", js.undefined)
      
      inline def setAccessListVarargs(value: StorageKeys*): Self = StObject.set(x, "accessList", js.Array(value*))
      
      inline def setChainId(value: String): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      inline def setChainIdUndefined: Self = StObject.set(x, "chainId", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setGas(value: String): Self = StObject.set(x, "gas", value.asInstanceOf[js.Any])
      
      inline def setGasPrice(value: String): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      inline def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
      
      inline def setGasUndefined: Self = StObject.set(x, "gas", js.undefined)
      
      inline def setMaxFeePerGas(value: String): Self = StObject.set(x, "maxFeePerGas", value.asInstanceOf[js.Any])
      
      inline def setMaxFeePerGasUndefined: Self = StObject.set(x, "maxFeePerGas", js.undefined)
      
      inline def setMaxPriorityFeePerGas(value: String): Self = StObject.set(x, "maxPriorityFeePerGas", value.asInstanceOf[js.Any])
      
      inline def setMaxPriorityFeePerGasUndefined: Self = StObject.set(x, "maxPriorityFeePerGas", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
