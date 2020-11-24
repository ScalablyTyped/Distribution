package typings.devtoolsProtocol.mod.Protocol.BackgroundService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearEventsRequest extends js.Object {
  
  var service: ServiceName = js.native
}
object ClearEventsRequest {
  
  @scala.inline
  def apply(service: ServiceName): ClearEventsRequest = {
    val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearEventsRequest]
  }
  
  @scala.inline
  implicit class ClearEventsRequestOps[Self <: ClearEventsRequest] (val x: Self) extends AnyVal {
    
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
    def setService(value: ServiceName): Self = this.set("service", value.asInstanceOf[js.Any])
  }
}
