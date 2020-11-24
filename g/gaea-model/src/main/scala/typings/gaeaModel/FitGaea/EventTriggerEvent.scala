package typings.gaeaModel.FitGaea

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventTriggerEvent extends js.Object {
  
  var listen: js.UndefOr[String] = js.native
}
object EventTriggerEvent {
  
  @scala.inline
  def apply(): EventTriggerEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventTriggerEvent]
  }
  
  @scala.inline
  implicit class EventTriggerEventOps[Self <: EventTriggerEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setListen(value: String): Self = this.set("listen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListen: Self = this.set("listen", js.undefined)
  }
}
