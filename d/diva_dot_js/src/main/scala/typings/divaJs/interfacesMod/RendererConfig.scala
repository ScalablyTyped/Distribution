package typings.divaJs.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RendererConfig extends js.Object {
  
  var maxZoomLevel: Double | Null = js.native
  
  var padding: Offset = js.native
  
  var pageLayouts: js.Object = js.native
  
  var verticallyOriented: Boolean = js.native
}
object RendererConfig {
  
  @scala.inline
  def apply(padding: Offset, pageLayouts: js.Object, verticallyOriented: Boolean): RendererConfig = {
    val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any], pageLayouts = pageLayouts.asInstanceOf[js.Any], verticallyOriented = verticallyOriented.asInstanceOf[js.Any])
    __obj.asInstanceOf[RendererConfig]
  }
  
  @scala.inline
  implicit class RendererConfigOps[Self <: RendererConfig] (val x: Self) extends AnyVal {
    
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
    def setPadding(value: Offset): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageLayouts(value: js.Object): Self = this.set("pageLayouts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticallyOriented(value: Boolean): Self = this.set("verticallyOriented", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomLevel(value: Double): Self = this.set("maxZoomLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomLevelNull: Self = this.set("maxZoomLevel", null)
  }
}
