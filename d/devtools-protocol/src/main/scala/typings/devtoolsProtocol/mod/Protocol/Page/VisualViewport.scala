package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VisualViewport extends js.Object {
  
  /**
    * Height (CSS pixels), excludes scrollbar if present.
    */
  var clientHeight: Double = js.native
  
  /**
    * Width (CSS pixels), excludes scrollbar if present.
    */
  var clientWidth: Double = js.native
  
  /**
    * Horizontal offset relative to the layout viewport (CSS pixels).
    */
  var offsetX: Double = js.native
  
  /**
    * Vertical offset relative to the layout viewport (CSS pixels).
    */
  var offsetY: Double = js.native
  
  /**
    * Horizontal offset relative to the document (CSS pixels).
    */
  var pageX: Double = js.native
  
  /**
    * Vertical offset relative to the document (CSS pixels).
    */
  var pageY: Double = js.native
  
  /**
    * Scale relative to the ideal viewport (size at width=device-width).
    */
  var scale: Double = js.native
  
  /**
    * Page zoom factor (CSS to device independent pixels ratio).
    */
  var zoom: js.UndefOr[Double] = js.native
}
object VisualViewport {
  
  @scala.inline
  def apply(
    clientHeight: Double,
    clientWidth: Double,
    offsetX: Double,
    offsetY: Double,
    pageX: Double,
    pageY: Double,
    scale: Double
  ): VisualViewport = {
    val __obj = js.Dynamic.literal(clientHeight = clientHeight.asInstanceOf[js.Any], clientWidth = clientWidth.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualViewport]
  }
  
  @scala.inline
  implicit class VisualViewportOps[Self <: VisualViewport] (val x: Self) extends AnyVal {
    
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
    def setClientHeight(value: Double): Self = this.set("clientHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientWidth(value: Double): Self = this.set("clientWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageX(value: Double): Self = this.set("pageX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageY(value: Double): Self = this.set("pageY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
}
