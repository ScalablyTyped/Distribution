package typings.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CornerMixin extends js.Object {
  
  var cornerRadius: Double | js.Symbol = js.native
  
  var cornerSmoothing: Double = js.native
}
object CornerMixin {
  
  @scala.inline
  def apply(cornerRadius: Double | js.Symbol, cornerSmoothing: Double): CornerMixin = {
    val __obj = js.Dynamic.literal(cornerRadius = cornerRadius.asInstanceOf[js.Any], cornerSmoothing = cornerSmoothing.asInstanceOf[js.Any])
    __obj.asInstanceOf[CornerMixin]
  }
  
  @scala.inline
  implicit class CornerMixinOps[Self <: CornerMixin] (val x: Self) extends AnyVal {
    
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
    def setCornerRadius(value: Double | js.Symbol): Self = this.set("cornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerSmoothing(value: Double): Self = this.set("cornerSmoothing", value.asInstanceOf[js.Any])
  }
}
