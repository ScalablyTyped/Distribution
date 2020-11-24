package typings.ejWebAll.ej.Tooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tip extends js.Object {
  
  /** Sets gap between tooltip against the target element.
    */
  var adjust: js.UndefOr[TipAdjust] = js.native
  
  /** Sets the Tooltip size.
    */
  var size: js.UndefOr[TipSize] = js.native
}
object Tip {
  
  @scala.inline
  def apply(): Tip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tip]
  }
  
  @scala.inline
  implicit class TipOps[Self <: Tip] (val x: Self) extends AnyVal {
    
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
    def setAdjust(value: TipAdjust): Self = this.set("adjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdjust: Self = this.set("adjust", js.undefined)
    
    @scala.inline
    def setSize(value: TipSize): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
