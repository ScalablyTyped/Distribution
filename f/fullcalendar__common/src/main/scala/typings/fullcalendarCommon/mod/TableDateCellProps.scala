package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableDateCellProps extends StObject {
  
  var colCnt: Double
  
  var colSpan: js.UndefOr[Double] = js.undefined
  
  var date: js.Date
  
  var dateProfile: DateProfile
  
  var dayHeaderFormat: DateFormatter
  
  var extraDataAttrs: js.UndefOr[Dictionary] = js.undefined
  
  var extraHookProps: js.UndefOr[Dictionary] = js.undefined
  
  var isSticky: js.UndefOr[Boolean] = js.undefined
  
  var todayRange: DateRange
}
object TableDateCellProps {
  
  inline def apply(
    colCnt: Double,
    date: js.Date,
    dateProfile: DateProfile,
    dayHeaderFormat: DateFormatter,
    todayRange: DateRange
  ): TableDateCellProps = {
    val __obj = js.Dynamic.literal(colCnt = colCnt.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], dateProfile = dateProfile.asInstanceOf[js.Any], dayHeaderFormat = dayHeaderFormat.asInstanceOf[js.Any], todayRange = todayRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableDateCellProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableDateCellProps] (val x: Self) extends AnyVal {
    
    inline def setColCnt(value: Double): Self = StObject.set(x, "colCnt", value.asInstanceOf[js.Any])
    
    inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateProfile(value: DateProfile): Self = StObject.set(x, "dateProfile", value.asInstanceOf[js.Any])
    
    inline def setDayHeaderFormat(value: DateFormatter): Self = StObject.set(x, "dayHeaderFormat", value.asInstanceOf[js.Any])
    
    inline def setExtraDataAttrs(value: Dictionary): Self = StObject.set(x, "extraDataAttrs", value.asInstanceOf[js.Any])
    
    inline def setExtraDataAttrsUndefined: Self = StObject.set(x, "extraDataAttrs", js.undefined)
    
    inline def setExtraHookProps(value: Dictionary): Self = StObject.set(x, "extraHookProps", value.asInstanceOf[js.Any])
    
    inline def setExtraHookPropsUndefined: Self = StObject.set(x, "extraHookProps", js.undefined)
    
    inline def setIsSticky(value: Boolean): Self = StObject.set(x, "isSticky", value.asInstanceOf[js.Any])
    
    inline def setIsStickyUndefined: Self = StObject.set(x, "isSticky", js.undefined)
    
    inline def setTodayRange(value: DateRange): Self = StObject.set(x, "todayRange", value.asInstanceOf[js.Any])
  }
}
