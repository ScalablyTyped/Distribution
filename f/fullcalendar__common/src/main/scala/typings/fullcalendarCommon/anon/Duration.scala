package typings.fullcalendarCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration extends StObject {
  
  var duration: Any
  
  var range: Any
  
  var unit: Any
}
object Duration {
  
  inline def apply(duration: Any, range: Any, unit: Any): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  
  extension [Self <: Duration](x: Self) {
    
    inline def setDuration(value: Any): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Any): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: Any): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
  }
}
