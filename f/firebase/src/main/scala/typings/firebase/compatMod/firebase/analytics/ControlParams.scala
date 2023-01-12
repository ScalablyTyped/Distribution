package typings.firebase.compatMod.firebase.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlParams extends StObject {
  
  var event_callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var event_timeout: js.UndefOr[Double] = js.undefined
  
  var groups: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var send_to: js.UndefOr[String | js.Array[String]] = js.undefined
}
object ControlParams {
  
  inline def apply(): ControlParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ControlParams] (val x: Self) extends AnyVal {
    
    inline def setEvent_callback(value: () => Unit): Self = StObject.set(x, "event_callback", js.Any.fromFunction0(value))
    
    inline def setEvent_callbackUndefined: Self = StObject.set(x, "event_callback", js.undefined)
    
    inline def setEvent_timeout(value: Double): Self = StObject.set(x, "event_timeout", value.asInstanceOf[js.Any])
    
    inline def setEvent_timeoutUndefined: Self = StObject.set(x, "event_timeout", js.undefined)
    
    inline def setGroups(value: String | js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setSend_to(value: String | js.Array[String]): Self = StObject.set(x, "send_to", value.asInstanceOf[js.Any])
    
    inline def setSend_toUndefined: Self = StObject.set(x, "send_to", js.undefined)
    
    inline def setSend_toVarargs(value: String*): Self = StObject.set(x, "send_to", js.Array(value*))
  }
}
