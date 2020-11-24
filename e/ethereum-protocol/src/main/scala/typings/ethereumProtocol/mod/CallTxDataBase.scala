package typings.ethereumProtocol.mod

import typings.bignumberJs.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallTxDataBase extends js.Object {
  
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
  implicit class CallTxDataBaseOps[Self <: CallTxDataBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setGas(value: Double | String | default): Self = this.set("gas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGas: Self = this.set("gas", js.undefined)
    
    @scala.inline
    def setGasPrice(value: Double | String | default): Self = this.set("gasPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGasPrice: Self = this.set("gasPrice", js.undefined)
    
    @scala.inline
    def setNonce(value: Double): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    
    @scala.inline
    def setValue(value: Double | String | default): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
