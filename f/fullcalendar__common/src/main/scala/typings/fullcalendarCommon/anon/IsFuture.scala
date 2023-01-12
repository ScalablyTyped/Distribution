package typings.fullcalendarCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsFuture extends StObject {
  
  var isFuture: Boolean
  
  var isPast: Boolean
  
  var isToday: Boolean
}
object IsFuture {
  
  inline def apply(isFuture: Boolean, isPast: Boolean, isToday: Boolean): IsFuture = {
    val __obj = js.Dynamic.literal(isFuture = isFuture.asInstanceOf[js.Any], isPast = isPast.asInstanceOf[js.Any], isToday = isToday.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsFuture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsFuture] (val x: Self) extends AnyVal {
    
    inline def setIsFuture(value: Boolean): Self = StObject.set(x, "isFuture", value.asInstanceOf[js.Any])
    
    inline def setIsPast(value: Boolean): Self = StObject.set(x, "isPast", value.asInstanceOf[js.Any])
    
    inline def setIsToday(value: Boolean): Self = StObject.set(x, "isToday", value.asInstanceOf[js.Any])
  }
}
