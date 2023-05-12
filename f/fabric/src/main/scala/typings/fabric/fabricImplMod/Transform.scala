package typings.fabric.fabricImplMod

import typings.fabric.anon.Angle
import typings.fabric.fabricStrings.bottom
import typings.fabric.fabricStrings.left
import typings.fabric.fabricStrings.right
import typings.fabric.fabricStrings.top
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transform extends StObject {
  
  var action: String
  
  def actionHandler(eventData: MouseEvent, transformData: Transform, x: Double, y: Double): Boolean
  @JSName("actionHandler")
  var actionHandler_Original: ControlMouseEventHandler
  
  var altKey: Boolean
  
  var corner: String
  
  var ex: Double
  
  var ey: Double
  
  var lastX: Double
  
  var lastY: Double
  
  var offsetX: Double
  
  var offsetY: Double
  
  var originX: left | right
  
  var originY: top | bottom
  
  var original: Angle
  
  var scaleX: Double
  
  var scaleY: Double
  
  var shiftKey: Boolean
  
  var skewX: Double
  
  var skewY: Double
  
  var target: Object
  
  var theta: Double
  
  var width: Double
}
object Transform {
  
  inline def apply(
    action: String,
    actionHandler: (/* eventData */ MouseEvent, /* transformData */ Transform, /* x */ Double, /* y */ Double) => Boolean,
    altKey: Boolean,
    corner: String,
    ex: Double,
    ey: Double,
    lastX: Double,
    lastY: Double,
    offsetX: Double,
    offsetY: Double,
    originX: left | right,
    originY: top | bottom,
    original: Angle,
    scaleX: Double,
    scaleY: Double,
    shiftKey: Boolean,
    skewX: Double,
    skewY: Double,
    target: Object,
    theta: Double,
    width: Double
  ): Transform = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], actionHandler = js.Any.fromFunction4(actionHandler), altKey = altKey.asInstanceOf[js.Any], corner = corner.asInstanceOf[js.Any], ex = ex.asInstanceOf[js.Any], ey = ey.asInstanceOf[js.Any], lastX = lastX.asInstanceOf[js.Any], lastY = lastY.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], originX = originX.asInstanceOf[js.Any], originY = originY.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], skewX = skewX.asInstanceOf[js.Any], skewY = skewY.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], theta = theta.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Transform] (val x: Self) extends AnyVal {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionHandler(
      value: (/* eventData */ MouseEvent, /* transformData */ Transform, /* x */ Double, /* y */ Double) => Boolean
    ): Self = StObject.set(x, "actionHandler", js.Any.fromFunction4(value))
    
    inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    inline def setCorner(value: String): Self = StObject.set(x, "corner", value.asInstanceOf[js.Any])
    
    inline def setEx(value: Double): Self = StObject.set(x, "ex", value.asInstanceOf[js.Any])
    
    inline def setEy(value: Double): Self = StObject.set(x, "ey", value.asInstanceOf[js.Any])
    
    inline def setLastX(value: Double): Self = StObject.set(x, "lastX", value.asInstanceOf[js.Any])
    
    inline def setLastY(value: Double): Self = StObject.set(x, "lastY", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOriginX(value: left | right): Self = StObject.set(x, "originX", value.asInstanceOf[js.Any])
    
    inline def setOriginY(value: top | bottom): Self = StObject.set(x, "originY", value.asInstanceOf[js.Any])
    
    inline def setOriginal(value: Angle): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    
    inline def setSkewX(value: Double): Self = StObject.set(x, "skewX", value.asInstanceOf[js.Any])
    
    inline def setSkewY(value: Double): Self = StObject.set(x, "skewY", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Object): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTheta(value: Double): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
