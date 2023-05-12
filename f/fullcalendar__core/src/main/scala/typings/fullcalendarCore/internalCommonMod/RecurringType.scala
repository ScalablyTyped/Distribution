package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecurringType[RecurringData] extends StObject {
  
  def expand(typeData: Any, framingRange: DateRange, dateEnv: DateEnv): js.Array[js.Date]
  
  def parse(refined: EventRefined, dateEnv: DateEnv): ParsedRecurring[RecurringData] | Null
}
object RecurringType {
  
  inline def apply[RecurringData](
    expand: (Any, DateRange, DateEnv) => js.Array[js.Date],
    parse: (EventRefined, DateEnv) => ParsedRecurring[RecurringData] | Null
  ): RecurringType[RecurringData] = {
    val __obj = js.Dynamic.literal(expand = js.Any.fromFunction3(expand), parse = js.Any.fromFunction2(parse))
    __obj.asInstanceOf[RecurringType[RecurringData]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecurringType[?], RecurringData] (val x: Self & RecurringType[RecurringData]) extends AnyVal {
    
    inline def setExpand(value: (Any, DateRange, DateEnv) => js.Array[js.Date]): Self = StObject.set(x, "expand", js.Any.fromFunction3(value))
    
    inline def setParse(value: (EventRefined, DateEnv) => ParsedRecurring[RecurringData] | Null): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
  }
}
