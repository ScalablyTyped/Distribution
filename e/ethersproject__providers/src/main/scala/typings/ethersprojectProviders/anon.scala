package typings.ethersprojectProviders

import typings.ethersprojectBignumber.bignumberMod.BigNumberish
import typings.ethersprojectBignumber.mod.BigNumber
import typings.ethersprojectBytes.mod.BytesLike
import typings.ethersprojectProviders.ethersprojectProvidersStrings.`2Dot0`
import typings.ethersprojectTransactions.anon.Address
import typings.ethersprojectTransactions.mod.AccessListish
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BlockNumber extends StObject {
    
    var blockNumber: Double
    
    var reqTime: Double
    
    var respTime: Double
  }
  object BlockNumber {
    
    inline def apply(blockNumber: Double, reqTime: Double, respTime: Double): BlockNumber = {
      val __obj = js.Dynamic.literal(blockNumber = blockNumber.asInstanceOf[js.Any], reqTime = reqTime.asInstanceOf[js.Any], respTime = respTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockNumber]
    }
    
    extension [Self <: BlockNumber](x: Self) {
      
      inline def setBlockNumber(value: Double): Self = StObject.set(x, "blockNumber", value.asInstanceOf[js.Any])
      
      inline def setReqTime(value: Double): Self = StObject.set(x, "reqTime", value.asInstanceOf[js.Any])
      
      inline def setRespTime(value: Double): Self = StObject.set(x, "respTime", value.asInstanceOf[js.Any])
    }
  }
  
  trait Content extends StObject {
    
    var content: String
    
    var `type`: String
  }
  object Content {
    
    inline def apply(content: String, `type`: String): Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    extension [Self <: Content](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var data: String
    
    var from: String
    
    var nonce: Double
    
    var startBlock: Double
    
    var to: String
    
    var value: BigNumber
  }
  object Data {
    
    inline def apply(data: String, from: String, nonce: Double, startBlock: Double, to: String, value: BigNumber): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], startBlock = startBlock.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: Double): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setStartBlock(value: Double): Self = StObject.set(x, "startBlock", value.asInstanceOf[js.Any])
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setValue(value: BigNumber): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @ethersproject/properties.@ethersproject/properties.Deferrable<@ethersproject/abstract-provider.@ethersproject/abstract-provider.TransactionRequest> */
  trait DeferrableTransactionRequ extends StObject {
    
    var accessList: js.UndefOr[AccessListish | js.Promise[js.UndefOr[AccessListish]]] = js.undefined
    
    var ccipReadEnabled: js.UndefOr[Boolean | js.Promise[js.UndefOr[Boolean]]] = js.undefined
    
    var chainId: js.UndefOr[Double | js.Promise[js.UndefOr[Double]]] = js.undefined
    
    var customData: js.UndefOr[(Record[String, Any]) | (js.Promise[js.UndefOr[Record[String, Any]]])] = js.undefined
    
    var data: js.UndefOr[BytesLike | js.Promise[js.UndefOr[BytesLike]]] = js.undefined
    
    var from: js.UndefOr[String | js.Promise[js.UndefOr[String]]] = js.undefined
    
    var gasLimit: js.UndefOr[BigNumberish | js.Promise[js.UndefOr[BigNumberish]]] = js.undefined
    
    var gasPrice: js.UndefOr[BigNumberish | js.Promise[js.UndefOr[BigNumberish]]] = js.undefined
    
    var maxFeePerGas: js.UndefOr[BigNumberish | js.Promise[js.UndefOr[BigNumberish]]] = js.undefined
    
    var maxPriorityFeePerGas: js.UndefOr[BigNumberish | js.Promise[js.UndefOr[BigNumberish]]] = js.undefined
    
    var nonce: js.UndefOr[BigNumberish | js.Promise[js.UndefOr[BigNumberish]]] = js.undefined
    
    var to: js.UndefOr[String | js.Promise[js.UndefOr[String]]] = js.undefined
    
    var `type`: js.UndefOr[Double | js.Promise[js.UndefOr[Double]]] = js.undefined
    
    var value: js.UndefOr[BigNumberish | js.Promise[js.UndefOr[BigNumberish]]] = js.undefined
  }
  object DeferrableTransactionRequ {
    
    inline def apply(): DeferrableTransactionRequ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeferrableTransactionRequ]
    }
    
    extension [Self <: DeferrableTransactionRequ](x: Self) {
      
      inline def setAccessList(value: AccessListish | js.Promise[js.UndefOr[AccessListish]]): Self = StObject.set(x, "accessList", value.asInstanceOf[js.Any])
      
      inline def setAccessListUndefined: Self = StObject.set(x, "accessList", js.undefined)
      
      inline def setAccessListVarargs(value: (Address | (js.Tuple2[String, js.Array[String]]))*): Self = StObject.set(x, "accessList", js.Array(value*))
      
      inline def setCcipReadEnabled(value: Boolean | js.Promise[js.UndefOr[Boolean]]): Self = StObject.set(x, "ccipReadEnabled", value.asInstanceOf[js.Any])
      
      inline def setCcipReadEnabledUndefined: Self = StObject.set(x, "ccipReadEnabled", js.undefined)
      
      inline def setChainId(value: Double | js.Promise[js.UndefOr[Double]]): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      inline def setChainIdUndefined: Self = StObject.set(x, "chainId", js.undefined)
      
      inline def setCustomData(value: (Record[String, Any]) | (js.Promise[js.UndefOr[Record[String, Any]]])): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
      
      inline def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
      
      inline def setData(value: BytesLike | js.Promise[js.UndefOr[BytesLike]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFrom(value: String | js.Promise[js.UndefOr[String]]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setGasLimit(value: BigNumberish | js.Promise[js.UndefOr[BigNumberish]]): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
      
      inline def setGasLimitUndefined: Self = StObject.set(x, "gasLimit", js.undefined)
      
      inline def setGasPrice(value: BigNumberish | js.Promise[js.UndefOr[BigNumberish]]): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      inline def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
      
      inline def setMaxFeePerGas(value: BigNumberish | js.Promise[js.UndefOr[BigNumberish]]): Self = StObject.set(x, "maxFeePerGas", value.asInstanceOf[js.Any])
      
      inline def setMaxFeePerGasUndefined: Self = StObject.set(x, "maxFeePerGas", js.undefined)
      
      inline def setMaxPriorityFeePerGas(value: BigNumberish | js.Promise[js.UndefOr[BigNumberish]]): Self = StObject.set(x, "maxPriorityFeePerGas", value.asInstanceOf[js.Any])
      
      inline def setMaxPriorityFeePerGasUndefined: Self = StObject.set(x, "maxPriorityFeePerGas", js.undefined)
      
      inline def setNonce(value: BigNumberish | js.Promise[js.UndefOr[BigNumberish]]): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setTo(value: String | js.Promise[js.UndefOr[String]]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setType(value: Double | js.Promise[js.UndefOr[Double]]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: BigNumberish | js.Promise[js.UndefOr[BigNumberish]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Id extends StObject {
    
    var id: Double
    
    var jsonrpc: `2Dot0`
    
    var method: String
    
    var params: js.Array[Any]
  }
  object Id {
    
    inline def apply(id: Double, method: String, params: js.Array[Any]): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = "2.0", method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setJsonrpc(value: `2Dot0`): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setParams(value: js.Array[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsVarargs(value: Any*): Self = StObject.set(x, "params", js.Array(value*))
    }
  }
  
  trait Method extends StObject {
    
    var method: String
    
    var params: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object Method {
    
    inline def apply(method: String): Method = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[Method]
    }
    
    extension [Self <: Method](x: Self) {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setParams(value: js.Array[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setParamsVarargs(value: Any*): Self = StObject.set(x, "params", js.Array(value*))
    }
  }
  
  trait Reject extends StObject {
    
    def reject(error: js.Error): Unit
    
    var request: Id
    
    def resolve(result: Any): Unit
  }
  object Reject {
    
    inline def apply(reject: js.Error => Unit, request: Id, resolve: Any => Unit): Reject = {
      val __obj = js.Dynamic.literal(reject = js.Any.fromFunction1(reject), request = request.asInstanceOf[js.Any], resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[Reject]
    }
    
    extension [Self <: Reject](x: Self) {
      
      inline def setReject(value: js.Error => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
      
      inline def setRequest(value: Id): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResolve(value: Any => Unit): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
}
