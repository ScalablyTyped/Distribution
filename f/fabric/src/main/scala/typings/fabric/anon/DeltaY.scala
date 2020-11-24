package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeltaY extends js.Object {
  
  var deltaY: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var kernedWidth: js.UndefOr[Double] = js.native
  
  var left: Double = js.native
  
  var width: Double = js.native
}
object DeltaY {
  
  @scala.inline
  def apply(left: Double, width: Double): DeltaY = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeltaY]
  }
  
  @scala.inline
  implicit class DeltaYOps[Self <: DeltaY] (val x: Self) extends AnyVal {
    
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
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaY(value: Double): Self = this.set("deltaY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeltaY: Self = this.set("deltaY", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setKernedWidth(value: Double): Self = this.set("kernedWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernedWidth: Self = this.set("kernedWidth", js.undefined)
  }
}
