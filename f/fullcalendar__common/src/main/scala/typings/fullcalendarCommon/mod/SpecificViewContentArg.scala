package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecificViewContentArg
  extends StObject
     with ViewProps {
  
  var nextDayThreshold: Duration
}
object SpecificViewContentArg {
  
  inline def apply(
    businessHours: EventStore,
    dateProfile: DateProfile,
    eventSelection: String,
    eventStore: EventStore,
    eventUiBases: EventUiHash,
    forPrint: Boolean,
    isHeightAuto: Boolean,
    nextDayThreshold: Duration
  ): SpecificViewContentArg = {
    val __obj = js.Dynamic.literal(businessHours = businessHours.asInstanceOf[js.Any], dateProfile = dateProfile.asInstanceOf[js.Any], eventSelection = eventSelection.asInstanceOf[js.Any], eventStore = eventStore.asInstanceOf[js.Any], eventUiBases = eventUiBases.asInstanceOf[js.Any], forPrint = forPrint.asInstanceOf[js.Any], isHeightAuto = isHeightAuto.asInstanceOf[js.Any], nextDayThreshold = nextDayThreshold.asInstanceOf[js.Any], dateSelection = null, eventDrag = null, eventResize = null)
    __obj.asInstanceOf[SpecificViewContentArg]
  }
  
  extension [Self <: SpecificViewContentArg](x: Self) {
    
    inline def setNextDayThreshold(value: Duration): Self = StObject.set(x, "nextDayThreshold", value.asInstanceOf[js.Any])
  }
}
