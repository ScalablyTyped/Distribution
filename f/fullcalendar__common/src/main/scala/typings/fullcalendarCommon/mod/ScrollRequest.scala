package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollRequest
  extends StObject
     with /* otherProp */ StringDictionary[Any] {
  
  var time: js.UndefOr[Duration] = js.undefined
}
object ScrollRequest {
  
  inline def apply(): ScrollRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollRequest] (val x: Self) extends AnyVal {
    
    inline def setTime(value: Duration): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
