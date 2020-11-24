package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeepLabels extends js.Object {
  
  var height: js.UndefOr[Double] = js.native
  
  var keepLabels: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object KeepLabels {
  
  @scala.inline
  def apply(): KeepLabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeepLabels]
  }
  
  @scala.inline
  implicit class KeepLabelsOps[Self <: KeepLabels] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setKeepLabels(value: Boolean): Self = this.set("keepLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepLabels: Self = this.set("keepLabels", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
