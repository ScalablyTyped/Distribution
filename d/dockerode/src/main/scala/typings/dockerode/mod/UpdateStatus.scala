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
  
  @scala.inline
  def apply(): UpdateStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateStatus]
  }
  
  @scala.inline
  implicit class UpdateStatusMutableBuilder[Self <: UpdateStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletedAt(value: String): Self = StObject.set(x, "CompletedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedAtUndefined: Self = StObject.set(x, "CompletedAt", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setStartedAt(value: String): Self = StObject.set(x, "StartedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedAtUndefined: Self = StObject.set(x, "StartedAt", js.undefined)
    
    @scala.inline
    def setState(value: UpdateState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
