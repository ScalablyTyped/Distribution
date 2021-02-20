package typings.ganacheCore

import typings.ganacheCore.anon.Log
import typings.ganacheCore.ganacheCoreStrings.byzantium
import typings.ganacheCore.ganacheCoreStrings.constantinople
import typings.ganacheCore.ganacheCoreStrings.istanbul
import typings.ganacheCore.ganacheCoreStrings.muirGlacier
import typings.ganacheCore.ganacheCoreStrings.petersburg
import typings.ganacheCore.mod.Ganache.IProviderOptions
import typings.ganacheCore.mod.Ganache.IServerOptions
import typings.ganacheCore.mod.Ganache.Provider
import typings.ganacheCore.mod.Ganache.Server
import typings.std.Date
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("ganache-core", "default.provider")
    @js.native
    def provider(): Provider = js.native
    @JSImport("ganache-core", "default.provider")
    @js.native
    def provider(opts: IProviderOptions): Provider = js.native
    
    @JSImport("ganache-core", "default.server")
    @js.native
    def server(): Server = js.native
    @JSImport("ganache-core", "default.server")
    @js.native
    def server(opts: IServerOptions): Server = js.native
  }
  
  object Ganache {
    
    @js.native
    trait IProviderOptions extends StObject {
      
      var account_keys_path: js.UndefOr[String] = js.native
      
      var accounts: js.UndefOr[js.Array[js.Object]] = js.native
      
      var allowUnlimitedContractSize: js.UndefOr[Boolean] = js.native
      
      var blockTime: js.UndefOr[Double] = js.native
      
      var db_path: js.UndefOr[String] = js.native
      
      var debug: js.UndefOr[Boolean] = js.native
      
      var default_balance_ether: js.UndefOr[Double] = js.native
      
      var fork: js.UndefOr[String | js.Object] = js.native
      
      var forkCacheSize: js.UndefOr[Double] = js.native
      
      var fork_block_number: js.UndefOr[String | Double] = js.native
      
      var gasLimit: js.UndefOr[String | Double] = js.native
      
      var gasPrice: js.UndefOr[String] = js.native
      
      var hardfork: js.UndefOr[byzantium | constantinople | petersburg | istanbul | muirGlacier] = js.native
      
      var hd_path: js.UndefOr[String] = js.native
      
      var locked: js.UndefOr[Boolean] = js.native
      
      var logger: js.UndefOr[Log] = js.native
      
      var mnemonic: js.UndefOr[String] = js.native
      
      var networkId: js.UndefOr[Double] = js.native
      
      var network_id: js.UndefOr[Double] = js.native
      
      var port: js.UndefOr[Double] = js.native
      
      var seed: js.UndefOr[js.Any] = js.native
      
      var time: js.UndefOr[Date] = js.native
      
      var total_accounts: js.UndefOr[Double] = js.native
      
      var unlocked_accounts: js.UndefOr[js.Array[String]] = js.native
      
      var verbose: js.UndefOr[Boolean] = js.native
      
      var vmErrorsOnRPCResponse: js.UndefOr[Boolean] = js.native
      
      var ws: js.UndefOr[Boolean] = js.native
    }
    object IProviderOptions {
      
      @scala.inline
      def apply(): IProviderOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IProviderOptions]
      }
      
      @scala.inline
      implicit class IProviderOptionsMutableBuilder[Self <: IProviderOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccount_keys_path(value: String): Self = StObject.set(x, "account_keys_path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccount_keys_pathUndefined: Self = StObject.set(x, "account_keys_path", js.undefined)
        
        @scala.inline
        def setAccounts(value: js.Array[js.Object]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccountsUndefined: Self = StObject.set(x, "accounts", js.undefined)
        
        @scala.inline
        def setAccountsVarargs(value: js.Object*): Self = StObject.set(x, "accounts", js.Array(value :_*))
        
        @scala.inline
        def setAllowUnlimitedContractSize(value: Boolean): Self = StObject.set(x, "allowUnlimitedContractSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllowUnlimitedContractSizeUndefined: Self = StObject.set(x, "allowUnlimitedContractSize", js.undefined)
        
        @scala.inline
        def setBlockTime(value: Double): Self = StObject.set(x, "blockTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBlockTimeUndefined: Self = StObject.set(x, "blockTime", js.undefined)
        
        @scala.inline
        def setDb_path(value: String): Self = StObject.set(x, "db_path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDb_pathUndefined: Self = StObject.set(x, "db_path", js.undefined)
        
        @scala.inline
        def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
        
        @scala.inline
        def setDefault_balance_ether(value: Double): Self = StObject.set(x, "default_balance_ether", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefault_balance_etherUndefined: Self = StObject.set(x, "default_balance_ether", js.undefined)
        
        @scala.inline
        def setFork(value: String | js.Object): Self = StObject.set(x, "fork", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForkCacheSize(value: Double): Self = StObject.set(x, "forkCacheSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForkCacheSizeUndefined: Self = StObject.set(x, "forkCacheSize", js.undefined)
        
        @scala.inline
        def setForkUndefined: Self = StObject.set(x, "fork", js.undefined)
        
        @scala.inline
        def setFork_block_number(value: String | Double): Self = StObject.set(x, "fork_block_number", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFork_block_numberUndefined: Self = StObject.set(x, "fork_block_number", js.undefined)
        
        @scala.inline
        def setGasLimit(value: String | Double): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGasLimitUndefined: Self = StObject.set(x, "gasLimit", js.undefined)
        
        @scala.inline
        def setGasPrice(value: String): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
        
        @scala.inline
        def setHardfork(value: byzantium | constantinople | petersburg | istanbul | muirGlacier): Self = StObject.set(x, "hardfork", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHardforkUndefined: Self = StObject.set(x, "hardfork", js.undefined)
        
        @scala.inline
        def setHd_path(value: String): Self = StObject.set(x, "hd_path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHd_pathUndefined: Self = StObject.set(x, "hd_path", js.undefined)
        
        @scala.inline
        def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
        
        @scala.inline
        def setLogger(value: Log): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
        
        @scala.inline
        def setMnemonic(value: String): Self = StObject.set(x, "mnemonic", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMnemonicUndefined: Self = StObject.set(x, "mnemonic", js.undefined)
        
        @scala.inline
        def setNetworkId(value: Double): Self = StObject.set(x, "networkId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNetworkIdUndefined: Self = StObject.set(x, "networkId", js.undefined)
        
        @scala.inline
        def setNetwork_id(value: Double): Self = StObject.set(x, "network_id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNetwork_idUndefined: Self = StObject.set(x, "network_id", js.undefined)
        
        @scala.inline
        def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
        
        @scala.inline
        def setSeed(value: js.Any): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
        
        @scala.inline
        def setTime(value: Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
        
        @scala.inline
        def setTotal_accounts(value: Double): Self = StObject.set(x, "total_accounts", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTotal_accountsUndefined: Self = StObject.set(x, "total_accounts", js.undefined)
        
        @scala.inline
        def setUnlocked_accounts(value: js.Array[String]): Self = StObject.set(x, "unlocked_accounts", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnlocked_accountsUndefined: Self = StObject.set(x, "unlocked_accounts", js.undefined)
        
        @scala.inline
        def setUnlocked_accountsVarargs(value: String*): Self = StObject.set(x, "unlocked_accounts", js.Array(value :_*))
        
        @scala.inline
        def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
        
        @scala.inline
        def setVmErrorsOnRPCResponse(value: Boolean): Self = StObject.set(x, "vmErrorsOnRPCResponse", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVmErrorsOnRPCResponseUndefined: Self = StObject.set(x, "vmErrorsOnRPCResponse", js.undefined)
        
        @scala.inline
        def setWs(value: Boolean): Self = StObject.set(x, "ws", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWsUndefined: Self = StObject.set(x, "ws", js.undefined)
      }
    }
    
    @js.native
    trait IServerOptions extends IProviderOptions {
      
      var keepAliveTimeout: js.UndefOr[Double] = js.native
    }
    object IServerOptions {
      
      @scala.inline
      def apply(): IServerOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IServerOptions]
      }
      
      @scala.inline
      implicit class IServerOptionsMutableBuilder[Self <: IServerOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setKeepAliveTimeout(value: Double): Self = StObject.set(x, "keepAliveTimeout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeepAliveTimeoutUndefined: Self = StObject.set(x, "keepAliveTimeout", js.undefined)
      }
    }
    
    @js.native
    trait Provider extends StObject {
      
      def close(callback: js.Function): Unit = js.native
      
      def on(`type`: String, callback: js.Function0[Unit]): Unit = js.native
      
      def once(`type`: String, callback: js.Function0[Unit]): Unit = js.native
      
      def removeAllListeners(`type`: String): Unit = js.native
      
      def removeListener(`type`: String, callback: js.Function0[Unit]): Unit = js.native
      
      def send(
        payload: JsonRpcPayload,
        callback: js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit]
      ): Unit = js.native
    }
    object Provider {
      
      @scala.inline
      def apply(
        close: js.Function => Unit,
        on: (String, js.Function0[Unit]) => Unit,
        once: (String, js.Function0[Unit]) => Unit,
        removeAllListeners: String => Unit,
        removeListener: (String, js.Function0[Unit]) => Unit,
        send: (JsonRpcPayload, js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit]) => Unit
      ): Provider = {
        val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), removeAllListeners = js.Any.fromFunction1(removeAllListeners), removeListener = js.Any.fromFunction2(removeListener), send = js.Any.fromFunction2(send))
        __obj.asInstanceOf[Provider]
      }
      
      @scala.inline
      implicit class ProviderMutableBuilder[Self <: Provider] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClose(value: js.Function => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOn(value: (String, js.Function0[Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
        
        @scala.inline
        def setOnce(value: (String, js.Function0[Unit]) => Unit): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
        
        @scala.inline
        def setRemoveAllListeners(value: String => Unit): Self = StObject.set(x, "removeAllListeners", js.Any.fromFunction1(value))
        
        @scala.inline
        def setRemoveListener(value: (String, js.Function0[Unit]) => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
        
        @scala.inline
        def setSend(
          value: (JsonRpcPayload, js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit]) => Unit
        ): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
      }
    }
    
    @js.native
    trait Server
      extends typings.node.httpMod.Server {
      
      var provider: Provider = js.native
    }
  }
  
  @js.native
  trait JsonRpcPayload extends StObject {
    
    var id: js.UndefOr[String | Double] = js.native
    
    var jsonrpc: String = js.native
    
    var method: String = js.native
    
    var params: js.Array[_] = js.native
  }
  object JsonRpcPayload {
    
    @scala.inline
    def apply(jsonrpc: String, method: String, params: js.Array[_]): JsonRpcPayload = {
      val __obj = js.Dynamic.literal(jsonrpc = jsonrpc.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonRpcPayload]
    }
    
    @scala.inline
    implicit class JsonRpcPayloadMutableBuilder[Self <: JsonRpcPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: js.Array[_]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsVarargs(value: js.Any*): Self = StObject.set(x, "params", js.Array(value :_*))
    }
  }
  
  @js.native
  trait JsonRpcResponse extends StObject {
    
    var error: js.UndefOr[String] = js.native
    
    var id: Double = js.native
    
    var jsonrpc: String = js.native
    
    var result: js.UndefOr[js.Any] = js.native
  }
  object JsonRpcResponse {
    
    @scala.inline
    def apply(id: Double, jsonrpc: String): JsonRpcResponse = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonRpcResponse]
    }
    
    @scala.inline
    implicit class JsonRpcResponseMutableBuilder[Self <: JsonRpcResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
}
