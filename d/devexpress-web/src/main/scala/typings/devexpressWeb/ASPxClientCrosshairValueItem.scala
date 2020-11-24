package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The client-side equivalent of the CrosshairValueItem class.
  */
@js.native
trait ASPxClientCrosshairValueItem extends js.Object {
  
  /**
    * Gets an index of a point for which this crosshair value item is displayed.
    */
  var pointIndex: Double = js.native
  
  /**
    * Gets the value that is displayed in a crosshair label.
    */
  var value: Double = js.native
}
object ASPxClientCrosshairValueItem {
  
  @scala.inline
  def apply(pointIndex: Double, value: Double): ASPxClientCrosshairValueItem = {
    val __obj = js.Dynamic.literal(pointIndex = pointIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCrosshairValueItem]
  }
  
  @scala.inline
  implicit class ASPxClientCrosshairValueItemOps[Self <: ASPxClientCrosshairValueItem] (val x: Self) extends AnyVal {
    
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
    def setPointIndex(value: Double): Self = this.set("pointIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
