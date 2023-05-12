package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateMeta extends StObject {
  
  var dow: Double
  
  var isDisabled: Boolean
  
  var isFuture: Boolean
  
  var isOther: Boolean
  
  var isPast: Boolean
  
  var isToday: Boolean
}
object DateMeta {
  
  inline def apply(
    dow: Double,
    isDisabled: Boolean,
    isFuture: Boolean,
    isOther: Boolean,
    isPast: Boolean,
    isToday: Boolean
  ): DateMeta = {
    val __obj = js.Dynamic.literal(dow = dow.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], isFuture = isFuture.asInstanceOf[js.Any], isOther = isOther.asInstanceOf[js.Any], isPast = isPast.asInstanceOf[js.Any], isToday = isToday.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateMeta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateMeta] (val x: Self) extends AnyVal {
    
    inline def setDow(value: Double): Self = StObject.set(x, "dow", value.asInstanceOf[js.Any])
    
    inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    inline def setIsFuture(value: Boolean): Self = StObject.set(x, "isFuture", value.asInstanceOf[js.Any])
    
    inline def setIsOther(value: Boolean): Self = StObject.set(x, "isOther", value.asInstanceOf[js.Any])
    
    inline def setIsPast(value: Boolean): Self = StObject.set(x, "isPast", value.asInstanceOf[js.Any])
    
    inline def setIsToday(value: Boolean): Self = StObject.set(x, "isToday", value.asInstanceOf[js.Any])
  }
}
