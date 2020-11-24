package typings.dropzone.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropzoneResizeInfo extends js.Object {
  
  var srcHeight: js.UndefOr[Double] = js.native
  
  var srcWidth: js.UndefOr[Double] = js.native
  
  var srcX: js.UndefOr[Double] = js.native
  
  var srcY: js.UndefOr[Double] = js.native
  
  var trgHeight: js.UndefOr[Double] = js.native
  
  var trgWidth: js.UndefOr[Double] = js.native
  
  var trgX: js.UndefOr[Double] = js.native
  
  var trgY: js.UndefOr[Double] = js.native
}
object DropzoneResizeInfo {
  
  @scala.inline
  def apply(): DropzoneResizeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropzoneResizeInfo]
  }
  
  @scala.inline
  implicit class DropzoneResizeInfoOps[Self <: DropzoneResizeInfo] (val x: Self) extends AnyVal {
    
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
    def setSrcHeight(value: Double): Self = this.set("srcHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrcHeight: Self = this.set("srcHeight", js.undefined)
    
    @scala.inline
    def setSrcWidth(value: Double): Self = this.set("srcWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrcWidth: Self = this.set("srcWidth", js.undefined)
    
    @scala.inline
    def setSrcX(value: Double): Self = this.set("srcX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrcX: Self = this.set("srcX", js.undefined)
    
    @scala.inline
    def setSrcY(value: Double): Self = this.set("srcY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrcY: Self = this.set("srcY", js.undefined)
    
    @scala.inline
    def setTrgHeight(value: Double): Self = this.set("trgHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrgHeight: Self = this.set("trgHeight", js.undefined)
    
    @scala.inline
    def setTrgWidth(value: Double): Self = this.set("trgWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrgWidth: Self = this.set("trgWidth", js.undefined)
    
    @scala.inline
    def setTrgX(value: Double): Self = this.set("trgX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrgX: Self = this.set("trgX", js.undefined)
    
    @scala.inline
    def setTrgY(value: Double): Self = this.set("trgY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrgY: Self = this.set("trgY", js.undefined)
  }
}
