package typings.ethereumProtocol.mod

import typings.bignumberJs.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallTxDataBase extends StObject {
  
  var data: js.UndefOr[String] = js.undefined
  
  var gas: js.UndefOr[Double | String | default] = js.undefined
  
  var gasPrice: js.UndefOr[Double | String | default] = js.undefined
  
  var nonce: js.UndefOr[Double] = js.undefined
  
  var to: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[Double | String | default] = js.undefined
}
object CallTxDataBase {
  
  inline def apply(): CallTxDataBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallTxDataBase]
  }
  
  extension [Self <: CallTxDataBase](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setGas(value: Double | String | default): Self = StObject.set(x, "gas", value.asInstanceOf[js.Any])
    
    inline def setGasPrice(value: Double | String | default): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
    
    inline def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
    
    inline def setGasUndefined: Self = StObject.set(x, "gas", js.undefined)
    
    inline def setNonce(value: Double): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setValue(value: Double | String | default): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
