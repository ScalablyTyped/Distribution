package typings.eventsource

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageEventInit[T] extends EventInit {
  
  var data: js.UndefOr[T] = js.native
  
  var lastEventId: js.UndefOr[String] = js.native
  
  var origin: js.UndefOr[String] = js.native
}
object MessageEventInit {
  
  @scala.inline
  def apply[T](): MessageEventInit[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageEventInit[T]]
  }
  
  @scala.inline
  implicit class MessageEventInitOps[Self <: MessageEventInit[_], T] (val x: Self with MessageEventInit[T]) extends AnyVal {
    
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
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setLastEventId(value: String): Self = this.set("lastEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastEventId: Self = this.set("lastEventId", js.undefined)
    
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
  }
}
