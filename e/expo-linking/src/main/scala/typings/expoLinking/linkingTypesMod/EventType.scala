package typings.expoLinking.linkingTypesMod

import typings.std.MessageEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventType extends js.Object {
  var nativeEvent: js.UndefOr[MessageEvent] = js.native
  var url: String = js.native
}

object EventType {
  @scala.inline
  def apply(url: String): EventType = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventType]
  }
  @scala.inline
  implicit class EventTypeOps[Self <: EventType] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setNativeEvent(value: MessageEvent): Self = this.set("nativeEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNativeEvent: Self = this.set("nativeEvent", js.undefined)
  }
  
}

