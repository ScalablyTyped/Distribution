package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BgEventProps extends StObject {
  
  var isFuture: Boolean
  
  var isPast: Boolean
  
  var isToday: Boolean
  
  var seg: Seg
}
object BgEventProps {
  
  inline def apply(isFuture: Boolean, isPast: Boolean, isToday: Boolean, seg: Seg): BgEventProps = {
    val __obj = js.Dynamic.literal(isFuture = isFuture.asInstanceOf[js.Any], isPast = isPast.asInstanceOf[js.Any], isToday = isToday.asInstanceOf[js.Any], seg = seg.asInstanceOf[js.Any])
    __obj.asInstanceOf[BgEventProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BgEventProps] (val x: Self) extends AnyVal {
    
    inline def setIsFuture(value: Boolean): Self = StObject.set(x, "isFuture", value.asInstanceOf[js.Any])
    
    inline def setIsPast(value: Boolean): Self = StObject.set(x, "isPast", value.asInstanceOf[js.Any])
    
    inline def setIsToday(value: Boolean): Self = StObject.set(x, "isToday", value.asInstanceOf[js.Any])
    
    inline def setSeg(value: Seg): Self = StObject.set(x, "seg", value.asInstanceOf[js.Any])
  }
}
