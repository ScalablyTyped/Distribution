package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonIconsInput
  extends StObject
     with /* viewOrCustomButton */ StringDictionary[js.UndefOr[String]] {
  
  var next: js.UndefOr[String] = js.undefined
  
  var nextYear: js.UndefOr[String] = js.undefined
  
  var prev: js.UndefOr[String] = js.undefined
  
  var prevYear: js.UndefOr[String] = js.undefined
  
  var today: js.UndefOr[String] = js.undefined
}
object ButtonIconsInput {
  
  inline def apply(): ButtonIconsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonIconsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ButtonIconsInput] (val x: Self) extends AnyVal {
    
    inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setNextYear(value: String): Self = StObject.set(x, "nextYear", value.asInstanceOf[js.Any])
    
    inline def setNextYearUndefined: Self = StObject.set(x, "nextYear", js.undefined)
    
    inline def setPrev(value: String): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
    
    inline def setPrevYear(value: String): Self = StObject.set(x, "prevYear", value.asInstanceOf[js.Any])
    
    inline def setPrevYearUndefined: Self = StObject.set(x, "prevYear", js.undefined)
    
    inline def setToday(value: String): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
    
    inline def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
  }
}
