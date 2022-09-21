package typings.ethRpcErrors

import typings.ethRpcErrors.classesMod.EthereumProviderError
import typings.ethRpcErrors.classesMod.EthereumRpcError
import typings.ethRpcErrors.classesMod.SerializedEthereumRpcError
import typings.ethRpcErrors.errorsMod.CustomErrorArg
import typings.ethRpcErrors.errorsMod.EthereumErrorOptions
import typings.ethRpcErrors.errorsMod.ServerErrorOptions
import typings.ethRpcErrors.ethRpcErrorsNumbers.`-32000`
import typings.ethRpcErrors.ethRpcErrorsNumbers.`-32001`
import typings.ethRpcErrors.ethRpcErrorsNumbers.`-32002`
import typings.ethRpcErrors.ethRpcErrorsNumbers.`-32003`
import typings.ethRpcErrors.ethRpcErrorsNumbers.`-32004`
import typings.ethRpcErrors.ethRpcErrorsNumbers.`-32005`
import typings.ethRpcErrors.ethRpcErrorsNumbers.`-32600`
import typings.ethRpcErrors.ethRpcErrorsNumbers.`-32601`
import typings.ethRpcErrors.ethRpcErrorsNumbers.`-32602`
import typings.ethRpcErrors.ethRpcErrorsNumbers.`-32603`
import typings.ethRpcErrors.ethRpcErrorsNumbers.`-32700`
import typings.ethRpcErrors.ethRpcErrorsNumbers.`4001`
import typings.ethRpcErrors.ethRpcErrorsNumbers.`4100`
import typings.ethRpcErrors.ethRpcErrorsNumbers.`4200`
import typings.ethRpcErrors.ethRpcErrorsNumbers.`4900`
import typings.ethRpcErrors.ethRpcErrorsNumbers.`4901`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ChainDisconnected extends StObject {
    
    val chainDisconnected: `4901`
    
    val disconnected: `4900`
    
    val unauthorized: `4100`
    
    val unsupportedMethod: `4200`
    
    val userRejectedRequest: `4001`
  }
  object ChainDisconnected {
    
    inline def apply(): ChainDisconnected = {
      val __obj = js.Dynamic.literal(chainDisconnected = 4901, disconnected = 4900, unauthorized = 4100, unsupportedMethod = 4200, userRejectedRequest = 4001)
      __obj.asInstanceOf[ChainDisconnected]
    }
    
    extension [Self <: ChainDisconnected](x: Self) {
      
      inline def setChainDisconnected(value: `4901`): Self = StObject.set(x, "chainDisconnected", value.asInstanceOf[js.Any])
      
      inline def setDisconnected(value: `4900`): Self = StObject.set(x, "disconnected", value.asInstanceOf[js.Any])
      
      inline def setUnauthorized(value: `4100`): Self = StObject.set(x, "unauthorized", value.asInstanceOf[js.Any])
      
      inline def setUnsupportedMethod(value: `4200`): Self = StObject.set(x, "unsupportedMethod", value.asInstanceOf[js.Any])
      
      inline def setUserRejectedRequest(value: `4001`): Self = StObject.set(x, "userRejectedRequest", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Custom extends StObject {
    
    /**
      * Get an Ethereum Provider Chain Not Connected (4901) error.
      */
    def chainDisconnected[T_16](): EthereumProviderError[T_16] = js.native
    def chainDisconnected[T_16](arg: String): EthereumProviderError[T_16] = js.native
    def chainDisconnected[T_16](arg: EthereumErrorOptions[T_16]): EthereumProviderError[T_16] = js.native
    
    /**
      * Get a custom Ethereum Provider error.
      */
    def custom[T_17](opts: CustomErrorArg[T_17]): EthereumProviderError[T_17] = js.native
    
    /**
      * Get an Ethereum Provider Not Connected (4900) error.
      */
    def disconnected[T_15](): EthereumProviderError[T_15] = js.native
    def disconnected[T_15](arg: String): EthereumProviderError[T_15] = js.native
    def disconnected[T_15](arg: EthereumErrorOptions[T_15]): EthereumProviderError[T_15] = js.native
    
    /**
      * Get an Ethereum Provider Unauthorized (4100) error.
      */
    def unauthorized[T_13](): EthereumProviderError[T_13] = js.native
    def unauthorized[T_13](arg: String): EthereumProviderError[T_13] = js.native
    def unauthorized[T_13](arg: EthereumErrorOptions[T_13]): EthereumProviderError[T_13] = js.native
    
    /**
      * Get an Ethereum Provider Unsupported Method (4200) error.
      */
    def unsupportedMethod[T_14](): EthereumProviderError[T_14] = js.native
    def unsupportedMethod[T_14](arg: String): EthereumProviderError[T_14] = js.native
    def unsupportedMethod[T_14](arg: EthereumErrorOptions[T_14]): EthereumProviderError[T_14] = js.native
    
    /**
      * Get an Ethereum Provider User Rejected Request (4001) error.
      */
    def userRejectedRequest[T_12](): EthereumProviderError[T_12] = js.native
    def userRejectedRequest[T_12](arg: String): EthereumProviderError[T_12] = js.native
    def userRejectedRequest[T_12](arg: EthereumErrorOptions[T_12]): EthereumProviderError[T_12] = js.native
  }
  
  trait FallbackError extends StObject {
    
    var fallbackError: js.UndefOr[SerializedEthereumRpcError] = js.undefined
    
    var shouldIncludeStack: js.UndefOr[Boolean] = js.undefined
  }
  object FallbackError {
    
    inline def apply(): FallbackError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FallbackError]
    }
    
    extension [Self <: FallbackError](x: Self) {
      
      inline def setFallbackError(value: SerializedEthereumRpcError): Self = StObject.set(x, "fallbackError", value.asInstanceOf[js.Any])
      
      inline def setFallbackErrorUndefined: Self = StObject.set(x, "fallbackError", js.undefined)
      
      inline def setShouldIncludeStack(value: Boolean): Self = StObject.set(x, "shouldIncludeStack", value.asInstanceOf[js.Any])
      
      inline def setShouldIncludeStackUndefined: Self = StObject.set(x, "shouldIncludeStack", js.undefined)
    }
  }
  
  trait Internal extends StObject {
    
    val internal: `-32603`
    
    val invalidInput: `-32000`
    
    val invalidParams: `-32602`
    
    val invalidRequest: `-32600`
    
    val limitExceeded: `-32005`
    
    val methodNotFound: `-32601`
    
    val methodNotSupported: `-32004`
    
    val parse: `-32700`
    
    val resourceNotFound: `-32001`
    
    val resourceUnavailable: `-32002`
    
    val transactionRejected: `-32003`
  }
  object Internal {
    
    inline def apply(): Internal = {
      val __obj = js.Dynamic.literal(internal = -32603, invalidInput = -32000, invalidParams = -32602, invalidRequest = -32600, limitExceeded = -32005, methodNotFound = -32601, methodNotSupported = -32004, parse = -32700, resourceNotFound = -32001, resourceUnavailable = -32002, transactionRejected = -32003)
      __obj.asInstanceOf[Internal]
    }
    
    extension [Self <: Internal](x: Self) {
      
      inline def setInternal(value: `-32603`): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
      
      inline def setInvalidInput(value: `-32000`): Self = StObject.set(x, "invalidInput", value.asInstanceOf[js.Any])
      
      inline def setInvalidParams(value: `-32602`): Self = StObject.set(x, "invalidParams", value.asInstanceOf[js.Any])
      
      inline def setInvalidRequest(value: `-32600`): Self = StObject.set(x, "invalidRequest", value.asInstanceOf[js.Any])
      
      inline def setLimitExceeded(value: `-32005`): Self = StObject.set(x, "limitExceeded", value.asInstanceOf[js.Any])
      
      inline def setMethodNotFound(value: `-32601`): Self = StObject.set(x, "methodNotFound", value.asInstanceOf[js.Any])
      
      inline def setMethodNotSupported(value: `-32004`): Self = StObject.set(x, "methodNotSupported", value.asInstanceOf[js.Any])
      
      inline def setParse(value: `-32700`): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      inline def setResourceNotFound(value: `-32001`): Self = StObject.set(x, "resourceNotFound", value.asInstanceOf[js.Any])
      
      inline def setResourceUnavailable(value: `-32002`): Self = StObject.set(x, "resourceUnavailable", value.asInstanceOf[js.Any])
      
      inline def setTransactionRejected(value: `-32003`): Self = StObject.set(x, "transactionRejected", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InvalidInput extends StObject {
    
    /**
      * Get a JSON RPC 2.0 Internal (-32603) error.
      */
    def internal[T_4](): EthereumRpcError[T_4] = js.native
    def internal[T_4](arg: String): EthereumRpcError[T_4] = js.native
    def internal[T_4](arg: EthereumErrorOptions[T_4]): EthereumRpcError[T_4] = js.native
    
    /**
      * Get an Ethereum JSON RPC Invalid Input (-32000) error.
      */
    def invalidInput[T_6](): EthereumRpcError[T_6] = js.native
    def invalidInput[T_6](arg: String): EthereumRpcError[T_6] = js.native
    def invalidInput[T_6](arg: EthereumErrorOptions[T_6]): EthereumRpcError[T_6] = js.native
    
    /**
      * Get a JSON RPC 2.0 Invalid Params (-32602) error.
      */
    def invalidParams[T_2](): EthereumRpcError[T_2] = js.native
    def invalidParams[T_2](arg: String): EthereumRpcError[T_2] = js.native
    def invalidParams[T_2](arg: EthereumErrorOptions[T_2]): EthereumRpcError[T_2] = js.native
    
    /**
      * Get a JSON RPC 2.0 Invalid Request (-32600) error.
      */
    def invalidRequest[T_1](): EthereumRpcError[T_1] = js.native
    def invalidRequest[T_1](arg: String): EthereumRpcError[T_1] = js.native
    def invalidRequest[T_1](arg: EthereumErrorOptions[T_1]): EthereumRpcError[T_1] = js.native
    
    /**
      * Get an Ethereum JSON RPC Limit Exceeded (-32005) error.
      */
    def limitExceeded[T_11](): EthereumRpcError[T_11] = js.native
    def limitExceeded[T_11](arg: String): EthereumRpcError[T_11] = js.native
    def limitExceeded[T_11](arg: EthereumErrorOptions[T_11]): EthereumRpcError[T_11] = js.native
    
    /**
      * Get a JSON RPC 2.0 Method Not Found (-32601) error.
      */
    def methodNotFound[T_3](): EthereumRpcError[T_3] = js.native
    def methodNotFound[T_3](arg: String): EthereumRpcError[T_3] = js.native
    def methodNotFound[T_3](arg: EthereumErrorOptions[T_3]): EthereumRpcError[T_3] = js.native
    
    /**
      * Get an Ethereum JSON RPC Method Not Supported (-32004) error.
      */
    def methodNotSupported[T_10](): EthereumRpcError[T_10] = js.native
    def methodNotSupported[T_10](arg: String): EthereumRpcError[T_10] = js.native
    def methodNotSupported[T_10](arg: EthereumErrorOptions[T_10]): EthereumRpcError[T_10] = js.native
    
    /**
      * Get a JSON RPC 2.0 Parse (-32700) error.
      */
    def parse[T](): EthereumRpcError[T] = js.native
    def parse[T](arg: String): EthereumRpcError[T] = js.native
    def parse[T](arg: EthereumErrorOptions[T]): EthereumRpcError[T] = js.native
    
    /**
      * Get an Ethereum JSON RPC Resource Not Found (-32001) error.
      */
    def resourceNotFound[T_7](): EthereumRpcError[T_7] = js.native
    def resourceNotFound[T_7](arg: String): EthereumRpcError[T_7] = js.native
    def resourceNotFound[T_7](arg: EthereumErrorOptions[T_7]): EthereumRpcError[T_7] = js.native
    
    /**
      * Get an Ethereum JSON RPC Resource Unavailable (-32002) error.
      */
    def resourceUnavailable[T_8](): EthereumRpcError[T_8] = js.native
    def resourceUnavailable[T_8](arg: String): EthereumRpcError[T_8] = js.native
    def resourceUnavailable[T_8](arg: EthereumErrorOptions[T_8]): EthereumRpcError[T_8] = js.native
    
    /**
      * Get a JSON RPC 2.0 Server error.
      * Permits integer error codes in the [ -32099 <= -32005 ] range.
      * Codes -32000 through -32004 are reserved by EIP-1474.
      */
    def server[T_5](opts: ServerErrorOptions[T_5]): EthereumRpcError[T_5] = js.native
    
    /**
      * Get an Ethereum JSON RPC Transaction Rejected (-32003) error.
      */
    def transactionRejected[T_9](): EthereumRpcError[T_9] = js.native
    def transactionRejected[T_9](arg: String): EthereumRpcError[T_9] = js.native
    def transactionRejected[T_9](arg: EthereumErrorOptions[T_9]): EthereumRpcError[T_9] = js.native
  }
  
  trait Message extends StObject {
    
    var message: String
    
    var standard: String
  }
  object Message {
    
    inline def apply(message: String, standard: String): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStandard(value: String): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    }
  }
}
