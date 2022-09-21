package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableDowCellProps extends StObject {
  
  var colSpan: js.UndefOr[Double] = js.undefined
  
  var dayHeaderFormat: DateFormatter
  
  var dow: Double
  
  var extraClassNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var extraDataAttrs: js.UndefOr[Dictionary] = js.undefined
  
  var extraHookProps: js.UndefOr[Dictionary] = js.undefined
  
  var isSticky: js.UndefOr[Boolean] = js.undefined
}
object TableDowCellProps {
  
  inline def apply(dayHeaderFormat: DateFormatter, dow: Double): TableDowCellProps = {
    val __obj = js.Dynamic.literal(dayHeaderFormat = dayHeaderFormat.asInstanceOf[js.Any], dow = dow.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableDowCellProps]
  }
  
  extension [Self <: TableDowCellProps](x: Self) {
    
    inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
    
    inline def setDayHeaderFormat(value: DateFormatter): Self = StObject.set(x, "dayHeaderFormat", value.asInstanceOf[js.Any])
    
    inline def setDow(value: Double): Self = StObject.set(x, "dow", value.asInstanceOf[js.Any])
    
    inline def setExtraClassNames(value: js.Array[String]): Self = StObject.set(x, "extraClassNames", value.asInstanceOf[js.Any])
    
    inline def setExtraClassNamesUndefined: Self = StObject.set(x, "extraClassNames", js.undefined)
    
    inline def setExtraClassNamesVarargs(value: String*): Self = StObject.set(x, "extraClassNames", js.Array(value*))
    
    inline def setExtraDataAttrs(value: Dictionary): Self = StObject.set(x, "extraDataAttrs", value.asInstanceOf[js.Any])
    
    inline def setExtraDataAttrsUndefined: Self = StObject.set(x, "extraDataAttrs", js.undefined)
    
    inline def setExtraHookProps(value: Dictionary): Self = StObject.set(x, "extraHookProps", value.asInstanceOf[js.Any])
    
    inline def setExtraHookPropsUndefined: Self = StObject.set(x, "extraHookProps", js.undefined)
    
    inline def setIsSticky(value: Boolean): Self = StObject.set(x, "isSticky", value.asInstanceOf[js.Any])
    
    inline def setIsStickyUndefined: Self = StObject.set(x, "isSticky", js.undefined)
  }
}
