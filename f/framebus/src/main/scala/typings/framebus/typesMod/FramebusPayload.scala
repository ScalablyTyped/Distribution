package typings.framebus.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FramebusPayload extends js.Object {
  
  var data: js.UndefOr[String] = js.native
  
  var event: String = js.native
  
  var eventData: js.UndefOr[FramebusSubscriberArg] = js.native
  
  var origin: String = js.native
  
  var reply: js.UndefOr[String | ReplyFunction] = js.native
}
object FramebusPayload {
  
  @scala.inline
  def apply(event: String, origin: String): FramebusPayload = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[FramebusPayload]
  }
  
  @scala.inline
  implicit class FramebusPayloadOps[Self <: FramebusPayload] (val x: Self) extends AnyVal {
    
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
    def setEvent(value: String): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setEventData(value: FramebusSubscriberArg): Self = this.set("eventData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventData: Self = this.set("eventData", js.undefined)
    
    @scala.inline
    def setReplyFunction1(value: /* repeated */ js.Any => Unit): Self = this.set("reply", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReply(value: String | ReplyFunction): Self = this.set("reply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReply: Self = this.set("reply", js.undefined)
  }
}
