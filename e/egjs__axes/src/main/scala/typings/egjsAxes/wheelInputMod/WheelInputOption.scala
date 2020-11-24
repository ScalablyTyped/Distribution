package typings.egjsAxes.wheelInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WheelInputOption extends js.Object {
  
  var scale: js.UndefOr[Double] = js.native
  
  var throttle: js.UndefOr[Double] = js.native
}
object WheelInputOption {
  
  @scala.inline
  def apply(): WheelInputOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WheelInputOption]
  }
  
  @scala.inline
  implicit class WheelInputOptionOps[Self <: WheelInputOption] (val x: Self) extends AnyVal {
    
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
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setThrottle(value: Double): Self = this.set("throttle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrottle: Self = this.set("throttle", js.undefined)
  }
}
