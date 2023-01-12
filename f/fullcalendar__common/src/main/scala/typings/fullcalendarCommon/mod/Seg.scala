package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Seg
  extends StObject
     with /* otherProp */ StringDictionary[Any] {
  
  var component: js.UndefOr[DateComponent[Any, Any]] = js.undefined
  
  var el: js.UndefOr[scala.Nothing] = js.undefined
  
  var eventRange: js.UndefOr[EventRenderRange] = js.undefined
  
  var isEnd: Boolean
  
  var isStart: Boolean
}
object Seg {
  
  inline def apply(isEnd: Boolean, isStart: Boolean): Seg = {
    val __obj = js.Dynamic.literal(isEnd = isEnd.asInstanceOf[js.Any], isStart = isStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[Seg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Seg] (val x: Self) extends AnyVal {
    
    inline def setComponent(value: DateComponent[Any, Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setEventRange(value: EventRenderRange): Self = StObject.set(x, "eventRange", value.asInstanceOf[js.Any])
    
    inline def setEventRangeUndefined: Self = StObject.set(x, "eventRange", js.undefined)
    
    inline def setIsEnd(value: Boolean): Self = StObject.set(x, "isEnd", value.asInstanceOf[js.Any])
    
    inline def setIsStart(value: Boolean): Self = StObject.set(x, "isStart", value.asInstanceOf[js.Any])
  }
}
