package typings.dropzone.mod

import org.scalablytyped.runtime.StringDictionary
import typings.dropzone.mod.global.HTMLElement
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropzoneListener extends js.Object {
  var element: HTMLElement = js.native
  var events: StringDictionary[js.Function1[/* e */ Event, _]] = js.native
}

object DropzoneListener {
  @scala.inline
  def apply(element: HTMLElement, events: StringDictionary[js.Function1[/* e */ Event, _]]): DropzoneListener = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropzoneListener]
  }
  @scala.inline
  implicit class DropzoneListenerOps[Self <: DropzoneListener] (val x: Self) extends AnyVal {
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
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvents(value: StringDictionary[js.Function1[/* e */ Event, _]]): Self = this.set("events", value.asInstanceOf[js.Any])
  }
  
}

