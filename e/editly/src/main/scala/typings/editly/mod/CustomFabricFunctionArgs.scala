package typings.editly.mod

import typings.editly.anon.TypeofFabric
import typings.fabric.mod.fabric.Canvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomFabricFunctionArgs extends StObject {
  
  var canvas: Canvas
  
  var fabric: TypeofFabric
  
  var height: Double
  
  var params: Any
  
  var width: Double
}
object CustomFabricFunctionArgs {
  
  inline def apply(canvas: Canvas, fabric: TypeofFabric, height: Double, params: Any, width: Double): CustomFabricFunctionArgs = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], fabric = fabric.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomFabricFunctionArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomFabricFunctionArgs] (val x: Self) extends AnyVal {
    
    inline def setCanvas(value: Canvas): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setFabric(value: TypeofFabric): Self = StObject.set(x, "fabric", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
