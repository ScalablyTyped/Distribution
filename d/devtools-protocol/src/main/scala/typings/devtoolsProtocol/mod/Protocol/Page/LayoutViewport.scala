package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayoutViewport extends js.Object {
  
  /**
    * Height (CSS pixels), excludes scrollbar if present.
    */
  var clientHeight: integer = js.native
  
  /**
    * Width (CSS pixels), excludes scrollbar if present.
    */
  var clientWidth: integer = js.native
  
  /**
    * Horizontal offset relative to the document (CSS pixels).
    */
  var pageX: integer = js.native
  
  /**
    * Vertical offset relative to the document (CSS pixels).
    */
  var pageY: integer = js.native
}
object LayoutViewport {
  
  @scala.inline
  def apply(clientHeight: integer, clientWidth: integer, pageX: integer, pageY: integer): LayoutViewport = {
    val __obj = js.Dynamic.literal(clientHeight = clientHeight.asInstanceOf[js.Any], clientWidth = clientWidth.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutViewport]
  }
  
  @scala.inline
  implicit class LayoutViewportOps[Self <: LayoutViewport] (val x: Self) extends AnyVal {
    
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
    def setClientHeight(value: integer): Self = this.set("clientHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientWidth(value: integer): Self = this.set("clientWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageX(value: integer): Self = this.set("pageX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageY(value: integer): Self = this.set("pageY", value.asInstanceOf[js.Any])
  }
}
