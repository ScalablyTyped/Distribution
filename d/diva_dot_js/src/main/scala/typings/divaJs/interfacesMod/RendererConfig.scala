package typings.divaJs.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RendererConfig extends StObject {
  
  var maxZoomLevel: Double | Null
  
  var padding: Offset
  
  var pageLayouts: js.Object
  
  var verticallyOriented: Boolean
}
object RendererConfig {
  
  @scala.inline
  def apply(padding: Offset, pageLayouts: js.Object, verticallyOriented: Boolean): RendererConfig = {
    val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any], pageLayouts = pageLayouts.asInstanceOf[js.Any], verticallyOriented = verticallyOriented.asInstanceOf[js.Any], maxZoomLevel = null)
    __obj.asInstanceOf[RendererConfig]
  }
  
  @scala.inline
  implicit class RendererConfigMutableBuilder[Self <: RendererConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxZoomLevel(value: Double): Self = StObject.set(x, "maxZoomLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomLevelNull: Self = StObject.set(x, "maxZoomLevel", null)
    
    @scala.inline
    def setPadding(value: Offset): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageLayouts(value: js.Object): Self = StObject.set(x, "pageLayouts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticallyOriented(value: Boolean): Self = StObject.set(x, "verticallyOriented", value.asInstanceOf[js.Any])
  }
}
