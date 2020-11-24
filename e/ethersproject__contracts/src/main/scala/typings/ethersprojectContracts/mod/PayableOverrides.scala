package typings.ethersprojectContracts.mod

import typings.ethersprojectBignumber.bignumberMod.BigNumberish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PayableOverrides extends Overrides {
  
  var value: js.UndefOr[BigNumberish | js.Promise[BigNumberish]] = js.native
}
object PayableOverrides {
  
  @scala.inline
  def apply(): PayableOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PayableOverrides]
  }
  
  @scala.inline
  implicit class PayableOverridesOps[Self <: PayableOverrides] (val x: Self) extends AnyVal {
    
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
    def setValue(value: BigNumberish | js.Promise[BigNumberish]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
