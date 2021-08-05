package typings.easeljs.createjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TickerEvent extends StObject {
  
  var delta: Double
  
  var paused: Boolean
  
  var runTime: Double
  
  // properties
  var target: js.Object
  
  var time: Double
  
  var `type`: String
}
object TickerEvent {
  
  inline def apply(delta: Double, paused: Boolean, runTime: Double, target: js.Object, time: Double, `type`: String): TickerEvent = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], runTime = runTime.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TickerEvent]
  }
  
  extension [Self <: TickerEvent](x: Self) {
    
    inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    inline def setRunTime(value: Double): Self = StObject.set(x, "runTime", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: js.Object): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
