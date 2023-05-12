package typings.fullcalendarInteraction.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtraListenerRefiners extends StObject {
  
  var dateClick: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<(arg : DateClickArg): void> */ Any
  
  var drop: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<(arg : DropArg): void> */ Any
  
  var eventDragStart: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<(arg : EventDragStartArg): void> */ Any
  
  var eventDragStop: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<(arg : EventDragStopArg): void> */ Any
  
  var eventDrop: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<(arg : EventDropArg): void> */ Any
  
  var eventLeave: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<(arg : EventLeaveArg): void> */ Any
  
  var eventReceive: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<(arg : EventReceiveArg): void> */ Any
  
  var eventResize: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<(arg : EventResizeDoneArg): void> */ Any
  
  var eventResizeStart: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<(arg : EventResizeStartArg): void> */ Any
  
  var eventResizeStop: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<(arg : EventResizeStopArg): void> */ Any
}
object ExtraListenerRefiners {
  
  inline def apply(
    dateClick: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<(arg : DateClickArg): void> */ Any,
    drop: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<(arg : DropArg): void> */ Any,
    eventDragStart: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<(arg : EventDragStartArg): void> */ Any,
    eventDragStop: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<(arg : EventDragStopArg): void> */ Any,
    eventDrop: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<(arg : EventDropArg): void> */ Any,
    eventLeave: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<(arg : EventLeaveArg): void> */ Any,
    eventReceive: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<(arg : EventReceiveArg): void> */ Any,
    eventResize: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<(arg : EventResizeDoneArg): void> */ Any,
    eventResizeStart: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<(arg : EventResizeStartArg): void> */ Any,
    eventResizeStop: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<(arg : EventResizeStopArg): void> */ Any
  ): ExtraListenerRefiners = {
    val __obj = js.Dynamic.literal(dateClick = dateClick.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], eventDragStart = eventDragStart.asInstanceOf[js.Any], eventDragStop = eventDragStop.asInstanceOf[js.Any], eventDrop = eventDrop.asInstanceOf[js.Any], eventLeave = eventLeave.asInstanceOf[js.Any], eventReceive = eventReceive.asInstanceOf[js.Any], eventResize = eventResize.asInstanceOf[js.Any], eventResizeStart = eventResizeStart.asInstanceOf[js.Any], eventResizeStop = eventResizeStop.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraListenerRefiners]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtraListenerRefiners] (val x: Self) extends AnyVal {
    
    inline def setDateClick(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<(arg : DateClickArg): void> */ Any
    ): Self = StObject.set(x, "dateClick", value.asInstanceOf[js.Any])
    
    inline def setDrop(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<(arg : DropArg): void> */ Any
    ): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
    
    inline def setEventDragStart(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<(arg : EventDragStartArg): void> */ Any
    ): Self = StObject.set(x, "eventDragStart", value.asInstanceOf[js.Any])
    
    inline def setEventDragStop(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<(arg : EventDragStopArg): void> */ Any
    ): Self = StObject.set(x, "eventDragStop", value.asInstanceOf[js.Any])
    
    inline def setEventDrop(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<(arg : EventDropArg): void> */ Any
    ): Self = StObject.set(x, "eventDrop", value.asInstanceOf[js.Any])
    
    inline def setEventLeave(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<(arg : EventLeaveArg): void> */ Any
    ): Self = StObject.set(x, "eventLeave", value.asInstanceOf[js.Any])
    
    inline def setEventReceive(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<(arg : EventReceiveArg): void> */ Any
    ): Self = StObject.set(x, "eventReceive", value.asInstanceOf[js.Any])
    
    inline def setEventResize(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<(arg : EventResizeDoneArg): void> */ Any
    ): Self = StObject.set(x, "eventResize", value.asInstanceOf[js.Any])
    
    inline def setEventResizeStart(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<(arg : EventResizeStartArg): void> */ Any
    ): Self = StObject.set(x, "eventResizeStart", value.asInstanceOf[js.Any])
    
    inline def setEventResizeStop(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identity<(arg : EventResizeStopArg): void> */ Any
    ): Self = StObject.set(x, "eventResizeStop", value.asInstanceOf[js.Any])
  }
}
