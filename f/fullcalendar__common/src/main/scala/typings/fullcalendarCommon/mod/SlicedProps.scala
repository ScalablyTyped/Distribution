package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlicedProps[SegType /* <: Seg */] extends StObject {
  
  var bgEventSegs: js.Array[SegType]
  
  var businessHourSegs: js.Array[SegType]
  
  var dateSelectionSegs: js.Array[SegType]
  
  var eventDrag: EventSegUiInteractionState | Null
  
  var eventResize: EventSegUiInteractionState | Null
  
  var eventSelection: String
  
  var fgEventSegs: js.Array[SegType]
}
object SlicedProps {
  
  inline def apply[SegType /* <: Seg */](
    bgEventSegs: js.Array[SegType],
    businessHourSegs: js.Array[SegType],
    dateSelectionSegs: js.Array[SegType],
    eventSelection: String,
    fgEventSegs: js.Array[SegType]
  ): SlicedProps[SegType] = {
    val __obj = js.Dynamic.literal(bgEventSegs = bgEventSegs.asInstanceOf[js.Any], businessHourSegs = businessHourSegs.asInstanceOf[js.Any], dateSelectionSegs = dateSelectionSegs.asInstanceOf[js.Any], eventSelection = eventSelection.asInstanceOf[js.Any], fgEventSegs = fgEventSegs.asInstanceOf[js.Any], eventDrag = null, eventResize = null)
    __obj.asInstanceOf[SlicedProps[SegType]]
  }
  
  extension [Self <: SlicedProps[?], SegType /* <: Seg */](x: Self & SlicedProps[SegType]) {
    
    inline def setBgEventSegs(value: js.Array[SegType]): Self = StObject.set(x, "bgEventSegs", value.asInstanceOf[js.Any])
    
    inline def setBgEventSegsVarargs(value: SegType*): Self = StObject.set(x, "bgEventSegs", js.Array(value*))
    
    inline def setBusinessHourSegs(value: js.Array[SegType]): Self = StObject.set(x, "businessHourSegs", value.asInstanceOf[js.Any])
    
    inline def setBusinessHourSegsVarargs(value: SegType*): Self = StObject.set(x, "businessHourSegs", js.Array(value*))
    
    inline def setDateSelectionSegs(value: js.Array[SegType]): Self = StObject.set(x, "dateSelectionSegs", value.asInstanceOf[js.Any])
    
    inline def setDateSelectionSegsVarargs(value: SegType*): Self = StObject.set(x, "dateSelectionSegs", js.Array(value*))
    
    inline def setEventDrag(value: EventSegUiInteractionState): Self = StObject.set(x, "eventDrag", value.asInstanceOf[js.Any])
    
    inline def setEventDragNull: Self = StObject.set(x, "eventDrag", null)
    
    inline def setEventResize(value: EventSegUiInteractionState): Self = StObject.set(x, "eventResize", value.asInstanceOf[js.Any])
    
    inline def setEventResizeNull: Self = StObject.set(x, "eventResize", null)
    
    inline def setEventSelection(value: String): Self = StObject.set(x, "eventSelection", value.asInstanceOf[js.Any])
    
    inline def setFgEventSegs(value: js.Array[SegType]): Self = StObject.set(x, "fgEventSegs", value.asInstanceOf[js.Any])
    
    inline def setFgEventSegsVarargs(value: SegType*): Self = StObject.set(x, "fgEventSegs", js.Array(value*))
  }
}
