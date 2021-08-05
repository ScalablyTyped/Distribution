package typings.easeljs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    def handleEvent(eventObj: js.Object): Unit
  }
  object `0` {
    
    inline def apply(handleEvent: js.Object => Unit): `0` = {
      val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setHandleEvent(value: js.Object => Unit): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
    }
  }
  
  trait HandleEvent extends StObject {
    
    def handleEvent(eventObj: js.Object): Boolean
  }
  object HandleEvent {
    
    inline def apply(handleEvent: js.Object => Boolean): HandleEvent = {
      val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
      __obj.asInstanceOf[HandleEvent]
    }
    
    extension [Self <: HandleEvent](x: Self) {
      
      inline def setHandleEvent(value: js.Object => Boolean): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
    }
  }
  
  trait Rotation extends StObject {
    
    var rotation: Double
    
    var scaleX: Double
    
    var scaleY: Double
    
    var skewX: Double
    
    var skewY: Double
    
    var x: Double
    
    var y: Double
  }
  object Rotation {
    
    inline def apply(
      rotation: Double,
      scaleX: Double,
      scaleY: Double,
      skewX: Double,
      skewY: Double,
      x: Double,
      y: Double
    ): Rotation = {
      val __obj = js.Dynamic.literal(rotation = rotation.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], skewX = skewX.asInstanceOf[js.Any], skewY = skewY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rotation]
    }
    
    extension [Self <: Rotation](x: Self) {
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
      
      inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
      
      inline def setSkewX(value: Double): Self = StObject.set(x, "skewX", value.asInstanceOf[js.Any])
      
      inline def setSkewY(value: Double): Self = StObject.set(x, "skewY", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
