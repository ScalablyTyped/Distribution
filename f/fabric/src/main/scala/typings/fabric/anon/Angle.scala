package typings.fabric.anon

import typings.fabric.fabricStrings.bottom
import typings.fabric.fabricStrings.left
import typings.fabric.fabricStrings.right
import typings.fabric.fabricStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Angle extends StObject {
  
  var angle: Double
  
  var fill: String
  
  var flipX: Boolean
  
  var flipY: Boolean
  
  var height: Double
  
  var left: Double
  
  var originX: left | right
  
  var originY: top | bottom
  
  var scaleX: Double
  
  var scaleY: Double
  
  var skewX: Double
  
  var skewY: Double
  
  var top: Double
  
  var width: Double
}
object Angle {
  
  inline def apply(
    angle: Double,
    fill: String,
    flipX: Boolean,
    flipY: Boolean,
    height: Double,
    left: Double,
    originX: left | right,
    originY: top | bottom,
    scaleX: Double,
    scaleY: Double,
    skewX: Double,
    skewY: Double,
    top: Double,
    width: Double
  ): Angle = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], flipX = flipX.asInstanceOf[js.Any], flipY = flipY.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], originX = originX.asInstanceOf[js.Any], originY = originY.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], skewX = skewX.asInstanceOf[js.Any], skewY = skewY.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Angle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Angle] (val x: Self) extends AnyVal {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFlipX(value: Boolean): Self = StObject.set(x, "flipX", value.asInstanceOf[js.Any])
    
    inline def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setOriginX(value: left | right): Self = StObject.set(x, "originX", value.asInstanceOf[js.Any])
    
    inline def setOriginY(value: top | bottom): Self = StObject.set(x, "originY", value.asInstanceOf[js.Any])
    
    inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    inline def setSkewX(value: Double): Self = StObject.set(x, "skewX", value.asInstanceOf[js.Any])
    
    inline def setSkewY(value: Double): Self = StObject.set(x, "skewY", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
