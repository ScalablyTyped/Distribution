package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Viewport extends StObject {
  
  /**
    * Rectangle height in device independent pixels (dip).
    */
  var height: Double
  
  /**
    * Page scale factor.
    */
  var scale: Double
  
  /**
    * Rectangle width in device independent pixels (dip).
    */
  var width: Double
  
  /**
    * X offset in device independent pixels (dip).
    */
  var x: Double
  
  /**
    * Y offset in device independent pixels (dip).
    */
  var y: Double
}
object Viewport {
  
  inline def apply(height: Double, scale: Double, width: Double, x: Double, y: Double): Viewport = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Viewport]
  }
  
  extension [Self <: Viewport](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
