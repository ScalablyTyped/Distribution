package typings.devtoolsProtocol.mod.Protocol.Input

import typings.devtoolsProtocol.mod.Protocol.integer
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
    * The normalized tangential pressure, which has a range of [-1,1] (default: 0).
    */
  var tangentialPressure: js.UndefOr[Double] = js.undefined
  
  /**
    * The plane angle between the Y-Z plane and the plane containing both the stylus axis and the Y axis, in degrees of the range [-90,90], a positive tiltX is to the right (default: 0)
    */
  var tiltX: js.UndefOr[integer] = js.undefined
  
  /**
    * The plane angle between the X-Z plane and the plane containing both the stylus axis and the X axis, in degrees of the range [-90,90], a positive tiltY is towards the user (default: 0).
    */
  var tiltY: js.UndefOr[integer] = js.undefined
  
  /**
    * The clockwise rotation of a pen stylus around its own major axis, in degrees in the range [0,359] (default: 0).
    */
  var twist: js.UndefOr[integer] = js.undefined
  
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
    
    inline def setTangentialPressure(value: Double): Self = StObject.set(x, "tangentialPressure", value.asInstanceOf[js.Any])
    
    inline def setTangentialPressureUndefined: Self = StObject.set(x, "tangentialPressure", js.undefined)
    
    inline def setTiltX(value: integer): Self = StObject.set(x, "tiltX", value.asInstanceOf[js.Any])
    
    inline def setTiltXUndefined: Self = StObject.set(x, "tiltX", js.undefined)
    
    inline def setTiltY(value: integer): Self = StObject.set(x, "tiltY", value.asInstanceOf[js.Any])
    
    inline def setTiltYUndefined: Self = StObject.set(x, "tiltY", js.undefined)
    
    inline def setTwist(value: integer): Self = StObject.set(x, "twist", value.asInstanceOf[js.Any])
    
    inline def setTwistUndefined: Self = StObject.set(x, "twist", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
