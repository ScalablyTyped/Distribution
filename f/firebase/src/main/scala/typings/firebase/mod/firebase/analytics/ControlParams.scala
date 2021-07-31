package typings.firebase.mod.firebase.analytics

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
  
  @scala.inline
  def apply(): ControlParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlParams]
  }
  
  @scala.inline
  implicit class ControlParamsMutableBuilder[Self <: ControlParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent_callback(value: () => Unit): Self = StObject.set(x, "event_callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEvent_callbackUndefined: Self = StObject.set(x, "event_callback", js.undefined)
    
    @scala.inline
    def setEvent_timeout(value: Double): Self = StObject.set(x, "event_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent_timeoutUndefined: Self = StObject.set(x, "event_timeout", js.undefined)
    
    @scala.inline
    def setGroups(value: String | js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setSend_to(value: String | js.Array[String]): Self = StObject.set(x, "send_to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSend_toUndefined: Self = StObject.set(x, "send_to", js.undefined)
    
    @scala.inline
    def setSend_toVarargs(value: String*): Self = StObject.set(x, "send_to", js.Array(value :_*))
  }
}
