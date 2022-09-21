package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DayTableCell extends StObject {
  
  var date: js.Date
  
  var extraClassNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var extraDataAttrs: js.UndefOr[Dictionary] = js.undefined
  
  var extraDateSpan: js.UndefOr[Dictionary] = js.undefined
  
  var extraHookProps: js.UndefOr[Dictionary] = js.undefined
  
  var key: String
}
object DayTableCell {
  
  inline def apply(date: js.Date, key: String): DayTableCell = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayTableCell]
  }
  
  extension [Self <: DayTableCell](x: Self) {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setExtraClassNames(value: js.Array[String]): Self = StObject.set(x, "extraClassNames", value.asInstanceOf[js.Any])
    
    inline def setExtraClassNamesUndefined: Self = StObject.set(x, "extraClassNames", js.undefined)
    
    inline def setExtraClassNamesVarargs(value: String*): Self = StObject.set(x, "extraClassNames", js.Array(value*))
    
    inline def setExtraDataAttrs(value: Dictionary): Self = StObject.set(x, "extraDataAttrs", value.asInstanceOf[js.Any])
    
    inline def setExtraDataAttrsUndefined: Self = StObject.set(x, "extraDataAttrs", js.undefined)
    
    inline def setExtraDateSpan(value: Dictionary): Self = StObject.set(x, "extraDateSpan", value.asInstanceOf[js.Any])
    
    inline def setExtraDateSpanUndefined: Self = StObject.set(x, "extraDateSpan", js.undefined)
    
    inline def setExtraHookProps(value: Dictionary): Self = StObject.set(x, "extraHookProps", value.asInstanceOf[js.Any])
    
    inline def setExtraHookPropsUndefined: Self = StObject.set(x, "extraHookProps", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
