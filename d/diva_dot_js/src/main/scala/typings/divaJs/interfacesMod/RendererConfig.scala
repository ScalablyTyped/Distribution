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
  
  inline def apply(padding: Offset, pageLayouts: js.Object, verticallyOriented: Boolean): RendererConfig = {
    val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any], pageLayouts = pageLayouts.asInstanceOf[js.Any], verticallyOriented = verticallyOriented.asInstanceOf[js.Any], maxZoomLevel = null)
    __obj.asInstanceOf[RendererConfig]
  }
  
  extension [Self <: RendererConfig](x: Self) {
    
    inline def setMaxZoomLevel(value: Double): Self = StObject.set(x, "maxZoomLevel", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomLevelNull: Self = StObject.set(x, "maxZoomLevel", null)
    
    inline def setPadding(value: Offset): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPageLayouts(value: js.Object): Self = StObject.set(x, "pageLayouts", value.asInstanceOf[js.Any])
    
    inline def setVerticallyOriented(value: Boolean): Self = StObject.set(x, "verticallyOriented", value.asInstanceOf[js.Any])
  }
}
