package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventMutation extends StObject {
  
  var datesDelta: js.UndefOr[Duration] = js.undefined
  
  var endDelta: js.UndefOr[Duration] = js.undefined
  
  var extendedProps: js.UndefOr[Any] = js.undefined
  
  var standardProps: js.UndefOr[Any] = js.undefined
  
  var startDelta: js.UndefOr[Duration] = js.undefined
}
object EventMutation {
  
  inline def apply(): EventMutation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventMutation]
  }
  
  extension [Self <: EventMutation](x: Self) {
    
    inline def setDatesDelta(value: Duration): Self = StObject.set(x, "datesDelta", value.asInstanceOf[js.Any])
    
    inline def setDatesDeltaUndefined: Self = StObject.set(x, "datesDelta", js.undefined)
    
    inline def setEndDelta(value: Duration): Self = StObject.set(x, "endDelta", value.asInstanceOf[js.Any])
    
    inline def setEndDeltaUndefined: Self = StObject.set(x, "endDelta", js.undefined)
    
    inline def setExtendedProps(value: Any): Self = StObject.set(x, "extendedProps", value.asInstanceOf[js.Any])
    
    inline def setExtendedPropsUndefined: Self = StObject.set(x, "extendedProps", js.undefined)
    
    inline def setStandardProps(value: Any): Self = StObject.set(x, "standardProps", value.asInstanceOf[js.Any])
    
    inline def setStandardPropsUndefined: Self = StObject.set(x, "standardProps", js.undefined)
    
    inline def setStartDelta(value: Duration): Self = StObject.set(x, "startDelta", value.asInstanceOf[js.Any])
    
    inline def setStartDeltaUndefined: Self = StObject.set(x, "startDelta", js.undefined)
  }
}
