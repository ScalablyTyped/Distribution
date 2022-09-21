package typings.dmx.mod

import typings.dmx.dmxStrings.slider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderRange
  extends StObject
     with Range {
  
  var max: Double
  
  var min: Double
  
  var `type`: slider
}
object SliderRange {
  
  inline def apply(max: Double, min: Double): SliderRange = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("slider")
    __obj.asInstanceOf[SliderRange]
  }
  
  extension [Self <: SliderRange](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setType(value: slider): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
