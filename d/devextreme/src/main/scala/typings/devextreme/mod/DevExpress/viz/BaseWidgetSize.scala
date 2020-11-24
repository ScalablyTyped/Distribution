package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [descr:BaseWidget.Options.size]
  */
@js.native
trait BaseWidgetSize extends js.Object {
  
  /**
    * [descr:BaseWidget.Options.size.height]
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * [descr:BaseWidget.Options.size.width]
    */
  var width: js.UndefOr[Double] = js.native
}
object BaseWidgetSize {
  
  @scala.inline
  def apply(): BaseWidgetSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseWidgetSize]
  }
  
  @scala.inline
  implicit class BaseWidgetSizeOps[Self <: BaseWidgetSize] (val x: Self) extends AnyVal {
    
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
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
