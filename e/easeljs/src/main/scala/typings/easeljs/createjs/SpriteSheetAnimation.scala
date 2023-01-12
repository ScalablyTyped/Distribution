package typings.easeljs.createjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// what is returned from SpriteSheet.getAnimation(string)
trait SpriteSheetAnimation extends StObject {
  
  var frames: js.Array[Double]
  
  var name: String
  
  var next: String
  
  var speed: Double
}
object SpriteSheetAnimation {
  
  inline def apply(frames: js.Array[Double], name: String, next: String, speed: Double): SpriteSheetAnimation = {
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteSheetAnimation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpriteSheetAnimation] (val x: Self) extends AnyVal {
    
    inline def setFrames(value: js.Array[Double]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setFramesVarargs(value: Double*): Self = StObject.set(x, "frames", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
  }
}
