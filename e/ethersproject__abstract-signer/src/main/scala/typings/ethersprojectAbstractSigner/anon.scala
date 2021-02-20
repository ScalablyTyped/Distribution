package typings.ethersprojectAbstractSigner

import typings.ethersprojectBignumber.bignumberMod.BigNumberish
import typings.ethersprojectBytes.mod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined @ethersproject/properties.@ethersproject/properties.Deferrable<@ethersproject/abstract-provider.@ethersproject/abstract-provider.TransactionRequest> */
  @js.native
  trait DeferrableTransactionRequ extends StObject {
    
    var chainId: js.UndefOr[Double | js.Promise[js.UndefOr[Double]]] = js.native
    
    var data: js.UndefOr[BytesLike | js.Promise[js.UndefOr[BytesLike]]] = js.native
    
    var from: js.UndefOr[String | js.Promise[js.UndefOr[String]]] = js.native
    
    var gasLimit: js.UndefOr[BigNumberish | js.Promise[js.UndefOr[BigNumberish]]] = js.native
    
    var gasPrice: js.UndefOr[BigNumberish | js.Promise[js.UndefOr[BigNumberish]]] = js.native
    
    var nonce: js.UndefOr[BigNumberish | js.Promise[js.UndefOr[BigNumberish]]] = js.native
    
    var to: js.UndefOr[String | js.Promise[js.UndefOr[String]]] = js.native
    
    var value: js.UndefOr[BigNumberish | js.Promise[js.UndefOr[BigNumberish]]] = js.native
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
}
