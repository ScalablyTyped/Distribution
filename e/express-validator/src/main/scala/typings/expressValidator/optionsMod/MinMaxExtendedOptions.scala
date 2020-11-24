package typings.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MinMaxExtendedOptions extends MinMaxOptions {
  
  var gt: js.UndefOr[Double] = js.native
  
  var lt: js.UndefOr[Double] = js.native
}
object MinMaxExtendedOptions {
  
  @scala.inline
  def apply(): MinMaxExtendedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinMaxExtendedOptions]
  }
  
  @scala.inline
  implicit class MinMaxExtendedOptionsOps[Self <: MinMaxExtendedOptions] (val x: Self) extends AnyVal {
    
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
    def setGt(value: Double): Self = this.set("gt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGt: Self = this.set("gt", js.undefined)
    
    @scala.inline
    def setLt(value: Double): Self = this.set("lt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLt: Self = this.set("lt", js.undefined)
  }
}
