package typings.dropboxjs.Dropbox.Util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventSource extends js.Object {
  
  def addListener(listener: js.Function1[/* event */ js.Any, Unit]): EventSource = js.native
  
  def dispatch(event: js.Object): Boolean = js.native
  
  def removeListener(listener: js.Function1[/* event */ js.Any, Unit]): EventSource = js.native
}
object EventSource {
  
  @scala.inline
  def apply(
    addListener: js.Function1[/* event */ js.Any, Unit] => EventSource,
    dispatch: js.Object => Boolean,
    removeListener: js.Function1[/* event */ js.Any, Unit] => EventSource
  ): EventSource = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), dispatch = js.Any.fromFunction1(dispatch), removeListener = js.Any.fromFunction1(removeListener))
    __obj.asInstanceOf[EventSource]
  }
  
  @scala.inline
  implicit class EventSourceOps[Self <: EventSource] (val x: Self) extends AnyVal {
    
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
    def setAddListener(value: js.Function1[/* event */ js.Any, Unit] => EventSource): Self = this.set("addListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDispatch(value: js.Object => Boolean): Self = this.set("dispatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveListener(value: js.Function1[/* event */ js.Any, Unit] => EventSource): Self = this.set("removeListener", js.Any.fromFunction1(value))
  }
}
