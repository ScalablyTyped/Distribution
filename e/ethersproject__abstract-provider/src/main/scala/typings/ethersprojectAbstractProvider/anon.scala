package typings.ethersprojectAbstractProvider

import typings.ethersprojectBignumber.libBignumberMod.BigNumberish
import typings.ethersprojectBytes.mod.BytesLike
import typings.ethersprojectTransactions.anon.Address
import typings.ethersprojectTransactions.mod.AccessListish
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
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
}
