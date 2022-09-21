package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventRootProps
  extends StObject
     with MinimalEventProps {
  
  def children(
    rootElRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any,
    classNames: js.Array[String],
    innerElRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any,
    innerContent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ Any,
    hookProps: EventContentArg
  ): Any
  
  def defaultContent(hookProps: EventContentArg): Any
  
  var disableDragging: js.UndefOr[Boolean] = js.undefined
  
  var disableResizing: js.UndefOr[Boolean] = js.undefined
  
  var timeText: String
}
object EventRootProps {
  
  inline def apply(
    children: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any, js.Array[String], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ Any, EventContentArg) => Any,
    defaultContent: EventContentArg => Any,
    isDateSelecting: Boolean,
    isDragging: Boolean,
    isFuture: Boolean,
    isPast: Boolean,
    isResizing: Boolean,
    isSelected: Boolean,
    isToday: Boolean,
    seg: Seg,
    timeText: String
  ): EventRootProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction5(children), defaultContent = js.Any.fromFunction1(defaultContent), isDateSelecting = isDateSelecting.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], isFuture = isFuture.asInstanceOf[js.Any], isPast = isPast.asInstanceOf[js.Any], isResizing = isResizing.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], isToday = isToday.asInstanceOf[js.Any], seg = seg.asInstanceOf[js.Any], timeText = timeText.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventRootProps]
  }
  
  extension [Self <: EventRootProps](x: Self) {
    
    inline def setChildren(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any, js.Array[String], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ Any, EventContentArg) => Any
    ): Self = StObject.set(x, "children", js.Any.fromFunction5(value))
    
    inline def setDefaultContent(value: EventContentArg => Any): Self = StObject.set(x, "defaultContent", js.Any.fromFunction1(value))
    
    inline def setDisableDragging(value: Boolean): Self = StObject.set(x, "disableDragging", value.asInstanceOf[js.Any])
    
    inline def setDisableDraggingUndefined: Self = StObject.set(x, "disableDragging", js.undefined)
    
    inline def setDisableResizing(value: Boolean): Self = StObject.set(x, "disableResizing", value.asInstanceOf[js.Any])
    
    inline def setDisableResizingUndefined: Self = StObject.set(x, "disableResizing", js.undefined)
    
    inline def setTimeText(value: String): Self = StObject.set(x, "timeText", value.asInstanceOf[js.Any])
  }
}
