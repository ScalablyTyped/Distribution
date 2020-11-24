package typings.ethersprojectContracts.mod

import typings.ethersprojectBignumber.bignumberMod.BigNumberish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Overrides extends js.Object {
  
  var gasLimit: js.UndefOr[BigNumberish | js.Promise[BigNumberish]] = js.native
  
  var gasPrice: js.UndefOr[BigNumberish | js.Promise[BigNumberish]] = js.native
  
  var nonce: js.UndefOr[BigNumberish | js.Promise[BigNumberish]] = js.native
}
object Overrides {
  
  @scala.inline
  def apply(): Overrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Overrides]
  }
  
  @scala.inline
  implicit class OverridesOps[Self <: Overrides] (val x: Self) extends AnyVal {
    
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
    def setGasLimit(value: BigNumberish | js.Promise[BigNumberish]): Self = this.set("gasLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGasLimit: Self = this.set("gasLimit", js.undefined)
    
    @scala.inline
    def setGasPrice(value: BigNumberish | js.Promise[BigNumberish]): Self = this.set("gasPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGasPrice: Self = this.set("gasPrice", js.undefined)
    
    @scala.inline
    def setNonce(value: BigNumberish | js.Promise[BigNumberish]): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
  }
}
