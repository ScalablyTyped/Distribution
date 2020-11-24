package typings.dogapi.mod

import typings.dogapi.anon.Datehappened
import typings.dogapi.dogapiStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventCreateResponse extends js.Object {
  
  var event: Datehappened = js.native
  
  var ok: Boolean = js.native
  
  var status: ok = js.native
}
object EventCreateResponse {
  
  @scala.inline
  def apply(event: Datehappened, ok: Boolean, status: ok): EventCreateResponse = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventCreateResponse]
  }
  
  @scala.inline
  implicit class EventCreateResponseOps[Self <: EventCreateResponse] (val x: Self) extends AnyVal {
    
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
    def setEvent(value: Datehappened): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOk(value: Boolean): Self = this.set("ok", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: ok): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
