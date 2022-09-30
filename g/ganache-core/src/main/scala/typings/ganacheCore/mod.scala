package typings.ganacheCore

import org.scalablytyped.runtime.Instantiable1
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
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.nodeNetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("ganache-core", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def provider(): Provider = ^.asInstanceOf[js.Dynamic].applyDynamic("provider")().asInstanceOf[Provider]
    inline def provider(opts: IProviderOptions): Provider = ^.asInstanceOf[js.Dynamic].applyDynamic("provider")(opts.asInstanceOf[js.Any]).asInstanceOf[Provider]
    
    inline def server(): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("server")().asInstanceOf[Server]
    inline def server(opts: IServerOptions): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("server")(opts.asInstanceOf[js.Any]).asInstanceOf[Server]
  }
  
  object Ganache {
    
    trait IProviderOptions extends StObject {
      
      var account_keys_path: js.UndefOr[String] = js.undefined
      
      var accounts: js.UndefOr[js.Array[js.Object]] = js.undefined
      
      var allowUnlimitedContractSize: js.UndefOr[Boolean] = js.undefined
      
      var blockTime: js.UndefOr[Double] = js.undefined
      
      var db_path: js.UndefOr[String] = js.undefined
      
      var debug: js.UndefOr[Boolean] = js.undefined
      
      var default_balance_ether: js.UndefOr[Double] = js.undefined
      
      var fork: js.UndefOr[String | js.Object] = js.undefined
      
      var forkCacheSize: js.UndefOr[Double] = js.undefined
      
      var fork_block_number: js.UndefOr[String | Double] = js.undefined
      
      var gasLimit: js.UndefOr[String | Double] = js.undefined
      
      var gasPrice: js.UndefOr[String] = js.undefined
      
      var hardfork: js.UndefOr[byzantium | constantinople | petersburg | istanbul | muirGlacier] = js.undefined
      
      var hd_path: js.UndefOr[String] = js.undefined
      
      var locked: js.UndefOr[Boolean] = js.undefined
      
      var logger: js.UndefOr[Log] = js.undefined
      
      var mnemonic: js.UndefOr[String] = js.undefined
      
      var networkId: js.UndefOr[Double] = js.undefined
      
      var network_id: js.UndefOr[Double] = js.undefined
      
      var port: js.UndefOr[Double] = js.undefined
      
      var seed: js.UndefOr[Any] = js.undefined
      
      var time: js.UndefOr[js.Date] = js.undefined
      
      var total_accounts: js.UndefOr[Double] = js.undefined
      
      var unlocked_accounts: js.UndefOr[js.Array[String]] = js.undefined
      
      var verbose: js.UndefOr[Boolean] = js.undefined
      
      var vmErrorsOnRPCResponse: js.UndefOr[Boolean] = js.undefined
      
      var ws: js.UndefOr[Boolean] = js.undefined
    }
    object IProviderOptions {
      
      inline def apply(): IProviderOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IProviderOptions]
      }
      
      extension [Self <: IProviderOptions](x: Self) {
        
        inline def setAccount_keys_path(value: String): Self = StObject.set(x, "account_keys_path", value.asInstanceOf[js.Any])
        
        inline def setAccount_keys_pathUndefined: Self = StObject.set(x, "account_keys_path", js.undefined)
        
        inline def setAccounts(value: js.Array[js.Object]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
        
        inline def setAccountsUndefined: Self = StObject.set(x, "accounts", js.undefined)
        
        inline def setAccountsVarargs(value: js.Object*): Self = StObject.set(x, "accounts", js.Array(value*))
        
        inline def setAllowUnlimitedContractSize(value: Boolean): Self = StObject.set(x, "allowUnlimitedContractSize", value.asInstanceOf[js.Any])
        
        inline def setAllowUnlimitedContractSizeUndefined: Self = StObject.set(x, "allowUnlimitedContractSize", js.undefined)
        
        inline def setBlockTime(value: Double): Self = StObject.set(x, "blockTime", value.asInstanceOf[js.Any])
        
        inline def setBlockTimeUndefined: Self = StObject.set(x, "blockTime", js.undefined)
        
        inline def setDb_path(value: String): Self = StObject.set(x, "db_path", value.asInstanceOf[js.Any])
        
        inline def setDb_pathUndefined: Self = StObject.set(x, "db_path", js.undefined)
        
        inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
        
        inline def setDefault_balance_ether(value: Double): Self = StObject.set(x, "default_balance_ether", value.asInstanceOf[js.Any])
        
        inline def setDefault_balance_etherUndefined: Self = StObject.set(x, "default_balance_ether", js.undefined)
        
        inline def setFork(value: String | js.Object): Self = StObject.set(x, "fork", value.asInstanceOf[js.Any])
        
        inline def setForkCacheSize(value: Double): Self = StObject.set(x, "forkCacheSize", value.asInstanceOf[js.Any])
        
        inline def setForkCacheSizeUndefined: Self = StObject.set(x, "forkCacheSize", js.undefined)
        
        inline def setForkUndefined: Self = StObject.set(x, "fork", js.undefined)
        
        inline def setFork_block_number(value: String | Double): Self = StObject.set(x, "fork_block_number", value.asInstanceOf[js.Any])
        
        inline def setFork_block_numberUndefined: Self = StObject.set(x, "fork_block_number", js.undefined)
        
        inline def setGasLimit(value: String | Double): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
        
        inline def setGasLimitUndefined: Self = StObject.set(x, "gasLimit", js.undefined)
        
        inline def setGasPrice(value: String): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
        
        inline def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
        
        inline def setHardfork(value: byzantium | constantinople | petersburg | istanbul | muirGlacier): Self = StObject.set(x, "hardfork", value.asInstanceOf[js.Any])
        
        inline def setHardforkUndefined: Self = StObject.set(x, "hardfork", js.undefined)
        
        inline def setHd_path(value: String): Self = StObject.set(x, "hd_path", value.asInstanceOf[js.Any])
        
        inline def setHd_pathUndefined: Self = StObject.set(x, "hd_path", js.undefined)
        
        inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
        
        inline def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
        
        inline def setLogger(value: Log): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
        
        inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
        
        inline def setMnemonic(value: String): Self = StObject.set(x, "mnemonic", value.asInstanceOf[js.Any])
        
        inline def setMnemonicUndefined: Self = StObject.set(x, "mnemonic", js.undefined)
        
        inline def setNetworkId(value: Double): Self = StObject.set(x, "networkId", value.asInstanceOf[js.Any])
        
        inline def setNetworkIdUndefined: Self = StObject.set(x, "networkId", js.undefined)
        
        inline def setNetwork_id(value: Double): Self = StObject.set(x, "network_id", value.asInstanceOf[js.Any])
        
        inline def setNetwork_idUndefined: Self = StObject.set(x, "network_id", js.undefined)
        
        inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
        
        inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
        
        inline def setSeed(value: Any): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
        
        inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
        
        inline def setTime(value: js.Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
        
        inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
        
        inline def setTotal_accounts(value: Double): Self = StObject.set(x, "total_accounts", value.asInstanceOf[js.Any])
        
        inline def setTotal_accountsUndefined: Self = StObject.set(x, "total_accounts", js.undefined)
        
        inline def setUnlocked_accounts(value: js.Array[String]): Self = StObject.set(x, "unlocked_accounts", value.asInstanceOf[js.Any])
        
        inline def setUnlocked_accountsUndefined: Self = StObject.set(x, "unlocked_accounts", js.undefined)
        
        inline def setUnlocked_accountsVarargs(value: String*): Self = StObject.set(x, "unlocked_accounts", js.Array(value*))
        
        inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
        
        inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
        
        inline def setVmErrorsOnRPCResponse(value: Boolean): Self = StObject.set(x, "vmErrorsOnRPCResponse", value.asInstanceOf[js.Any])
        
        inline def setVmErrorsOnRPCResponseUndefined: Self = StObject.set(x, "vmErrorsOnRPCResponse", js.undefined)
        
        inline def setWs(value: Boolean): Self = StObject.set(x, "ws", value.asInstanceOf[js.Any])
        
        inline def setWsUndefined: Self = StObject.set(x, "ws", js.undefined)
      }
    }
    
    trait IServerOptions
      extends StObject
         with IProviderOptions {
      
      var keepAliveTimeout: js.UndefOr[Double] = js.undefined
    }
    object IServerOptions {
      
      inline def apply(): IServerOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IServerOptions]
      }
      
      extension [Self <: IServerOptions](x: Self) {
        
        inline def setKeepAliveTimeout(value: Double): Self = StObject.set(x, "keepAliveTimeout", value.asInstanceOf[js.Any])
        
        inline def setKeepAliveTimeoutUndefined: Self = StObject.set(x, "keepAliveTimeout", js.undefined)
      }
    }
    
    trait Provider extends StObject {
      
      def close(callback: js.Function): Unit
      
      def on(`type`: String, callback: js.Function0[Unit]): Unit
      
      def once(`type`: String, callback: js.Function0[Unit]): Unit
      
      def removeAllListeners(`type`: String): Unit
      
      def removeListener(`type`: String, callback: js.Function0[Unit]): Unit
      
      def send(
        payload: JsonRpcPayload,
        callback: js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit]
      ): Unit
    }
    object Provider {
      
      inline def apply(
        close: js.Function => Unit,
        on: (String, js.Function0[Unit]) => Unit,
        once: (String, js.Function0[Unit]) => Unit,
        removeAllListeners: String => Unit,
        removeListener: (String, js.Function0[Unit]) => Unit,
        send: (JsonRpcPayload, js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit]) => Unit
      ): Provider = {
        val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), removeAllListeners = js.Any.fromFunction1(removeAllListeners), removeListener = js.Any.fromFunction2(removeListener), send = js.Any.fromFunction2(send))
        __obj.asInstanceOf[Provider]
      }
      
      extension [Self <: Provider](x: Self) {
        
        inline def setClose(value: js.Function => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
        
        inline def setOn(value: (String, js.Function0[Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
        
        inline def setOnce(value: (String, js.Function0[Unit]) => Unit): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
        
        inline def setRemoveAllListeners(value: String => Unit): Self = StObject.set(x, "removeAllListeners", js.Any.fromFunction1(value))
        
        inline def setRemoveListener(value: (String, js.Function0[Unit]) => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
        
        inline def setSend(
          value: (JsonRpcPayload, js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit]) => Unit
        ): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
      }
    }
    
    @js.native
    trait Server
      extends typings.node.httpMod.Server[
              Instantiable1[/* socket */ Socket, IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                ServerResponse[IncomingMessage]
              ]
            ] {
      
      var provider: Provider = js.native
    }
  }
  
  trait JsonRpcPayload extends StObject {
    
    var id: js.UndefOr[String | Double] = js.undefined
    
    var jsonrpc: String
    
    var method: String
    
    var params: js.Array[Any]
  }
  object JsonRpcPayload {
    
    inline def apply(jsonrpc: String, method: String, params: js.Array[Any]): JsonRpcPayload = {
      val __obj = js.Dynamic.literal(jsonrpc = jsonrpc.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonRpcPayload]
    }
    
    extension [Self <: JsonRpcPayload](x: Self) {
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setParams(value: js.Array[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsVarargs(value: Any*): Self = StObject.set(x, "params", js.Array(value*))
    }
  }
  
  trait JsonRpcResponse extends StObject {
    
    var error: js.UndefOr[String] = js.undefined
    
    var id: Double
    
    var jsonrpc: String
    
    var result: js.UndefOr[Any] = js.undefined
  }
  object JsonRpcResponse {
    
    inline def apply(id: Double, jsonrpc: String): JsonRpcResponse = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonRpcResponse]
    }
    
    extension [Self <: JsonRpcResponse](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
}
