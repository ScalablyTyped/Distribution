package typings.fullcalendarTimegrid

import typings.fullcalendarTimegrid.fullcalendarTimegridBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AllDay extends StObject
  
  trait DayMaxEventRows extends StObject {
    
    var dayMaxEventRows: Double | `false`
    
    var dayMaxEvents: Double | Boolean
  }
  object DayMaxEventRows {
    
    inline def apply(dayMaxEventRows: Double | `false`, dayMaxEvents: Double | Boolean): DayMaxEventRows = {
      val __obj = js.Dynamic.literal(dayMaxEventRows = dayMaxEventRows.asInstanceOf[js.Any], dayMaxEvents = dayMaxEvents.asInstanceOf[js.Any])
      __obj.asInstanceOf[DayMaxEventRows]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DayMaxEventRows] (val x: Self) extends AnyVal {
      
      inline def setDayMaxEventRows(value: Double | `false`): Self = StObject.set(x, "dayMaxEventRows", value.asInstanceOf[js.Any])
      
      inline def setDayMaxEvents(value: Double | Boolean): Self = StObject.set(x, "dayMaxEvents", value.asInstanceOf[js.Any])
    }
  }
  
  trait SlatCoords extends StObject {
    
    var slatCoords: Any
  }
  object SlatCoords {
    
    inline def apply(slatCoords: Any): SlatCoords = {
      val __obj = js.Dynamic.literal(slatCoords = slatCoords.asInstanceOf[js.Any])
      __obj.asInstanceOf[SlatCoords]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SlatCoords] (val x: Self) extends AnyVal {
      
      inline def setSlatCoords(value: Any): Self = StObject.set(x, "slatCoords", value.asInstanceOf[js.Any])
    }
  }
}
