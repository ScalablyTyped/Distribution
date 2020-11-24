package typings.divaJs.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewportPosition extends js.Object {
  
  var anchorPage: Boolean = js.native
  
  var horizontalOffset: Double = js.native
  
  var verticalOffset: Double = js.native
  
  var zoomLevel: Null | Double = js.native
}
object ViewportPosition {
  
  @scala.inline
  def apply(anchorPage: Boolean, horizontalOffset: Double, verticalOffset: Double): ViewportPosition = {
    val __obj = js.Dynamic.literal(anchorPage = anchorPage.asInstanceOf[js.Any], horizontalOffset = horizontalOffset.asInstanceOf[js.Any], verticalOffset = verticalOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportPosition]
  }
  
  @scala.inline
  implicit class ViewportPositionOps[Self <: ViewportPosition] (val x: Self) extends AnyVal {
    
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
    def setAnchorPage(value: Boolean): Self = this.set("anchorPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalOffset(value: Double): Self = this.set("horizontalOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalOffset(value: Double): Self = this.set("verticalOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomLevel(value: Double): Self = this.set("zoomLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomLevelNull: Self = this.set("zoomLevel", null)
  }
}
