package typings.devtoolsProtocol.mod.Protocol.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchPoint extends StObject {
  
  /**
    * Force (default: 1.0).
    */
  var force: js.UndefOr[Double] = js.undefined
  
  /**
    * Identifier used to track touch sources between events, must be unique within an event.
    */
  var id: js.UndefOr[Double] = js.undefined
  
  /**
    * X radius of the touch area (default: 1.0).
    */
  var radiusX: js.UndefOr[Double] = js.undefined
  
  /**
    * Y radius of the touch area (default: 1.0).
    */
  var radiusY: js.UndefOr[Double] = js.undefined
  
  /**
    * Rotation angle (default: 0.0).
    */
  var rotationAngle: js.UndefOr[Double] = js.undefined
  
  /**
    * X coordinate of the event relative to the main frame's viewport in CSS pixels.
    */
  var x: Double
  
  /**
    * Y coordinate of the event relative to the main frame's viewport in CSS pixels. 0 refers to
    * the top of the viewport and Y increases as it proceeds towards the bottom of the viewport.
    */
  var y: Double
}
object TouchPoint {
  
  inline def apply(x: Double, y: Double): TouchPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchPoint]
  }
  
  extension [Self <: TouchPoint](x: Self) {
    
    inline def setForce(value: Double): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setRadiusX(value: Double): Self = StObject.set(x, "radiusX", value.asInstanceOf[js.Any])
    
    inline def setRadiusXUndefined: Self = StObject.set(x, "radiusX", js.undefined)
    
    inline def setRadiusY(value: Double): Self = StObject.set(x, "radiusY", value.asInstanceOf[js.Any])
    
    inline def setRadiusYUndefined: Self = StObject.set(x, "radiusY", js.undefined)
    
    inline def setRotationAngle(value: Double): Self = StObject.set(x, "rotationAngle", value.asInstanceOf[js.Any])
    
    inline def setRotationAngleUndefined: Self = StObject.set(x, "rotationAngle", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
