package typings.flot.jquery.flot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait interaction extends js.Object {
  
  var redrawOverlayInterval: js.UndefOr[Double] = js.native
}
object interaction {
  
  @scala.inline
  def apply(): interaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[interaction]
  }
  
  @scala.inline
  implicit class interactionOps[Self <: interaction] (val x: Self) extends AnyVal {
    
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
    def setRedrawOverlayInterval(value: Double): Self = this.set("redrawOverlayInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedrawOverlayInterval: Self = this.set("redrawOverlayInterval", js.undefined)
  }
}
