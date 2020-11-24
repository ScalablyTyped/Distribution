package typings.ethereumjsTx.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TxData extends js.Object {
  
  /**
    * This will contain the data of the message or the init of a contract
    */
  var data: js.UndefOr[BufferLike] = js.native
  
  /**
    * The transaction's gas limit.
    */
  var gasLimit: js.UndefOr[BufferLike] = js.native
  
  /**
    * The transaction's gas price.
    */
  var gasPrice: js.UndefOr[BufferLike] = js.native
  
  /**
    * The transaction's nonce.
    */
  var nonce: js.UndefOr[BufferLike] = js.native
  
  /**
    * EC signature parameter.
    */
  var r: js.UndefOr[BufferLike] = js.native
  
  /**
    * EC signature parameter.
    */
  var s: js.UndefOr[BufferLike] = js.native
  
  /**
    * The transaction's the address is sent to.
    */
  var to: js.UndefOr[BufferLike] = js.native
  
  /**
    * EC recovery ID.
    */
  var v: js.UndefOr[BufferLike] = js.native
  
  /**
    * The amount of Ether sent.
    */
  var value: js.UndefOr[BufferLike] = js.native
}
object TxData {
  
  @scala.inline
  def apply(): TxData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TxData]
  }
  
  @scala.inline
  implicit class TxDataOps[Self <: TxData] (val x: Self) extends AnyVal {
    
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
    def setData(value: BufferLike): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setGasLimit(value: BufferLike): Self = this.set("gasLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGasLimit: Self = this.set("gasLimit", js.undefined)
    
    @scala.inline
    def setGasPrice(value: BufferLike): Self = this.set("gasPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGasPrice: Self = this.set("gasPrice", js.undefined)
    
    @scala.inline
    def setNonce(value: BufferLike): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    
    @scala.inline
    def setR(value: BufferLike): Self = this.set("r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteR: Self = this.set("r", js.undefined)
    
    @scala.inline
    def setS(value: BufferLike): Self = this.set("s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS: Self = this.set("s", js.undefined)
    
    @scala.inline
    def setTo(value: BufferLike): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    
    @scala.inline
    def setV(value: BufferLike): Self = this.set("v", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteV: Self = this.set("v", js.undefined)
    
    @scala.inline
    def setValue(value: BufferLike): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
