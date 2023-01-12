package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStatus extends StObject {
  
  var CompletedAt: js.UndefOr[String] = js.undefined
  
  var Message: js.UndefOr[String] = js.undefined
  
  var StartedAt: js.UndefOr[String] = js.undefined
  
  var State: js.UndefOr[UpdateState] = js.undefined
}
object UpdateStatus {
  
  inline def apply(): UpdateStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateStatus] (val x: Self) extends AnyVal {
    
    inline def setCompletedAt(value: String): Self = StObject.set(x, "CompletedAt", value.asInstanceOf[js.Any])
    
    inline def setCompletedAtUndefined: Self = StObject.set(x, "CompletedAt", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setStartedAt(value: String): Self = StObject.set(x, "StartedAt", value.asInstanceOf[js.Any])
    
    inline def setStartedAtUndefined: Self = StObject.set(x, "StartedAt", js.undefined)
    
    inline def setState(value: UpdateState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
