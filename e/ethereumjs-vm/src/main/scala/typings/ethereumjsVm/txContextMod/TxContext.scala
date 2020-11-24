package typings.ethereumjsVm.txContextMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TxContext extends js.Object {
  
  var gasPrice: Buffer = js.native
  
  var origin: Buffer = js.native
}
object TxContext {
  
  @scala.inline
  def apply(gasPrice: Buffer, origin: Buffer): TxContext = {
    val __obj = js.Dynamic.literal(gasPrice = gasPrice.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[TxContext]
  }
  
  @scala.inline
  implicit class TxContextOps[Self <: TxContext] (val x: Self) extends AnyVal {
    
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
    def setGasPrice(value: Buffer): Self = this.set("gasPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: Buffer): Self = this.set("origin", value.asInstanceOf[js.Any])
  }
}
