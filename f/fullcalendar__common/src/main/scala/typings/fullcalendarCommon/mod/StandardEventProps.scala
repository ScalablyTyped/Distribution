package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardEventProps
  extends StObject
     with MinimalEventProps {
  
  var defaultContent: js.UndefOr[
    js.Function1[
      /* hookProps */ EventContentArg, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ Any
    ]
  ] = js.undefined
  
  var defaultDisplayEventEnd: js.UndefOr[Boolean] = js.undefined
  
  var defaultDisplayEventTime: js.UndefOr[Boolean] = js.undefined
  
  var defaultTimeFormat: DateFormatter
  
  var disableDragging: js.UndefOr[Boolean] = js.undefined
  
  var disableResizing: js.UndefOr[Boolean] = js.undefined
  
  var extraClassNames: js.Array[String]
}
object StandardEventProps {
  
  inline def apply(
    defaultTimeFormat: DateFormatter,
    extraClassNames: js.Array[String],
    isDateSelecting: Boolean,
    isDragging: Boolean,
    isFuture: Boolean,
    isPast: Boolean,
    isResizing: Boolean,
    isSelected: Boolean,
    isToday: Boolean,
    seg: Seg
  ): StandardEventProps = {
    val __obj = js.Dynamic.literal(defaultTimeFormat = defaultTimeFormat.asInstanceOf[js.Any], extraClassNames = extraClassNames.asInstanceOf[js.Any], isDateSelecting = isDateSelecting.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], isFuture = isFuture.asInstanceOf[js.Any], isPast = isPast.asInstanceOf[js.Any], isResizing = isResizing.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], isToday = isToday.asInstanceOf[js.Any], seg = seg.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardEventProps]
  }
  
  extension [Self <: StandardEventProps](x: Self) {
    
    inline def setDefaultContent(
      value: /* hookProps */ EventContentArg => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ Any
    ): Self = StObject.set(x, "defaultContent", js.Any.fromFunction1(value))
    
    inline def setDefaultContentUndefined: Self = StObject.set(x, "defaultContent", js.undefined)
    
    inline def setDefaultDisplayEventEnd(value: Boolean): Self = StObject.set(x, "defaultDisplayEventEnd", value.asInstanceOf[js.Any])
    
    inline def setDefaultDisplayEventEndUndefined: Self = StObject.set(x, "defaultDisplayEventEnd", js.undefined)
    
    inline def setDefaultDisplayEventTime(value: Boolean): Self = StObject.set(x, "defaultDisplayEventTime", value.asInstanceOf[js.Any])
    
    inline def setDefaultDisplayEventTimeUndefined: Self = StObject.set(x, "defaultDisplayEventTime", js.undefined)
    
    inline def setDefaultTimeFormat(value: DateFormatter): Self = StObject.set(x, "defaultTimeFormat", value.asInstanceOf[js.Any])
    
    inline def setDisableDragging(value: Boolean): Self = StObject.set(x, "disableDragging", value.asInstanceOf[js.Any])
    
    inline def setDisableDraggingUndefined: Self = StObject.set(x, "disableDragging", js.undefined)
    
    inline def setDisableResizing(value: Boolean): Self = StObject.set(x, "disableResizing", value.asInstanceOf[js.Any])
    
    inline def setDisableResizingUndefined: Self = StObject.set(x, "disableResizing", js.undefined)
    
    inline def setExtraClassNames(value: js.Array[String]): Self = StObject.set(x, "extraClassNames", value.asInstanceOf[js.Any])
    
    inline def setExtraClassNamesVarargs(value: String*): Self = StObject.set(x, "extraClassNames", js.Array(value*))
  }
}
