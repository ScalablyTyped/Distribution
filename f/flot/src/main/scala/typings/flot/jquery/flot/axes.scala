package typings.flot.jquery.flot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait axes extends js.Object {
  
  var x2axis: js.UndefOr[axis] = js.native
  
  var xaxis: axis = js.native
  
  var y2axis: js.UndefOr[axis] = js.native
  
  var yaxis: axis = js.native
}
object axes {
  
  @scala.inline
  def apply(xaxis: axis, yaxis: axis): axes = {
    val __obj = js.Dynamic.literal(xaxis = xaxis.asInstanceOf[js.Any], yaxis = yaxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[axes]
  }
  
  @scala.inline
  implicit class axesOps[Self <: axes] (val x: Self) extends AnyVal {
    
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
    def setXaxis(value: axis): Self = this.set("xaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxis(value: axis): Self = this.set("yaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2axis(value: axis): Self = this.set("x2axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX2axis: Self = this.set("x2axis", js.undefined)
    
    @scala.inline
    def setY2axis(value: axis): Self = this.set("y2axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY2axis: Self = this.set("y2axis", js.undefined)
  }
}
