package typings.ethersprojectProviders

import typings.ethersprojectBignumber.bignumberMod.BigNumberish
import typings.ethersprojectBytes.mod.BytesLike
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
    
    @scala.inline
    def apply(blockNumber: Double, reqTime: Double, respTime: Double): BlockNumber = {
      val __obj = js.Dynamic.literal(blockNumber = blockNumber.asInstanceOf[js.Any], reqTime = reqTime.asInstanceOf[js.Any], respTime = respTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockNumber]
    }
    
    @scala.inline
    implicit class BlockNumberMutableBuilder[Self <: BlockNumber] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockNumber(value: Double): Self = StObject.set(x, "blockNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReqTime(value: Double): Self = StObject.set(x, "reqTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRespTime(value: Double): Self = StObject.set(x, "respTime", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @ethersproject/properties.@ethersproject/properties.Deferrable<@ethersproject/abstract-provider.@ethersproject/abstract-provider.TransactionRequest> */
  trait DeferrableTransactionRequ extends StObject {
    
    var chainId: js.UndefOr[Double | js.Promise[js.UndefOr[Double]]] = js.undefined
    
    var data: js.UndefOr[BytesLike | js.Promise[js.UndefOr[BytesLike]]] = js.undefined
    
    var from: js.UndefOr[String | js.Promise[js.UndefOr[String]]] = js.undefined
    
    var gasLimit: js.UndefOr[BigNumberish | js.Promise[js.UndefOr[BigNumberish]]] = js.undefined
    
    var gasPrice: js.UndefOr[BigNumberish | js.Promise[js.UndefOr[BigNumberish]]] = js.undefined
    
    var nonce: js.UndefOr[BigNumberish | js.Promise[js.UndefOr[BigNumberish]]] = js.undefined
    
    var to: js.UndefOr[String | js.Promise[js.UndefOr[String]]] = js.undefined
    
    var value: js.UndefOr[BigNumberish | js.Promise[js.UndefOr[BigNumberish]]] = js.undefined
  }
  object DeferrableTransactionRequ {
    
    @scala.inline
    def apply(): DeferrableTransactionRequ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeferrableTransactionRequ]
    }
    
    @scala.inline
    implicit class DeferrableTransactionRequMutableBuilder[Self <: DeferrableTransactionRequ] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChainId(value: Double | js.Promise[js.UndefOr[Double]]): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChainIdUndefined: Self = StObject.set(x, "chainId", js.undefined)
      
      @scala.inline
      def setData(value: BytesLike | js.Promise[js.UndefOr[BytesLike]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setFrom(value: String | js.Promise[js.UndefOr[String]]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setGasLimit(value: BigNumberish | js.Promise[js.UndefOr[BigNumberish]]): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasLimitUndefined: Self = StObject.set(x, "gasLimit", js.undefined)
      
      @scala.inline
      def setGasPrice(value: BigNumberish | js.Promise[js.UndefOr[BigNumberish]]): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
      
      @scala.inline
      def setNonce(value: BigNumberish | js.Promise[js.UndefOr[BigNumberish]]): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      @scala.inline
      def setTo(value: String | js.Promise[js.UndefOr[String]]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      @scala.inline
      def setValue(value: BigNumberish | js.Promise[js.UndefOr[BigNumberish]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Method extends StObject {
    
    var method: String
    
    var params: js.UndefOr[js.Array[js.Any]] = js.undefined
  }
  object Method {
    
    @scala.inline
    def apply(method: String): Method = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[Method]
    }
    
    @scala.inline
    implicit class MethodMutableBuilder[Self <: Method] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: js.Array[js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setParamsVarargs(value: js.Any*): Self = StObject.set(x, "params", js.Array(value :_*))
    }
  }
}
