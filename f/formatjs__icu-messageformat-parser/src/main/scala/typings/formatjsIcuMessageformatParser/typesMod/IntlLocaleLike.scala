package typings.formatjsIcuMessageformatParser.typesMod

import typings.std.Intl.LocaleHourCycleKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntlLocaleLike extends StObject {
  
  val hourCycle: js.UndefOr[LocaleHourCycleKey] = js.undefined
  
  val hourCycles: js.UndefOr[js.Array[LocaleHourCycleKey]] = js.undefined
}
object IntlLocaleLike {
  
  inline def apply(): IntlLocaleLike = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntlLocaleLike]
  }
  
  extension [Self <: IntlLocaleLike](x: Self) {
    
    inline def setHourCycle(value: LocaleHourCycleKey): Self = StObject.set(x, "hourCycle", value.asInstanceOf[js.Any])
    
    inline def setHourCycleUndefined: Self = StObject.set(x, "hourCycle", js.undefined)
    
    inline def setHourCycles(value: js.Array[LocaleHourCycleKey]): Self = StObject.set(x, "hourCycles", value.asInstanceOf[js.Any])
    
    inline def setHourCyclesUndefined: Self = StObject.set(x, "hourCycles", js.undefined)
    
    inline def setHourCyclesVarargs(value: LocaleHourCycleKey*): Self = StObject.set(x, "hourCycles", js.Array(value*))
  }
}
