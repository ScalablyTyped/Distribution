package typings.ethereumProtocol.mod

import typings.bignumberJs.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallTxDataBase extends StObject {
  
  var data: js.UndefOr[String] = js.native
  
  var gas: js.UndefOr[Double | String | default] = js.native
  
  var gasPrice: js.UndefOr[Double | String | default] = js.native
  
  var nonce: js.UndefOr[Double] = js.native
  
  var to: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[Double | String | default] = js.native
}
object CallTxDataBase {
  
  @scala.inline
  def apply(): CallTxDataBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallTxDataBase]
  }
  
  @scala.inline
  implicit class CallTxDataBaseMutableBuilder[Self <: CallTxDataBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setGas(value: Double | String | default): Self = StObject.set(x, "gas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGasPrice(value: Double | String | default): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
    
    @scala.inline
    def setGasUndefined: Self = StObject.set(x, "gas", js.undefined)
    
    @scala.inline
    def setNonce(value: Double): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    @scala.inline
    def setValue(value: Double | String | default): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
