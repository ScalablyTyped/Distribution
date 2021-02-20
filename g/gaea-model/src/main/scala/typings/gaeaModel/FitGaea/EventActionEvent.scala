package typings.gaeaModel.FitGaea

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventActionEvent extends StObject {
  
  var emit: js.UndefOr[String] = js.native
}
object EventActionEvent {
  
  @scala.inline
  def apply(): EventActionEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventActionEvent]
  }
  
  @scala.inline
  implicit class EventActionEventMutableBuilder[Self <: EventActionEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmit(value: String): Self = StObject.set(x, "emit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmitUndefined: Self = StObject.set(x, "emit", js.undefined)
  }
}
