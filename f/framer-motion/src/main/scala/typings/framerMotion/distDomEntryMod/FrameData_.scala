package typings.framerMotion.distDomEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameData_ extends StObject {
  
  var delta: Double
  
  var timestamp: Double
}
object FrameData_ {
  
  inline def apply(delta: Double, timestamp: Double): FrameData_ = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameData_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FrameData_] (val x: Self) extends AnyVal {
    
    inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
